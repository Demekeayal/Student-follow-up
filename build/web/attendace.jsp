<%-- 
    Document   : attendece
    Created on : Nov 15, 2019, 10:53:53 PM
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
        <h1>PLEASE FILL STUDENT ATTENDECE!!</h1>
        <form name="att_form" action="attendec.java" method="POST">
            <label>STUDENT_ID</label> <input type="text" name="studid" value="" size="12" /><br><br>
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
           <label>dateOfAbsence</label> <input type="date" name="dofAbsnc" value="" ><br><br>
            
           <label>dateOfLatness</label> <input type="date" name="dofLtns" value="" ><br><br>
            <input type="submit" value="addAttendance" name=" submit" />
            <input type="reset" value="cancel" name="reset" />
            
        </form>
        <% 
        
       String studId=request.getParameter("studid");
       String GradeLevel=request.getParameter("GradeLevel");
       String SECTION=request.getParameter("SECTION");
       String dofAbsnc=request.getParameter("dofAbsnc");
       String dofLtns=request.getParameter("dofLtns");
         

        %>
        
        
        
        
        
    </body>
</html>
