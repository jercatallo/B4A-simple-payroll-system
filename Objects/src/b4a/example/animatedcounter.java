package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class animatedcounter extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.animatedcounter");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.animatedcounter.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.collections.List _imageviews = null;
public int _mdigits = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbltemplate = null;
public anywheresoftware.b4a.objects.collections.List _mvalue = null;
public int _digitheight = 0;
public int _digitwidth = 0;
public int _mduration = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _fade = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xfadeiv = null;
public Object _tag = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.mainrec _mainrec = null;
public b4a.example.addrec _addrec = null;
public b4a.example.editrec _editrec = null;
public b4a.example.adduser _adduser = null;
public b4a.example.edituser _edituser = null;
public b4a.example.userrec _userrec = null;
public b4a.example.salaryedit _salaryedit = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public String  _base_resize(b4a.example.animatedcounter __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="animatedcounter";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
int _columns = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
int _left = 0;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _iv = null;
RDebugUtils.currentLine=9764864;
 //BA.debugLineNum = 9764864;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=9764865;
 //BA.debugLineNum = 9764865;BA.debugLine="mBase.GetView(0).SetLayoutAnimated(0, 0, 0, Width";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=9764866;
 //BA.debugLineNum = 9764866;BA.debugLine="xfadeIv.SetLayoutAnimated(0, 0, 0, Width, Height)";
__ref._xfadeiv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=9764867;
 //BA.debugLineNum = 9764867;BA.debugLine="xfadeIv.SetBitmap(fade.Resize(Width, Height, Fals";
__ref._xfadeiv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(__ref._fade /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .Resize((int) (_width),(int) (_height),__c.False).getObject()));
RDebugUtils.currentLine=9764868;
 //BA.debugLineNum = 9764868;BA.debugLine="DigitHeight = Height";
__ref._digitheight /*int*/  = (int) (_height);
RDebugUtils.currentLine=9764869;
 //BA.debugLineNum = 9764869;BA.debugLine="Dim Columns As Int = mdigits";
_columns = __ref._mdigits /*int*/ ;
RDebugUtils.currentLine=9764870;
 //BA.debugLineNum = 9764870;BA.debugLine="DigitWidth = Width / Columns";
__ref._digitwidth /*int*/  = (int) (_width/(double)_columns);
RDebugUtils.currentLine=9764871;
 //BA.debugLineNum = 9764871;BA.debugLine="Dim bmp As B4XBitmap = CreateBitmap(lblTemplate)";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = __ref._createbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (null,__ref._lbltemplate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=9764872;
 //BA.debugLineNum = 9764872;BA.debugLine="Dim left As Int = Width";
_left = (int) (_width);
RDebugUtils.currentLine=9764873;
 //BA.debugLineNum = 9764873;BA.debugLine="For i = 0 To ImageViews.Size - 1";
{
final int step9 = 1;
final int limit9 = (int) (__ref._imageviews /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=9764874;
 //BA.debugLineNum = 9764874;BA.debugLine="Dim iv As B4XView = ImageViews.Get(i)";
_iv = new anywheresoftware.b4a.objects.B4XViewWrapper();
_iv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._imageviews /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=9764876;
 //BA.debugLineNum = 9764876;BA.debugLine="left = left - DigitWidth";
_left = (int) (_left-__ref._digitwidth /*int*/ );
RDebugUtils.currentLine=9764877;
 //BA.debugLineNum = 9764877;BA.debugLine="iv.SetLayoutAnimated(0, left, TopFromValue(i), D";
_iv.SetLayoutAnimated((int) (0),_left,__ref._topfromvalue /*int*/ (null,_i),__ref._digitwidth /*int*/ ,(int) (__ref._digitheight /*int*/ *10));
RDebugUtils.currentLine=9764878;
 //BA.debugLineNum = 9764878;BA.debugLine="iv.SetBitmap(bmp)";
_iv.SetBitmap((android.graphics.Bitmap)(_bmp.getObject()));
 }
};
RDebugUtils.currentLine=9764880;
 //BA.debugLineNum = 9764880;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _createbitmap(b4a.example.animatedcounter __ref,anywheresoftware.b4a.objects.B4XViewWrapper _lbl) throws Exception{
