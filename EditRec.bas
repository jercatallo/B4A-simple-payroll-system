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
	
	Dim employee_num As String
	Dim name As String
	Dim address As String
	Dim age As String
	Dim gender As String
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
	
	Activity.LoadLayout("layEdit")

	txtnum.Text = employee_num
	txtname.Text = name
	txtaddress.Text = address
	txtage.Text = age
	txtgender.Text = gender
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


Private Sub btnEdit_Click
	Dim ans As String
	Dim qry As String
	ans = Msgbox2("Save Changes?", "Update Records", "Ok", "Cancel", "", Null)
	If ans = DialogResponse.POSITIVE Then
		qry = "UPDATE jer_carlo SET name = ?, address = ?, age = ?, gender = ? WHERE employee_num = " & txtnum.Text & ""
		
		sql.ExecNonQuery2(qry, Array As String(txtname.Text, txtaddress.Text, txtage.Text, txtgender.Text))
		Msgbox("Records Updated","")
		Activity.Finish
	Else
		Msgbox("Update was cancelled!", "")
	End If
End Sub

Private Sub btnClose_Click
	Activity.Finish
End Sub