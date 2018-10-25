
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>UserRegister</title>
</head>
<body <%out.print("style=\"background-image:url(holiday2.jpg);background-position:center;background-repeat:repeat y;text-align:right;background-color:#E6E6FA\""); %>>

	<h2  <%out.print("style=\"margin-top:10px; font-size:60px;color:#444444\""); %>>UserRegister</h2>
	<div class="container" >

		<form action="RegisterServletFactory" method="post">
			<div class="field" id="searchform" <%out.print("style=\"margin-top:20px;font-size:20px;\""); %>>
			<p <%out.print("style=\"margin-top:10px;font-size:25px;\""); %>>First Name:<input type="text" name="FirstName" <%out.print("style=\"border-radius:5px\""); %>/></p>
			<p <%out.print("style=\"margin-top:10px;font-size:25px;\""); %>>Last Name:<input type="text" name="LastName"<%out.print("style=\"margin-left:5px;border-radius:5px\""); %> /></p>
			<p <%out.print("style=\"margin-top:10px;font-size:25px;\""); %>>Email:	   <input type="text" name="Email" <%out.print("style=\"margin-left:38px;border-radius:5px\""); %>/></p>
			<p <%out.print("style=\"margin-top:10px;font-size:25px;\""); %>>PhoneNo:	<input type="text" name="PhoneNo" <%out.print("style=\"margin-left:12px;border-radius:5px\""); %>/></p>
			<p <%out.print("style=\"margin-top:10px;font-size:25px;\""); %>>Address:	<input type="text" name="Address" <%out.print("style=\"margin-left:20px;border-radius:5px\""); %>/></p>
			<p <%out.print("style=\"margin-top:10px;font-size:25px;\""); %>>Password:	<input type="text" name="Password" <%out.print("style=\"margin-left:10px;border-radius:5px\""); %>/></p>
				<button type="submit" value="submit"<%out.print("style=\"margin-top:2px;font-size:25px;border-radius:5px;margin-right:15px\""); %>>sign up</button>
				<button type="reset" value="cancel"<%out.print("style=\"margin-top:2px;font-size:25px;border-radius:5px;margin-left:15px\""); %>>cancel</button>
			</div>
		</form>
	</div>

<%if( request.getAttribute( "malformedName" ) != null ) {%>
<% String malformedName = (String)request.getAttribute("malformedName"); %>
<% System.out.println("malformed name is " + malformedName); %>
<font color="red"><%=malformedName %></font>
<% } %>
</body>
</html>




