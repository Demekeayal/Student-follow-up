<%-- 
    Document   : insert
    Created on : Nov 27, 2019, 7:53:03 PM
    Author     : hp
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>


<%
    String userName;
       
        
        String password;
  if(request.getParameter("submit")!=null){
              
            
                userName=request.getParameter("uname");
                password=request.getParameter("pass");
                Connection con;
                PreparedStatement pst;
                ResultSet rs;
                
              Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql//localhost/school", "root", "");
                pst=con.prepareStatement("inser in to user (userName,password,role) values (?,?,?)");
            
            pst.setString(1,userName);
            pst.setString(2,password);
           pst.executeUpdate();
            
            
            
            } 


%>
