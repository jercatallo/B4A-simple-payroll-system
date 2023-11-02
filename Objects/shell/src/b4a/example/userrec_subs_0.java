package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class userrec_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (userrec) ","userrec",7,userrec.mostCurrent.activityBA,userrec.mostCurrent,22);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.userrec.remoteMe.runUserSub(false, "userrec","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 22;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 24;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(8388608);
if (_firsttime.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 25;BA.debugLine="CopyDb(\"catallodb.db\")";
Debug.ShouldStop(16777216);
_copydb(RemoteObject.createImmutable("catallodb.db"));
 BA.debugLineNum = 26;BA.debugLine="sql.Initialize(File.DirInternal, \"catallodb.db\",";
Debug.ShouldStop(33554432);
userrec._sql.runVoidMethod ("Initialize",(Object)(userrec.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("catallodb.db")),(Object)(userrec.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 29;BA.debugLine="Activity.LoadLayout(\"layUser\")";
Debug.ShouldStop(268435456);
userrec.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("layUser")),userrec.mostCurrent.activityBA);
 BA.debugLineNum = 31;BA.debugLine="B4XTable1.AddColumn(\"ID\", B4XTable1.COLUMN_TYPE_T";
Debug.ShouldStop(1073741824);
userrec.mostCurrent._b4xtable1.runClassMethod (b4a.example.b4xtable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ID")),(Object)(userrec.mostCurrent._b4xtable1.getField(true,"_column_type_text" /*RemoteObject*/ )));
 BA.debugLineNum = 32;BA.debugLine="B4XTable1.AddColumn(\"Username\", B4XTable1.COLUMN_";
Debug.ShouldStop(-2147483648);
userrec.mostCurrent._b4xtable1.runClassMethod (b4a.example.b4xtable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Username")),(Object)(userrec.mostCurrent._b4xtable1.getField(true,"_column_type_text" /*RemoteObject*/ )));
 BA.debugLineNum = 33;BA.debugLine="B4XTable1.AddColumn(\"Password\", B4XTable1.COLUMN_";
Debug.ShouldStop(1);
userrec.mostCurrent._b4xtable1.runClassMethod (b4a.example.b4xtable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Password")),(Object)(userrec.mostCurrent._b4xtable1.getField(true,"_column_type_text" /*RemoteObject*/ )));
 BA.debugLineNum = 34;BA.debugLine="B4XTable1.AddColumn(\"Full Name\", B4XTable1.COLUMN";
Debug.ShouldStop(2);
userrec.mostCurrent._b4xtable1.runClassMethod (b4a.example.b4xtable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Full Name")),(Object)(userrec.mostCurrent._b4xtable1.getField(true,"_column_type_text" /*RemoteObject*/ )));
 BA.debugLineNum = 35;BA.debugLine="B4XTable1.AddColumn(\"Level\", B4XTable1.COLUMN_TYP";
Debug.ShouldStop(4);
userrec.mostCurrent._b4xtable1.runClassMethod (b4a.example.b4xtable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Level")),(Object)(userrec.mostCurrent._b4xtable1.getField(true,"_column_type_text" /*RemoteObject*/ )));
 BA.debugLineNum = 37;BA.debugLine="ShowList";
Debug.ShouldStop(16);
_showlist();
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("Activity_Pause (userrec) ","userrec",7,userrec.mostCurrent.activityBA,userrec.mostCurrent,44);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.userrec.remoteMe.runUserSub(false, "userrec","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 44;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2048);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (userrec) ","userrec",7,userrec.mostCurrent.activityBA,userrec.mostCurrent,40);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.userrec.remoteMe.runUserSub(false, "userrec","activity_resume");}
 BA.debugLineNum = 40;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="ShowList";
Debug.ShouldStop(256);
_showlist();
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnadduser_click() throws Exception{
try {
		Debug.PushSubsStack("btnAddUser_Click (userrec) ","userrec",7,userrec.mostCurrent.activityBA,userrec.mostCurrent,76);
if (RapidSub.canDelegate("btnadduser_click")) { return b4a.example.userrec.remoteMe.runUserSub(false, "userrec","btnadduser_click");}
 BA.debugLineNum = 76;BA.debugLine="Private Sub btnAddUser_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 77;BA.debugLine="StartActivity(AddUser)";
Debug.ShouldStop(4096);
userrec.mostCurrent.__c.runVoidMethod ("StartActivity",userrec.processBA,(Object)((userrec.mostCurrent._adduser.getObject())));
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
public static RemoteObject  _btnclose_click() throws Exception{
try {
		Debug.PushSubsStack("btnClose_Click (userrec) ","userrec",7,userrec.mostCurrent.activityBA,userrec.mostCurrent,72);
if (RapidSub.canDelegate("btnclose_click")) { return b4a.example.userrec.remoteMe.runUserSub(false, "userrec","btnclose_click");}
 BA.debugLineNum = 72;BA.debugLine="Private Sub btnClose_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="Activity.Finish";
Debug.ShouldStop(256);
userrec.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _btnedit_click() throws Exception{
try {
		Debug.PushSubsStack("btnEdit_Click (userrec) ","userrec",7,userrec.mostCurrent.activityBA,userrec.mostCurrent,80);
if (RapidSub.canDelegate("btnedit_click")) { return b4a.example.userrec.remoteMe.runUserSub(false, "userrec","btnedit_click");}
RemoteObject _ans2 = RemoteObject.createImmutable("");
RemoteObject _enum2 = RemoteObject.createImmutable("");
RemoteObject _qry = RemoteObject.createImmutable("");
RemoteObject _c2 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 BA.debugLineNum = 80;BA.debugLine="Private Sub btnEdit_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 81;BA.debugLine="Dim ans2 As String";
Debug.ShouldStop(65536);
_ans2 = RemoteObject.createImmutable("");Debug.locals.put("ans2", _ans2);
 BA.debugLineNum = 82;BA.debugLine="Dim enum2 As String";
Debug.ShouldStop(131072);
_enum2 = RemoteObject.createImmutable("");Debug.locals.put("enum2", _enum2);
 BA.debugLineNum = 83;BA.debugLine="Dim qry As String";
Debug.ShouldStop(262144);
_qry = RemoteObject.createImmutable("");Debug.locals.put("qry", _qry);
 BA.debugLineNum = 84;BA.debugLine="Dim c2 As Cursor";
Debug.ShouldStop(524288);
_c2 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("c2", _c2);
 BA.debugLineNum = 85;BA.debugLine="inpdlg.Input=\"\"";
Debug.ShouldStop(1048576);
userrec.mostCurrent._inpdlg.runMethod(true,"setInput",BA.ObjectToString(""));
 BA.debugLineNum = 86;BA.debugLine="ans2 = inpdlg.Show(\"Enter Employee Number\",\"Updat";
Debug.ShouldStop(2097152);
_ans2 = BA.NumberToString(userrec.mostCurrent._inpdlg.runMethodAndSync(true,"Show",(Object)(BA.ObjectToString("Enter Employee Number")),(Object)(BA.ObjectToString("Update Records")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("Cancel")),(Object)(BA.ObjectToString("")),userrec.mostCurrent.activityBA,(Object)((userrec.mostCurrent.__c.getField(false,"Null")))));Debug.locals.put("ans2", _ans2);
 BA.debugLineNum = 88;BA.debugLine="If ans2 = DialogResponse.POSITIVE Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_ans2,BA.NumberToString(userrec.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 89;BA.debugLine="enum2 = inpdlg.Input";
Debug.ShouldStop(16777216);
_enum2 = userrec.mostCurrent._inpdlg.runMethod(true,"getInput");Debug.locals.put("enum2", _enum2);
 BA.debugLineNum = 90;BA.debugLine="qry = \"Select * from tbllogin where id = ?\"";
Debug.ShouldStop(33554432);
_qry = BA.ObjectToString("Select * from tbllogin where id = ?");Debug.locals.put("qry", _qry);
 BA.debugLineNum = 91;BA.debugLine="c2 = sql.ExecQuery2(qry, Array As String(enum2))";
Debug.ShouldStop(67108864);
_c2 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), userrec._sql.runMethod(false,"ExecQuery2",(Object)(_qry),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_enum2}))));
 BA.debugLineNum = 92;BA.debugLine="If c2.RowCount > 0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(">",_c2.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 93;BA.debugLine="c2.Position = 0";
Debug.ShouldStop(268435456);
_c2.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 94;BA.debugLine="EditUser.fname = c2.GetString(\"full_name\")";
Debug.ShouldStop(536870912);
userrec.mostCurrent._edituser._fname /*RemoteObject*/  = _c2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("full_name")));
 BA.debugLineNum = 95;BA.debugLine="EditUser.id = c2.GetString(\"id\")";
Debug.ShouldStop(1073741824);
userrec.mostCurrent._edituser._id /*RemoteObject*/  = _c2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("id")));
 BA.debugLineNum = 96;BA.debugLine="EditUser.password = c2.GetString(\"password\")";
Debug.ShouldStop(-2147483648);
userrec.mostCurrent._edituser._password /*RemoteObject*/  = _c2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("password")));
 BA.debugLineNum = 97;BA.debugLine="EditUser.username = c2.GetString(\"username\")";
