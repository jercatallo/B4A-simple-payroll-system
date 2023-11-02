package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class adduser_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (adduser) ","adduser",5,adduser.mostCurrent.activityBA,adduser.mostCurrent,32);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.adduser.remoteMe.runUserSub(false, "adduser","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 32;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 34;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(2);
if (_firsttime.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 35;BA.debugLine="CopyDb(\"catallodb.db\")";
Debug.ShouldStop(4);
_copydb(RemoteObject.createImmutable("catallodb.db"));
 BA.debugLineNum = 36;BA.debugLine="sql.Initialize(File.DirInternal, \"catallodb.db\",";
Debug.ShouldStop(8);
adduser._sql.runVoidMethod ("Initialize",(Object)(adduser.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("catallodb.db")),(Object)(adduser.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 39;BA.debugLine="Activity.LoadLayout(\"layAddUser\")";
Debug.ShouldStop(64);
adduser.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("layAddUser")),adduser.mostCurrent.activityBA);
 BA.debugLineNum = 41;BA.debugLine="txtusername.Text = username";
Debug.ShouldStop(256);
adduser.mostCurrent._txtusername.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(adduser._username));
 BA.debugLineNum = 42;BA.debugLine="txtpassword.Text = password";
Debug.ShouldStop(512);
adduser.mostCurrent._txtpassword.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(adduser._password));
 BA.debugLineNum = 43;BA.debugLine="txtid.Text = id";
Debug.ShouldStop(1024);
adduser.mostCurrent._txtid.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(adduser._id));
 BA.debugLineNum = 44;BA.debugLine="txtfname.Text = fname";
Debug.ShouldStop(2048);
adduser.mostCurrent._txtfname.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(adduser._fname));
 BA.debugLineNum = 45;BA.debugLine="txtlevel.Text = level";
