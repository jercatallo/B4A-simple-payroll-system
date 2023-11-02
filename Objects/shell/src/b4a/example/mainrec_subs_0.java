package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class mainrec_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (mainrec) ","mainrec",2,mainrec.mostCurrent.activityBA,mainrec.mostCurrent,35);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.mainrec.remoteMe.runUserSub(false, "mainrec","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 35;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 37;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(16);
if (_firsttime.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 38;BA.debugLine="CopyDb(\"catallodb.db\")";
Debug.ShouldStop(32);
_copydb(RemoteObject.createImmutable("catallodb.db"));
 BA.debugLineNum = 39;BA.debugLine="sql.Initialize(File.DirInternal, \"catallodb.db\",";
Debug.ShouldStop(64);
mainrec._sql.runVoidMethod ("Initialize",(Object)(mainrec.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("catallodb.db")),(Object)(mainrec.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 42;BA.debugLine="Activity.LoadLayout(\"layMain\")";
Debug.ShouldStop(512);
mainrec.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("layMain")),mainrec.mostCurrent.activityBA);
 BA.debugLineNum = 44;BA.debugLine="B4XTable1.AddColumn(\"Employee Number\", B4XTable1.";
Debug.ShouldStop(2048);
mainrec.mostCurrent._b4xtable1.runClassMethod (b4a.example.b4xtable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Employee Number")),(Object)(mainrec.mostCurrent._b4xtable1.getField(true,"_column_type_text" /*RemoteObject*/ )));
 BA.debugLineNum = 45;BA.debugLine="B4XTable1.AddColumn(\"Name\", B4XTable1.COLUMN_TYPE";
Debug.ShouldStop(4096);
mainrec.mostCurrent._b4xtable1.runClassMethod (b4a.example.b4xtable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Name")),(Object)(mainrec.mostCurrent._b4xtable1.getField(true,"_column_type_text" /*RemoteObject*/ )));
 BA.debugLineNum = 46;BA.debugLine="B4XTable1.AddColumn(\"Address\", B4XTable1.COLUMN_T";
Debug.ShouldStop(8192);
mainrec.mostCurrent._b4xtable1.runClassMethod (b4a.example.b4xtable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Address")),(Object)(mainrec.mostCurrent._b4xtable1.getField(true,"_column_type_text" /*RemoteObject*/ )));
 BA.debugLineNum = 47;BA.debugLine="B4XTable1.AddColumn(\"Age\", B4XTable1.COLUMN_TYPE_";
Debug.ShouldStop(16384);
mainrec.mostCurrent._b4xtable1.runClassMethod (b4a.example.b4xtable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Age")),(Object)(mainrec.mostCurrent._b4xtable1.getField(true,"_column_type_text" /*RemoteObject*/ )));
 BA.debugLineNum = 48;BA.debugLine="B4XTable1.AddColumn(\"Gender\", B4XTable1.COLUMN_TY";
Debug.ShouldStop(32768);
mainrec.mostCurrent._b4xtable1.runClassMethod (b4a.example.b4xtable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Gender")),(Object)(mainrec.mostCurrent._b4xtable1.getField(true,"_column_type_text" /*RemoteObject*/ )));
 BA.debugLineNum = 49;BA.debugLine="B4XTable1.AddColumn(\"Days\", B4XTable1.COLUMN_TYPE";
Debug.ShouldStop(65536);
mainrec.mostCurrent._b4xtable1.runClassMethod (b4a.example.b4xtable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Days")),(Object)(mainrec.mostCurrent._b4xtable1.getField(true,"_column_type_text" /*RemoteObject*/ )));
 BA.debugLineNum = 50;BA.debugLine="B4XTable1.AddColumn(\"Rate\", B4XTable1.COLUMN_TYPE";
Debug.ShouldStop(131072);
mainrec.mostCurrent._b4xtable1.runClassMethod (b4a.example.b4xtable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Rate")),(Object)(mainrec.mostCurrent._b4xtable1.getField(true,"_column_type_text" /*RemoteObject*/ )));
 BA.debugLineNum = 51;BA.debugLine="B4XTable1.AddColumn(\"Salary\", B4XTable1.COLUMN_TY";
Debug.ShouldStop(262144);
mainrec.mostCurrent._b4xtable1.runClassMethod (b4a.example.b4xtable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Salary")),(Object)(mainrec.mostCurrent._b4xtable1.getField(true,"_column_type_text" /*RemoteObject*/ )));
 BA.debugLineNum = 53;BA.debugLine="ShowList";
Debug.ShouldStop(1048576);
_showlist();
 BA.debugLineNum = 57;BA.debugLine="Spinner1.Add(fname)";
Debug.ShouldStop(16777216);
mainrec.mostCurrent._spinner1.runVoidMethod ("Add",(Object)(mainrec._fname));
 BA.debugLineNum = 58;BA.debugLine="Spinner1.Add(\"Edit Profile\")";
Debug.ShouldStop(33554432);
mainrec.mostCurrent._spinner1.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Edit Profile")));
 BA.debugLineNum = 59;BA.debugLine="Spinner1.Add(\"Logout\")";
Debug.ShouldStop(67108864);
mainrec.mostCurrent._spinner1.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Logout")));
 BA.debugLineNum = 60;BA.debugLine="Spinner1.Add(\"Exit\")";
Debug.ShouldStop(134217728);
mainrec.mostCurrent._spinner1.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Exit")));
 BA.debugLineNum = 62;BA.debugLine="If level = 2 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",mainrec._level,BA.NumberToString(2))) { 
 BA.debugLineNum = 63;BA.debugLine="btnUser.Visible = False";
Debug.ShouldStop(1073741824);
mainrec.mostCurrent._btnuser.runMethod(true,"setVisible",mainrec.mostCurrent.__c.getField(true,"False"));
 }else 
{ BA.debugLineNum = 64;BA.debugLine="Else if level = 3 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",mainrec._level,BA.NumberToString(3))) { 
 BA.debugLineNum = 65;BA.debugLine="btnUser.Visible = False";
Debug.ShouldStop(1);
mainrec.mostCurrent._btnuser.runMethod(true,"setVisible",mainrec.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 66;BA.debugLine="btnEdit.Visible = False";
Debug.ShouldStop(2);
mainrec.mostCurrent._btnedit.runMethod(true,"setVisible",mainrec.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 67;BA.debugLine="btnDelete.Visible = False";
Debug.ShouldStop(4);
mainrec.mostCurrent._btndelete.runMethod(true,"setVisible",mainrec.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 68;BA.debugLine="btnAdd.Visible = False";
Debug.ShouldStop(8);
mainrec.mostCurrent._btnadd.runMethod(true,"setVisible",mainrec.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 69;BA.debugLine="btnEditSalary.Visible = False";
Debug.ShouldStop(16);
mainrec.mostCurrent._btneditsalary.runMethod(true,"setVisible",mainrec.mostCurrent.__c.getField(true,"False"));
 }}
;
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("Activity_Pause (mainrec) ","mainrec",2,mainrec.mostCurrent.activityBA,mainrec.mostCurrent,77);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.mainrec.remoteMe.runUserSub(false, "mainrec","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 77;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4096);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (mainrec) ","mainrec",2,mainrec.mostCurrent.activityBA,mainrec.mostCurrent,73);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.mainrec.remoteMe.runUserSub(false, "mainrec","activity_resume");}
 BA.debugLineNum = 73;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(256);
 BA.debugLineNum = 74;BA.debugLine="ShowList";
Debug.ShouldStop(512);
_showlist();
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
public static RemoteObject  _btnadd_click() throws Exception{
try {
		Debug.PushSubsStack("btnAdd_Click (mainrec) ","mainrec",2,mainrec.mostCurrent.activityBA,mainrec.mostCurrent,212);
if (RapidSub.canDelegate("btnadd_click")) { return b4a.example.mainrec.remoteMe.runUserSub(false, "mainrec","btnadd_click");}
 BA.debugLineNum = 212;BA.debugLine="Private Sub btnAdd_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 213;BA.debugLine="StartActivity(AddRec)";
Debug.ShouldStop(1048576);
mainrec.mostCurrent.__c.runVoidMethod ("StartActivity",mainrec.processBA,(Object)((mainrec.mostCurrent._addrec.getObject())));
 BA.debugLineNum = 214;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btndelete_click() throws Exception{
try {
		Debug.PushSubsStack("btnDelete_Click (mainrec) ","mainrec",2,mainrec.mostCurrent.activityBA,mainrec.mostCurrent,178);
if (RapidSub.canDelegate("btndelete_click")) { return b4a.example.mainrec.remoteMe.runUserSub(false, "mainrec","btndelete_click");}
RemoteObject _ans = RemoteObject.createImmutable("");
RemoteObject _enum = RemoteObject.createImmutable("");
RemoteObject _qry = RemoteObject.createImmutable("");
RemoteObject _qry2 = RemoteObject.createImmutable("");
RemoteObject _qry3 = RemoteObject.createImmutable("");
RemoteObject _x = RemoteObject.createImmutable("");
 BA.debugLineNum = 178;BA.debugLine="Private Sub btnDelete_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 179;BA.debugLine="Dim ans As String";
Debug.ShouldStop(262144);
_ans = RemoteObject.createImmutable("");Debug.locals.put("ans", _ans);
 BA.debugLineNum = 180;BA.debugLine="Dim enum As String";
Debug.ShouldStop(524288);
_enum = RemoteObject.createImmutable("");Debug.locals.put("enum", _enum);
 BA.debugLineNum = 181;BA.debugLine="Dim qry, qry2, qry3 As String";
Debug.ShouldStop(1048576);
_qry = RemoteObject.createImmutable("");Debug.locals.put("qry", _qry);
_qry2 = RemoteObject.createImmutable("");Debug.locals.put("qry2", _qry2);
_qry3 = RemoteObject.createImmutable("");Debug.locals.put("qry3", _qry3);
 BA.debugLineNum = 182;BA.debugLine="Dim c1 As Cursor";
Debug.ShouldStop(2097152);
mainrec._c1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 BA.debugLineNum = 184;BA.debugLine="inpdlg.Input = \"\"";
Debug.ShouldStop(8388608);
mainrec.mostCurrent._inpdlg.runMethod(true,"setInput",BA.ObjectToString(""));
 BA.debugLineNum = 185;BA.debugLine="ans = inpdlg.Show(\"Enter Employee Number\", \"Delet";
Debug.ShouldStop(16777216);
_ans = BA.NumberToString(mainrec.mostCurrent._inpdlg.runMethodAndSync(true,"Show",(Object)(BA.ObjectToString("Enter Employee Number")),(Object)(BA.ObjectToString("Deleting of Record")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("Cancel")),(Object)(BA.ObjectToString("")),mainrec.mostCurrent.activityBA,(Object)((mainrec.mostCurrent.__c.getField(false,"Null")))));Debug.locals.put("ans", _ans);
 BA.debugLineNum = 187;BA.debugLine="If ans = DialogResponse.POSITIVE Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_ans,BA.NumberToString(mainrec.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 188;BA.debugLine="enum = inpdlg.Input";
Debug.ShouldStop(134217728);
_enum = mainrec.mostCurrent._inpdlg.runMethod(true,"getInput");Debug.locals.put("enum", _enum);
 BA.debugLineNum = 189;BA.debugLine="qry = \"SELECT * FROM jer_carlo WHERE employee_nu";
Debug.ShouldStop(268435456);
_qry = BA.ObjectToString("SELECT * FROM jer_carlo WHERE employee_num = ?");Debug.locals.put("qry", _qry);
 BA.debugLineNum = 190;BA.debugLine="c1 = sql.ExecQuery2(qry, Array As String(enum))";
Debug.ShouldStop(536870912);
mainrec._c1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mainrec._sql.runMethod(false,"ExecQuery2",(Object)(_qry),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_enum}))));
 BA.debugLineNum = 191;BA.debugLine="If c1.RowCount > 0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(">",mainrec._c1.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 192;BA.debugLine="Dim x As String";
Debug.ShouldStop(-2147483648);
_x = RemoteObject.createImmutable("");Debug.locals.put("x", _x);
 BA.debugLineNum = 193;BA.debugLine="x = Msgbox2(\"Delete this record?\",\"Deleting\",\"O";
Debug.ShouldStop(1);
_x = BA.NumberToString(mainrec.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Delete this record?")),(Object)(BA.ObjectToCharSequence("Deleting")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("Cancel")),(Object)(BA.ObjectToString("")),(Object)((mainrec.mostCurrent.__c.getField(false,"Null"))),mainrec.mostCurrent.activityBA));Debug.locals.put("x", _x);
 BA.debugLineNum = 194;BA.debugLine="If x = DialogResponse.POSITIVE Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_x,BA.NumberToString(mainrec.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 195;BA.debugLine="qry2 = \"Delete from jer_carlo where employee_n";
Debug.ShouldStop(4);
_qry2 = BA.ObjectToString("Delete from jer_carlo where employee_num = ?");Debug.locals.put("qry2", _qry2);
 BA.debugLineNum = 196;BA.debugLine="sql.ExecNonQuery2(qry2, Array As String(enum))";
Debug.ShouldStop(8);
mainrec._sql.runVoidMethod ("ExecNonQuery2",(Object)(_qry2),(Object)(mainrec.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_enum})))));
 BA.debugLineNum = 198;BA.debugLine="qry3 = \"Delete from doctolero where employee_n";
Debug.ShouldStop(32);
_qry3 = BA.ObjectToString("Delete from doctolero where employee_num = ?");Debug.locals.put("qry3", _qry3);
 BA.debugLineNum = 199;BA.debugLine="sql.ExecNonQuery2(qry3, Array As String(enum))";
Debug.ShouldStop(64);
mainrec._sql.runVoidMethod ("ExecNonQuery2",(Object)(_qry3),(Object)(mainrec.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_enum})))));
 BA.debugLineNum = 200;BA.debugLine="ShowList";
Debug.ShouldStop(128);
_showlist();
 }else {
 BA.debugLineNum = 202;BA.debugLine="Msgbox(\"Deletion cancelled\",\"\")";
Debug.ShouldStop(512);
mainrec.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Deletion cancelled")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),mainrec.mostCurrent.activityBA);
 };
 }else {
 BA.debugLineNum = 206;BA.debugLine="Msgbox(\"No record found\",\"\")";
Debug.ShouldStop(8192);
mainrec.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No record found")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),mainrec.mostCurrent.activityBA);
 BA.debugLineNum = 207;BA.debugLine="ShowList";
Debug.ShouldStop(16384);
_showlist();
 };
 };
 BA.debugLineNum = 210;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("btnEdit_Click (mainrec) ","mainrec",2,mainrec.mostCurrent.activityBA,mainrec.mostCurrent,145);
