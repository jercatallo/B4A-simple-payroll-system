package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class edituser_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (edituser) ","edituser",6,edituser.mostCurrent.activityBA,edituser.mostCurrent,31);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.edituser.remoteMe.runUserSub(false, "edituser","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 31;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 33;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(1);
if (_firsttime.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 34;BA.debugLine="CopyDb(\"catallodb.db\")";
Debug.ShouldStop(2);
_copydb(RemoteObject.createImmutable("catallodb.db"));
 BA.debugLineNum = 35;BA.debugLine="sql.Initialize(File.DirInternal, \"catallodb.db\",";
Debug.ShouldStop(4);
edituser._sql.runVoidMethod ("Initialize",(Object)(edituser.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("catallodb.db")),(Object)(edituser.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 38;BA.debugLine="Activity.LoadLayout(\"layEditUser\")";
Debug.ShouldStop(32);
edituser.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("layEditUser")),edituser.mostCurrent.activityBA);
 BA.debugLineNum = 40;BA.debugLine="txtusername.Text = username";
Debug.ShouldStop(128);
edituser.mostCurrent._txtusername.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(edituser._username));
 BA.debugLineNum = 41;BA.debugLine="txtpassword.Text = password";
Debug.ShouldStop(256);
edituser.mostCurrent._txtpassword.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(edituser._password));
 BA.debugLineNum = 42;BA.debugLine="txtid.Text = id";
Debug.ShouldStop(512);
edituser.mostCurrent._txtid.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(edituser._id));
 BA.debugLineNum = 43;BA.debugLine="txtfname.Text = fname";
Debug.ShouldStop(1024);
edituser.mostCurrent._txtfname.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(edituser._fname));
 BA.debugLineNum = 44;BA.debugLine="txtlevel.Text = level";
