<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>E-cart Login page</title>
<script>
function login()
{
	var uname=document.getElementById("uname");
	var pass=document.getElementById("pass");
	
	if(uname=="")
		{
		alert("please, enter username");
		return false;
		}
	if(pass=="")
		{
		alert("please, enter password");
		return false;
		}
	}

</script>
</head>
<body>
<h1 align="center" style="color:darkred;background-color:lightblue;">E-Cart Online Shopping</h1>
<h2 style="color:blue">Welcome  to Login page</h2>

<form action="LoginController" method="post" onsubmit="return login()">
		<table>
				<tr><td><label>UserName</label></td><td><input type ="text" name="username" id="uname"></td></tr>
				
				<tr><td><label>Password</label></td><td><input type ="password" name="pass" id="pass"></td></tr>
				
				<tr><td><a href="register.jsp">signup</a></td><td><input type ="submit" value="Login" id="submit"></td></tr>
		
		
		</table>
	</form>
</body>
</html>