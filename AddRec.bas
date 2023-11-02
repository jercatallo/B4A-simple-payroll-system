B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=10.7
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Dim sql As SQL
	Dim rs As ResultSet
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private txtnum As EditText
	Private txtname As EditText
	Private txtaddress As EditText
	Private txtage As EditText
	Private txtgender As EditText
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	If FirstTime Then
		CopyDb("catallodb.db")
		sql.Initialize(File.DirInternal, "catallodb.db", False)
	End If

	Activity.LoadLayout("layAdd")
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub CopyDb(Filename As String)
	'File.Delete(File.DirInternal, "catallodb.db")
	If File.Exists(File.DirInternal, Filename) = False Then
		File.Copy(File.DirAssets, Filename, File.DirInternal, Filename)
	End If
End Sub

Private Sub btnAdd_Click
	Dim qry,qry2 As String
	
	If txtnum.Text = "" Or txtname.Text = "" Or txtgender.Text = "" Or txtage.Text = "" Or txtaddress.Text = "" Then
		Msgbox("Please fill out all data", "Warning")
		txtnum.RequestFocus
	Else
		qry = "Insert into jer_carlo Values(?,?,?,?,?)"
		sql.ExecNonQuery2(qry, Array As String(txtnum.Text, txtname.Text, txtaddress.Text, txtage.Text, txtgender.Text))
		
		qry2 = "INSERT INTO doctolero VALUES(?,?,?,?)"
		sql.ExecNonQuery2(qry2, Array As String(txtnum.Text, 0, 0, 0))
		Activity.Finish
	End If
End Sub

Private Sub btnClose_Click
	Activity.Finish
End Sub

