package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homr_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                <link href=\"../css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("<body style=\"background-color:#a8aecb; color:black;\">\n");
      out.write("<div  id=\"header\">\n");
      out.write("<img src=\"ETHIO.jpg\" width=\"80%\"height=\"200px\"></img>\n");
      out.write("</div>\n");
      out.write("<div id=\"menu\">\n");
      out.write("<ul>\n");
      out.write("<li><a href=\"phome.html\">Home</a></li>\n");
      out.write("<li><a href=\"feedbakview.php\">News</a></li>\n");
      out.write("<li><a href=\"pabout.html\">About</a></li>\n");
      out.write("<li><a href=\"pcontact.html\">Contact</a></li>\n");
      out.write("<li><a href=\"view.php\">dawnload</a></li></ul>\n");
      out.write("<li><a href=\"logout.php\">logout</a></li></ul>\n");
      out.write("</div>\t\n");
      out.write("<div align=\"center\" style=\"color:#0000CC\" style=\"border:medium\" style=\"background-color:#000000\">\n");
      out.write("&nbsp; <p><h1>welcome to parent home</h1></p></div>\n");
      out.write("<div id=\"page\">\n");
      out.write("<div border=\"1\" id=\"page1\">\n");
      out.write("&nbsp <p>welcome</p>\n");
      out.write("<ol>\n");
      out.write("<a href=\"comment.php\">add massage</a><br>\n");
      out.write("<a href=\"aatendance_view.php\">see Attendance</a><br>\n");
      out.write("<a href=\"aattview.php\">see Student result</a><br>\n");
      out.write("<a href=\"report.html\">view report</a><br>\n");
      out.write(" \n");
      out.write(" \n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<div id=\"footer\">\n");
      out.write("\t <p>Copyright &copy; DebreWork school 2017<p>\n");
      out.write("  <p><a href=\"#\">Privacy Policy</a> | <a href=\"#\">Terms of Use</a> |</p>\n");
      out.write("</div>\n");
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