Debug.ShouldStop(1);
userrec.mostCurrent._edituser._username /*RemoteObject*/  = _c2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("username")));
 BA.debugLineNum = 98;BA.debugLine="EditUser.level = c2.GetString(\"level\")";
Debug.ShouldStop(2);
userrec.mostCurrent._edituser._level /*RemoteObject*/  = _c2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("level")));
 BA.debugLineNum = 99;BA.debugLine="StartActivity(EditUser)";
Debug.ShouldStop(4);
userrec.mostCurrent.__c.runVoidMethod ("StartActivity",userrec.processBA,(Object)((userrec.mostCurrent._edituser.getObject())));
 }else {
 BA.debugLineNum = 101;BA.debugLine="Msgbox(\"No records found\",\"\")";
Debug.ShouldStop(16);
userrec.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No records found")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),userrec.mostCurrent.activityBA);
 };
 };
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("CopyDb (userrec) ","userrec",7,userrec.mostCurrent.activityBA,userrec.mostCurrent,48);
if (RapidSub.canDelegate("copydb")) { return b4a.example.userrec.remoteMe.runUserSub(false, "userrec","copydb", _filename);}
Debug.locals.put("Filename", _filename);
 BA.debugLineNum = 48;BA.debugLine="Sub CopyDb(Filename As String)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 50;BA.debugLine="If File.Exists(File.DirInternal, Filename) = Fals";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",userrec.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(userrec.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(_filename)),userrec.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 51;BA.debugLine="File.Copy(File.DirAssets, Filename, File.DirInte";
