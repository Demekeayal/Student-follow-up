package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class attendece_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <h1>PLEASE FILL STUDENT ATTENDECE!!</h1>\n");
      out.write("        <form name=\"att_form\" action=\"attendec\" method=\"POST\">\n");
      out.write("            <label>STUDENT_ID</label> <input type=\"text\" name=\"studid\" value=\"\" size=\"12\" /><br><br>\n");
      out.write("            <label>GradeLevel</label>\n");
      out.write("            <select name=\"GradeLevel\">\n");
      out.write("                <option value=\"grade 9\">grade 9</option>\n");
      out.write("                <option value=\"grade 10\">grade 10</option>\n");
      out.write("                <option value=\"grade 11\">grade 11</option>\n");
      out.write("                <option value=\"grade 12\">grade 12</option>\n");
      out.write("            </select><br><br>\n");
      out.write("            <label>SECTION</label><select name=\"section\">\n");
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
      out.write("            </select><br><br>\n");
      out.write("           <label>dateOfAbsence</label> <input type=\"date\" name=\"dofAbsnc\" value=\"\" ><br><br>\n");
      out.write("            \n");
      out.write("           <label>dateOfLatness</label> <input type=\"date\" name=\"dofLtns\" value=\"\" ><br><br>\n");
      out.write("            <input type=\"submit\" value=\"submit\" name=\" submit\" />\n");
      out.write("            <input type=\"reset\" value=\"cancel\" name=\"reset\" />\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("        ");
 
        
       String studId=request.getParameter("studid");
       String GradeLevel=request.getParameter("GradeLevel");
       String SECTION=request.getParameter("SECTION");
       String dofAbsnc=request.getParameter("dofAbsnc");
       String dofLtns=request.getParameter("dofLtns");
         

        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
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
