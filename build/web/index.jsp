<%-- 
    Document   : index
    Created on : Nov 19, 2012, 11:46:56 AM
    Author     : 3129916
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<% String qstr = request.getParameter("action"); %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World! <%= qstr%></h1>
    </body>
</html>
