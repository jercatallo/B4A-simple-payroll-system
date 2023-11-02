package b4a.example;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class mainrec extends Activity implements B4AActivity{
	public static mainrec mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = true;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.mainrec");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (mainrec).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.mainrec");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.mainrec", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (mainrec) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (mainrec) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return mainrec.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        if (!dontPause)
            BA.LogInfo("** Activity (mainrec) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (mainrec) Pause event (activity is not paused). **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        if (!dontPause) {
            processBA.setActivityPaused(true);
            mostCurrent = null;
        }

        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            mainrec mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (mainrec) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }



public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.sql.SQL _sql = null;
public static anywheresoftware.b4a.sql.SQL.ResultSetWrapper _rs = null;
public static String _fname = "";
public static String _level = "";
public static String _password = "";
public static String _id = "";
public static String _username = "";
public static anywheresoftware.b4a.sql.SQL.CursorWrapper _c1 = null;
public b4a.example.b4xtable _b4xtable1 = null;
public anywheresoftware.b4a.agraham.dialogs.InputDialog _inpdlg = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinner1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnuser = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnadd = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btndelete = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnedit = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btneditsalary = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.addrec _addrec = null;
public b4a.example.editrec _editrec = null;
public b4a.example.adduser _adduser = null;
public b4a.example.edituser _edituser = null;
public b4a.example.userrec _userrec = null;
public b4a.example.salaryedit _salaryedit = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="mainrec";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="If FirstTime Then";
if (_firsttime) { 
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="CopyDb(\"catallodb.db\")";
_copydb("catallodb.db");
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="sql.Initialize(File.DirInternal, \"catallodb.db\",";
_sql.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"catallodb.db",anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=1114119;
 //BA.debugLineNum = 1114119;BA.debugLine="Activity.LoadLayout(\"layMain\")";
mostCurrent._activity.LoadLayout("layMain",mostCurrent.activityBA);
RDebugUtils.currentLine=1114121;
 //BA.debugLineNum = 1114121;BA.debugLine="B4XTable1.AddColumn(\"Employee Number\", B4XTable1.";
mostCurrent._b4xtable1._addcolumn /*b4a.example.b4xtable._b4xtablecolumn*/ (null,"Employee Number",mostCurrent._b4xtable1._column_type_text /*int*/ );
RDebugUtils.currentLine=1114122;
 //BA.debugLineNum = 1114122;BA.debugLine="B4XTable1.AddColumn(\"Name\", B4XTable1.COLUMN_TYPE";
mostCurrent._b4xtable1._addcolumn /*b4a.example.b4xtable._b4xtablecolumn*/ (null,"Name",mostCurrent._b4xtable1._column_type_text /*int*/ );
RDebugUtils.currentLine=1114123;
 //BA.debugLineNum = 1114123;BA.debugLine="B4XTable1.AddColumn(\"Address\", B4XTable1.COLUMN_T";
mostCurrent._b4xtable1._addcolumn /*b4a.example.b4xtable._b4xtablecolumn*/ (null,"Address",mostCurrent._b4xtable1._column_type_text /*int*/ );
RDebugUtils.currentLine=1114124;
 //BA.debugLineNum = 1114124;BA.debugLine="B4XTable1.AddColumn(\"Age\", B4XTable1.COLUMN_TYPE_";
mostCurrent._b4xtable1._addcolumn /*b4a.example.b4xtable._b4xtablecolumn*/ (null,"Age",mostCurrent._b4xtable1._column_type_text /*int*/ );
RDebugUtils.currentLine=1114125;
 //BA.debugLineNum = 1114125;BA.debugLine="B4XTable1.AddColumn(\"Gender\", B4XTable1.COLUMN_TY";
mostCurrent._b4xtable1._addcolumn /*b4a.example.b4xtable._b4xtablecolumn*/ (null,"Gender",mostCurrent._b4xtable1._column_type_text /*int*/ );
RDebugUtils.currentLine=1114126;
 //BA.debugLineNum = 1114126;BA.debugLine="B4XTable1.AddColumn(\"Days\", B4XTable1.COLUMN_TYPE";
mostCurrent._b4xtable1._addcolumn /*b4a.example.b4xtable._b4xtablecolumn*/ (null,"Days",mostCurrent._b4xtable1._column_type_text /*int*/ );
RDebugUtils.currentLine=1114127;
 //BA.debugLineNum = 1114127;BA.debugLine="B4XTable1.AddColumn(\"Rate\", B4XTable1.COLUMN_TYPE";
mostCurrent._b4xtable1._addcolumn /*b4a.example.b4xtable._b4xtablecolumn*/ (null,"Rate",mostCurrent._b4xtable1._column_type_text /*int*/ );
RDebugUtils.currentLine=1114128;
 //BA.debugLineNum = 1114128;BA.debugLine="B4XTable1.AddColumn(\"Salary\", B4XTable1.COLUMN_TY";
mostCurrent._b4xtable1._addcolumn /*b4a.example.b4xtable._b4xtablecolumn*/ (null,"Salary",mostCurrent._b4xtable1._column_type_text /*int*/ );
RDebugUtils.currentLine=1114130;
 //BA.debugLineNum = 1114130;BA.debugLine="ShowList";
_showlist();
RDebugUtils.currentLine=1114134;
 //BA.debugLineNum = 1114134;BA.debugLine="Spinner1.Add(fname)";
mostCurrent._spinner1.Add(_fname);
RDebugUtils.currentLine=1114135;
 //BA.debugLineNum = 1114135;BA.debugLine="Spinner1.Add(\"Edit Profile\")";
mostCurrent._spinner1.Add("Edit Profile");
RDebugUtils.currentLine=1114136;
 //BA.debugLineNum = 1114136;BA.debugLine="Spinner1.Add(\"Logout\")";
mostCurrent._spinner1.Add("Logout");
RDebugUtils.currentLine=1114137;
 //BA.debugLineNum = 1114137;BA.debugLine="Spinner1.Add(\"Exit\")";
mostCurrent._spinner1.Add("Exit");
RDebugUtils.currentLine=1114139;
 //BA.debugLineNum = 1114139;BA.debugLine="If level = 2 Then";
if ((_level).equals(BA.NumberToString(2))) { 
RDebugUtils.currentLine=1114140;
 //BA.debugLineNum = 1114140;BA.debugLine="btnUser.Visible = False";
mostCurrent._btnuser.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else 
{RDebugUtils.currentLine=1114141;
 //BA.debugLineNum = 1114141;BA.debugLine="Else if level = 3 Then";
if ((_level).equals(BA.NumberToString(3))) { 
RDebugUtils.currentLine=1114142;
 //BA.debugLineNum = 1114142;BA.debugLine="btnUser.Visible = False";
mostCurrent._btnuser.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1114143;
 //BA.debugLineNum = 1114143;BA.debugLine="btnEdit.Visible = False";
mostCurrent._btnedit.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1114144;
 //BA.debugLineNum = 1114144;BA.debugLine="btnDelete.Visible = False";
mostCurrent._btndelete.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1114145;
 //BA.debugLineNum = 1114145;BA.debugLine="btnAdd.Visible = False";
mostCurrent._btnadd.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1114146;
 //BA.debugLineNum = 1114146;BA.debugLine="btnEditSalary.Visible = False";
mostCurrent._btneditsalary.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }}
;
RDebugUtils.currentLine=1114148;
 //BA.debugLineNum = 1114148;BA.debugLine="End Sub";
return "";
}
public static String  _copydb(String _filename) throws Exception{
RDebugUtils.currentModule="mainrec";
if (Debug.shouldDelegate(mostCurrent.activityBA, "copydb", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "copydb", new Object[] {_filename}));}
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Sub CopyDb(Filename As String)";
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="If File.Exists(File.DirInternal, Filename) = Fals";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),_filename)==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="File.Copy(File.DirAssets, Filename, File.DirInte";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_filename,anywheresoftware.b4a.keywords.Common.File.getDirInternal(),_filename);
 };
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="End Sub";
return "";
}
public static String  _showlist() throws Exception{
RDebugUtils.currentModule="mainrec";
if (Debug.shouldDelegate(mostCurrent.activityBA, "showlist", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "showlist", null));}
anywheresoftware.b4a.objects.collections.List _data = null;
Object[] _row = null;
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Sub ShowList";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="Dim data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="data.Initialize";
_data.Initialize();
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="rs = sql.ExecQuery(\"SELECT jer_carlo.employee_num";
_rs = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery("SELECT jer_carlo.employee_num, jer_carlo.name, jer_carlo.address, jer_carlo.age, jer_carlo.gender, doctolero.days, doctolero.rate, doctolero.salary from jer_carlo inner join doctolero WHERE jer_carlo.employee_num = doctolero.employee_num")));
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=1376261;
 //BA.debugLineNum = 1376261;BA.debugLine="Dim row(8) As Object";