Debug.ShouldStop(2048);
edituser.mostCurrent._txtlevel.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(edituser._level));
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("Activity_Pause (edituser) ","edituser",6,edituser.mostCurrent.activityBA,edituser.mostCurrent,51);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.edituser.remoteMe.runUserSub(false, "edituser","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 51;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("Activity_Resume (edituser) ","edituser",6,edituser.mostCurrent.activityBA,edituser.mostCurrent,47);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.edituser.remoteMe.runUserSub(false, "edituser","activity_resume");}
 BA.debugLineNum = 47;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(16384);
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("btnClose_Click (edituser) ","edituser",6,edituser.mostCurrent.activityBA,edituser.mostCurrent,77);
if (RapidSub.canDelegate("btnclose_click")) { return b4a.example.edituser.remoteMe.runUserSub(false, "edituser","btnclose_click");}
 BA.debugLineNum = 77;BA.debugLine="Private Sub btnClose_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 78;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8192);
edituser.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnsave_click() throws Exception{
try {
		Debug.PushSubsStack("btnSave_Click (edituser) ","edituser",6,edituser.mostCurrent.activityBA,edituser.mostCurrent,62);
if (RapidSub.canDelegate("btnsave_click")) { return b4a.example.edituser.remoteMe.runUserSub(false, "edituser","btnsave_click");}
RemoteObject _ans = RemoteObject.createImmutable("");
RemoteObject _qry = RemoteObject.createImmutable("");
 BA.debugLineNum = 62;BA.debugLine="Private Sub btnSave_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="Dim ans As String";
Debug.ShouldStop(1073741824);
_ans = RemoteObject.createImmutable("");Debug.locals.put("ans", _ans);
 BA.debugLineNum = 64;BA.debugLine="Dim qry As String";
Debug.ShouldStop(-2147483648);
_qry = RemoteObject.createImmutable("");Debug.locals.put("qry", _qry);
 BA.debugLineNum = 65;BA.debugLine="ans = Msgbox2(\"Save Changes?\", \"Update Records\",";
Debug.ShouldStop(1);
_ans = BA.NumberToString(edituser.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Save Changes?")),(Object)(BA.ObjectToCharSequence("Update Records")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("Cancel")),(Object)(BA.ObjectToString("")),(Object)((edituser.mostCurrent.__c.getField(false,"Null"))),edituser.mostCurrent.activityBA));Debug.locals.put("ans", _ans);
 BA.debugLineNum = 66;BA.debugLine="If ans = DialogResponse.POSITIVE Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_ans,BA.NumberToString(edituser.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 67;BA.debugLine="qry = \"UPDATE tbllogin SET username = ?, passwor";
Debug.ShouldStop(4);
_qry = RemoteObject.concat(RemoteObject.createImmutable("UPDATE tbllogin SET username = ?, password = ?, full_name = ?, level = ? WHERE id = "),edituser.mostCurrent._txtid.runMethod(true,"getText"),RemoteObject.createImmutable(""));Debug.locals.put("qry", _qry);
 BA.debugLineNum = 69;BA.debugLine="sql.ExecNonQuery2(qry, Array As String(txtuserna";
Debug.ShouldStop(16);
edituser._sql.runVoidMethod ("ExecNonQuery2",(Object)(_qry),(Object)(edituser.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {4},new Object[] {edituser.mostCurrent._txtusername.runMethod(true,"getText"),edituser.mostCurrent._txtpassword.runMethod(true,"getText"),edituser.mostCurrent._txtfname.runMethod(true,"getText"),edituser.mostCurrent._txtlevel.runMethod(true,"getText")})))));
 BA.debugLineNum = 70;BA.debugLine="Msgbox(\"Records Updated\",\"\")";
Debug.ShouldStop(32);
edituser.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Records Updated")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),edituser.mostCurrent.activityBA);
 BA.debugLineNum = 71;BA.debugLine="Activity.Finish";
Debug.ShouldStop(64);
edituser.mostCurrent._activity.runVoidMethod ("Finish");
 }else {
 BA.debugLineNum = 73;BA.debugLine="Msgbox(\"Update was cancelled!\", \"\")";
Debug.ShouldStop(256);
edituser.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Update was cancelled!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),edituser.mostCurrent.activityBA);
 };
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("chkPass_CheckedChange (edituser) ","edituser",6,edituser.mostCurrent.activityBA,edituser.mostCurrent,81);
if (RapidSub.canDelegate("chkpass_checkedchange")) { return b4a.example.edituser.remoteMe.runUserSub(false, "edituser","chkpass_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 81;BA.debugLine="Private Sub chkPass_CheckedChange(Checked As Boole";
Debug.ShouldStop(65536);
 BA.debugLineNum = 82;BA.debugLine="If chkPass.Checked = True Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",edituser.mostCurrent._chkpass.runMethod(true,"getChecked"),edituser.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 83;BA.debugLine="txtpassword.PasswordMode = False";
Debug.ShouldStop(262144);
edituser.mostCurrent._txtpassword.runVoidMethod ("setPasswordMode",edituser.mostCurrent.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 85;BA.debugLine="txtpassword.PasswordMode = True";
Debug.ShouldStop(1048576);
edituser.mostCurrent._txtpassword.runVoidMethod ("setPasswordMode",edituser.mostCurrent.__c.getField(true,"True"));
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
public static RemoteObject  _copydb(RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("CopyDb (edituser) ","edituser",6,edituser.mostCurrent.activityBA,edituser.mostCurrent,55);
if (RapidSub.canDelegate("copydb")) { return b4a.example.edituser.remoteMe.runUserSub(false, "edituser","copydb", _filename);}
Debug.locals.put("Filename", _filename);
 BA.debugLineNum = 55;BA.debugLine="Sub CopyDb(Filename As String)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 57;BA.debugLine="If File.Exists(File.DirInternal, Filename) = Fals";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",edituser.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(edituser.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(_filename)),edituser.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 58;BA.debugLine="File.Copy(File.DirAssets, Filename, File.DirInte";
Debug.ShouldStop(33554432);
edituser.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(edituser.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(_filename),(Object)(edituser.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(_filename));
 };
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
edituser.mostCurrent._txtid = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private txtusername As EditText";
edituser.mostCurrent._txtusername = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private txtpassword As EditText";
edituser.mostCurrent._txtpassword = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private txtfname As EditText";
edituser.mostCurrent._txtfname = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private txtlevel As EditText";
edituser.mostCurrent._txtlevel = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private chkPass As CheckBox";
edituser.mostCurrent._chkpass = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim sql As SQL";
edituser._sql = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 10;BA.debugLine="Dim rs As ResultSet";
edituser._rs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
 //BA.debugLineNum = 12;BA.debugLine="Dim id As String";
edituser._id = RemoteObject.createImmutable("");
 //BA.debugLineNum = 13;BA.debugLine="Dim username As String";
edituser._username = RemoteObject.createImmutable("");
 //BA.debugLineNum = 14;BA.debugLine="Dim fname As String";
edituser._fname = RemoteObject.createImmutable("");
 //BA.debugLineNum = 15;BA.debugLine="Dim password As String";
edituser._password = RemoteObject.createImmutable("");
 //BA.debugLineNum = 16;BA.debugLine="Dim level As String";
edituser._level = RemoteObject.createImmutable("");
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}