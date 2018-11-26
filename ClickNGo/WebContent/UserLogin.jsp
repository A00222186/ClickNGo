<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>USER LOGIN</title>
</head>
<body <%out.print("style=\"background-image:url(holiday2.jpg);background-position:center;background-repeat:repeat y;text-align:right;background-color:#E6E6FA\""); %>>

<h2  <%out.print("style=\"margin-top:10px; font-size:40px;color:#444444\""); %>>User Login</h2>
<form action="UserLoginServlet" method="post">
<p <%out.print("style=\"margin-top:20px;font-size:25px;\""); %>>Email:<input type="text" name="email" <%out.print("style=\"border-radius:5px\""); %>> </p>
<p <%out.print("style=\"margin-top:20px;font-size:25px;\""); %>>Password:<input type="password" name="Password" <%out.print("style=\"border-radius:5px\""); %>> </p>
<input type="submit" value="      login    " <%out.print("style=\"background-color:#DDDDDD;border-radius:9px;font-size:20px;margin-left:10px\""); %>>
<p <%out.print("style=\"margin-top:30px\""); %>><input type = "button" value = "Back Main" onclick = "window.location.href = 'index.jsp'" <%out.print("style=\"background-color:#DDDDDD;border-radius:9px;font-size:20px;margin-left:10px\""); %>></p>
	
</form>

</body>
</html>