__ref = this;
RDebugUtils.currentModule="animatedcounter";
if (Debug.shouldDelegate(ba, "createbitmap", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) Debug.delegate(ba, "createbitmap", new Object[] {_lbl}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _baseline = 0;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _res = null;
RDebugUtils.currentLine=9895936;
 //BA.debugLineNum = 9895936;BA.debugLine="Private Sub CreateBitmap (lbl As B4XView) As B4XBi";
RDebugUtils.currentLine=9895937;
 //BA.debugLineNum = 9895937;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=9895938;
 //BA.debugLineNum = 9895938;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, DigitWidth, DigitHei";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._digitwidth /*int*/ ,(int) (__ref._digitheight /*int*/ *10));
RDebugUtils.currentLine=9895939;
 //BA.debugLineNum = 9895939;BA.debugLine="Dim cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=9895940;
 //BA.debugLineNum = 9895940;BA.debugLine="cvs.Initialize(p)";
_cvs.Initialize(_p);
RDebugUtils.currentLine=9895941;
 //BA.debugLineNum = 9895941;BA.debugLine="Dim r As B4XRect = cvs.MeasureText(\"5\", lbl.Font)";
_r = _cvs.MeasureText("5",_lbl.getFont());
RDebugUtils.currentLine=9895942;
 //BA.debugLineNum = 9895942;BA.debugLine="Dim BaseLine As Int = DigitHeight / 2 - r.Height";
_baseline = (int) (__ref._digitheight /*int*/ /(double)2-_r.getHeight()/(double)2-_r.getTop());
RDebugUtils.currentLine=9895943;
 //BA.debugLineNum = 9895943;BA.debugLine="For i = 0 To 9";
{
final int step7 = 1;
final int limit7 = (int) (9);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=9895944;
 //BA.debugLineNum = 9895944;BA.debugLine="cvs.DrawText(i, DigitWidth / 2, i * DigitHeight";
_cvs.DrawText(ba,BA.NumberToString(_i),(float) (__ref._digitwidth /*int*/ /(double)2),(float) (_i*__ref._digitheight /*int*/ +_baseline),_lbl.getFont(),_lbl.getTextColor(),BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 }
};
RDebugUtils.currentLine=9895946;
 //BA.debugLineNum = 9895946;BA.debugLine="cvs.Invalidate";
_cvs.Invalidate();
RDebugUtils.currentLine=9895947;
 //BA.debugLineNum = 9895947;BA.debugLine="Dim res As B4XBitmap = cvs.CreateBitmap";
_res = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_res = _cvs.CreateBitmap();
RDebugUtils.currentLine=9895948;
 //BA.debugLineNum = 9895948;BA.debugLine="cvs.Release";
_cvs.Release();
RDebugUtils.currentLine=9895949;
 //BA.debugLineNum = 9895949;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=9895950;
 //BA.debugLineNum = 9895950;BA.debugLine="End Sub";
return null;
}
public int  _topfromvalue(b4a.example.animatedcounter __ref,int _digit) throws Exception{
__ref = this;
RDebugUtils.currentModule="animatedcounter";
if (Debug.shouldDelegate(ba, "topfromvalue", true))
	 {return ((Integer) Debug.delegate(ba, "topfromvalue", new Object[] {_digit}));}
int _d = 0;
RDebugUtils.currentLine=9830400;
 //BA.debugLineNum = 9830400;BA.debugLine="Private Sub TopFromValue (Digit As Int) As Int";
RDebugUtils.currentLine=9830401;
 //BA.debugLineNum = 9830401;BA.debugLine="Dim d As Int = mValue.Get(Digit)";
_d = (int)(BA.ObjectToNumber(__ref._mvalue /*anywheresoftware.b4a.objects.collections.List*/ .Get(_digit)));
RDebugUtils.currentLine=9830402;
 //BA.debugLineNum = 9830402;BA.debugLine="Return -d * DigitHeight";
if (true) return (int) (-_d*__ref._digitheight /*int*/ );
RDebugUtils.currentLine=9830403;
 //BA.debugLineNum = 9830403;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals(b4a.example.animatedcounter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="animatedcounter";
RDebugUtils.currentLine=9502720;
 //BA.debugLineNum = 9502720;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=9502721;
 //BA.debugLineNum = 9502721;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=9502722;
 //BA.debugLineNum = 9502722;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=9502723;
 //BA.debugLineNum = 9502723;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=9502724;
 //BA.debugLineNum = 9502724;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=9502725;
 //BA.debugLineNum = 9502725;BA.debugLine="Private ImageViews As List";
_imageviews = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=9502726;
 //BA.debugLineNum = 9502726;BA.debugLine="Private mdigits As Int";
_mdigits = 0;
RDebugUtils.currentLine=9502727;
 //BA.debugLineNum = 9502727;BA.debugLine="Private lblTemplate As B4XView";
_lbltemplate = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=9502728;
 //BA.debugLineNum = 9502728;BA.debugLine="Private mValue As List";
_mvalue = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=9502729;
 //BA.debugLineNum = 9502729;BA.debugLine="Private DigitHeight, DigitWidth As Int";
_digitheight = 0;
_digitwidth = 0;
RDebugUtils.currentLine=9502730;
 //BA.debugLineNum = 9502730;BA.debugLine="Private mDuration As Int";
_mduration = 0;
RDebugUtils.currentLine=9502731;
 //BA.debugLineNum = 9502731;BA.debugLine="Private fade As B4XBitmap";
_fade = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
RDebugUtils.currentLine=9502732;
 //BA.debugLineNum = 9502732;BA.debugLine="Private xfadeIv As B4XView";
_xfadeiv = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=9502733;
 //BA.debugLineNum = 9502733;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=9502735;
 //BA.debugLineNum = 9502735;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _createfadebitmap(b4a.example.animatedcounter __ref,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="animatedcounter";
if (Debug.shouldDelegate(ba, "createfadebitmap", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) Debug.delegate(ba, "createfadebitmap", new Object[] {_clr}));}
b4a.example.bitmapcreator _bc = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _tclr = 0;
RDebugUtils.currentLine=9699328;
 //BA.debugLineNum = 9699328;BA.debugLine="Private Sub CreateFadeBitmap (clr As Int) As B4XBi";
RDebugUtils.currentLine=9699329;
 //BA.debugLineNum = 9699329;BA.debugLine="Dim bc As BitmapCreator";
_bc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=9699330;
 //BA.debugLineNum = 9699330;BA.debugLine="bc.Initialize(200, 50)";
_bc._initialize(ba,(int) (200),(int) (50));
RDebugUtils.currentLine=9699331;
 //BA.debugLineNum = 9699331;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=9699332;
 //BA.debugLineNum = 9699332;BA.debugLine="r.Initialize(0, 0, bc.mWidth, bc.mHeight / 3)";
_r.Initialize((float) (0),(float) (0),(float) (_bc._mwidth),(float) (_bc._mheight/(double)3));
RDebugUtils.currentLine=9699333;
 //BA.debugLineNum = 9699333;BA.debugLine="Dim tclr As Int = Bit.And(0x00ffffff, clr)";
_tclr = __c.Bit.And((int) (0x00ffffff),_clr);
RDebugUtils.currentLine=9699334;
 //BA.debugLineNum = 9699334;BA.debugLine="bc.FillGradient(Array As Int(clr, tclr), r, \"TOP_";
_bc._fillgradient(new int[]{_clr,_tclr},_r,"TOP_BOTTOM");
RDebugUtils.currentLine=9699335;
 //BA.debugLineNum = 9699335;BA.debugLine="r.Top = bc.mHeight * 2 / 3";
_r.setTop((float) (_bc._mheight*2/(double)3));
RDebugUtils.currentLine=9699336;
 //BA.debugLineNum = 9699336;BA.debugLine="r.Bottom = bc.mHeight";
_r.setBottom((float) (_bc._mheight));
RDebugUtils.currentLine=9699337;
 //BA.debugLineNum = 9699337;BA.debugLine="bc.FillGradient(Array As Int(clr, tclr), r, \"BOTT";
_bc._fillgradient(new int[]{_clr,_tclr},_r,"BOTTOM_TOP");
RDebugUtils.currentLine=9699338;
 //BA.debugLineNum = 9699338;BA.debugLine="Return bc.Bitmap";
if (true) return _bc._getbitmap();
RDebugUtils.currentLine=9699339;
 //BA.debugLineNum = 9699339;BA.debugLine="End Sub";
return null;
}
public String  _designercreateview(b4a.example.animatedcounter __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="animatedcounter";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
int _i = 0;
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
anywheresoftware.b4a.objects.ImageViewWrapper _fadeiv = null;
RDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
RDebugUtils.currentLine=9633793;
 //BA.debugLineNum = 9633793;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=9633795;
 //BA.debugLineNum = 9633795;BA.debugLine="Dim pnl As B4XView = xui.CreatePanel(\"\") 'needed";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=9633796;
 //BA.debugLineNum = 9633796;BA.debugLine="mBase.AddView(pnl, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_pnl.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=9633797;
 //BA.debugLineNum = 9633797;BA.debugLine="mdigits = Props.Get(\"Digits\")";
__ref._mdigits /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Digits"))));
RDebugUtils.currentLine=9633798;
 //BA.debugLineNum = 9633798;BA.debugLine="mDuration = Props.Get(\"Duration\")";
__ref._mduration /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Duration"))));
RDebugUtils.currentLine=9633799;
 //BA.debugLineNum = 9633799;BA.debugLine="lblTemplate = lbl";
__ref._lbltemplate /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=9633800;
 //BA.debugLineNum = 9633800;BA.debugLine="fade = CreateFadeBitmap(xui.PaintOrColorToColor(P";
__ref._fade /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = __ref._createfadebitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.GetDefault((Object)("FadeColor"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White))));
RDebugUtils.currentLine=9633801;
 //BA.debugLineNum = 9633801;BA.debugLine="For i = 0 To mdigits - 1";
{
final int step10 = 1;
final int limit10 = (int) (__ref._mdigits /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=9633802;
 //BA.debugLineNum = 9633802;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=9633803;
 //BA.debugLineNum = 9633803;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
RDebugUtils.currentLine=9633804;
 //BA.debugLineNum = 9633804;BA.debugLine="ImageViews.Add(iv)";
__ref._imageviews /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_iv.getObject()));
RDebugUtils.currentLine=9633805;
 //BA.debugLineNum = 9633805;BA.debugLine="mBase.GetView(0).AddView(iv, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).AddView((android.view.View)(_iv.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 }
};
RDebugUtils.currentLine=9633807;
 //BA.debugLineNum = 9633807;BA.debugLine="Dim fadeIv As ImageView";
