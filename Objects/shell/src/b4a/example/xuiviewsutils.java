
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

public class xuiviewsutils implements IRemote{
	public static xuiviewsutils mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public xuiviewsutils() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
     private static PCBA pcBA = new PCBA(null, xuiviewsutils.class);
    static {
		mostCurrent = new xuiviewsutils();
        remoteMe = RemoteObject.declareNull("b4a.example.xuiviewsutils");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("xuiviewsutils"), "b4a.example.xuiviewsutils");
        RDebug.INSTANCE.eventTargets.put(new DeviceClass("b4a.example.xuiviewsutils"), new java.lang.ref.WeakReference<PCBA> (pcBA));
	}
   
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
	public PCBA create(Object[] args) throws ClassNotFoundException{
        throw new RuntimeException("CREATE is not supported.");
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _utilsinitialized = RemoteObject.createImmutable(false);
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.mainrec _mainrec = null;
public static b4a.example.addrec _addrec = null;
public static b4a.example.editrec _editrec = null;
public static b4a.example.adduser _adduser = null;
public static b4a.example.edituser _edituser = null;
public static b4a.example.userrec _userrec = null;
public static b4a.example.salaryedit _salaryedit = null;
  public Object[] GetGlobals() {
		return new Object[] {"AddRec",Debug.moduleToString(b4a.example.addrec.class),"AddUser",Debug.moduleToString(b4a.example.adduser.class),"DateUtils",xuiviewsutils.mostCurrent._dateutils,"EditRec",Debug.moduleToString(b4a.example.editrec.class),"EditUser",Debug.moduleToString(b4a.example.edituser.class),"Main",Debug.moduleToString(b4a.example.main.class),"MainRec",Debug.moduleToString(b4a.example.mainrec.class),"SalaryEdit",Debug.moduleToString(b4a.example.salaryedit.class),"Starter",Debug.moduleToString(b4a.example.starter.class),"UserRec",Debug.moduleToString(b4a.example.userrec.class),"UtilsInitialized",xuiviewsutils._utilsinitialized,"xui",xuiviewsutils._xui};
}
}