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
<title>Insert title here</title>
</head>
<body <%out.print("style=\"background-image:url(holiday2.jpg);background-position:center;background-repeat:repeat y;text-align:right;background-color:#E6E6FA\""); %>>>
<div <%out.print("style=\"margin-top:20px;font-size:20px;\""); %>s>
  <table border="1" <%out.print("style=\"float:right\""); %>>
       <tr>
          <td>Holiday ID</td>
           <td>Destination</td>
           <td>Start Date</td>
           <td>End Date</td>
       </tr>
         <%
            TitleDAO dao=new TitleDAO();
            List<Title> list =dao.readFirstTitle();    
            for(Title tl:list)
            {%>
           <tr>
               <td><%=tl.getId() %></td>
               <td><%=tl.getDes() %></td>
               <td><%=tl.getStartdate() %>></td>
               <td><%=tl.getEnddate() %></td>
          </tr>
            <%}
        %>
   </table>
</div>
</body>
</html>