_fadeiv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=9633808;
 //BA.debugLineNum = 9633808;BA.debugLine="fadeIv.Initialize(\"\")";
_fadeiv.Initialize(ba,"");
RDebugUtils.currentLine=9633809;
 //BA.debugLineNum = 9633809;BA.debugLine="xfadeIv = fadeIv";
__ref._xfadeiv /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_fadeiv.getObject()));
RDebugUtils.currentLine=9633810;
 //BA.debugLineNum = 9633810;BA.debugLine="mBase.GetView(0).AddView(fadeIv, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).AddView((android.view.View)(_fadeiv.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=9633811;
 //BA.debugLineNum = 9633811;BA.debugLine="setValue(0)";
__ref._setvalue /*String*/ (null,(int) (0));
RDebugUtils.currentLine=9633812;
 //BA.debugLineNum = 9633812;BA.debugLine="If xui.IsB4A Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A()) { 
RDebugUtils.currentLine=9633813;
 //BA.debugLineNum = 9633813;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=9633814;
 //BA.debugLineNum = 9633814;BA.debugLine="setValue(getValue)";
__ref._setvalue /*String*/ (null,__ref._getvalue /*int*/ (null));
 };
RDebugUtils.currentLine=9633816;
 //BA.debugLineNum = 9633816;BA.debugLine="End Sub";
