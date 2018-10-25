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
<body>

  <table border="1">
       <tr>
          <td>id</td>
           <td>name</td>
           <td>creator</td>
           <td>createTime</td>
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
</body>
</html>