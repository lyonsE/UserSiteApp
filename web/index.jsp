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
        <h1>Hello World!</h1>
        
        <%
            out.println((String) request.getAttribute("site"));
            
            %>
    </body>
    
</html>
