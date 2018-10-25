<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AddHoliday</title>
</head>
<body <%out.print("style=\"background-image:url(holiday2.jpg);background-position:center;background-repeat:repeat y;text-align:right;background-color:#E6E6FA\""); %>>
<form method="post" action="HolidayServlet">
<h2 <%out.print("style=\"margin-top:10px; font-size:60px;color:#444444\""); %>>Holiday Available Table</h2>
<div <%out.print("style=\"margin-top:20px;font-size:20px;\""); %>>
<p <%out.print("style=\"margin-top:10px;font-size:25px;\""); %>>ID:<input type="text" name="ID" <%out.print("style=\"margin-left:75px;border-radius:5px\""); %> ></p>
<p <%out.print("style=\"margin-top:10px;font-size:25px;\""); %>>Destination:<input type="text" name="Destination" <%out.print("style=\"margin-left:5px;border-radius:5px\""); %> ></p>
<p <%out.print("style=\"margin-top:10px;font-size:25px;\""); %>>Start Data:<input type="text" name="StartData" <%out.print("style=\"margin-left:15px;border-radius:5px\""); %> ></p>
<p <%out.print("style=\"margin-top:10px;font-size:25px;\""); %>>End Data:<input type="text" name="EndData" <%out.print("style=\"margin-left:21px;border-radius:5px\""); %> ></p>
<p <%out.print("style=\"margin-top:10px;font-size:25px;\""); %>>Cost:<input type="text" name="Cost" <%out.print("style=\"margin-left:60px;border-radius:5px\""); %> ></p>
<p <%out.print("style=\"margin-top:10px;font-size:25px;\""); %>>Quantity:<input type="text" name="Quantity" <%out.print("style=\"margin-left:25px;border-radius:5px\""); %> ></p>
<input type="submit" value ="Check  in DB" <%out.print("style=\"margin-top:2px;font-size:20px;border-radius:5px;margin-right:15px\""); %> >
</div>
</form>

</body>
</html>