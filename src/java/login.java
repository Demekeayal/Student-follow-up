/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Character.UnicodeBlock.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
@WebServlet(urlPatterns = {"/login"})
public class login extends HttpServlet {
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
String userName;
         String role;
       
        
        String password;
        
                userName=request.getParameter("uname");
                password=request.getParameter("pass");
                role=request.getParameter("role");
              if(userName.equals("admin") && password.equals("admin00")){
                  
                  response.sendRedirect("admin.jsp");
              }
             
             
              else if(userName.equals("parent") && password.equals("parent11")){
                  response.sendRedirect("parent.jsp");
                      
                      }
               else if(userName.equals("subteacher") && password.equals("sub111")){
                  response.sendRedirect("sub_teacher.jsp");
                      
                      }
               else if(userName.equals("officer") && password.equals("of111")){
                  response.sendRedirect("officer.jsp");
                      
                      }
               else if(userName.equals("hmteacher") && password.equals("ht111")){
                  response.sendRedirect("hm_teacher.jsp");
                      
                      }
               else{
                                   response.sendRedirect("login.jsp");
 
              }
              
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
