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

	Private B4XTable1 As B4XTable
	Dim inpdlg As InputDialog
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	If FirstTime Then
		CopyDb("catallodb.db")
		sql.Initialize(File.DirInternal, "catallodb.db", False)
	End If
	
	Activity.LoadLayout("layUser")

	B4XTable1.AddColumn("ID", B4XTable1.COLUMN_TYPE_TEXT)
	B4XTable1.AddColumn("Username", B4XTable1.COLUMN_TYPE_TEXT)
	B4XTable1.AddColumn("Password", B4XTable1.COLUMN_TYPE_TEXT)
	B4XTable1.AddColumn("Full Name", B4XTable1.COLUMN_TYPE_TEXT)
	B4XTable1.AddColumn("Level", B4XTable1.COLUMN_TYPE_TEXT)
	
	ShowList
End Sub

Sub Activity_Resume
	ShowList
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub CopyDb(Filename As String)
	'File.Delete(File.DirInternal, "catallodb.db")
	If File.Exists(File.DirInternal, Filename) = False Then
		File.Copy(File.DirAssets, Filename, File.DirInternal, Filename)
	End If
End Sub

Sub ShowList
	Dim data As List
	data.Initialize
	rs = sql.ExecQuery("Select * from tbllogin")
	Do While rs.NextRow
		Dim row(5) As Object
		row(0) = rs.GetInt("id")
		row(1) = rs.GetString("username")
		row(2) = rs.GetString("password")
		row(3) = rs.GetString("full_name")
		row(4) = rs.GetString("level")
		data.Add(row)
	Loop
	rs.Close
	B4XTable1.SetData(data)
End Sub

Private Sub btnClose_Click
	Activity.Finish
End Sub

Private Sub btnAddUser_Click
	StartActivity(AddUser)
End Sub

Private Sub btnEdit_Click
	Dim ans2 As String
	Dim enum2 As String
	Dim qry As String
	Dim c2 As Cursor
	inpdlg.Input=""
	ans2 = inpdlg.Show("Enter Employee Number","Update Records","Ok","Cancel","",Null)
	
	If ans2 = DialogResponse.POSITIVE Then
		enum2 = inpdlg.Input
		qry = "Select * from tbllogin where id = ?"
		c2 = sql.ExecQuery2(qry, Array As String(enum2))
		If c2.RowCount > 0 Then
			c2.Position = 0
			EditUser.fname = c2.GetString("full_name")
			EditUser.id = c2.GetString("id")
			EditUser.password = c2.GetString("password")
			EditUser.username = c2.GetString("username")
			EditUser.level = c2.GetString("level")
			StartActivity(EditUser)
		Else
			Msgbox("No records found","")
		End If
	End If

End Sub