Debug.ShouldStop(4096);
adduser.mostCurrent._txtlevel.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(adduser._level));
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("Activity_Pause (adduser) ","adduser",5,adduser.mostCurrent.activityBA,adduser.mostCurrent,52);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.adduser.remoteMe.runUserSub(false, "adduser","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 52;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("Activity_Resume (adduser) ","adduser",5,adduser.mostCurrent.activityBA,adduser.mostCurrent,48);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.adduser.remoteMe.runUserSub(false, "adduser","activity_resume");}
 BA.debugLineNum = 48;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(32768);
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnadd_click() throws Exception{
try {
		Debug.PushSubsStack("btnAdd_Click (adduser) ","adduser",5,adduser.mostCurrent.activityBA,adduser.mostCurrent,63);
if (RapidSub.canDelegate("btnadd_click")) { return b4a.example.adduser.remoteMe.runUserSub(false, "adduser","btnadd_click");}
RemoteObject _qry = RemoteObject.createImmutable("");
RemoteObject _qry2 = RemoteObject.createImmutable("");
RemoteObject _c1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 BA.debugLineNum = 63;BA.debugLine="Private Sub btnAdd_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 64;BA.debugLine="Dim qry, qry2 As String";
Debug.ShouldStop(-2147483648);
_qry = RemoteObject.createImmutable("");Debug.locals.put("qry", _qry);
_qry2 = RemoteObject.createImmutable("");Debug.locals.put("qry2", _qry2);
 BA.debugLineNum = 65;BA.debugLine="Dim c1 As Cursor";
Debug.ShouldStop(1);
_c1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("c1", _c1);
 BA.debugLineNum = 67;BA.debugLine="If txtid.Text = \"\" Or txtusername.Text = \"\" Or tx";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",adduser.mostCurrent._txtid.runMethod(true,"getText"),BA.ObjectToString("")) || RemoteObject.solveBoolean("=",adduser.mostCurrent._txtusername.runMethod(true,"getText"),BA.ObjectToString("")) || RemoteObject.solveBoolean("=",adduser.mostCurrent._txtpassword.runMethod(true,"getText"),BA.ObjectToString("")) || RemoteObject.solveBoolean("=",adduser.mostCurrent._txtpassword2.runMethod(true,"getText"),BA.ObjectToString("")) || RemoteObject.solveBoolean("=",adduser.mostCurrent._txtfname.runMethod(true,"getText"),BA.ObjectToString("")) || RemoteObject.solveBoolean("=",adduser.mostCurrent._txtlevel.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 68;BA.debugLine="ToastMessageShow(\"Please Fill out all data\", Fal";
Debug.ShouldStop(8);
adduser.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Please Fill out all data")),(Object)(adduser.mostCurrent.__c.getField(true,"False")));
 }else {
 BA.debugLineNum = 70;BA.debugLine="If txtpassword.Text = txtpassword2.Text Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",adduser.mostCurrent._txtpassword.runMethod(true,"getText"),adduser.mostCurrent._txtpassword2.runMethod(true,"getText"))) { 
 BA.debugLineNum = 71;BA.debugLine="qry = \"SELECT * FROM tbllogin where username =";
Debug.ShouldStop(64);
_qry = BA.ObjectToString("SELECT * FROM tbllogin where username = ?");Debug.locals.put("qry", _qry);
 BA.debugLineNum = 72;BA.debugLine="c1 = sql.ExecQuery2(qry, Array As String(txtuse";
Debug.ShouldStop(128);
_c1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), adduser._sql.runMethod(false,"ExecQuery2",(Object)(_qry),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {adduser.mostCurrent._txtusername.runMethod(true,"getText")}))));
 BA.debugLineNum = 74;BA.debugLine="If c1.RowCount > 0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(">",_c1.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 75;BA.debugLine="Msgbox(\"Username Already Exist\", \"\")";
Debug.ShouldStop(1024);
adduser.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Username Already Exist")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),adduser.mostCurrent.activityBA);
 BA.debugLineNum = 76;BA.debugLine="txtusername.RequestFocus";
Debug.ShouldStop(2048);
adduser.mostCurrent._txtusername.runVoidMethod ("RequestFocus");
 }else {
 BA.debugLineNum = 78;BA.debugLine="qry2 = \"INSERT INTO tbllogin(username,password";
Debug.ShouldStop(8192);
_qry2 = BA.ObjectToString("INSERT INTO tbllogin(username,password,full_name,level) VALUES (?,?,?,?)");Debug.locals.put("qry2", _qry2);
 BA.debugLineNum = 79;BA.debugLine="sql.ExecNonQuery2(qry2, Array As String(txtuse";
Debug.ShouldStop(16384);
adduser._sql.runVoidMethod ("ExecNonQuery2",(Object)(_qry2),(Object)(adduser.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {4},new Object[] {adduser.mostCurrent._txtusername.runMethod(true,"getText"),adduser.mostCurrent._txtpassword.runMethod(true,"getText"),adduser.mostCurrent._txtfname.runMethod(true,"getText"),adduser.mostCurrent._txtlevel.runMethod(true,"getText")})))));
 BA.debugLineNum = 80;BA.debugLine="Msgbox(\"User Added Successfully!\", \"\")";
Debug.ShouldStop(32768);
adduser.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("User Added Successfully!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),adduser.mostCurrent.activityBA);
 BA.debugLineNum = 81;BA.debugLine="Activity.Finish";
Debug.ShouldStop(65536);
adduser.mostCurrent._activity.runVoidMethod ("Finish");
 };
 }else {
 BA.debugLineNum = 84;BA.debugLine="Msgbox(\"Password Mismatch!\", \"\")";
Debug.ShouldStop(524288);
adduser.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Password Mismatch!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),adduser.mostCurrent.activityBA);
 };
 };
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("btnClose_Click (adduser) ","adduser",5,adduser.mostCurrent.activityBA,adduser.mostCurrent,90);
if (RapidSub.canDelegate("btnclose_click")) { return b4a.example.adduser.remoteMe.runUserSub(false, "adduser","btnclose_click");}
 BA.debugLineNum = 90;BA.debugLine="Private Sub btnClose_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 91;BA.debugLine="Activity.Finish";
