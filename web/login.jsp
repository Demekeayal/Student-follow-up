<%-- 
    Document   : login
    Created on : Nov 15, 2019, 6:05:12 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>parent follow up student system</title>
        <link href="css/loginn.css" rel="stylesheet" type="text/css"/>
    </head>
    <body bgcolor="cyan">
        
       <div class="login-page" >
           <div class="form">
           
               <form class="login-form" name="userlog" action="login" method="post">
                   <fieldset>
                     <h1>Login Form</h1>
                   
           <input type="text" name="uname" value="" id="uname" placeholder="enter user name..." size="35" />      

                            
           <input type="password" name="pass"  id="pass" value="" placeholder="enter password..." size="35" /> 
           <div class="submit">
                  <input type="submit" value="Submit" name="submit" />
                     </div>
                     <div class="cancel">
    <button type="reset" name="button">Cancel</button>
    </div>
            
</fieldset>
    
         
 
                
                
                               

         
            </form>
                   </div>
       </div>
    </body>
</html>

<%
  if(request.getParameter("submit")!=null)
  {
               String userName;
               String password;
            
                userName=request.getParameter("uname");
                password=request.getParameter("pass");
                Connection con;
                PreparedStatement pst;
                ResultSet rs;
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost/school", "root", "");
                pst=con.prepareStatement("inser in to user (userName,password)values(?,?)");
            
               pst.setString(1,userName);
               pst.setString(2,password);
               pst.executeUpdate();
            }
   %>

