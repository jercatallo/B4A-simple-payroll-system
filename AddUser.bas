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
	
	Dim id As String
	Dim username As String
	Dim fname As String
	Dim password As String
	Dim level As String
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private txtid As EditText
	Private txtusername As EditText
	Private txtpassword As EditText
	Private txtpassword2 As EditText
	Private txtfname As EditText
	Private txtlevel As EditText
	Private chkPass As CheckBox
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	If FirstTime Then
		CopyDb("catallodb.db")
		sql.Initialize(File.DirInternal, "catallodb.db", False)
	End If
	
	Activity.LoadLayout("layAddUser")

	txtusername.Text = username
	txtpassword.Text = password
	txtid.Text = id
	txtfname.Text = fname
	txtlevel.Text = level
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
	Dim qry, qry2 As String
	Dim c1 As Cursor
	
	If txtid.Text = "" Or txtusername.Text = "" Or txtpassword.Text = "" Or txtpassword2.Text = "" Or txtfname.Text = "" Or txtlevel.Text = "" Then
		ToastMessageShow("Please Fill out all data", False)
	Else
		If txtpassword.Text = txtpassword2.Text Then
			qry = "SELECT * FROM tbllogin where username = ?"
			c1 = sql.ExecQuery2(qry, Array As String(txtusername.Text))
			
			If c1.RowCount > 0 Then
				Msgbox("Username Already Exist", "")
				txtusername.RequestFocus
			Else
				qry2 = "INSERT INTO tbllogin(username,password,full_name,level) VALUES (?,?,?,?)"
				sql.ExecNonQuery2(qry2, Array As String(txtusername.Text,txtpassword.Text,txtfname.Text,txtlevel.Text))
				Msgbox("User Added Successfully!", "")
				Activity.Finish
			End If
		Else
			Msgbox("Password Mismatch!", "")
		End If
	End If
End Sub


Private Sub btnClose_Click
	Activity.Finish
End Sub

Private Sub chkPass_CheckedChange(Checked As Boolean)
	If chkPass.Checked = True Then
		txtpassword.PasswordMode = False
		txtpassword2.PasswordMode = False
	Else
		txtpassword.PasswordMode = True
		txtpassword2.PasswordMode = True
	End If
End Sub
