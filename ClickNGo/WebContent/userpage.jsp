<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>UserPage</title>
</head>
<body <%out.print("style=\"background-image:url(holiday2.jpg);background-position:center;background-repeat:repeat y;text-align:right;background-color:#E6E6FA\""); %>>

    <h2  <%out.print("style=\"margin-top:10px; font-size:30px;color:#444444;margin-right:30px\""); %>>Please select: </h2><br>
	
	<p <%out.print("style=\"margin-top:30px\""); %>><input type = "button" value = "Register" onclick = "window.location.href = 'useraccount.jsp' " <%out.print("style=\"background-color:#DDDDDD;border-radius:5px;font-size:25px;margin-right:60px;\""); %>></p>
    <p <%out.print("style=\"margin-top:30px\""); %>><input type = "button" value = "  Login  " onclick = "window.location.href = 'UserLogin.jsp'" <%out.print("style=\"background-color:#DDDDDD;border-radius:5px;font-size:25px;margin-right:60px\""); %>></p>
	<p <%out.print("style=\"margin-top:30px\""); %>><input type = "button" value = "Back" onclick = "window.location.href = 'index.jsp'" <%out.print("style=\"background-color:#DDDDDD;border-radius:15px;font-size:15px;margin-right:80px\""); %>></p>
	
</body>
</html>