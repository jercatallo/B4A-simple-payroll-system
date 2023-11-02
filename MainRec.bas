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

	Dim fname As String
	Dim level As String
	Dim password As String
	Dim id As String
	Dim username As String
	Dim c1 As Cursor
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private B4XTable1 As B4XTable
	Dim inpdlg As InputDialog
	
	Private Spinner1 As Spinner
	Private btnUser As  Button
	Private btnAdd As Button
	Private btnDelete As Button
	Private btnEdit As Button
	Private btnEditSalary As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	If FirstTime Then
		CopyDb("catallodb.db")
		sql.Initialize(File.DirInternal, "catallodb.db", False)
	End If
	
	Activity.LoadLayout("layMain")
	
	B4XTable1.AddColumn("Employee Number", B4XTable1.COLUMN_TYPE_TEXT)
	B4XTable1.AddColumn("Name", B4XTable1.COLUMN_TYPE_TEXT)
	B4XTable1.AddColumn("Address", B4XTable1.COLUMN_TYPE_TEXT)
	B4XTable1.AddColumn("Age", B4XTable1.COLUMN_TYPE_TEXT)
	B4XTable1.AddColumn("Gender", B4XTable1.COLUMN_TYPE_TEXT)
	B4XTable1.AddColumn("Days", B4XTable1.COLUMN_TYPE_TEXT)
	B4XTable1.AddColumn("Rate", B4XTable1.COLUMN_TYPE_TEXT)
	B4XTable1.AddColumn("Salary", B4XTable1.COLUMN_TYPE_TEXT)
	
	ShowList
	

	
	Spinner1.Add(fname)
	Spinner1.Add("Edit Profile")
	Spinner1.Add("Logout")
	Spinner1.Add("Exit")
	
	If level = 2 Then
		btnUser.Visible = False
	Else if level = 3 Then 
		btnUser.Visible = False
		btnEdit.Visible = False
		btnDelete.Visible = False
		btnAdd.Visible = False
		btnEditSalary.Visible = False
	End If
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
	rs = sql.ExecQuery("SELECT jer_carlo.employee_num, jer_carlo.name, jer_carlo.address, jer_carlo.age, jer_carlo.gender, doctolero.days, doctolero.rate, doctolero.salary from jer_carlo inner join doctolero WHERE jer_carlo.employee_num = doctolero.employee_num")
	Do While rs.NextRow
		Dim row(8) As Object
		row(0) = rs.GetString("employee_num")
		row(1) = rs.GetString("name")
		row(2) = rs.GetString("address")
		row(3) = rs.GetString("age")
		row(4) = rs.GetString("gender")
		row(5) = rs.GetString("days")
		row(6) = rs.GetString("rate")
		row(7) = rs.GetString("salary")
		data.Add(row)
	Loop
	rs.Close
	B4XTable1.SetData(data)
End Sub


Private Sub btnUser_Click
	StartActivity(UserRec)
End Sub

Private Sub btnEditSalary_Click
	Dim ans2 As String
	Dim enum2 As String
	Dim qry As String
	Dim c2 As Cursor
	inpdlg.Input=""
	ans2 = inpdlg.Show("Enter Employee Number","Update Salary","Ok","Cancel","",Null)
	
	If ans2 = DialogResponse.POSITIVE Then
		enum2 = inpdlg.Input
		qry = "Select * from doctolero where employee_num = ?"
		c2 = sql.ExecQuery2(qry, Array As String(enum2))
		If c2.RowCount > 0 Then
			Dim x As String
			x = Msgbox2("Edit this Salary?", "Edit Salary", "Yes", "Cancel", "", Null)
			If x = DialogResponse.POSITIVE Then
				c2.Position = 0
				SalaryEdit.employee_num = c2.GetString("employee_num")
				SalaryEdit.days = c2.GetString("days")
				SalaryEdit.rate = c2.GetString("rate")
				SalaryEdit.salary = c2.GetString("salary")
				StartActivity(SalaryEdit)
			Else
				Msgbox("Edit cancelled.", "")
			End If
			
		Else
			Msgbox("No records found","")
		End If
	End If
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
		qry = "Select * from jer_carlo where employee_num = ?"
		c2 = sql.ExecQuery2(qry, Array As String(enum2))
		If c2.RowCount > 0 Then
			Dim x As String
			x = Msgbox2("Edit this record?", "Edit Record", "Yes", "Cancel", "", Null)
			If x = DialogResponse.POSITIVE Then
				c2.Position = 0
				EditRec.employee_num = c2.GetString("employee_num")
				EditRec.name = c2.GetString("name")
				EditRec.address = c2.GetString("address")
				EditRec.age = c2.GetString("age")
				EditRec.gender = c2.GetString("gender")
				StartActivity(EditRec)
			Else
				Msgbox("Edit cancelled.", "")
			End If
			
		Else
			Msgbox("No records found","")
		End If
	End If
End Sub

Private Sub btnDelete_Click
	Dim ans As String
	Dim enum As String
	Dim qry, qry2, qry3 As String
	Dim c1 As Cursor
	
	inpdlg.Input = ""
	ans = inpdlg.Show("Enter Employee Number", "Deleting of Record", "Ok", "Cancel", "", Null)

	If ans = DialogResponse.POSITIVE Then
		enum = inpdlg.Input
		qry = "SELECT * FROM jer_carlo WHERE employee_num = ?"
		c1 = sql.ExecQuery2(qry, Array As String(enum))
		If c1.RowCount > 0 Then
			Dim x As String
			x = Msgbox2("Delete this record?","Deleting","Ok","Cancel","",Null)
			If x = DialogResponse.POSITIVE Then
				qry2 = "Delete from jer_carlo where employee_num = ?"
				sql.ExecNonQuery2(qry2, Array As String(enum))
				
				qry3 = "Delete from doctolero where employee_num = ?"
				sql.ExecNonQuery2(qry3, Array As String(enum))
				ShowList
			Else
				Msgbox("Deletion cancelled","")

			End If
		Else
			Msgbox("No record found","")
			ShowList
		End If
	End If
End Sub

Private Sub btnAdd_Click
	StartActivity(AddRec)
End Sub

Private Sub Spinner1_ItemClick (Position As Int, Value As Object)
	If Spinner1.SelectedIndex = 1 Then
		StartActivity(EditUser)
		
		EditUser.fname = fname
		EditUser.id = id
		EditUser.password = password
		EditUser.username = username
		EditUser.level = level
	
	Else if Spinner1.SelectedIndex = 2 Then
		Activity.Finish
	Else if Spinner1.SelectedIndex = 3 Then
		ExitApplication
	End If
End Sub