if (RapidSub.canDelegate("btnedit_click")) { return b4a.example.mainrec.remoteMe.runUserSub(false, "mainrec","btnedit_click");}
RemoteObject _ans2 = RemoteObject.createImmutable("");
RemoteObject _enum2 = RemoteObject.createImmutable("");
RemoteObject _qry = RemoteObject.createImmutable("");
RemoteObject _c2 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _x = RemoteObject.createImmutable("");
 BA.debugLineNum = 145;BA.debugLine="Private Sub btnEdit_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 146;BA.debugLine="Dim ans2 As String";
Debug.ShouldStop(131072);
_ans2 = RemoteObject.createImmutable("");Debug.locals.put("ans2", _ans2);
 BA.debugLineNum = 147;BA.debugLine="Dim enum2 As String";
Debug.ShouldStop(262144);
_enum2 = RemoteObject.createImmutable("");Debug.locals.put("enum2", _enum2);
 BA.debugLineNum = 148;BA.debugLine="Dim qry As String";
Debug.ShouldStop(524288);
_qry = RemoteObject.createImmutable("");Debug.locals.put("qry", _qry);
 BA.debugLineNum = 149;BA.debugLine="Dim c2 As Cursor";
Debug.ShouldStop(1048576);
_c2 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("c2", _c2);
 BA.debugLineNum = 150;BA.debugLine="inpdlg.Input=\"\"";
