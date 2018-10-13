<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JobPortal</title>
<script>
function inputValidity(){
	 var ID = document.form.ID.value;
	 var name = document.form.name.value;
	 var skills = document.form.skills.value; 
	 var exp = document.form.exp.value;
	 var skill_ID= document.form.skill_ID.value;
	 
	 if (ID==null || ID=="")
	 { 
	 alert("Candidate ID cannot be blank"); 
	 return false; 
	 }
	 else if (name==null || name=="")
	 { 
	 alert("Candidate name cannot be blank"); 
	 return false; 
	 }
	 else if (skills==null || skills=="")
	 { 
	 alert("Skills cannot be blank"); 
	 return false; 
	 }
	 else if(skill_ID==null || skill_ID=="")
	 { 
	 alert("Enter the Skill ID"); 
	 return false; 
	 } 
	 else if (exp==null || exp=="")
	 { 
	 alert(Enter your Work experience); 
	 return false; 
	 } 
	 }

</script>
</head>
<body bgcolor="#b6c3d8">
	<marquee scrollamount="10" behavior="alternate">
		<h1 style="color: #575e4d; font-family: verdana;">Welcome to
			JobPortal</h1>
	</marquee>

	<form method="post" action="ControllerServlet"
		onsubmit="return inputValidity()"
		style="text-align: center; margin-top: 50px; color: #4613c6">
		Enter Candidate ID <br> <input type="text" name="ID"><br>
		<br> Enter Candidate Name <br> <input type="text"
			name="name"><br> <br> Enter Candidate SkillSet <br>
		<br> (Java, J2EE, HTML, CSS, React, JavaScript, Python, SQL,
		Android, <br> C, C++, Shell Scripting, Servlets, JSP, PHP, Ruby)
		<br> <input type="text" name="skills"><br> <br>
		Enter Skill ID <br> <input type="text" name="skill_ID"><br>
		<br> Enter Candidate Experience(in years) <br> <input
			type="text" name="exp"><br> <br> <input
			type="submit">

	</form>


</body>
</html>