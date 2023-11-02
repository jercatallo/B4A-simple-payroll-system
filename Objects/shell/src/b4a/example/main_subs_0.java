package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,16);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 16;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 17;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(65536);
if (_firsttime.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 18;BA.debugLine="CopyDb(\"catallodb.db\")";
Debug.ShouldStop(131072);
_copydb(RemoteObject.createImmutable("catallodb.db"));
 BA.debugLineNum = 19;BA.debugLine="sql.Initialize(File.DirInternal, \"catallodb.db\",";
Debug.ShouldStop(262144);
main._sql.runVoidMethod ("Initialize",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("catallodb.db")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 21;BA.debugLine="Activity.LoadLayout(\"Layout\")";
Debug.ShouldStop(1048576);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,27);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 27;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,24);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 24;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnclose_click() throws Exception{
try {
		Debug.PushSubsStack("btnClose_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,78);
if (RapidSub.canDelegate("btnclose_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","btnclose_click");}
 BA.debugLineNum = 78;BA.debugLine="Sub btnClose_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16384);
main.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnlogin_click() throws Exception{
try {
		Debug.PushSubsStack("btnLogin_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,37);
if (RapidSub.canDelegate("btnlogin_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","btnlogin_click");}
RemoteObject _qry = RemoteObject.createImmutable("");
RemoteObject _c1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _mypass = RemoteObject.createImmutable("");
RemoteObject _myfname = RemoteObject.createImmutable("");
RemoteObject _mylevel = RemoteObject.createImmutable("");
RemoteObject _myid = RemoteObject.createImmutable("");
RemoteObject _myusername = RemoteObject.createImmutable("");
 BA.debugLineNum = 37;BA.debugLine="Sub btnLogin_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="Dim qry As String";
Debug.ShouldStop(32);
_qry = RemoteObject.createImmutable("");Debug.locals.put("qry", _qry);
 BA.debugLineNum = 39;BA.debugLine="Dim c1 As Cursor";
Debug.ShouldStop(64);
_c1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("c1", _c1);
 BA.debugLineNum = 41;BA.debugLine="Dim mypass As String";
Debug.ShouldStop(256);
_mypass = RemoteObject.createImmutable("");Debug.locals.put("mypass", _mypass);
 BA.debugLineNum = 42;BA.debugLine="Dim myfname As String";
Debug.ShouldStop(512);
_myfname = RemoteObject.createImmutable("");Debug.locals.put("myfname", _myfname);
 BA.debugLineNum = 43;BA.debugLine="Dim mylevel As String";
Debug.ShouldStop(1024);
_mylevel = RemoteObject.createImmutable("");Debug.locals.put("mylevel", _mylevel);
 BA.debugLineNum = 44;BA.debugLine="Dim myid As String";
Debug.ShouldStop(2048);
_myid = RemoteObject.createImmutable("");Debug.locals.put("myid", _myid);
 BA.debugLineNum = 45;BA.debugLine="Dim myusername As String";
Debug.ShouldStop(4096);
_myusername = RemoteObject.createImmutable("");Debug.locals.put("myusername", _myusername);
 BA.debugLineNum = 47;BA.debugLine="qry = \"Select * from tbllogin where username = ?\"";
Debug.ShouldStop(16384);
_qry = BA.ObjectToString("Select * from tbllogin where username = ?");Debug.locals.put("qry", _qry);
 BA.debugLineNum = 48;BA.debugLine="c1 = sql.ExecQuery2(qry, Array As String(txtusern";
Debug.ShouldStop(32768);
_c1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), main._sql.runMethod(false,"ExecQuery2",(Object)(_qry),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {main.mostCurrent._txtusername.runMethod(true,"getText")}))));
 BA.debugLineNum = 50;BA.debugLine="If c1.RowCount > 0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(">",_c1.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 52;BA.debugLine="c1.Position = 0";
Debug.ShouldStop(524288);
_c1.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 54;BA.debugLine="mypass = c1.GetString(\"password\")";
Debug.ShouldStop(2097152);
_mypass = _c1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("password")));Debug.locals.put("mypass", _mypass);
 BA.debugLineNum = 55;BA.debugLine="myfname = c1.GetString(\"full_name\")";
