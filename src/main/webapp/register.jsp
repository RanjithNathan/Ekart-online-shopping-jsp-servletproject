<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>E-cart User Registration page</title>
</head>
<body>
<h1 align="center" style="color:darkred;background-color:lightblue;">E-Cart Online Shopping</h1>
<h2 style="color:blue">Welcome to Registration Page</h2>
	
	<form action="RegisterController" method="post">
		<table>
				<tr><td><label>Name</label></td><td><input type ="text" name="name" id="name"></td></tr>
				<tr><td><label>Mail-Id</label></td><td><input type ="email" name="mail" id="mail"></td></tr>
				<tr><td><label>Mobile Number</label></td><td><input type ="text" name="mobile" id="mobile"></td></tr>
				<tr><td><label>UserName</label></td><td><input type ="text" name="username" id="uname"></td></tr>
				<tr><td><label>Password</label></td><td><input type ="password" name="pass" id="pass"></td></tr>
				<tr><td><label>Re-Enter Password</label></td><td><input type="password" name="repass" id="repass"></td></tr>
				<tr><td></td><td><input type ="submit" value="Register" id="submit"></td></tr>
		
		
		</table>
	</form>
</body>
</html>