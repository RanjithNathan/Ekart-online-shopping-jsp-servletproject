<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>E=cart Online Shopping User Home Page</title>
</head>
<body>
		<%
				String name=(String)session.getAttribute("sname");
		%>
		<h2 style="color:darkblue;">Welcome,Mr.<%=name %></h2>
			<ul type=none>
				<li><a href="">Products List</a></li>
				<li><a href="">View Cart</a></li>
			</ul>
	
</body>
</html>