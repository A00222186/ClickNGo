<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LinkPage</title>
</head>
<body <%out.print("style=\"background-image:url(holiday2.jpg);background-position:center;background-repeat:repeat y;text-align:right;background-color:#E6E6FA\""); %>>
<h2 <%out.print("style=\"margin-top:10px; font-size:80px;color:#444444\""); %>>Main Menu</h2>
<p <%out.print("style=\"margin-top:50px\""); %>><input type = "button" value = "Register User" onclick = "window.location.href = 'useraccount.jsp' " <%out.print("style=\"background-color:#DDDDDD;border-radius:5px;font-size:25px;margin-right:100px;\""); %>></p>
<p <%out.print("style=\"margin-top:50px\""); %>><input type = "button" value = "Register Admin" onclick = "window.location.href = 'index.jsp'" <%out.print("style=\"background-color:#DDDDDD;border-radius:5px;font-size:25px;margin-right:90px\""); %>></p>
<p <%out.print("style=\"margin-top:50px\""); %>><input type = "button" value = "Add Holiday" onclick = "window.location.href = 'addHoliday.jsp'" <%out.print("style=\"background-color:#DDDDDD;border-radius:5px;font-size:25px;margin-right:100px\""); %>></p>
<p <%out.print("style=\"margin-top:50px\""); %>><input type = "button" value = "Remove Holiday" onclick = "window.location.href = 'RemoveHolidays.jsp'" <%out.print("style=\"background-color:#DDDDDD;border-radius:5px;font-size:25px;margin-right:80px\""); %>></p>
</body>
</html>