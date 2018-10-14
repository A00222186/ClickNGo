<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>UserRegister</title>
</head>
<body>

	<h2>UserRegister</h2>
	<div class="container">

		<form action="RegisterServletFactory" method="post">
			<div class="field" id="searchform">
			First Name:	<input type="text" name="firstName" /><br>
			Last Name:	<input type="text" name="lastName" /><br>
			Email:	<input type="text" name="email" /><br>
			PhoneNo:	<input type="text" name="phoneno" /><br>
			Address:	<input type="text" name="address" /><br>
			Password:	<input type="text" name="password" /><br>
				<button type="submit" value="submit">sign up!</button>
				<!-- button type="cancel" value="cancel">cancel</button-->
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


