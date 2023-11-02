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

public class main extends Activity implements B4AActivity{
	public static main mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
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
		return main.class;
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
            BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (main) Pause event (activity is not paused). **");
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
            main mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (main) Resume **");
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
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        b4a.example.dateutils._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}
public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
vis = vis | (mainrec.mostCurrent != null);
vis = vis | (addrec.mostCurrent != null);
vis = vis | (editrec.mostCurrent != null);
vis = vis | (adduser.mostCurrent != null);
vis = vis | (edituser.mostCurrent != null);
vis = vis | (userrec.mostCurrent != null);
vis = vis | (salaryedit.mostCurrent != null);
return vis;}

private static BA killProgramHelper(BA ba) {
    if (ba == null)
        return null;
    anywheresoftware.b4a.BA.SharedProcessBA sharedProcessBA = ba.sharedProcessBA;
    if (sharedProcessBA == null || sharedProcessBA.activityBA == null)
        return null;
    return sharedProcessBA.activityBA.get();
}
public static void killProgram() {
     {
            Activity __a = null;
            if (main.previousOne != null) {
				__a = main.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(main.mostCurrent == null ? null : main.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, starter.class));
 {
            Activity __a = null;
            if (mainrec.previousOne != null) {
				__a = mainrec.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(mainrec.mostCurrent == null ? null : mainrec.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (addrec.previousOne != null) {
				__a = addrec.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(addrec.mostCurrent == null ? null : addrec.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (editrec.previousOne != null) {
				__a = editrec.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(editrec.mostCurrent == null ? null : editrec.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (adduser.previousOne != null) {
				__a = adduser.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(adduser.mostCurrent == null ? null : adduser.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (edituser.previousOne != null) {
				__a = edituser.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(edituser.mostCurrent == null ? null : edituser.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (userrec.previousOne != null) {
				__a = userrec.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(userrec.mostCurrent == null ? null : userrec.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (salaryedit.previousOne != null) {
				__a = salaryedit.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(salaryedit.mostCurrent == null ? null : salaryedit.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static anywheresoftware.b4a.sql.SQL _sql = null;
public static anywheresoftware.b4a.sql.SQL.ResultSetWrapper _rs = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtusername = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtpassword = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chkpassword = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.starter _starter = null;
public b4a.example.mainrec _mainrec = null;
public b4a.example.addrec _addrec = null;
public b4a.example.editrec _editrec = null;
public b4a.example.adduser _adduser = null;
public b4a.example.edituser _edituser = null;
public b4a.example.userrec _userrec = null;
public b4a.example.salaryedit _salaryedit = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="If FirstTime Then";
if (_firsttime) { 
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="CopyDb(\"catallodb.db\")";
_copydb("catallodb.db");
RDebugUtils.currentLine=131075;
 //BA.debugLineNum = 131075;BA.debugLine="sql.Initialize(File.DirInternal, \"catallodb.db\",";
_sql.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"catallodb.db",anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="Activity.LoadLayout(\"Layout\")";
mostCurrent._activity.LoadLayout("Layout",mostCurrent.activityBA);
RDebugUtils.currentLine=131078;
 //BA.debugLineNum = 131078;BA.debugLine="End Sub";
return "";
}
public static String  _copydb(String _filename) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "copydb", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "copydb", new Object[] {_filename}));}
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub CopyDb(Filename As String)";
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="If File.Exists(File.DirInternal, Filename) = Fals";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),_filename)==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="File.Copy(File.DirAssets, Filename, File.DirInte";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_filename,anywheresoftware.b4a.keywords.Common.File.getDirInternal(),_filename);
 };
RDebugUtils.currentLine=327685;
 //BA.debugLineNum = 327685;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="End Sub";
return "";
}
public static String  _btnclose_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnclose_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnclose_click", null));}
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub btnClose_Click";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="End Sub";
return "";
}
public static String  _btnlogin_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnlogin_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnlogin_click", null));}
String _qry = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _c1 = null;
String _mypass = "";
String _myfname = "";
String _mylevel = "";
String _myid = "";
String _myusername = "";
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Sub btnLogin_Click";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="Dim qry As String";
_qry = "";
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="Dim c1 As Cursor";
_c1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="Dim mypass As String";
_mypass = "";
RDebugUtils.currentLine=393221;
 //BA.debugLineNum = 393221;BA.debugLine="Dim myfname As String";
_myfname = "";
RDebugUtils.currentLine=393222;
 //BA.debugLineNum = 393222;BA.debugLine="Dim mylevel As String";
_mylevel = "";
RDebugUtils.currentLine=393223;
 //BA.debugLineNum = 393223;BA.debugLine="Dim myid As String";
_myid = "";
RDebugUtils.currentLine=393224;
 //BA.debugLineNum = 393224;BA.debugLine="Dim myusername As String";
_myusername = "";
RDebugUtils.currentLine=393226;
 //BA.debugLineNum = 393226;BA.debugLine="qry = \"Select * from tbllogin where username = ?\"";
_qry = "Select * from tbllogin where username = ?";
RDebugUtils.currentLine=393227;
 //BA.debugLineNum = 393227;BA.debugLine="c1 = sql.ExecQuery2(qry, Array As String(txtusern";
_c1 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sql.ExecQuery2(_qry,new String[]{mostCurrent._txtusername.getText()})));
RDebugUtils.currentLine=393229;
 //BA.debugLineNum = 393229;BA.debugLine="If c1.RowCount > 0 Then";
if (_c1.getRowCount()>0) { 
RDebugUtils.currentLine=393231;
 //BA.debugLineNum = 393231;BA.debugLine="c1.Position = 0";
_c1.setPosition((int) (0));
RDebugUtils.currentLine=393233;
 //BA.debugLineNum = 393233;BA.debugLine="mypass = c1.GetString(\"password\")";
_mypass = _c1.GetString("password");
RDebugUtils.currentLine=393234;
 //BA.debugLineNum = 393234;BA.debugLine="myfname = c1.GetString(\"full_name\")";
_myfname = _c1.GetString("full_name");
RDebugUtils.currentLine=393235;
 //BA.debugLineNum = 393235;BA.debugLine="mylevel = c1.GetString(\"level\")";
_mylevel = _c1.GetString("level");
RDebugUtils.currentLine=393236;
 //BA.debugLineNum = 393236;BA.debugLine="myid = c1.GetString(\"id\")";
_myid = _c1.GetString("id");
RDebugUtils.currentLine=393237;
 //BA.debugLineNum = 393237;BA.debugLine="myusername = c1.GetString(\"username\")";
_myusername = _c1.GetString("username");
RDebugUtils.currentLine=393238;
 //BA.debugLineNum = 393238;BA.debugLine="If mypass = txtpassword.Text Then";
if ((_mypass).equals(mostCurrent._txtpassword.getText())) { 
RDebugUtils.currentLine=393239;
 //BA.debugLineNum = 393239;BA.debugLine="Msgbox(\"Welcome \"& myfname, \"\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Welcome "+_myfname),BA.ObjectToCharSequence(""),mostCurrent.activityBA);
RDebugUtils.currentLine=393240;
 //BA.debugLineNum = 393240;BA.debugLine="StartActivity(MainRec)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._mainrec.getObject()));
RDebugUtils.currentLine=393242;
 //BA.debugLineNum = 393242;BA.debugLine="txtusername.Text=\"\"";
mostCurrent._txtusername.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=393243;
 //BA.debugLineNum = 393243;BA.debugLine="txtpassword.Text=\"\"";
mostCurrent._txtpassword.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=393245;
 //BA.debugLineNum = 393245;BA.debugLine="MainRec.level = mylevel";
mostCurrent._mainrec._level /*String*/  = _mylevel;
RDebugUtils.currentLine=393246;
 //BA.debugLineNum = 393246;BA.debugLine="MainRec.fname = myfname";
mostCurrent._mainrec._fname /*String*/  = _myfname;
RDebugUtils.currentLine=393247;
 //BA.debugLineNum = 393247;BA.debugLine="MainRec.id = myid";
mostCurrent._mainrec._id /*String*/  = _myid;
RDebugUtils.currentLine=393248;
 //BA.debugLineNum = 393248;BA.debugLine="MainRec.password = mypass";
mostCurrent._mainrec._password /*String*/  = _mypass;
 }else {
RDebugUtils.currentLine=393250;
 //BA.debugLineNum = 393250;BA.debugLine="Msgbox(\"Wrong Password\",\"\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Wrong Password"),BA.ObjectToCharSequence(""),mostCurrent.activityBA);
 };
 }else {
RDebugUtils.currentLine=393253;
 //BA.debugLineNum = 393253;BA.debugLine="Msgbox(\"No Username Found\",\"\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("No Username Found"),BA.ObjectToCharSequence(""),mostCurrent.activityBA);
 };
RDebugUtils.currentLine=393255;
 //BA.debugLineNum = 393255;BA.debugLine="End Sub";
return "";
}
public static String  _chkpassword_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "chkpassword_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "chkpassword_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Private Sub chkpassword_CheckedChange(Checked As B";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="If chkpassword.Checked = True Then";
if (mostCurrent._chkpassword.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="txtpassword.PasswordMode = False";
mostCurrent._txtpassword.setPasswordMode(anywheresoftware.b4a.keywords.Common.False);
 }else {
RDebugUtils.currentLine=524292;
 //BA.debugLineNum = 524292;BA.debugLine="txtpassword.PasswordMode = True";
mostCurrent._txtpassword.setPasswordMode(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=524294;
 //BA.debugLineNum = 524294;BA.debugLine="End Sub";
return "";
}
}