Debug.ShouldStop(2097152);
mainrec.mostCurrent._inpdlg.runMethod(true,"setInput",BA.ObjectToString(""));
 BA.debugLineNum = 151;BA.debugLine="ans2 = inpdlg.Show(\"Enter Employee Number\",\"Updat";
Debug.ShouldStop(4194304);
_ans2 = BA.NumberToString(mainrec.mostCurrent._inpdlg.runMethodAndSync(true,"Show",(Object)(BA.ObjectToString("Enter Employee Number")),(Object)(BA.ObjectToString("Update Records")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("Cancel")),(Object)(BA.ObjectToString("")),mainrec.mostCurrent.activityBA,(Object)((mainrec.mostCurrent.__c.getField(false,"Null")))));Debug.locals.put("ans2", _ans2);
 BA.debugLineNum = 153;BA.debugLine="If ans2 = DialogResponse.POSITIVE Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_ans2,BA.NumberToString(mainrec.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 154;BA.debugLine="enum2 = inpdlg.Input";
Debug.ShouldStop(33554432);
_enum2 = mainrec.mostCurrent._inpdlg.runMethod(true,"getInput");Debug.locals.put("enum2", _enum2);
 BA.debugLineNum = 155;BA.debugLine="qry = \"Select * from jer_carlo where employee_nu";
