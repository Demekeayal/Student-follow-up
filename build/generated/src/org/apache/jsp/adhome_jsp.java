package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <div class=\"menu\">\n");
      out.write("            <ul class=\"horizontal\">\n");
      out.write("                <li><a href=\"home.jsp\">HOME</a></li>\n");
      out.write("                <li><a href=\"about.jsp\">ABOUT</a></li>\n");
      out.write("                <li><a href=\"news.jsp\">NEWS</a></li>\n");
      out.write("                <li><a href=\"contact.jsp\">CONTACT</a></li>\n");
      out.write("                 <li><a href=\"galary.jsp\">GALlARY</a></li>\n");
      out.write("                 <li><a href=\"#\">AccountType</a>\n");
      out.write("                 \n");
      out.write("                     <ul class=\"dropbtn\">\n");
      out.write("                         <li><a href=\"adhome.jsp\">admin</a></li>\n");
      out.write("                         <li><a href=\"phome.jsp\">parent</a></li>\n");
      out.write("                         <li><a href=\"hhome.jsp\">homeRoomTeacher</a></li>\n");
      out.write("                         <li><a href=\"rhome.jsp\">RecoredOfficer</a></li>\n");
      out.write("                         <li><a href=\"shome.jsp\">subjectTeacher</a></li>\n");
      out.write("                         <li><a href=\"sthome.jsp\">student</a></li>\n");
      out.write("                     </ul>\n");
      out.write("                 \n");
      out.write("                 \n");
      out.write("                 </li>\n");
      out.write("            </ul>\n");
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
