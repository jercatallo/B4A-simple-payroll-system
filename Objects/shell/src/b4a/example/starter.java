
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

public class starter implements IRemote{
	public static starter mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public starter() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("starter"), "b4a.example.starter");
	}
     public static RemoteObject getObject() {
		return myClass;
	 }
	public RemoteObject _service;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
        _service = (RemoteObject) args[2];
        remoteMe = RemoteObject.declareNull("b4a.example.starter");
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[3];
		pcBA = new PCBA(this, starter.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) mostCurrent.pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.main _main = null;
public static b4a.example.mainrec _mainrec = null;
public static b4a.example.addrec _addrec = null;
public static b4a.example.editrec _editrec = null;
public static b4a.example.adduser _adduser = null;
public static b4a.example.edituser _edituser = null;
public static b4a.example.userrec _userrec = null;
public static b4a.example.salaryedit _salaryedit = null;
public static b4a.example.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"AddRec",Debug.moduleToString(b4a.example.addrec.class),"AddUser",Debug.moduleToString(b4a.example.adduser.class),"DateUtils",starter.mostCurrent._dateutils,"EditRec",Debug.moduleToString(b4a.example.editrec.class),"EditUser",Debug.moduleToString(b4a.example.edituser.class),"Main",Debug.moduleToString(b4a.example.main.class),"MainRec",Debug.moduleToString(b4a.example.mainrec.class),"SalaryEdit",Debug.moduleToString(b4a.example.salaryedit.class),"Service",starter.mostCurrent._service,"UserRec",Debug.moduleToString(b4a.example.userrec.class),"XUIViewsUtils",Debug.moduleToString(b4a.example.xuiviewsutils.class)};
}
}