Debug.ShouldStop(67108864);
_qry = BA.ObjectToString("Select * from jer_carlo where employee_num = ?");Debug.locals.put("qry", _qry);
 BA.debugLineNum = 156;BA.debugLine="c2 = sql.ExecQuery2(qry, Array As String(enum2))";
Debug.ShouldStop(134217728);
_c2 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mainrec._sql.runMethod(false,"ExecQuery2",(Object)(_qry),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_enum2}))));
 BA.debugLineNum = 157;BA.debugLine="If c2.RowCount > 0 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",_c2.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 158;BA.debugLine="Dim x As String";
Debug.ShouldStop(536870912);
_x = RemoteObject.createImmutable("");Debug.locals.put("x", _x);
 BA.debugLineNum = 159;BA.debugLine="x = Msgbox2(\"Edit this record?\", \"Edit Record\",";
Debug.ShouldStop(1073741824);
_x = BA.NumberToString(mainrec.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Edit this record?")),(Object)(BA.ObjectToCharSequence("Edit Record")),(Object)(BA.ObjectToString("Yes")),(Object)(BA.ObjectToString("Cancel")),(Object)(BA.ObjectToString("")),(Object)((mainrec.mostCurrent.__c.getField(false,"Null"))),mainrec.mostCurrent.activityBA));Debug.locals.put("x", _x);
 BA.debugLineNum = 160;BA.debugLine="If x = DialogResponse.POSITIVE Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_x,BA.NumberToString(mainrec.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 161;BA.debugLine="c2.Position = 0";
Debug.ShouldStop(1);
_c2.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 162;BA.debugLine="EditRec.employee_num = c2.GetString(\"employee_";
Debug.ShouldStop(2);
mainrec.mostCurrent._editrec._employee_num /*RemoteObject*/  = _c2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("employee_num")));
 BA.debugLineNum = 163;BA.debugLine="EditRec.name = c2.GetString(\"name\")";
