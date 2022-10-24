<%-- 
    Document   : emp_reg
    Created on : Nov 27, 2019, 11:18:03 AM
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
        <form name="emp_reg" action="emp_reg.jaa" method="POST">
            
            <table border="0" cellspacing="2" cellpadding="5">
                
                <tbody>
                    <tr>
                        <td> First Name</td>
                        <td><input type="text" name="fname" value="" size="20" /></td>
                    </tr>
                    <tr>
                        <td>Last Name</td>
                        <td><input type="text" name="lname" value="" size="20" /></td>
                    </tr>
                    
                    <tr>
                        <td>Role</td>
                        <td><select name="role">
                                <option value="admin">admin</option>
                                <option value="subjectTeacher">sub_teacher</option>
                                <option value="homeRoomTeacher">HR_teacher</option>
                                <option value="recoredOfficer"> recoredOfficer</option>
                            </select></td>
                    </tr><tr>
                        <td>User Name</td>
                        <td><input type="text" name="uname" value="" size="20" /></td>
                    </tr>
                    <tr>
                        <td>password</td>
                        <td><input type="password" name="pass" value="" size="20" /></td>
                    </tr>
                </tbody>
            </table>

            
 <input type="submit" value="Register" name="submit" /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             <input type="reset" value="cancel" name="reset" />

        </form>    
        
    </body>
</html>
