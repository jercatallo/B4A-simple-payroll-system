package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class addrec_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (addrec) ","addrec",3,addrec.mostCurrent.activityBA,addrec.mostCurrent,24);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.addrec.remoteMe.runUserSub(false, "addrec","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 24;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 26;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(33554432);
if (_firsttime.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 27;BA.debugLine="CopyDb(\"catallodb.db\")";
Debug.ShouldStop(67108864);
_copydb(RemoteObject.createImmutable("catallodb.db"));
 BA.debugLineNum = 28;BA.debugLine="sql.Initialize(File.DirInternal, \"catallodb.db\",";
Debug.ShouldStop(134217728);
addrec._sql.runVoidMethod ("Initialize",(Object)(addrec.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("catallodb.db")),(Object)(addrec.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 31;BA.debugLine="Activity.LoadLayout(\"layAdd\")";
Debug.ShouldStop(1073741824);
addrec.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("layAdd")),addrec.mostCurrent.activityBA);
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("Activity_Pause (addrec) ","addrec",3,addrec.mostCurrent.activityBA,addrec.mostCurrent,38);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.addrec.remoteMe.runUserSub(false, "addrec","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 38;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32);
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("Activity_Resume (addrec) ","addrec",3,addrec.mostCurrent.activityBA,addrec.mostCurrent,34);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.addrec.remoteMe.runUserSub(false, "addrec","activity_resume");}
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(2);
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("btnAdd_Click (addrec) ","addrec",3,addrec.mostCurrent.activityBA,addrec.mostCurrent,49);
if (RapidSub.canDelegate("btnadd_click")) { return b4a.example.addrec.remoteMe.runUserSub(false, "addrec","btnadd_click");}
RemoteObject _qry = RemoteObject.createImmutable("");
RemoteObject _qry2 = RemoteObject.createImmutable("");
 BA.debugLineNum = 49;BA.debugLine="Private Sub btnAdd_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="Dim qry,qry2 As String";
Debug.ShouldStop(131072);
_qry = RemoteObject.createImmutable("");Debug.locals.put("qry", _qry);
_qry2 = RemoteObject.createImmutable("");Debug.locals.put("qry2", _qry2);
 BA.debugLineNum = 52;BA.debugLine="If txtnum.Text = \"\" Or txtname.Text = \"\" Or txtge";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",addrec.mostCurrent._txtnum.runMethod(true,"getText"),BA.ObjectToString("")) || RemoteObject.solveBoolean("=",addrec.mostCurrent._txtname.runMethod(true,"getText"),BA.ObjectToString("")) || RemoteObject.solveBoolean("=",addrec.mostCurrent._txtgender.runMethod(true,"getText"),BA.ObjectToString("")) || RemoteObject.solveBoolean("=",addrec.mostCurrent._txtage.runMethod(true,"getText"),BA.ObjectToString("")) || RemoteObject.solveBoolean("=",addrec.mostCurrent._txtaddress.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 53;BA.debugLine="Msgbox(\"Please fill out all data\", \"Warning\")";
Debug.ShouldStop(1048576);
addrec.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Please fill out all data")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),addrec.mostCurrent.activityBA);
 BA.debugLineNum = 54;BA.debugLine="txtnum.RequestFocus";
Debug.ShouldStop(2097152);
addrec.mostCurrent._txtnum.runVoidMethod ("RequestFocus");
 }else {
 BA.debugLineNum = 56;BA.debugLine="qry = \"Insert into jer_carlo Values(?,?,?,?,?)\"";
Debug.ShouldStop(8388608);
_qry = BA.ObjectToString("Insert into jer_carlo Values(?,?,?,?,?)");Debug.locals.put("qry", _qry);
 BA.debugLineNum = 57;BA.debugLine="sql.ExecNonQuery2(qry, Array As String(txtnum.Te";
Debug.ShouldStop(16777216);
addrec._sql.runVoidMethod ("ExecNonQuery2",(Object)(_qry),(Object)(addrec.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {5},new Object[] {addrec.mostCurrent._txtnum.runMethod(true,"getText"),addrec.mostCurrent._txtname.runMethod(true,"getText"),addrec.mostCurrent._txtaddress.runMethod(true,"getText"),addrec.mostCurrent._txtage.runMethod(true,"getText"),addrec.mostCurrent._txtgender.runMethod(true,"getText")})))));
 BA.debugLineNum = 59;BA.debugLine="qry2 = \"INSERT INTO doctolero VALUES(?,?,?,?)\"";
Debug.ShouldStop(67108864);
_qry2 = BA.ObjectToString("INSERT INTO doctolero VALUES(?,?,?,?)");Debug.locals.put("qry2", _qry2);
 BA.debugLineNum = 60;BA.debugLine="sql.ExecNonQuery2(qry2, Array As String(txtnum.T";
Debug.ShouldStop(134217728);
addrec._sql.runVoidMethod ("ExecNonQuery2",(Object)(_qry2),(Object)(addrec.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {4},new Object[] {addrec.mostCurrent._txtnum.runMethod(true,"getText"),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(0)})))));
 BA.debugLineNum = 61;BA.debugLine="Activity.Finish";
Debug.ShouldStop(268435456);
addrec.mostCurrent._activity.runVoidMethod ("Finish");
 };
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("btnClose_Click (addrec) ","addrec",3,addrec.mostCurrent.activityBA,addrec.mostCurrent,65);
if (RapidSub.canDelegate("btnclose_click")) { return b4a.example.addrec.remoteMe.runUserSub(false, "addrec","btnclose_click");}
 BA.debugLineNum = 65;BA.debugLine="Private Sub btnClose_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2);
addrec.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("CopyDb (addrec) ","addrec",3,addrec.mostCurrent.activityBA,addrec.mostCurrent,42);
if (RapidSub.canDelegate("copydb")) { return b4a.example.addrec.remoteMe.runUserSub(false, "addrec","copydb", _filename);}
Debug.locals.put("Filename", _filename);
 BA.debugLineNum = 42;BA.debugLine="Sub CopyDb(Filename As String)";
Debug.ShouldStop(512);
 BA.debugLineNum = 44;BA.debugLine="If File.Exists(File.DirInternal, Filename) = Fals";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",addrec.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(addrec.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(_filename)),addrec.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 45;BA.debugLine="File.Copy(File.DirAssets, Filename, File.DirInte";
Debug.ShouldStop(4096);
addrec.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(addrec.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(_filename),(Object)(addrec.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(_filename));
 };
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 17;BA.debugLine="Private txtnum As EditText";
addrec.mostCurrent._txtnum = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private txtname As EditText";
addrec.mostCurrent._txtname = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private txtaddress As EditText";
addrec.mostCurrent._txtaddress = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private txtage As EditText";
addrec.mostCurrent._txtage = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private txtgender As EditText";
addrec.mostCurrent._txtgender = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim sql As SQL";
addrec._sql = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 10;BA.debugLine="Dim rs As ResultSet";
addrec._rs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}