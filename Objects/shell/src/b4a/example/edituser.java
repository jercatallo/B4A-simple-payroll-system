
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

public class edituser implements IRemote{
	public static edituser mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public edituser() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("edituser"), "b4a.example.edituser");
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
		pcBA = new PCBA(this, edituser.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _sql = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _username = RemoteObject.createImmutable("");
public static RemoteObject _fname = RemoteObject.createImmutable("");
public static RemoteObject _password = RemoteObject.createImmutable("");
public static RemoteObject _level = RemoteObject.createImmutable("");
public static RemoteObject _txtid = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtusername = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtpassword = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtfname = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtlevel = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _chkpass = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.mainrec _mainrec = null;
public static b4a.example.addrec _addrec = null;
public static b4a.example.editrec _editrec = null;
public static b4a.example.adduser _adduser = null;
public static b4a.example.userrec _userrec = null;
public static b4a.example.salaryedit _salaryedit = null;
public static b4a.example.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",edituser.mostCurrent._activity,"AddRec",Debug.moduleToString(b4a.example.addrec.class),"AddUser",Debug.moduleToString(b4a.example.adduser.class),"chkPass",edituser.mostCurrent._chkpass,"DateUtils",edituser.mostCurrent._dateutils,"EditRec",Debug.moduleToString(b4a.example.editrec.class),"fname",edituser._fname,"id",edituser._id,"level",edituser._level,"Main",Debug.moduleToString(b4a.example.main.class),"MainRec",Debug.moduleToString(b4a.example.mainrec.class),"password",edituser._password,"rs",edituser._rs,"SalaryEdit",Debug.moduleToString(b4a.example.salaryedit.class),"sql",edituser._sql,"Starter",Debug.moduleToString(b4a.example.starter.class),"txtfname",edituser.mostCurrent._txtfname,"txtid",edituser.mostCurrent._txtid,"txtlevel",edituser.mostCurrent._txtlevel,"txtpassword",edituser.mostCurrent._txtpassword,"txtusername",edituser.mostCurrent._txtusername,"username",edituser._username,"UserRec",Debug.moduleToString(b4a.example.userrec.class),"XUIViewsUtils",Debug.moduleToString(b4a.example.xuiviewsutils.class)};
}
}