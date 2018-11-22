<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="dao.HistoryDAO,model.History"%>
      <%@ page import ="java.util.ArrayList"%>
<%@ page import ="java.util.List"%>
    <%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<body <%out.print("style=\"background-image:url(holiday2.jpg);background-position:center;background-repeat:repeat y;text-align:right;background-color:#E6E6FA\""); %>>>
<div <%out.print("style=\"margin-top:20px;font-size:20px;\""); %>s>
  <table border="1" <%out.print("style=\"float:right\""); %>>
       <tr>
          <td>Purchased Holiday </td>
           <td>Holiday ID</td>
           <td>Destination</td>
           <td>Start Date</td>
           <td>User ID</td>
           
       </tr>
         <%
            HistoryDAO dao=new HistoryDAO();
            List<History> list =dao.readFirstTitle();    
            for(History tl:list)
            {%>
           <tr>
               <td><%=tl.getPurchasedHoliday() %></td>
               <td><%=tl.getHolidayID() %></td>
               <td><%=tl.getDestination() %></td>
               <td><%=tl.getStartDate() %></td>
               <td><%=tl.getUserID() %></td>
               
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
         <p><input type = "button" value = "Back" onclick = "window.location.href = 'AdminMenu.jsp'" <%out.print("style=\"background-color:#DDDDDD;border-radius:5px;font-size:15px;\""); %>></p>
</div>
</body>
</html>