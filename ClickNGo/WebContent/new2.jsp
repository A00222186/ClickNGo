<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="dao.TitleDAO,model.Title"%>
      <%@ page import ="java.util.ArrayList"%>
<%@ page import ="java.util.List"%>
    <%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
  %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Buy a Holiday</title>
<script type="text/javascript">
function firm()
{ if (window.confirm("Are you sure you want to add to basket?")) 
{ return true; } return false; } 
</script> 
</head>
<body <%out.print("style=\"background-image:url(holiday2.jpg);background-position:center;background-repeat:repeat y;text-align:right;background-color:#E6E6FA\""); %>>>
<div <%out.print("style=\"margin-top:20px;font-size:20px;\""); %>>
 
  <table border="1" <%out.print("style=\"float:right\""); %>>
       <tr>
          <td>Holiday ID</td>
           <td>Destination</td>
           <td>Start Date</td>
           <td>End Date</td>
           <td>Cost (Euro)</td>
           <td>Quantity</td>
       </tr>
         <%
            TitleDAO dao=new TitleDAO();
            List<Title> list =dao.readFirstTitle();    
            for(Title tl:list)
            {%>
           <tr>
               <td><%=tl.getId() %></td>
               <td><%=tl.getDes() %></td>
               <td><%=tl.getStartdate() %></td>
               <td><%=tl.getEnddate() %></td>
               <td><%=tl.getCost() %></td>
               <td><%=tl.getQuantity() %></td>
          </tr>
            <%}
        %>
   </table>
   
   <br>
    <br>
     <br>
      <br>
       <br>
        <br>
         <br>
   <div>
 
   <form method="post" action="BuyHolidayServlet">
  <p><input type = "button" value = "Back" onclick = "window.location.href = 'AdminMenu.jsp'" <%out.print("style=\"background-color:#DDDDDD;border-radius:5px;font-size:15px;\""); %>></p>
   </form>
   
   </div>
</div>
</body>
</html>