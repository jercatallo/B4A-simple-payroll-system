
package b4a.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class mainrec implements IRemote{
	public static mainrec mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public mainrec() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("mainrec"), "b4a.example.mainrec");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, mainrec.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _sql = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
public static RemoteObject _fname = RemoteObject.createImmutable("");
public static RemoteObject _level = RemoteObject.createImmutable("");
public static RemoteObject _password = RemoteObject.createImmutable("");
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _username = RemoteObject.createImmutable("");
public static RemoteObject _c1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
public static RemoteObject _b4xtable1 = RemoteObject.declareNull("b4a.example.b4xtable");
public static RemoteObject _inpdlg = RemoteObject.declareNull("anywheresoftware.b4a.agraham.dialogs.InputDialog");
public static RemoteObject _spinner1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _btnuser = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnadd = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btndelete = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnedit = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btneditsalary = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.addrec _addrec = null;
public static b4a.example.editrec _editrec = null;
public static b4a.example.adduser _adduser = null;
public static b4a.example.edituser _edituser = null;
public static b4a.example.userrec _userrec = null;
public static b4a.example.salaryedit _salaryedit = null;
public static b4a.example.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",mainrec.mostCurrent._activity,"AddRec",Debug.moduleToString(b4a.example.addrec.class),"AddUser",Debug.moduleToString(b4a.example.adduser.class),"B4XTable1",mainrec.mostCurrent._b4xtable1,"btnAdd",mainrec.mostCurrent._btnadd,"btnDelete",mainrec.mostCurrent._btndelete,"btnEdit",mainrec.mostCurrent._btnedit,"btnEditSalary",mainrec.mostCurrent._btneditsalary,"btnUser",mainrec.mostCurrent._btnuser,"c1",mainrec._c1,"DateUtils",mainrec.mostCurrent._dateutils,"EditRec",Debug.moduleToString(b4a.example.editrec.class),"EditUser",Debug.moduleToString(b4a.example.edituser.class),"fname",mainrec._fname,"id",mainrec._id,"inpdlg",mainrec.mostCurrent._inpdlg,"level",mainrec._level,"Main",Debug.moduleToString(b4a.example.main.class),"password",mainrec._password,"rs",mainrec._rs,"SalaryEdit",Debug.moduleToString(b4a.example.salaryedit.class),"Spinner1",mainrec.mostCurrent._spinner1,"sql",mainrec._sql,"Starter",Debug.moduleToString(b4a.example.starter.class),"username",mainrec._username,"UserRec",Debug.moduleToString(b4a.example.userrec.class),"XUIViewsUtils",Debug.moduleToString(b4a.example.xuiviewsutils.class)};
}
}