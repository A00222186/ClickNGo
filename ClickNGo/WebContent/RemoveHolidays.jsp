<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>RemoveHoliday</title>
</head>
<body <%out.print("style=\"background-image:url(holiday2.jpg);background-position:center;background-repeat:repeat y;text-align:right;background-color:#E6E6FA\""); %>>
<h2 <%out.print("style=\"margin-top:10px; font-size:60px;color:#444444\""); %>>Remove Holiday</h2>

<form method="delete" action="RemoveHolidayServlet">
<div <%out.print("style=\"margin-top:20px;font-size:20px;\""); %>s>
<p <%out.print("style=\"margin-top:10px;font-size:25px;\""); %>>Enter Holiday ID to remove:</p>
<input type="text" name="remholiday" <%out.print("style=\"border-radius:5px\""); %>><br>
<input type="submit" value= "remove " <%out.print("style=\"margin-top:10px;font-size:25px;border-radius:5px;margin-right:15px\""); %>>
<p <%out.print("style=\"margin-top:30px\""); %>><input type = "button" value = "Back Main" onclick = "window.location.href = 'AdminMenu.jsp'" <%out.print("style=\"background-color:#DDDDDD;border-radius:9px;font-size:20px;margin-left:10px\""); %>></p>
</div>
</form>
</body>
</html>