
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main Page</title>
</head>
<body <%out.print("style=\"background-image:url(holiday2.jpg);background-position:center;background-repeat:repeat y;text-align:right;background-color:#E6E6FA\""); %>>

    <h2  <%out.print("style=\"margin-top:10px; font-size:30px;color:#444444;margin-right:20px\""); %>>Please select first: </h2><br>
	<h1  <%out.print("style=\"margin-top:10px; font-size:60px;color:#444444;margin-right:40px\""); %>>I am a: </h1>
	<p <%out.print("style=\"margin-top:30px\""); %>><input type = "button" value = "User" onclick = "window.location.href = 'userpage.jsp' " <%out.print("style=\"background-color:#DDDDDD;border-radius:5px;font-size:25px;margin-right:80px;\""); %>></p>
    <p <%out.print("style=\"margin-top:30px\""); %>><input type = "button" value = "Administrator" onclick = "window.location.href = 'AdminLogin.jsp'" <%out.print("style=\"background-color:#DDDDDD;border-radius:5px;font-size:25px;margin-right:40px\""); %>></p>
	
</body>
</html>




