package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class editrec_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (editrec) ","editrec",4,editrec.mostCurrent.activityBA,editrec.mostCurrent,29);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.editrec.remoteMe.runUserSub(false, "editrec","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 29;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 31;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(1073741824);
if (_firsttime.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 32;BA.debugLine="CopyDb(\"catallodb.db\")";
Debug.ShouldStop(-2147483648);
_copydb(RemoteObject.createImmutable("catallodb.db"));
 BA.debugLineNum = 33;BA.debugLine="sql.Initialize(File.DirInternal, \"catallodb.db\",";
Debug.ShouldStop(1);
editrec._sql.runVoidMethod ("Initialize",(Object)(editrec.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("catallodb.db")),(Object)(editrec.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 36;BA.debugLine="Activity.LoadLayout(\"layEdit\")";
Debug.ShouldStop(8);
editrec.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("layEdit")),editrec.mostCurrent.activityBA);
 BA.debugLineNum = 38;BA.debugLine="txtnum.Text = employee_num";
Debug.ShouldStop(32);
editrec.mostCurrent._txtnum.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(editrec._employee_num));
 BA.debugLineNum = 39;BA.debugLine="txtname.Text = name";
Debug.ShouldStop(64);
editrec.mostCurrent._txtname.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(editrec._name));
 BA.debugLineNum = 40;BA.debugLine="txtaddress.Text = address";
Debug.ShouldStop(128);
editrec.mostCurrent._txtaddress.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(editrec._address));
 BA.debugLineNum = 41;BA.debugLine="txtage.Text = age";
Debug.ShouldStop(256);
editrec.mostCurrent._txtage.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(editrec._age));
 BA.debugLineNum = 42;BA.debugLine="txtgender.Text = gender";
Debug.ShouldStop(512);
editrec.mostCurrent._txtgender.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(editrec._gender));
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("Activity_Pause (editrec) ","editrec",4,editrec.mostCurrent.activityBA,editrec.mostCurrent,49);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.editrec.remoteMe.runUserSub(false, "editrec","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 49;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("Activity_Resume (editrec) ","editrec",4,editrec.mostCurrent.activityBA,editrec.mostCurrent,45);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.editrec.remoteMe.runUserSub(false, "editrec","activity_resume");}
 BA.debugLineNum = 45;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4096);
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("btnClose_Click (editrec) ","editrec",4,editrec.mostCurrent.activityBA,editrec.mostCurrent,76);
if (RapidSub.canDelegate("btnclose_click")) { return b4a.example.editrec.remoteMe.runUserSub(false, "editrec","btnclose_click");}
 BA.debugLineNum = 76;BA.debugLine="Private Sub btnClose_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 77;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4096);
editrec.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnedit_click() throws Exception{
try {
		Debug.PushSubsStack("btnEdit_Click (editrec) ","editrec",4,editrec.mostCurrent.activityBA,editrec.mostCurrent,61);
if (RapidSub.canDelegate("btnedit_click")) { return b4a.example.editrec.remoteMe.runUserSub(false, "editrec","btnedit_click");}
RemoteObject _ans = RemoteObject.createImmutable("");
RemoteObject _qry = RemoteObject.createImmutable("");
 BA.debugLineNum = 61;BA.debugLine="Private Sub btnEdit_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="Dim ans As String";
Debug.ShouldStop(536870912);
_ans = RemoteObject.createImmutable("");Debug.locals.put("ans", _ans);
 BA.debugLineNum = 63;BA.debugLine="Dim qry As String";
Debug.ShouldStop(1073741824);
_qry = RemoteObject.createImmutable("");Debug.locals.put("qry", _qry);
 BA.debugLineNum = 64;BA.debugLine="ans = Msgbox2(\"Save Changes?\", \"Update Records\",";
Debug.ShouldStop(-2147483648);
_ans = BA.NumberToString(editrec.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Save Changes?")),(Object)(BA.ObjectToCharSequence("Update Records")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("Cancel")),(Object)(BA.ObjectToString("")),(Object)((editrec.mostCurrent.__c.getField(false,"Null"))),editrec.mostCurrent.activityBA));Debug.locals.put("ans", _ans);
 BA.debugLineNum = 65;BA.debugLine="If ans = DialogResponse.POSITIVE Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_ans,BA.NumberToString(editrec.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 66;BA.debugLine="qry = \"UPDATE jer_carlo SET name = ?, address =";
Debug.ShouldStop(2);
_qry = RemoteObject.concat(RemoteObject.createImmutable("UPDATE jer_carlo SET name = ?, address = ?, age = ?, gender = ? WHERE employee_num = "),editrec.mostCurrent._txtnum.runMethod(true,"getText"),RemoteObject.createImmutable(""));Debug.locals.put("qry", _qry);
 BA.debugLineNum = 68;BA.debugLine="sql.ExecNonQuery2(qry, Array As String(txtname.T";
Debug.ShouldStop(8);
editrec._sql.runVoidMethod ("ExecNonQuery2",(Object)(_qry),(Object)(editrec.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {4},new Object[] {editrec.mostCurrent._txtname.runMethod(true,"getText"),editrec.mostCurrent._txtaddress.runMethod(true,"getText"),editrec.mostCurrent._txtage.runMethod(true,"getText"),editrec.mostCurrent._txtgender.runMethod(true,"getText")})))));
 BA.debugLineNum = 69;BA.debugLine="Msgbox(\"Records Updated\",\"\")";
Debug.ShouldStop(16);
editrec.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Records Updated")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),editrec.mostCurrent.activityBA);
 BA.debugLineNum = 70;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32);
editrec.mostCurrent._activity.runVoidMethod ("Finish");
 }else {
 BA.debugLineNum = 72;BA.debugLine="Msgbox(\"Update was cancelled!\", \"\")";
Debug.ShouldStop(128);
editrec.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Update was cancelled!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),editrec.mostCurrent.activityBA);
 };
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("CopyDb (editrec) ","editrec",4,editrec.mostCurrent.activityBA,editrec.mostCurrent,53);
if (RapidSub.canDelegate("copydb")) { return b4a.example.editrec.remoteMe.runUserSub(false, "editrec","copydb", _filename);}
Debug.locals.put("Filename", _filename);
 BA.debugLineNum = 53;BA.debugLine="Sub CopyDb(Filename As String)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 55;BA.debugLine="If File.Exists(File.DirInternal, Filename) = Fals";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",editrec.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(editrec.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(_filename)),editrec.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 56;BA.debugLine="File.Copy(File.DirAssets, Filename, File.DirInte";
Debug.ShouldStop(8388608);
editrec.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(editrec.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(_filename),(Object)(editrec.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(_filename));
 };
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 22;BA.debugLine="Private txtnum As EditText";
editrec.mostCurrent._txtnum = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private txtname As EditText";
editrec.mostCurrent._txtname = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private txtaddress As EditText";
editrec.mostCurrent._txtaddress = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private txtage As EditText";
editrec.mostCurrent._txtage = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private txtgender As EditText";
editrec.mostCurrent._txtgender = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim sql As SQL";
editrec._sql = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 11;BA.debugLine="Dim employee_num As String";
editrec._employee_num = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="Dim name As String";
editrec._name = RemoteObject.createImmutable("");
 //BA.debugLineNum = 13;BA.debugLine="Dim address As String";
editrec._address = RemoteObject.createImmutable("");
 //BA.debugLineNum = 14;BA.debugLine="Dim age As String";
editrec._age = RemoteObject.createImmutable("");
 //BA.debugLineNum = 15;BA.debugLine="Dim gender As String";
editrec._gender = RemoteObject.createImmutable("");
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}