return "";
}
public String  _setvalue(b4a.example.animatedcounter __ref,int _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="animatedcounter";
if (Debug.shouldDelegate(ba, "setvalue", true))
	 {return ((String) Debug.delegate(ba, "setvalue", new Object[] {_v}));}
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _iv = null;
RDebugUtils.currentLine=9961472;
 //BA.debugLineNum = 9961472;BA.debugLine="Public Sub setValue(v As Int)";
RDebugUtils.currentLine=9961473;
 //BA.debugLineNum = 9961473;BA.debugLine="mValue.Clear";
__ref._mvalue /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=9961474;
 //BA.debugLineNum = 9961474;BA.debugLine="For i = 0 To mdigits - 1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._mdigits /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=9961475;
 //BA.debugLineNum = 9961475;BA.debugLine="mValue.Add(v Mod 10)";
__ref._mvalue /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_v%10));
RDebugUtils.currentLine=9961476;
 //BA.debugLineNum = 9961476;BA.debugLine="v = v / 10";
_v = (int) (_v/(double)10);
RDebugUtils.currentLine=9961477;
 //BA.debugLineNum = 9961477;BA.debugLine="Dim iv As B4XView = ImageViews.Get(i)";
_iv = new anywheresoftware.b4a.objects.B4XViewWrapper();
_iv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._imageviews /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=9961478;
 //BA.debugLineNum = 9961478;BA.debugLine="iv.SetLayoutAnimated(mDuration, iv.Left, TopFrom";
