package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class salaryedit_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (salaryedit) ","salaryedit",8,salaryedit.mostCurrent.activityBA,salaryedit.mostCurrent,28);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.salaryedit.remoteMe.runUserSub(false, "salaryedit","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 28;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 30;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(536870912);
if (_firsttime.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 31;BA.debugLine="CopyDb(\"catallodb.db\")";
Debug.ShouldStop(1073741824);
_copydb(RemoteObject.createImmutable("catallodb.db"));
 BA.debugLineNum = 32;BA.debugLine="sql.Initialize(File.DirInternal, \"catallodb.db\",";
Debug.ShouldStop(-2147483648);
salaryedit._sql.runVoidMethod ("Initialize",(Object)(salaryedit.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("catallodb.db")),(Object)(salaryedit.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 35;BA.debugLine="Activity.LoadLayout(\"laySalary\")";
Debug.ShouldStop(4);
salaryedit.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("laySalary")),salaryedit.mostCurrent.activityBA);
 BA.debugLineNum = 37;BA.debugLine="txtid.Text = employee_num";
Debug.ShouldStop(16);
salaryedit.mostCurrent._txtid.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(salaryedit._employee_num));
 BA.debugLineNum = 38;BA.debugLine="txtdays.Text = days";
Debug.ShouldStop(32);
salaryedit.mostCurrent._txtdays.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(salaryedit._days));
 BA.debugLineNum = 39;BA.debugLine="txtrate.Text = rate";
Debug.ShouldStop(64);
salaryedit.mostCurrent._txtrate.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(salaryedit._rate));
 BA.debugLineNum = 40;BA.debugLine="txtsalary.Text = salary";
Debug.ShouldStop(128);
salaryedit.mostCurrent._txtsalary.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(salaryedit._salary));
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("Activity_Pause (salaryedit) ","salaryedit",8,salaryedit.mostCurrent.activityBA,salaryedit.mostCurrent,47);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.salaryedit.remoteMe.runUserSub(false, "salaryedit","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 47;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (salaryedit) ","salaryedit",8,salaryedit.mostCurrent.activityBA,salaryedit.mostCurrent,43);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.salaryedit.remoteMe.runUserSub(false, "salaryedit","activity_resume");}
 BA.debugLineNum = 43;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1024);
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
public static RemoteObject  _btnclose_click() throws Exception{
try {
		Debug.PushSubsStack("btnClose_Click (salaryedit) ","salaryedit",8,salaryedit.mostCurrent.activityBA,salaryedit.mostCurrent,73);
if (RapidSub.canDelegate("btnclose_click")) { return b4a.example.salaryedit.remoteMe.runUserSub(false, "salaryedit","btnclose_click");}
 BA.debugLineNum = 73;BA.debugLine="Private Sub btnClose_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 74;BA.debugLine="Activity.Finish";
Debug.ShouldStop(512);
salaryedit.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _btncompute_click() throws Exception{
try {
		Debug.PushSubsStack("btnCompute_Click (salaryedit) ","salaryedit",8,salaryedit.mostCurrent.activityBA,salaryedit.mostCurrent,77);
if (RapidSub.canDelegate("btncompute_click")) { return b4a.example.salaryedit.remoteMe.runUserSub(false, "salaryedit","btncompute_click");}
 BA.debugLineNum = 77;BA.debugLine="Private Sub btnCompute_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 78;BA.debugLine="If txtrate.Text = \"\" Or txtdays.Text = \"\" Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",salaryedit.mostCurrent._txtrate.runMethod(true,"getText"),BA.ObjectToString("")) || RemoteObject.solveBoolean("=",salaryedit.mostCurrent._txtdays.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 79;BA.debugLine="Msgbox(\"Fill out data\", \"\")";
Debug.ShouldStop(16384);
salaryedit.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Fill out data")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),salaryedit.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 81;BA.debugLine="txtsalary.Text = txtdays.Text * txtrate.Text";
Debug.ShouldStop(65536);
salaryedit.mostCurrent._txtsalary.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, salaryedit.mostCurrent._txtdays.runMethod(true,"getText")),BA.numberCast(double.class, salaryedit.mostCurrent._txtrate.runMethod(true,"getText"))}, "*",0, 0)));
 };
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("btnEdit_Click (salaryedit) ","salaryedit",8,salaryedit.mostCurrent.activityBA,salaryedit.mostCurrent,59);
if (RapidSub.canDelegate("btnedit_click")) { return b4a.example.salaryedit.remoteMe.runUserSub(false, "salaryedit","btnedit_click");}
RemoteObject _ans = RemoteObject.createImmutable("");
RemoteObject _qry = RemoteObject.createImmutable("");
RemoteObject _qry2 = RemoteObject.createImmutable("");
 BA.debugLineNum = 59;BA.debugLine="Private Sub btnEdit_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="Dim ans As String";
