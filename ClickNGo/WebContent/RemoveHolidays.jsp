<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>RemoveHoliday</title>
</head>
<body <%out.print("style=\"text-align:center;background-color:#E6E6FA\""); %>>
<h2>Remove Holiday</h2>

<form method="delete" action="RemoveHolidayServlet">
<div <%out.print("style=\"margin-top:20px;font-size:20px;\""); %>s>
<p <%out.print("style=\"margin-top:2px\""); %>>Enter Holiday ID to remove:</p>
<input type="text" name="remholiday" <%out.print("style=\"border-radius:5px\""); %>><br>
<input type="submit" value= "remove " <%out.print("style=\"font-size:20px;margin-top:10px;border-radius:5px\""); %>>
</div>
</form>
</body>
</html>