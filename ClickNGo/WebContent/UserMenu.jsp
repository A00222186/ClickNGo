<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome!</title>
<script type="text/javascript">
function firm()
{ if (window.confirm("Do you want to logout?")) 
{ 
	window.location.href=" index.jsp";return false ;
}

return true ;
}
</script>
</head>
<body <%out.print("style=\"background-image:url(holiday2.jpg);background-position:center;background-repeat:repeat y;text-align:right;background-color:#E6E6FA\""); %>>

    <h2  <%out.print("style=\"margin-top:10px; font-size:40px;color:#444444;margin-right:20px\""); %>>User Menu</h2><br>
	<h1  <%out.print("style=\"margin-top:10px; font-size:30px;color:#444444;margin-right:40px\""); %>>Select an option</h1>
	<p <%out.print("style=\"margin-top:30px\""); %>><input type = "button" value = "Browse Holidays" onclick = "window.location.href = 'new.jsp' " <%out.print("style=\"background-color:#DDDDDD;border-radius:5px;font-size:25px;margin-right:40px;\""); %>></p>
	<p <%out.print("style=\"margin-top:30px\""); %>><input type = "button" value = "Log out" onclick = firm() <%out.print("style=\"background-color:#DDDDDD;border-radius:5px;font-size:25px;margin-right:40px;\""); %>></p>
</body>
</html>