Debug.ShouldStop(4194304);
_myfname = _c1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("full_name")));Debug.locals.put("myfname", _myfname);
 BA.debugLineNum = 56;BA.debugLine="mylevel = c1.GetString(\"level\")";
Debug.ShouldStop(8388608);
_mylevel = _c1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("level")));Debug.locals.put("mylevel", _mylevel);
 BA.debugLineNum = 57;BA.debugLine="myid = c1.GetString(\"id\")";
Debug.ShouldStop(16777216);
_myid = _c1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("id")));Debug.locals.put("myid", _myid);
 BA.debugLineNum = 58;BA.debugLine="myusername = c1.GetString(\"username\")";
Debug.ShouldStop(33554432);
_myusername = _c1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("username")));Debug.locals.put("myusername", _myusername);
 BA.debugLineNum = 59;BA.debugLine="If mypass = txtpassword.Text Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_mypass,main.mostCurrent._txtpassword.runMethod(true,"getText"))) { 
 BA.debugLineNum = 60;BA.debugLine="Msgbox(\"Welcome \"& myfname, \"\")";
Debug.ShouldStop(134217728);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Welcome "),_myfname))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),main.mostCurrent.activityBA);
 BA.debugLineNum = 61;BA.debugLine="StartActivity(MainRec)";
Debug.ShouldStop(268435456);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._mainrec.getObject())));
 BA.debugLineNum = 63;BA.debugLine="txtusername.Text=\"\"";
Debug.ShouldStop(1073741824);
main.mostCurrent._txtusername.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 64;BA.debugLine="txtpassword.Text=\"\"";
Debug.ShouldStop(-2147483648);
main.mostCurrent._txtpassword.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 66;BA.debugLine="MainRec.level = mylevel";
Debug.ShouldStop(2);
main.mostCurrent._mainrec._level /*RemoteObject*/  = _mylevel;
 BA.debugLineNum = 67;BA.debugLine="MainRec.fname = myfname";
Debug.ShouldStop(4);
main.mostCurrent._mainrec._fname /*RemoteObject*/  = _myfname;
 BA.debugLineNum = 68;BA.debugLine="MainRec.id = myid";
Debug.ShouldStop(8);
main.mostCurrent._mainrec._id /*RemoteObject*/  = _myid;
 BA.debugLineNum = 69;BA.debugLine="MainRec.password = mypass";
