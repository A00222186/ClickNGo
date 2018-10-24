<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LinkPage</title>
</head>
<body <%out.print("style=\"text-align:center;background-color:#E6E6FA\""); %>>
<h2>Link Pages Button</h2>
<p <%out.print("style=\"margin-top:3px\""); %>><input type = "button" value = "userRegister" onclick = "window.location.href = 'useraccount.jsp' " <%out.print("style=\"background-color:#DDDDDD;border-radius:5px;font-size:20px;\""); %>></p>
<p <%out.print("style=\"margin-top:3px\""); %>><input type = "button" value = "adminRegister" onclick = "window.location.href = 'index.jsp'" <%out.print("style=\"background-color:#DDDDDD;border-radius:5px;font-size:20px;\""); %>></p>
<p <%out.print("style=\"margin-top:3px\""); %>><input type = "button" value = "addHoliday" onclick = "window.location.href = 'addHoliday.jsp'" <%out.print("style=\"background-color:#DDDDDD;border-radius:5px;font-size:20px;\""); %>></p>
<p <%out.print("style=\"margin-top:3px\""); %>><input type = "button" value = "removeHoliday" onclick = "window.location.href = 'RemoveHolidays.jsp'" <%out.print("style=\"background-color:#DDDDDD;border-radius:5px;font-size:20px;\""); %>></p>
</body>
</html>