Debug.ShouldStop(67108864);
adduser.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _chkpass_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("chkPass_CheckedChange (adduser) ","adduser",5,adduser.mostCurrent.activityBA,adduser.mostCurrent,94);
if (RapidSub.canDelegate("chkpass_checkedchange")) { return b4a.example.adduser.remoteMe.runUserSub(false, "adduser","chkpass_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 94;BA.debugLine="Private Sub chkPass_CheckedChange(Checked As Boole";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 95;BA.debugLine="If chkPass.Checked = True Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",adduser.mostCurrent._chkpass.runMethod(true,"getChecked"),adduser.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 96;BA.debugLine="txtpassword.PasswordMode = False";
Debug.ShouldStop(-2147483648);
adduser.mostCurrent._txtpassword.runVoidMethod ("setPasswordMode",adduser.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 97;BA.debugLine="txtpassword2.PasswordMode = False";
Debug.ShouldStop(1);
adduser.mostCurrent._txtpassword2.runVoidMethod ("setPasswordMode",adduser.mostCurrent.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 99;BA.debugLine="txtpassword.PasswordMode = True";
Debug.ShouldStop(4);
adduser.mostCurrent._txtpassword.runVoidMethod ("setPasswordMode",adduser.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 100;BA.debugLine="txtpassword2.PasswordMode = True";
Debug.ShouldStop(8);
adduser.mostCurrent._txtpassword2.runVoidMethod ("setPasswordMode",adduser.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 102;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("CopyDb (adduser) ","adduser",5,adduser.mostCurrent.activityBA,adduser.mostCurrent,56);
if (RapidSub.canDelegate("copydb")) { return b4a.example.adduser.remoteMe.runUserSub(false, "adduser","copydb", _filename);}
Debug.locals.put("Filename", _filename);
 BA.debugLineNum = 56;BA.debugLine="Sub CopyDb(Filename As String)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 58;BA.debugLine="If File.Exists(File.DirInternal, Filename) = Fals";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",adduser.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(adduser.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(_filename)),adduser.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 59;BA.debugLine="File.Copy(File.DirAssets, Filename, File.DirInte";
Debug.ShouldStop(67108864);
adduser.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(adduser.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(_filename),(Object)(adduser.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(_filename));
 };
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 23;BA.debugLine="Private txtid As EditText";
adduser.mostCurrent._txtid = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private txtusername As EditText";
adduser.mostCurrent._txtusername = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private txtpassword As EditText";
adduser.mostCurrent._txtpassword = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private txtpassword2 As EditText";
adduser.mostCurrent._txtpassword2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private txtfname As EditText";
adduser.mostCurrent._txtfname = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private txtlevel As EditText";
adduser.mostCurrent._txtlevel = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private chkPass As CheckBox";
adduser.mostCurrent._chkpass = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim sql As SQL";
adduser._sql = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 10;BA.debugLine="Dim rs As ResultSet";
adduser._rs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
 //BA.debugLineNum = 12;BA.debugLine="Dim id As String";
adduser._id = RemoteObject.createImmutable("");
 //BA.debugLineNum = 13;BA.debugLine="Dim username As String";
adduser._username = RemoteObject.createImmutable("");
 //BA.debugLineNum = 14;BA.debugLine="Dim fname As String";
adduser._fname = RemoteObject.createImmutable("");
 //BA.debugLineNum = 15;BA.debugLine="Dim password As String";
adduser._password = RemoteObject.createImmutable("");
 //BA.debugLineNum = 16;BA.debugLine="Dim level As String";
adduser._level = RemoteObject.createImmutable("");
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}