package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class User_005fForget_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Real Estate Management</title>\n");
      out.write("     <link rel=\"stylesheet\" href=\"bootstrap.min.css\">\n");
      out.write("         <script src=\"validation.js\"></script>\n");
      out.write("         <style>\n");
      out.write("          \n");
      out.write("            .container\n");
      out.write("            {\n");
      out.write("                padding:20px;\n");
      out.write("                margin:50px;\n");
      out.write("            }\n");
      out.write("           \n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("                background-color: pink;\n");
      out.write("            }\n");
      out.write("                       \n");
      out.write("            \n");
      out.write("             \n");
      out.write("                \n");
      out.write("            \n");
      out.write("            h1\n");
      out.write("            {\n");
      out.write("                color:orange;\n");
      out.write("            }\n");
      out.write("           \n");
      out.write("           \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("         <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-3\"></div>\n");
      out.write("            <div class=\"col-sm-6\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("    <h1>Forget Password</h1>\n");
      out.write("    <form action=\"User_Forget\" method=\"post\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-12\">\n");
      out.write("        <label>Username:</label>\n");
      out.write("         <input type=\"text\" name=\"un\"  placeholder=\"Enter Name\" class=\"form-control\" onkeypress=\"javascript:return isString(event)\" required=\"\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <br>\n");
      out.write("         <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-12\">\n");
      out.write("        <label>New Password:</label>\n");
      out.write("        <input type=\"password\" name=\"np\" placeholder=\"Conform Password\" class=\"form-control\" required=\"\">\n");
      out.write("            </div>\n");
      out.write("         </div>\n");
      out.write("        <br>\n");
      out.write("         <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-12\">\n");
      out.write("         <label>Confirm Password:</label>\n");
      out.write("        <input type=\"password\" name=\"cp\" placeholder=\"Conform Password\" class=\"form-control\" required=\"\">\n");
      out.write("            </div>\n");
      out.write("         </div>\n");
      out.write("        <br>\n");
      out.write("         <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-12\">\n");
      out.write("        <input type=\"submit\"  name=\"btn\"  value=\"Change Password\" class=\"btn btn-primary form control\">\n");
      out.write("            </div>\n");
      out.write("         </div>\n");
      out.write("    </form>\n");
      out.write("        </div>\n");
      out.write("            </div>\n");
      out.write("         </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