_row = new Object[(int) (8)];
{
int d0 = _row.length;
for (int i0 = 0;i0 < d0;i0++) {
_row[i0] = new Object();
}
}
;
RDebugUtils.currentLine=1376262;
 //BA.debugLineNum = 1376262;BA.debugLine="row(0) = rs.GetString(\"employee_num\")";
_row[(int) (0)] = (Object)(_rs.GetString("employee_num"));
RDebugUtils.currentLine=1376263;
 //BA.debugLineNum = 1376263;BA.debugLine="row(1) = rs.GetString(\"name\")";
_row[(int) (1)] = (Object)(_rs.GetString("name"));
RDebugUtils.currentLine=1376264;
 //BA.debugLineNum = 1376264;BA.debugLine="row(2) = rs.GetString(\"address\")";
_row[(int) (2)] = (Object)(_rs.GetString("address"));
RDebugUtils.currentLine=1376265;
 //BA.debugLineNum = 1376265;BA.debugLine="row(3) = rs.GetString(\"age\")";
_row[(int) (3)] = (Object)(_rs.GetString("age"));
RDebugUtils.currentLine=1376266;
 //BA.debugLineNum = 1376266;BA.debugLine="row(4) = rs.GetString(\"gender\")";
_row[(int) (4)] = (Object)(_rs.GetString("gender"));
RDebugUtils.currentLine=1376267;
 //BA.debugLineNum = 1376267;BA.debugLine="row(5) = rs.GetString(\"days\")";
