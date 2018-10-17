<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link type="text/css" rel="stylesheet" href="/WEB-INF/resouces/css/AdminRegCSS.css">
	<head>
		<meta charset="ISO-8859-1">
		<title>Admin Registration</title>
	</head>
	<body>
		<form method="post" action="AdminRegServlet">
			Enter Staff ID:<input type="text" name="staffid">
			<br>
			Enter First Name:<input type="text" name="fname">
			<br>
			Enter Last Name:<input type="text" name="lname">
			<br>
			Enter Address:<input type="text" name="address">
			<br>
			Enter E-mail:<input type="text" name="email">
			<br>
			Enter Phone number:<input type="text" name="phone">
			<br>
			Enter new Password:<input type="text" name="password">
			<br>
			<input type="submit" value ="Register Admin">
		</form>
	</body>
</html>