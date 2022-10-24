package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class stud_005freg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form name=\"stud_reg\" action=\"stud_reg.java\" method=\"POST\">\n");
      out.write("            \n");
      out.write("            <table border=\"0\" width=\"50\" cellspacing=\"1\" cellpadding=\"2\">\n");
      out.write("                \n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td> First Name</td>\n");
      out.write("                        <td> <input type=\"text\" name=\"fname\" value=\"\" size=\"20\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Last Name</td>\n");
      out.write("                        <td><input type=\"text\" name=\"lname\" value=\"\" size=\"20\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Grade Level</td>\n");
      out.write("                        <td> <select name=\"GradeLevel\">\n");
      out.write("                <option value=\"grade 9\">grade 9</option>\n");
      out.write("                <option value=\"grade 10\">grade 10</option>\n");
      out.write("                <option value=\"grade 11\">grade 11</option>\n");
      out.write("                <option value=\"grade 12\">grade 12</option>\n");
      out.write("            </select></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Section</td>\n");
      out.write("                        <td><select name=\"section\">\n");
      out.write("                <option value=\"A\"> SEC_A</option>\n");
      out.write("                <option value=\"B\">SEC_B</option>\n");
      out.write("                <option value=\"C\">SEC_C</option>\n");
      out.write("                <option value=\"D\"> SEC_D</option>\n");
      out.write("                <option value=\"E\">SEC_E</option>\n");
      out.write("                <option value=\"F\">SEC_F</option>\n");
      out.write("                <option value=\"G\">SEC_G</option>\n");
      out.write("                <option value=\"H\">SEC_H</option>\n");
      out.write("                <option value=\"I\">SEC_I</option>\n");
      out.write("                <option value=\"J\">SEC_J</option>\n");
      out.write("                <option value=\"K\">SEC_K</option>\n");
      out.write("                <option value=\"L\">SEC_L</option>\n");
      out.write("                <option value=\"M\">SEC_M</option>\n");
      out.write("                <option value=\"N\">SEC_N</option>\n");
      out.write("                <option value=\"O\">SEC_O</option>\n");
      out.write("                <option value=\"P\">SEC_P</option>\n");
      out.write("                <option value=\"Q\">SEC_Q</option>\n");
      out.write("                <option value=\"R\">SEC_R</option>\n");
      out.write("                <option value=\"S\">SEC_S</option>\n");
      out.write("                <option value=\"T\">SEC_T</option>\n");
      out.write("                <option value=\"U\">SEC_U</option>\n");
      out.write("                <option value=\"V\">SEC_V</option>\n");
      out.write("                <option value=\"W\">SEC_W</option>\n");
      out.write("                <option value=\"X\">SEC_X</option>\n");
      out.write("                <option value=\"Y\">SEC_Y</option>\n");
      out.write("                <option value=\"Z\">SEC_Z</option>\n");
      out.write("            </select></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>User Name</td>\n");
      out.write("                        <td><input type=\"text\" name=\"uname\" value=\"\" size=\"20\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>password</td>\n");
      out.write("                        <td><input type=\"password\" name=\"pass\" value=\"\" size=\"20\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                 \n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
