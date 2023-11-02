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
	Dim days As String
	Dim rate As String
	Dim salary As String
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	
	Private txtid As EditText
	Private txtdays As EditText
	Private txtrate As EditText
	Private txtsalary As EditText
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	If FirstTime Then
		CopyDb("catallodb.db")
		sql.Initialize(File.DirInternal, "catallodb.db", False)
	End If
	
	Activity.LoadLayout("laySalary")

	txtid.Text = employee_num
	txtdays.Text = days
	txtrate.Text = rate
	txtsalary.Text = salary
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
	Dim qry, qry2 As String
	ans = Msgbox2("Save Changes?", "Update Salary", "Ok", "Cancel", "", Null)
	If ans = DialogResponse.POSITIVE Then
		qry = "UPDATE doctolero SET days = ?, rate = ?, salary = ? WHERE employee_num = " & txtid.Text & ""
		sql.ExecNonQuery2(qry, Array As String(txtdays.Text, txtrate.Text, txtsalary.Text))
		Msgbox("Salary Updated","")
		Activity.Finish
	Else
		Msgbox("Update was cancelled!", "")
	End If
End Sub

Private Sub btnClose_Click
	Activity.Finish
End Sub

Private Sub btnCompute_Click
	If txtrate.Text = "" Or txtdays.Text = "" Then
		Msgbox("Fill out data", "")
	Else
		txtsalary.Text = txtdays.Text * txtrate.Text
	End If
	
End Sub