Debug.ShouldStop(4);
mainrec.mostCurrent._editrec._name /*RemoteObject*/  = _c2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("name")));
 BA.debugLineNum = 164;BA.debugLine="EditRec.address = c2.GetString(\"address\")";
Debug.ShouldStop(8);
mainrec.mostCurrent._editrec._address /*RemoteObject*/  = _c2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("address")));
 BA.debugLineNum = 165;BA.debugLine="EditRec.age = c2.GetString(\"age\")";
Debug.ShouldStop(16);
mainrec.mostCurrent._editrec._age /*RemoteObject*/  = _c2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("age")));
 BA.debugLineNum = 166;BA.debugLine="EditRec.gender = c2.GetString(\"gender\")";
Debug.ShouldStop(32);
mainrec.mostCurrent._editrec._gender /*RemoteObject*/  = _c2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("gender")));
 BA.debugLineNum = 167;BA.debugLine="StartActivity(EditRec)";
Debug.ShouldStop(64);
mainrec.mostCurrent.__c.runVoidMethod ("StartActivity",mainrec.processBA,(Object)((mainrec.mostCurrent._editrec.getObject())));
 }else {
 BA.debugLineNum = 169;BA.debugLine="Msgbox(\"Edit cancelled.\", \"\")";
Debug.ShouldStop(256);
mainrec.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Edit cancelled.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),mainrec.mostCurrent.activityBA);
 };
 }else {
 BA.debugLineNum = 173;BA.debugLine="Msgbox(\"No records found\",\"\")";
Debug.ShouldStop(4096);
mainrec.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No records found")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),mainrec.mostCurrent.activityBA);
 };
 };
 BA.debugLineNum = 176;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btneditsalary_click() throws Exception{
try {
		Debug.PushSubsStack("btnEditSalary_Click (mainrec) ","mainrec",2,mainrec.mostCurrent.activityBA,mainrec.mostCurrent,113);
if (RapidSub.canDelegate("btneditsalary_click")) { return b4a.example.mainrec.remoteMe.runUserSub(false, "mainrec","btneditsalary_click");}
RemoteObject _ans2 = RemoteObject.createImmutable("");
RemoteObject _enum2 = RemoteObject.createImmutable("");
RemoteObject _qry = RemoteObject.createImmutable("");
RemoteObject _c2 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _x = RemoteObject.createImmutable("");
 BA.debugLineNum = 113;BA.debugLine="Private Sub btnEditSalary_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 114;BA.debugLine="Dim ans2 As String";
Debug.ShouldStop(131072);
_ans2 = RemoteObject.createImmutable("");Debug.locals.put("ans2", _ans2);
 BA.debugLineNum = 115;BA.debugLine="Dim enum2 As String";
Debug.ShouldStop(262144);
_enum2 = RemoteObject.createImmutable("");Debug.locals.put("enum2", _enum2);
 BA.debugLineNum = 116;BA.debugLine="Dim qry As String";
Debug.ShouldStop(524288);
_qry = RemoteObject.createImmutable("");Debug.locals.put("qry", _qry);
 BA.debugLineNum = 117;BA.debugLine="Dim c2 As Cursor";
Debug.ShouldStop(1048576);
_c2 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("c2", _c2);
 BA.debugLineNum = 118;BA.debugLine="inpdlg.Input=\"\"";
Debug.ShouldStop(2097152);
mainrec.mostCurrent._inpdlg.runMethod(true,"setInput",BA.ObjectToString(""));
 BA.debugLineNum = 119;BA.debugLine="ans2 = inpdlg.Show(\"Enter Employee Number\",\"Updat";
Debug.ShouldStop(4194304);
_ans2 = BA.NumberToString(mainrec.mostCurrent._inpdlg.runMethodAndSync(true,"Show",(Object)(BA.ObjectToString("Enter Employee Number")),(Object)(BA.ObjectToString("Update Salary")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("Cancel")),(Object)(BA.ObjectToString("")),mainrec.mostCurrent.activityBA,(Object)((mainrec.mostCurrent.__c.getField(false,"Null")))));Debug.locals.put("ans2", _ans2);
 BA.debugLineNum = 121;BA.debugLine="If ans2 = DialogResponse.POSITIVE Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_ans2,BA.NumberToString(mainrec.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 122;BA.debugLine="enum2 = inpdlg.Input";
Debug.ShouldStop(33554432);
_enum2 = mainrec.mostCurrent._inpdlg.runMethod(true,"getInput");Debug.locals.put("enum2", _enum2);
 BA.debugLineNum = 123;BA.debugLine="qry = \"Select * from doctolero where employee_nu";
Debug.ShouldStop(67108864);
_qry = BA.ObjectToString("Select * from doctolero where employee_num = ?");Debug.locals.put("qry", _qry);
 BA.debugLineNum = 124;BA.debugLine="c2 = sql.ExecQuery2(qry, Array As String(enum2))";
Debug.ShouldStop(134217728);
_c2 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mainrec._sql.runMethod(false,"ExecQuery2",(Object)(_qry),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_enum2}))));
 BA.debugLineNum = 125;BA.debugLine="If c2.RowCount > 0 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",_c2.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 126;BA.debugLine="Dim x As String";