_iv.SetLayoutAnimated(__ref._mduration /*int*/ ,_iv.getLeft(),__ref._topfromvalue /*int*/ (null,_i),(int) (__c.Max(1,_iv.getWidth())),(int) (__c.Max(1,_iv.getHeight())));
 }
};
RDebugUtils.currentLine=9961481;
 //BA.debugLineNum = 9961481;BA.debugLine="End Sub";
return "";
}
public int  _getvalue(b4a.example.animatedcounter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="animatedcounter";
if (Debug.shouldDelegate(ba, "getvalue", true))
	 {return ((Integer) Debug.delegate(ba, "getvalue", null));}
int _res = 0;
int _i = 0;
RDebugUtils.currentLine=10027008;
 //BA.debugLineNum = 10027008;BA.debugLine="Public Sub getValue As Int";
RDebugUtils.currentLine=10027009;
 //BA.debugLineNum = 10027009;BA.debugLine="Dim res As Int";
_res = 0;
RDebugUtils.currentLine=10027010;
 //BA.debugLineNum = 10027010;BA.debugLine="For i = 0 To mValue.Size - 1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._mvalue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=10027011;
 //BA.debugLineNum = 10027011;BA.debugLine="res = res + mValue.Get(i) * Power(10, i)";
_res = (int) (_res+(double)(BA.ObjectToNumber(__ref._mvalue /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)))*__c.Power(10,_i));
 }
};
RDebugUtils.currentLine=10027013;
 //BA.debugLineNum = 10027013;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=10027014;
 //BA.debugLineNum = 10027014;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(b4a.example.animatedcounter __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="animatedcounter";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=9568256;
 //BA.debugLineNum = 9568256;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=9568257;
 //BA.debugLineNum = 9568257;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=9568258;
 //BA.debugLineNum = 9568258;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=9568259;
 //BA.debugLineNum = 9568259;BA.debugLine="ImageViews.Initialize";
__ref._imageviews /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=9568260;
 //BA.debugLineNum = 9568260;BA.debugLine="mValue.Initialize";
__ref._mvalue /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=9568261;
 //BA.debugLineNum = 9568261;BA.debugLine="End Sub";
return "";
}
}