Debug.ShouldStop(16);
main.mostCurrent._mainrec._password /*RemoteObject*/  = _mypass;
 }else {
 BA.debugLineNum = 71;BA.debugLine="Msgbox(\"Wrong Password\",\"\")";
Debug.ShouldStop(64);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Wrong Password")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),main.mostCurrent.activityBA);
 };
 }else {
 BA.debugLineNum = 74;BA.debugLine="Msgbox(\"No Username Found\",\"\")";
Debug.ShouldStop(512);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No Username Found")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _chkpassword_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("chkpassword_CheckedChange (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,82);
if (RapidSub.canDelegate("chkpassword_checkedchange")) { return b4a.example.main.remoteMe.runUserSub(false, "main","chkpassword_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 82;BA.debugLine="Private Sub chkpassword_CheckedChange(Checked As B";
Debug.ShouldStop(131072);
 BA.debugLineNum = 83;BA.debugLine="If chkpassword.Checked = True Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",main.mostCurrent._chkpassword.runMethod(true,"getChecked"),main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 84;BA.debugLine="txtpassword.PasswordMode = False";
Debug.ShouldStop(524288);
main.mostCurrent._txtpassword.runVoidMethod ("setPasswordMode",main.mostCurrent.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 86;BA.debugLine="txtpassword.PasswordMode = True";
Debug.ShouldStop(2097152);
main.mostCurrent._txtpassword.runVoidMethod ("setPasswordMode",main.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _copydb(RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("CopyDb (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,30);
if (RapidSub.canDelegate("copydb")) { return b4a.example.main.remoteMe.runUserSub(false, "main","copydb", _filename);}
Debug.locals.put("Filename", _filename);
 BA.debugLineNum = 30;BA.debugLine="Sub CopyDb(Filename As String)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 32;BA.debugLine="If File.Exists(File.DirInternal, Filename) = Fals";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",main.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(_filename)),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 33;BA.debugLine="File.Copy(File.DirAssets, Filename, File.DirInte";
Debug.ShouldStop(1);
main.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(_filename),(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(_filename));
 };
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 11;BA.debugLine="Private txtusername As EditText";
main.mostCurrent._txtusername = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 12;BA.debugLine="Private txtpassword As EditText";
main.mostCurrent._txtpassword = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 13;BA.debugLine="Private chkpassword As CheckBox";
main.mostCurrent._chkpassword = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
mainrec_subs_0._process_globals();
addrec_subs_0._process_globals();
editrec_subs_0._process_globals();
adduser_subs_0._process_globals();
edituser_subs_0._process_globals();
userrec_subs_0._process_globals();
salaryedit_subs_0._process_globals();
xuiviewsutils_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
mainrec.myClass = BA.getDeviceClass ("b4a.example.mainrec");
addrec.myClass = BA.getDeviceClass ("b4a.example.addrec");
editrec.myClass = BA.getDeviceClass ("b4a.example.editrec");
adduser.myClass = BA.getDeviceClass ("b4a.example.adduser");
edituser.myClass = BA.getDeviceClass ("b4a.example.edituser");
userrec.myClass = BA.getDeviceClass ("b4a.example.userrec");
salaryedit.myClass = BA.getDeviceClass ("b4a.example.salaryedit");
b4xtable.myClass = BA.getDeviceClass ("b4a.example.b4xtable");
b4xformatter.myClass = BA.getDeviceClass ("b4a.example.b4xformatter");
animatedcounter.myClass = BA.getDeviceClass ("b4a.example.animatedcounter");
anotherprogressbar.myClass = BA.getDeviceClass ("b4a.example.anotherprogressbar");
b4xbreadcrumb.myClass = BA.getDeviceClass ("b4a.example.b4xbreadcrumb");
b4xcolortemplate.myClass = BA.getDeviceClass ("b4a.example.b4xcolortemplate");
b4xcombobox.myClass = BA.getDeviceClass ("b4a.example.b4xcombobox");
b4xdatetemplate.myClass = BA.getDeviceClass ("b4a.example.b4xdatetemplate");
b4xdialog.myClass = BA.getDeviceClass ("b4a.example.b4xdialog");
b4xfloattextfield.myClass = BA.getDeviceClass ("b4a.example.b4xfloattextfield");
b4ximageview.myClass = BA.getDeviceClass ("b4a.example.b4ximageview");
b4xinputtemplate.myClass = BA.getDeviceClass ("b4a.example.b4xinputtemplate");
b4xlisttemplate.myClass = BA.getDeviceClass ("b4a.example.b4xlisttemplate");
b4xloadingindicator.myClass = BA.getDeviceClass ("b4a.example.b4xloadingindicator");
b4xlongtexttemplate.myClass = BA.getDeviceClass ("b4a.example.b4xlongtexttemplate");
b4xplusminus.myClass = BA.getDeviceClass ("b4a.example.b4xplusminus");
b4xsearchtemplate.myClass = BA.getDeviceClass ("b4a.example.b4xsearchtemplate");
b4xseekbar.myClass = BA.getDeviceClass ("b4a.example.b4xseekbar");
b4xsignaturetemplate.myClass = BA.getDeviceClass ("b4a.example.b4xsignaturetemplate");
b4xswitch.myClass = BA.getDeviceClass ("b4a.example.b4xswitch");
b4xtimedtemplate.myClass = BA.getDeviceClass ("b4a.example.b4xtimedtemplate");
madewithlove.myClass = BA.getDeviceClass ("b4a.example.madewithlove");
roundslider.myClass = BA.getDeviceClass ("b4a.example.roundslider");
scrollinglabel.myClass = BA.getDeviceClass ("b4a.example.scrollinglabel");
swiftbutton.myClass = BA.getDeviceClass ("b4a.example.swiftbutton");
xuiviewsutils.myClass = BA.getDeviceClass ("b4a.example.xuiviewsutils");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 5;BA.debugLine="Dim sql As SQL";
main._sql = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 6;BA.debugLine="Dim rs As ResultSet";
main._rs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}