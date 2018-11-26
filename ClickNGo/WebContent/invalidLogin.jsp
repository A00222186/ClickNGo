<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Oops!</title>
</head>
<body <%out.print("style=\"background-image:url(holiday2.jpg);background-position:center;background-repeat:repeat y;text-align:right;background-color:#E6E6FA\""); %>>

    <h2  <%out.print("style=\"margin-top:10px; font-size:40px;color:#444444;margin-right:20px\""); %>>Oops! Something went wrong.</h2><br>
	<h1  <%out.print("style=\"margin-top:10px; font-size:30px;color:#444444;margin-right:40px\""); %>>Please try again.</h1>
	<p <%out.print("style=\"margin-top:30px\""); %>><input type = "button" value = "TRY AGAIN!" onclick = "window.location.href = 'AdminLogin.jsp' " <%out.print("style=\"background-color:#DDDDDD;border-radius:5px;font-size:25px;margin-right:40px;\""); %>></p>
</body>
</html>