Debug.ShouldStop(536870912);
_x = RemoteObject.createImmutable("");Debug.locals.put("x", _x);
 BA.debugLineNum = 127;BA.debugLine="x = Msgbox2(\"Edit this Salary?\", \"Edit Salary\",";
Debug.ShouldStop(1073741824);
_x = BA.NumberToString(mainrec.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Edit this Salary?")),(Object)(BA.ObjectToCharSequence("Edit Salary")),(Object)(BA.ObjectToString("Yes")),(Object)(BA.ObjectToString("Cancel")),(Object)(BA.ObjectToString("")),(Object)((mainrec.mostCurrent.__c.getField(false,"Null"))),mainrec.mostCurrent.activityBA));Debug.locals.put("x", _x);
 BA.debugLineNum = 128;BA.debugLine="If x = DialogResponse.POSITIVE Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_x,BA.NumberToString(mainrec.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 129;BA.debugLine="c2.Position = 0";
Debug.ShouldStop(1);
_c2.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 130;BA.debugLine="SalaryEdit.employee_num = c2.GetString(\"employ";
Debug.ShouldStop(2);
mainrec.mostCurrent._salaryedit._employee_num /*RemoteObject*/  = _c2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("employee_num")));
 BA.debugLineNum = 131;BA.debugLine="SalaryEdit.days = c2.GetString(\"days\")";
Debug.ShouldStop(4);
mainrec.mostCurrent._salaryedit._days /*RemoteObject*/  = _c2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("days")));
 BA.debugLineNum = 132;BA.debugLine="SalaryEdit.rate = c2.GetString(\"rate\")";
Debug.ShouldStop(8);
mainrec.mostCurrent._salaryedit._rate /*RemoteObject*/  = _c2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("rate")));
 BA.debugLineNum = 133;BA.debugLine="SalaryEdit.salary = c2.GetString(\"salary\")";
Debug.ShouldStop(16);
mainrec.mostCurrent._salaryedit._salary /*RemoteObject*/  = _c2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("salary")));
 BA.debugLineNum = 134;BA.debugLine="StartActivity(SalaryEdit)";
