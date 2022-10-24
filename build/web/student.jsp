<%-- 
    Document   : student
    Created on : Nov 17, 2019, 9:13:40 AM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
<h1>PLEASE FILL STUDENT registration form!!</h1>
        <form name="stud_form" action="studentControler" method="POST">
            <label>STUDENT_ID</label> <input type="text" name="studid" value="" size="12" /><br><br>
                        <label>FirstName</label> <input type="text" name="fname" value="" size="15" /><br><br>
                        <label>LastName</label> <input type="text" name="lname" value="" size="15" /><br><br>

            <label>GradeLevel</label>
            <select name="GradeLevel">
                <option value="grade 9">grade 9</option>
                <option value="grade 10">grade 10</option>
                <option value="grade 11">grade 11</option>
                <option value="grade 12">grade 12</option>
            </select><br><br>
            <label>SECTION</label><select name="section">
                <option value="A"> SEC_A</option>
                <option value="B">SEC_B</option>
                <option value="C">SEC_C</option>
                <option value="D"> SEC_D</option>
                <option value="E">SEC_E</option>
                <option value="F">SEC_F</option>
                <option value="G">SEC_G</option>
                <option value="H">SEC_H</option>
                <option value="I">SEC_I</option>
                <option value="J">SEC_J</option>
                <option value="K">SEC_K</option>
                <option value="L">SEC_L</option>
                <option value="M">SEC_M</option>
                <option value="N">SEC_N</option>
                <option value="O">SEC_O</option>
                <option value="P">SEC_P</option>
                <option value="Q">SEC_Q</option>
                <option value="R">SEC_R</option>
                <option value="S">SEC_S</option>
                <option value="T">SEC_T</option>
                <option value="U">SEC_U</option>
                <option value="V">SEC_V</option>
                <option value="W">SEC_W</option>
                <option value="X">SEC_X</option>
                <option value="Y">SEC_Y</option>
                <option value="Z">SEC_Z</option>
            </select><br><br>
           <label>userName</label> <input type="text" name="uname" value="" ><br><br>
            
           <label>password</label> <input type="password" name="pass" value="" ><br><br>
            <input type="submit" value="register" name=" submit" />
            <input type="reset" value="cancel" name="reset" />
            
        </form>
        <% 
        
       String studId=request.getParameter("studid");
        String fname=request.getParameter("fname");
       String lname=request.getParameter("lname");
          String uname=request.getParameter("uname");
       String password=request.getParameter("pass");
         
       String GradeLevel=request.getParameter("GradeLevel");
       String SECTION=request.getParameter("SECTION");
      

        %>
        
        
        
        
            </body>
</html>