Debug.ShouldStop(262144);
userrec.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(userrec.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(_filename),(Object)(userrec.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(_filename));
 };
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private B4XTable1 As B4XTable";
userrec.mostCurrent._b4xtable1 = RemoteObject.createNew ("b4a.example.b4xtable");
 //BA.debugLineNum = 19;BA.debugLine="Dim inpdlg As InputDialog";
userrec.mostCurrent._inpdlg = RemoteObject.createNew ("anywheresoftware.b4a.agraham.dialogs.InputDialog");
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim sql As SQL";
userrec._sql = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 10;BA.debugLine="Dim rs As ResultSet";
userrec._rs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _showlist() throws Exception{
try {
		Debug.PushSubsStack("ShowList (userrec) ","userrec",7,userrec.mostCurrent.activityBA,userrec.mostCurrent,55);
if (RapidSub.canDelegate("showlist")) { return b4a.example.userrec.remoteMe.runUserSub(false, "userrec","showlist");}
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = null;
 BA.debugLineNum = 55;BA.debugLine="Sub ShowList";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="Dim data As List";
Debug.ShouldStop(8388608);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("data", _data);
 BA.debugLineNum = 57;BA.debugLine="data.Initialize";
Debug.ShouldStop(16777216);
_data.runVoidMethod ("Initialize");
 BA.debugLineNum = 58;BA.debugLine="rs = sql.ExecQuery(\"Select * from tbllogin\")";
Debug.ShouldStop(33554432);
userrec._rs = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), userrec._sql.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * from tbllogin"))));
 BA.debugLineNum = 59;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(67108864);
while (userrec._rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 60;BA.debugLine="Dim row(5) As Object";
Debug.ShouldStop(134217728);
_row = RemoteObject.createNewArray ("Object", new int[] {5}, new Object[]{});Debug.locals.put("row", _row);
 BA.debugLineNum = 61;BA.debugLine="row(0) = rs.GetInt(\"id\")";
Debug.ShouldStop(268435456);
_row.setArrayElement ((userrec._rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id")))),BA.numberCast(int.class, 0));
 BA.debugLineNum = 62;BA.debugLine="row(1) = rs.GetString(\"username\")";
Debug.ShouldStop(536870912);
_row.setArrayElement ((userrec._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("username")))),BA.numberCast(int.class, 1));
 BA.debugLineNum = 63;BA.debugLine="row(2) = rs.GetString(\"password\")";
Debug.ShouldStop(1073741824);
_row.setArrayElement ((userrec._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("password")))),BA.numberCast(int.class, 2));
 BA.debugLineNum = 64;BA.debugLine="row(3) = rs.GetString(\"full_name\")";
Debug.ShouldStop(-2147483648);
_row.setArrayElement ((userrec._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("full_name")))),BA.numberCast(int.class, 3));
 BA.debugLineNum = 65;BA.debugLine="row(4) = rs.GetString(\"level\")";
Debug.ShouldStop(1);
_row.setArrayElement ((userrec._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("level")))),BA.numberCast(int.class, 4));
 BA.debugLineNum = 66;BA.debugLine="data.Add(row)";
Debug.ShouldStop(2);
_data.runVoidMethod ("Add",(Object)((_row)));
 }
;
 BA.debugLineNum = 68;BA.debugLine="rs.Close";
Debug.ShouldStop(8);
userrec._rs.runVoidMethod ("Close");
 BA.debugLineNum = 69;BA.debugLine="B4XTable1.SetData(data)";
Debug.ShouldStop(16);
userrec.mostCurrent._b4xtable1.runClassMethod (b4a.example.b4xtable.class, "_setdata" /*RemoteObject*/ ,(Object)(_data));
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}