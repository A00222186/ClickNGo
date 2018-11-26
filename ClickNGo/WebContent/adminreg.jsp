<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link type="text/css" rel="stylesheet" href="/WEB-INF/resouces/css/AdminRegCSS.css">
	<head>
		<meta charset="ISO-8859-1">
		<title>Admin Registration</title>
		<script type="text/javascript">
function alert()
{ alert("Register Successfully!") } 
</script> 
	</head>
	<body  <%out.print("style=\"background-image:url(holiday2.jpg);background-position:center;background-repeat:repeat y;text-align:right;background-color:#E6E6FA\""); %>>
	
	<h2 <%out.print("style=\"margin-top:10px; font-size:60px;color:#444444\""); %>>AdminRegister</h2>
	<div class="container" <%out.print("style=\"margin-top:20px;font-size:20px;\""); %> >
		<form method="post" action="AdminRegServlet">
		
		<p <%out.print("style=\"margin-top:10px;font-size:25px;\""); %>>	Enter Staff ID:<input type="text" name="staffid" <%out.print("style=\"margin-left:25px;border-radius:5px\""); %>></p>
		
		<p <%out.print("style=\"margin-top:10px;font-size:25px;\""); %>>	Enter First Name:<input type="text" name="fname"<%out.print("style=\"border-radius:5px\""); %>></p>
			
		<p <%out.print("style=\"margin-top:10px;font-size:25px;\""); %>>Enter Last Name:<input type="text" name="lname"<%out.print("style=\"margin-left:5px;border-radius:5px\""); %>></p>
		
			
		<p <%out.print("style=\"margin-top:10px;font-size:25px;\""); %>>	Enter Address:<input type="text" name="address" <%out.print("style=\"margin-left:28px;border-radius:5px\"");%>></p>
			
		<p <%out.print("style=\"margin-top:10px;font-size:25px;\""); %>>	Enter E-mail:<input type="text" name="email" <%out.print("style=\"margin-left:40px;border-radius:5px\"");%>></p>
			
		<p <%out.print("style=\"margin-top:10px;font-size:25px;\""); %>>	Enter Phone number:<input type="text" name="phone" <%out.print("style=\"border-radius:5px\"");%>></p>
			
		<p <%out.print("style=\"margin-top:10px;font-size:25px;\""); %>>	Enter new Password:<input type="text" name="password" <%out.print("style=\"border-radius:5px\"");%>></p>
			
			<input type="submit" value ="Register Admin" onclick=alert() <%out.print("style=\"margin-top:2px;font-size:25px;border-radius:5px;margin-right:15px\""); %>>
			<p <%out.print("style=\"margin-top:30px\""); %>><input type = "button" value = "Back Main" onclick = "window.location.href = 'AdminMenu.jsp'" <%out.print("style=\"background-color:#DDDDDD;border-radius:9px;font-size:20px;margin-left:10px\""); %>></p>
		</form>
		</div>
	</body>
</html>