Debug.ShouldStop(134217728);
_ans = RemoteObject.createImmutable("");Debug.locals.put("ans", _ans);
 BA.debugLineNum = 61;BA.debugLine="Dim qry, qry2 As String";
Debug.ShouldStop(268435456);
_qry = RemoteObject.createImmutable("");Debug.locals.put("qry", _qry);
_qry2 = RemoteObject.createImmutable("");Debug.locals.put("qry2", _qry2);
 BA.debugLineNum = 62;BA.debugLine="ans = Msgbox2(\"Save Changes?\", \"Update Salary\", \"";
Debug.ShouldStop(536870912);
_ans = BA.NumberToString(salaryedit.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Save Changes?")),(Object)(BA.ObjectToCharSequence("Update Salary")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("Cancel")),(Object)(BA.ObjectToString("")),(Object)((salaryedit.mostCurrent.__c.getField(false,"Null"))),salaryedit.mostCurrent.activityBA));Debug.locals.put("ans", _ans);
 BA.debugLineNum = 63;BA.debugLine="If ans = DialogResponse.POSITIVE Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_ans,BA.NumberToString(salaryedit.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 64;BA.debugLine="qry = \"UPDATE doctolero SET days = ?, rate = ?,";
Debug.ShouldStop(-2147483648);
_qry = RemoteObject.concat(RemoteObject.createImmutable("UPDATE doctolero SET days = ?, rate = ?, salary = ? WHERE employee_num = "),salaryedit.mostCurrent._txtid.runMethod(true,"getText"),RemoteObject.createImmutable(""));Debug.locals.put("qry", _qry);
 BA.debugLineNum = 65;BA.debugLine="sql.ExecNonQuery2(qry, Array As String(txtdays.T";
Debug.ShouldStop(1);
salaryedit._sql.runVoidMethod ("ExecNonQuery2",(Object)(_qry),(Object)(salaryedit.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {3},new Object[] {salaryedit.mostCurrent._txtdays.runMethod(true,"getText"),salaryedit.mostCurrent._txtrate.runMethod(true,"getText"),salaryedit.mostCurrent._txtsalary.runMethod(true,"getText")})))));
 BA.debugLineNum = 66;BA.debugLine="Msgbox(\"Salary Updated\",\"\")";
Debug.ShouldStop(2);
salaryedit.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Salary Updated")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),salaryedit.mostCurrent.activityBA);
 BA.debugLineNum = 67;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4);
salaryedit.mostCurrent._activity.runVoidMethod ("Finish");
 }else {
 BA.debugLineNum = 69;BA.debugLine="Msgbox(\"Update was cancelled!\", \"\")";
Debug.ShouldStop(16);
salaryedit.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Update was cancelled!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),salaryedit.mostCurrent.activityBA);
 };
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
public static RemoteObject  _copydb(RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("CopyDb (salaryedit) ","salaryedit",8,salaryedit.mostCurrent.activityBA,salaryedit.mostCurrent,51);
if (RapidSub.canDelegate("copydb")) { return b4a.example.salaryedit.remoteMe.runUserSub(false, "salaryedit","copydb", _filename);}
Debug.locals.put("Filename", _filename);
 BA.debugLineNum = 51;BA.debugLine="Sub CopyDb(Filename As String)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 53;BA.debugLine="If File.Exists(File.DirInternal, Filename) = Fals";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",salaryedit.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(salaryedit.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(_filename)),salaryedit.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 54;BA.debugLine="File.Copy(File.DirAssets, Filename, File.DirInte";
Debug.ShouldStop(2097152);
salaryedit.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(salaryedit.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(_filename),(Object)(salaryedit.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(_filename));
 };
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 22;BA.debugLine="Private txtid As EditText";
salaryedit.mostCurrent._txtid = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private txtdays As EditText";
salaryedit.mostCurrent._txtdays = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private txtrate As EditText";
salaryedit.mostCurrent._txtrate = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private txtsalary As EditText";
salaryedit.mostCurrent._txtsalary = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim sql As SQL";
salaryedit._sql = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 11;BA.debugLine="Dim employee_num As String";
salaryedit._employee_num = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="Dim days As String";
salaryedit._days = RemoteObject.createImmutable("");
 //BA.debugLineNum = 13;BA.debugLine="Dim rate As String";
salaryedit._rate = RemoteObject.createImmutable("");
 //BA.debugLineNum = 14;BA.debugLine="Dim salary As String";
salaryedit._salary = RemoteObject.createImmutable("");
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}