_row[(int) (5)] = (Object)(_rs.GetString("days"));
RDebugUtils.currentLine=1376268;
 //BA.debugLineNum = 1376268;BA.debugLine="row(6) = rs.GetString(\"rate\")";
_row[(int) (6)] = (Object)(_rs.GetString("rate"));
RDebugUtils.currentLine=1376269;
 //BA.debugLineNum = 1376269;BA.debugLine="row(7) = rs.GetString(\"salary\")";
_row[(int) (7)] = (Object)(_rs.GetString("salary"));
RDebugUtils.currentLine=1376270;
 //BA.debugLineNum = 1376270;BA.debugLine="data.Add(row)";
_data.Add((Object)(_row));
 }
;
RDebugUtils.currentLine=1376272;
 //BA.debugLineNum = 1376272;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=1376273;
 //BA.debugLineNum = 1376273;BA.debugLine="B4XTable1.SetData(data)";
mostCurrent._b4xtable1._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_data);
RDebugUtils.currentLine=1376274;
 //BA.debugLineNum = 1376274;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="mainrec";
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="mainrec";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="ShowList";
_showlist();
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="End Sub";
return "";
}
public static String  _btnadd_click() throws Exception{
RDebugUtils.currentModule="mainrec";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnadd_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnadd_click", null));}
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Private Sub btnAdd_Click";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="StartActivity(AddRec)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._addrec.getObject()));
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="End Sub";
return "";
}
public static String  _btndelete_click() throws Exception{
RDebugUtils.currentModule="mainrec";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btndelete_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btndelete_click", null));}
String _ans = "";
String _enum = "";
String _qry = "";
String _qry2 = "";
String _qry3 = "";
String _x = "";
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Private Sub btnDelete_Click";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="Dim ans As String";
_ans = "";
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="Dim enum As String";
_enum = "";
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="Dim qry, qry2, qry3 As String";
_qry = "";
_qry2 = "";
_qry3 = "";
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="Dim c1 As Cursor";
_c1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=1638406;
 //BA.debugLineNum = 1638406;BA.debugLine="inpdlg.Input = \"\"";
mostCurrent._inpdlg.setInput("");
RDebugUtils.currentLine=1638407;
 //BA.debugLineNum = 1638407;BA.debugLine="ans = inpdlg.Show(\"Enter Employee Number\", \"Delet";
_ans = BA.NumberToString(mostCurrent._inpdlg.Show("Enter Employee Number","Deleting of Record","Ok","Cancel","",mostCurrent.activityBA,(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=1638409;
 //BA.debugLineNum = 1638409;BA.debugLine="If ans = DialogResponse.POSITIVE Then";
if ((_ans).equals(BA.NumberToString(anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE))) { 
RDebugUtils.currentLine=1638410;
 //BA.debugLineNum = 1638410;BA.debugLine="enum = inpdlg.Input";
_enum = mostCurrent._inpdlg.getInput();
RDebugUtils.currentLine=1638411;
 //BA.debugLineNum = 1638411;BA.debugLine="qry = \"SELECT * FROM jer_carlo WHERE employee_nu";
_qry = "SELECT * FROM jer_carlo WHERE employee_num = ?";
RDebugUtils.currentLine=1638412;
 //BA.debugLineNum = 1638412;BA.debugLine="c1 = sql.ExecQuery2(qry, Array As String(enum))";
_c1 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sql.ExecQuery2(_qry,new String[]{_enum})));
RDebugUtils.currentLine=1638413;
 //BA.debugLineNum = 1638413;BA.debugLine="If c1.RowCount > 0 Then";
if (_c1.getRowCount()>0) { 
RDebugUtils.currentLine=1638414;
 //BA.debugLineNum = 1638414;BA.debugLine="Dim x As String";
_x = "";
RDebugUtils.currentLine=1638415;
 //BA.debugLineNum = 1638415;BA.debugLine="x = Msgbox2(\"Delete this record?\",\"Deleting\",\"O";
_x = BA.NumberToString(anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Delete this record?"),BA.ObjectToCharSequence("Deleting"),"Ok","Cancel","",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA));
RDebugUtils.currentLine=1638416;
 //BA.debugLineNum = 1638416;BA.debugLine="If x = DialogResponse.POSITIVE Then";
if ((_x).equals(BA.NumberToString(anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE))) { 
RDebugUtils.currentLine=1638417;
 //BA.debugLineNum = 1638417;BA.debugLine="qry2 = \"Delete from jer_carlo where employee_n";
_qry2 = "Delete from jer_carlo where employee_num = ?";
RDebugUtils.currentLine=1638418;
 //BA.debugLineNum = 1638418;BA.debugLine="sql.ExecNonQuery2(qry2, Array As String(enum))";
_sql.ExecNonQuery2(_qry2,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_enum}));
RDebugUtils.currentLine=1638420;
 //BA.debugLineNum = 1638420;BA.debugLine="qry3 = \"Delete from doctolero where employee_n";
_qry3 = "Delete from doctolero where employee_num = ?";
RDebugUtils.currentLine=1638421;
 //BA.debugLineNum = 1638421;BA.debugLine="sql.ExecNonQuery2(qry3, Array As String(enum))";
_sql.ExecNonQuery2(_qry3,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_enum}));
RDebugUtils.currentLine=1638422;
 //BA.debugLineNum = 1638422;BA.debugLine="ShowList";
_showlist();
 }else {
RDebugUtils.currentLine=1638424;
 //BA.debugLineNum = 1638424;BA.debugLine="Msgbox(\"Deletion cancelled\",\"\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Deletion cancelled"),BA.ObjectToCharSequence(""),mostCurrent.activityBA);
 };
 }else {
RDebugUtils.currentLine=1638428;
 //BA.debugLineNum = 1638428;BA.debugLine="Msgbox(\"No record found\",\"\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("No record found"),BA.ObjectToCharSequence(""),mostCurrent.activityBA);
RDebugUtils.currentLine=1638429;
 //BA.debugLineNum = 1638429;BA.debugLine="ShowList";
_showlist();
 };
 };
