<%-- 
    Document   : index
    Created on : 11-Mar-2014, 23:50:01
    Author     : Éanna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="WEB-INF/jspf/siteHeader.jspf" %>
        <%@include file="WEB-INF/jspf/siteNav.jspf" %>
        <%
            out.println( "<p>URL: " +(String) request.getAttribute("siteURL") + "</p>");
            out.println("<p>Database Name: " + (String) request.getAttribute("dbName")+ "</p>");
            out.println("<p>PageName: " + (String) request.getAttribute("pageName")+ "</p>");
        %>
    </body>
    
</html>
