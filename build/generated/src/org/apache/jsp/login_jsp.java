package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>parent follow up student system</title>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"cyan\">\n");
      out.write("        \n");
      out.write("       <div   align='center' >\n");
      out.write("           \n");
      out.write("               <form name=\"userlog\" action=\"login\" method=\"post\">\n");
      out.write("                   <table border=\"0\" width=\"30%\" cellpadding=\"0\" cellspacing=\"55\">\n");
      out.write("\n");
      out.write("                       <tbody>\n");
      out.write("                           <tr>\n");
      out.write("                               <td>USERNAME:</td>\n");
      out.write("                               <td>            <input type=\"text\" name=\"uname\" value=\"\" id=\"uname\" placeholder=\"enter user name...\" size=\"35\" />  <br>    <br>    \n");
      out.write("</td>\n");
      out.write("                           </tr>\n");
      out.write("                           <tr>\n");
      out.write("                               <td>password</td>\n");
      out.write("                               <td> <input type=\"password\" name=\"pass\"  id=\"pass\" value=\"\" placeholder=\"enter password...\" size=\"35\" /> <br>    <br>   \n");
      out.write("</td>\n");
      out.write("                           </tr><br><br> <br><br>\n");
      out.write("                       <tr><td colspan=\"2\" > &nbsp;&nbsp;&nbsp;&nbsp;<input type=\"submit\" value=\"login\" name=\"submit\" />  &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                <input type=\"reset\" value=\"cancel\" name=\"reset\" />\n");
      out.write("            </td></tr>\n");
      out.write("                       </tbody>\n");
      out.write("                   </table>\n");
      out.write("\n");
      out.write("    \n");
      out.write("         \n");
      out.write(" \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                               \n");
      out.write("\n");
      out.write("         \n");
      out.write("            </form>\n");
      out.write("                   \n");
      out.write("       </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");

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



    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