Debug.ShouldStop(32);
mainrec.mostCurrent.__c.runVoidMethod ("StartActivity",mainrec.processBA,(Object)((mainrec.mostCurrent._salaryedit.getObject())));
 }else {
 BA.debugLineNum = 136;BA.debugLine="Msgbox(\"Edit cancelled.\", \"\")";
Debug.ShouldStop(128);
mainrec.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Edit cancelled.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),mainrec.mostCurrent.activityBA);
 };
 }else {
 BA.debugLineNum = 140;BA.debugLine="Msgbox(\"No records found\",\"\")";
Debug.ShouldStop(2048);
mainrec.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No records found")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),mainrec.mostCurrent.activityBA);
 };
 };
 BA.debugLineNum = 143;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnuser_click() throws Exception{
try {
		Debug.PushSubsStack("btnUser_Click (mainrec) ","mainrec",2,mainrec.mostCurrent.activityBA,mainrec.mostCurrent,109);
if (RapidSub.canDelegate("btnuser_click")) { return b4a.example.mainrec.remoteMe.runUserSub(false, "mainrec","btnuser_click");}
 BA.debugLineNum = 109;BA.debugLine="Private Sub btnUser_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 110;BA.debugLine="StartActivity(UserRec)";
Debug.ShouldStop(8192);
mainrec.mostCurrent.__c.runVoidMethod ("StartActivity",mainrec.processBA,(Object)((mainrec.mostCurrent._userrec.getObject())));
 BA.debugLineNum = 111;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("CopyDb (mainrec) ","mainrec",2,mainrec.mostCurrent.activityBA,mainrec.mostCurrent,81);
if (RapidSub.canDelegate("copydb")) { return b4a.example.mainrec.remoteMe.runUserSub(false, "mainrec","copydb", _filename);}
Debug.locals.put("Filename", _filename);
 BA.debugLineNum = 81;BA.debugLine="Sub CopyDb(Filename As String)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 83;BA.debugLine="If File.Exists(File.DirInternal, Filename) = Fals";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",mainrec.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(mainrec.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(_filename)),mainrec.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 84;BA.debugLine="File.Copy(File.DirAssets, Filename, File.DirInte";
Debug.ShouldStop(524288);
mainrec.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(mainrec.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(_filename),(Object)(mainrec.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(_filename));
 };
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 24;BA.debugLine="Private B4XTable1 As B4XTable";
mainrec.mostCurrent._b4xtable1 = RemoteObject.createNew ("b4a.example.b4xtable");
 //BA.debugLineNum = 25;BA.debugLine="Dim inpdlg As InputDialog";
mainrec.mostCurrent._inpdlg = RemoteObject.createNew ("anywheresoftware.b4a.agraham.dialogs.InputDialog");
 //BA.debugLineNum = 27;BA.debugLine="Private Spinner1 As Spinner";
mainrec.mostCurrent._spinner1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private btnUser As  Button";
mainrec.mostCurrent._btnuser = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private btnAdd As Button";
mainrec.mostCurrent._btnadd = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private btnDelete As Button";
mainrec.mostCurrent._btndelete = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private btnEdit As Button";
mainrec.mostCurrent._btnedit = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private btnEditSalary As Button";
mainrec.mostCurrent._btneditsalary = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim sql As SQL";
mainrec._sql = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 10;BA.debugLine="Dim rs As ResultSet";
mainrec._rs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
 //BA.debugLineNum = 12;BA.debugLine="Dim fname As String";
mainrec._fname = RemoteObject.createImmutable("");
 //BA.debugLineNum = 13;BA.debugLine="Dim level As String";
mainrec._level = RemoteObject.createImmutable("");
 //BA.debugLineNum = 14;BA.debugLine="Dim password As String";
mainrec._password = RemoteObject.createImmutable("");
 //BA.debugLineNum = 15;BA.debugLine="Dim id As String";
mainrec._id = RemoteObject.createImmutable("");
 //BA.debugLineNum = 16;BA.debugLine="Dim username As String";
mainrec._username = RemoteObject.createImmutable("");
 //BA.debugLineNum = 17;BA.debugLine="Dim c1 As Cursor";
mainrec._c1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _showlist() throws Exception{
try {
		Debug.PushSubsStack("ShowList (mainrec) ","mainrec",2,mainrec.mostCurrent.activityBA,mainrec.mostCurrent,88);
if (RapidSub.canDelegate("showlist")) { return b4a.example.mainrec.remoteMe.runUserSub(false, "mainrec","showlist");}
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = null;
 BA.debugLineNum = 88;BA.debugLine="Sub ShowList";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="Dim data As List";
Debug.ShouldStop(16777216);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("data", _data);
 BA.debugLineNum = 90;BA.debugLine="data.Initialize";
Debug.ShouldStop(33554432);
_data.runVoidMethod ("Initialize");
 BA.debugLineNum = 91;BA.debugLine="rs = sql.ExecQuery(\"SELECT jer_carlo.employee_num";
Debug.ShouldStop(67108864);
mainrec._rs = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), mainrec._sql.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT jer_carlo.employee_num, jer_carlo.name, jer_carlo.address, jer_carlo.age, jer_carlo.gender, doctolero.days, doctolero.rate, doctolero.salary from jer_carlo inner join doctolero WHERE jer_carlo.employee_num = doctolero.employee_num"))));
 BA.debugLineNum = 92;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(134217728);
while (mainrec._rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 93;BA.debugLine="Dim row(8) As Object";
Debug.ShouldStop(268435456);
_row = RemoteObject.createNewArray ("Object", new int[] {8}, new Object[]{});Debug.locals.put("row", _row);
 BA.debugLineNum = 94;BA.debugLine="row(0) = rs.GetString(\"employee_num\")";
Debug.ShouldStop(536870912);
_row.setArrayElement ((mainrec._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("employee_num")))),BA.numberCast(int.class, 0));
 BA.debugLineNum = 95;BA.debugLine="row(1) = rs.GetString(\"name\")";
Debug.ShouldStop(1073741824);
_row.setArrayElement ((mainrec._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("name")))),BA.numberCast(int.class, 1));
 BA.debugLineNum = 96;BA.debugLine="row(2) = rs.GetString(\"address\")";
