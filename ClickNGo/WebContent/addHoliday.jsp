<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="HolidayServlet">
<h2>Holiday Available Table</h2>
ID:<input type="text" name="ID">
Destination:<input type="text" name="Destination">
Start Data:<input type="text" name="StartData">
End Data:<input type="text" name="EndData">
Cost:<input type="text" name="Cost">
Quantity:<input type="text" name="Quantity">
<input type="submit" value ="Check  in DB">
</form>
</body>
</html>