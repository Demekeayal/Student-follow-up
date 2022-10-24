<%-- 
    Document   : stud_reg
    Created on : Nov 27, 2019, 10:25:33 AM
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
            <center>
        <form name="stud_reg" action="stud_reg.java" method="POST">
            
            <table border="0" cellspacing="3" cellpadding="10">
                
                <tbody>
                    <tr>
                        <td> First Name</td>
                        <td> <input type="text" name="fname" value="" size="20" /></td>
                    </tr>
                    <tr>
                        <td>Last Name</td>
                        <td><input type="text" name="lname" value="" size="20" /></td>
                    </tr>
                    <tr>
                        <td>Grade Level</td>
                        <td> <select name="GradeLevel">
                <option value="grade 9">grade 9</option>
                <option value="grade 10">grade 10</option>
                <option value="grade 11">grade 11</option>
                <option value="grade 12">grade 12</option>
            </select></td>
                    </tr>
                    <tr>
                        <td>Section</td>
                        <td><select name="section">
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
            </select></td>
                    </tr>
                    <tr>
                        <td>User Name</td>
                        <td><input type="text" name="uname" value="" size="20" /></td>
                    </tr>
                    <tr>
                        <td>password</td>
                        <td><input type="password" name="pass" value="" size="20" /></td>
                    </tr>
                 
                </tbody>
            </table>
<br><br><br>



            <input type="submit" value="Register" name="submit" /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             <input type="reset" value="cancel" name="reset" />


            
        </form>    </center>
    </body>
</html>