Debug.ShouldStop(-2147483648);
_row.setArrayElement ((mainrec._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("address")))),BA.numberCast(int.class, 2));
 BA.debugLineNum = 97;BA.debugLine="row(3) = rs.GetString(\"age\")";
Debug.ShouldStop(1);
_row.setArrayElement ((mainrec._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("age")))),BA.numberCast(int.class, 3));
 BA.debugLineNum = 98;BA.debugLine="row(4) = rs.GetString(\"gender\")";
Debug.ShouldStop(2);
_row.setArrayElement ((mainrec._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("gender")))),BA.numberCast(int.class, 4));
 BA.debugLineNum = 99;BA.debugLine="row(5) = rs.GetString(\"days\")";
Debug.ShouldStop(4);
_row.setArrayElement ((mainrec._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("days")))),BA.numberCast(int.class, 5));
 BA.debugLineNum = 100;BA.debugLine="row(6) = rs.GetString(\"rate\")";
Debug.ShouldStop(8);
_row.setArrayElement ((mainrec._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("rate")))),BA.numberCast(int.class, 6));
 BA.debugLineNum = 101;BA.debugLine="row(7) = rs.GetString(\"salary\")";
Debug.ShouldStop(16);
_row.setArrayElement ((mainrec._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("salary")))),BA.numberCast(int.class, 7));
 BA.debugLineNum = 102;BA.debugLine="data.Add(row)";
Debug.ShouldStop(32);
_data.runVoidMethod ("Add",(Object)((_row)));
 }
;
 BA.debugLineNum = 104;BA.debugLine="rs.Close";
Debug.ShouldStop(128);
mainrec._rs.runVoidMethod ("Close");
 BA.debugLineNum = 105;BA.debugLine="B4XTable1.SetData(data)";
Debug.ShouldStop(256);
mainrec.mostCurrent._b4xtable1.runClassMethod (b4a.example.b4xtable.class, "_setdata" /*RemoteObject*/ ,(Object)(_data));
 BA.debugLineNum = 106;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spinner1_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Spinner1_ItemClick (mainrec) ","mainrec",2,mainrec.mostCurrent.activityBA,mainrec.mostCurrent,216);
if (RapidSub.canDelegate("spinner1_itemclick")) { return b4a.example.mainrec.remoteMe.runUserSub(false, "mainrec","spinner1_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 216;BA.debugLine="Private Sub Spinner1_ItemClick (Position As Int, V";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 217;BA.debugLine="If Spinner1.SelectedIndex = 1 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",mainrec.mostCurrent._spinner1.runMethod(true,"getSelectedIndex"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 218;BA.debugLine="StartActivity(EditUser)";
Debug.ShouldStop(33554432);
mainrec.mostCurrent.__c.runVoidMethod ("StartActivity",mainrec.processBA,(Object)((mainrec.mostCurrent._edituser.getObject())));
 BA.debugLineNum = 220;BA.debugLine="EditUser.fname = fname";
Debug.ShouldStop(134217728);
mainrec.mostCurrent._edituser._fname /*RemoteObject*/  = mainrec._fname;
 BA.debugLineNum = 221;BA.debugLine="EditUser.id = id";
Debug.ShouldStop(268435456);
mainrec.mostCurrent._edituser._id /*RemoteObject*/  = mainrec._id;
 BA.debugLineNum = 222;BA.debugLine="EditUser.password = password";
Debug.ShouldStop(536870912);
mainrec.mostCurrent._edituser._password /*RemoteObject*/  = mainrec._password;
 BA.debugLineNum = 223;BA.debugLine="EditUser.username = username";
Debug.ShouldStop(1073741824);
mainrec.mostCurrent._edituser._username /*RemoteObject*/  = mainrec._username;
 BA.debugLineNum = 224;BA.debugLine="EditUser.level = level";
Debug.ShouldStop(-2147483648);
mainrec.mostCurrent._edituser._level /*RemoteObject*/  = mainrec._level;
 }else 
{ BA.debugLineNum = 226;BA.debugLine="Else if Spinner1.SelectedIndex = 2 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",mainrec.mostCurrent._spinner1.runMethod(true,"getSelectedIndex"),BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 227;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4);
mainrec.mostCurrent._activity.runVoidMethod ("Finish");
 }else 
{ BA.debugLineNum = 228;BA.debugLine="Else if Spinner1.SelectedIndex = 3 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",mainrec.mostCurrent._spinner1.runMethod(true,"getSelectedIndex"),BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 229;BA.debugLine="ExitApplication";
Debug.ShouldStop(16);
mainrec.mostCurrent.__c.runVoidMethod ("ExitApplication");
 }}}
;
 BA.debugLineNum = 231;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}