RDebugUtils.currentLine=1638432;
 //BA.debugLineNum = 1638432;BA.debugLine="End Sub";
return "";
}
public static String  _btnedit_click() throws Exception{
RDebugUtils.currentModule="mainrec";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnedit_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnedit_click", null));}
String _ans2 = "";
String _enum2 = "";
String _qry = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _c2 = null;
String _x = "";
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Private Sub btnEdit_Click";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="Dim ans2 As String";
_ans2 = "";
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="Dim enum2 As String";
_enum2 = "";
RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="Dim qry As String";
_qry = "";
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="Dim c2 As Cursor";
_c2 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=1572869;
 //BA.debugLineNum = 1572869;BA.debugLine="inpdlg.Input=\"\"";
mostCurrent._inpdlg.setInput("");
RDebugUtils.currentLine=1572870;
 //BA.debugLineNum = 1572870;BA.debugLine="ans2 = inpdlg.Show(\"Enter Employee Number\",\"Updat";
_ans2 = BA.NumberToString(mostCurrent._inpdlg.Show("Enter Employee Number","Update Records","Ok","Cancel","",mostCurrent.activityBA,(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=1572872;
 //BA.debugLineNum = 1572872;BA.debugLine="If ans2 = DialogResponse.POSITIVE Then";
if ((_ans2).equals(BA.NumberToString(anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE))) { 
RDebugUtils.currentLine=1572873;
 //BA.debugLineNum = 1572873;BA.debugLine="enum2 = inpdlg.Input";
_enum2 = mostCurrent._inpdlg.getInput();
RDebugUtils.currentLine=1572874;
 //BA.debugLineNum = 1572874;BA.debugLine="qry = \"Select * from jer_carlo where employee_nu";
_qry = "Select * from jer_carlo where employee_num = ?";
RDebugUtils.currentLine=1572875;
 //BA.debugLineNum = 1572875;BA.debugLine="c2 = sql.ExecQuery2(qry, Array As String(enum2))";
_c2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sql.ExecQuery2(_qry,new String[]{_enum2})));
RDebugUtils.currentLine=1572876;
 //BA.debugLineNum = 1572876;BA.debugLine="If c2.RowCount > 0 Then";
if (_c2.getRowCount()>0) { 
RDebugUtils.currentLine=1572877;
 //BA.debugLineNum = 1572877;BA.debugLine="Dim x As String";
_x = "";
RDebugUtils.currentLine=1572878;
 //BA.debugLineNum = 1572878;BA.debugLine="x = Msgbox2(\"Edit this record?\", \"Edit Record\",";
_x = BA.NumberToString(anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Edit this record?"),BA.ObjectToCharSequence("Edit Record"),"Yes","Cancel","",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA));
RDebugUtils.currentLine=1572879;
 //BA.debugLineNum = 1572879;BA.debugLine="If x = DialogResponse.POSITIVE Then";
if ((_x).equals(BA.NumberToString(anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE))) { 
RDebugUtils.currentLine=1572880;
 //BA.debugLineNum = 1572880;BA.debugLine="c2.Position = 0";
_c2.setPosition((int) (0));
RDebugUtils.currentLine=1572881;
 //BA.debugLineNum = 1572881;BA.debugLine="EditRec.employee_num = c2.GetString(\"employee_";
mostCurrent._editrec._employee_num /*String*/  = _c2.GetString("employee_num");
RDebugUtils.currentLine=1572882;
 //BA.debugLineNum = 1572882;BA.debugLine="EditRec.name = c2.GetString(\"name\")";
mostCurrent._editrec._name /*String*/  = _c2.GetString("name");
RDebugUtils.currentLine=1572883;
 //BA.debugLineNum = 1572883;BA.debugLine="EditRec.address = c2.GetString(\"address\")";
mostCurrent._editrec._address /*String*/  = _c2.GetString("address");
RDebugUtils.currentLine=1572884;
 //BA.debugLineNum = 1572884;BA.debugLine="EditRec.age = c2.GetString(\"age\")";
mostCurrent._editrec._age /*String*/  = _c2.GetString("age");
RDebugUtils.currentLine=1572885;
 //BA.debugLineNum = 1572885;BA.debugLine="EditRec.gender = c2.GetString(\"gender\")";
mostCurrent._editrec._gender /*String*/  = _c2.GetString("gender");
RDebugUtils.currentLine=1572886;
 //BA.debugLineNum = 1572886;BA.debugLine="StartActivity(EditRec)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._editrec.getObject()));
 }else {
RDebugUtils.currentLine=1572888;
 //BA.debugLineNum = 1572888;BA.debugLine="Msgbox(\"Edit cancelled.\", \"\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Edit cancelled."),BA.ObjectToCharSequence(""),mostCurrent.activityBA);
 };
 }else {
RDebugUtils.currentLine=1572892;
 //BA.debugLineNum = 1572892;BA.debugLine="Msgbox(\"No records found\",\"\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("No records found"),BA.ObjectToCharSequence(""),mostCurrent.activityBA);
 };
 };
RDebugUtils.currentLine=1572895;
 //BA.debugLineNum = 1572895;BA.debugLine="End Sub";
return "";
}
public static String  _btneditsalary_click() throws Exception{
RDebugUtils.currentModule="mainrec";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btneditsalary_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btneditsalary_click", null));}
String _ans2 = "";
String _enum2 = "";
String _qry = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _c2 = null;
String _x = "";
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Private Sub btnEditSalary_Click";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="Dim ans2 As String";
_ans2 = "";
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="Dim enum2 As String";
_enum2 = "";
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="Dim qry As String";
_qry = "";
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="Dim c2 As Cursor";
_c2 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="inpdlg.Input=\"\"";
mostCurrent._inpdlg.setInput("");
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="ans2 = inpdlg.Show(\"Enter Employee Number\",\"Updat";
_ans2 = BA.NumberToString(mostCurrent._inpdlg.Show("Enter Employee Number","Update Salary","Ok","Cancel","",mostCurrent.activityBA,(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=1507336;
 //BA.debugLineNum = 1507336;BA.debugLine="If ans2 = DialogResponse.POSITIVE Then";
if ((_ans2).equals(BA.NumberToString(anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE))) { 
RDebugUtils.currentLine=1507337;
 //BA.debugLineNum = 1507337;BA.debugLine="enum2 = inpdlg.Input";
_enum2 = mostCurrent._inpdlg.getInput();
RDebugUtils.currentLine=1507338;
 //BA.debugLineNum = 1507338;BA.debugLine="qry = \"Select * from doctolero where employee_nu";
_qry = "Select * from doctolero where employee_num = ?";
RDebugUtils.currentLine=1507339;
 //BA.debugLineNum = 1507339;BA.debugLine="c2 = sql.ExecQuery2(qry, Array As String(enum2))";
_c2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sql.ExecQuery2(_qry,new String[]{_enum2})));
RDebugUtils.currentLine=1507340;
 //BA.debugLineNum = 1507340;BA.debugLine="If c2.RowCount > 0 Then";
if (_c2.getRowCount()>0) { 
RDebugUtils.currentLine=1507341;
 //BA.debugLineNum = 1507341;BA.debugLine="Dim x As String";
_x = "";
RDebugUtils.currentLine=1507342;
 //BA.debugLineNum = 1507342;BA.debugLine="x = Msgbox2(\"Edit this Salary?\", \"Edit Salary\",";
_x = BA.NumberToString(anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Edit this Salary?"),BA.ObjectToCharSequence("Edit Salary"),"Yes","Cancel","",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA));
RDebugUtils.currentLine=1507343;
 //BA.debugLineNum = 1507343;BA.debugLine="If x = DialogResponse.POSITIVE Then";
if ((_x).equals(BA.NumberToString(anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE))) { 
RDebugUtils.currentLine=1507344;
 //BA.debugLineNum = 1507344;BA.debugLine="c2.Position = 0";
_c2.setPosition((int) (0));
RDebugUtils.currentLine=1507345;
 //BA.debugLineNum = 1507345;BA.debugLine="SalaryEdit.employee_num = c2.GetString(\"employ";
mostCurrent._salaryedit._employee_num /*String*/  = _c2.GetString("employee_num");
RDebugUtils.currentLine=1507346;
 //BA.debugLineNum = 1507346;BA.debugLine="SalaryEdit.days = c2.GetString(\"days\")";
mostCurrent._salaryedit._days /*String*/  = _c2.GetString("days");
RDebugUtils.currentLine=1507347;
 //BA.debugLineNum = 1507347;BA.debugLine="SalaryEdit.rate = c2.GetString(\"rate\")";
mostCurrent._salaryedit._rate /*String*/  = _c2.GetString("rate");
RDebugUtils.currentLine=1507348;
 //BA.debugLineNum = 1507348;BA.debugLine="SalaryEdit.salary = c2.GetString(\"salary\")";
mostCurrent._salaryedit._salary /*String*/  = _c2.GetString("salary");
RDebugUtils.currentLine=1507349;
 //BA.debugLineNum = 1507349;BA.debugLine="StartActivity(SalaryEdit)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._salaryedit.getObject()));
 }else {
RDebugUtils.currentLine=1507351;
 //BA.debugLineNum = 1507351;BA.debugLine="Msgbox(\"Edit cancelled.\", \"\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Edit cancelled."),BA.ObjectToCharSequence(""),mostCurrent.activityBA);
 };
 }else {
RDebugUtils.currentLine=1507355;
 //BA.debugLineNum = 1507355;BA.debugLine="Msgbox(\"No records found\",\"\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("No records found"),BA.ObjectToCharSequence(""),mostCurrent.activityBA);
 };
 };
RDebugUtils.currentLine=1507358;
 //BA.debugLineNum = 1507358;BA.debugLine="End Sub";
return "";
}
public static String  _btnuser_click() throws Exception{
RDebugUtils.currentModule="mainrec";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnuser_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnuser_click", null));}
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Private Sub btnUser_Click";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="StartActivity(UserRec)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._userrec.getObject()));
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="End Sub";
return "";
}
public static String  _spinner1_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="mainrec";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spinner1_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "spinner1_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Private Sub Spinner1_ItemClick (Position As Int, V";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="If Spinner1.SelectedIndex = 1 Then";
if (mostCurrent._spinner1.getSelectedIndex()==1) { 
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="StartActivity(EditUser)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._edituser.getObject()));
RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="EditUser.fname = fname";
mostCurrent._edituser._fname /*String*/  = _fname;
RDebugUtils.currentLine=1769477;
 //BA.debugLineNum = 1769477;BA.debugLine="EditUser.id = id";
mostCurrent._edituser._id /*String*/  = _id;
RDebugUtils.currentLine=1769478;
 //BA.debugLineNum = 1769478;BA.debugLine="EditUser.password = password";
mostCurrent._edituser._password /*String*/  = _password;
RDebugUtils.currentLine=1769479;
 //BA.debugLineNum = 1769479;BA.debugLine="EditUser.username = username";
mostCurrent._edituser._username /*String*/  = _username;
RDebugUtils.currentLine=1769480;
 //BA.debugLineNum = 1769480;BA.debugLine="EditUser.level = level";
mostCurrent._edituser._level /*String*/  = _level;
 }else 
{RDebugUtils.currentLine=1769482;
 //BA.debugLineNum = 1769482;BA.debugLine="Else if Spinner1.SelectedIndex = 2 Then";
if (mostCurrent._spinner1.getSelectedIndex()==2) { 
RDebugUtils.currentLine=1769483;
 //BA.debugLineNum = 1769483;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 }else 
{RDebugUtils.currentLine=1769484;
 //BA.debugLineNum = 1769484;BA.debugLine="Else if Spinner1.SelectedIndex = 3 Then";
if (mostCurrent._spinner1.getSelectedIndex()==3) { 
RDebugUtils.currentLine=1769485;
 //BA.debugLineNum = 1769485;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 }}}
;
RDebugUtils.currentLine=1769487;
 //BA.debugLineNum = 1769487;BA.debugLine="End Sub";
return "";
}
}