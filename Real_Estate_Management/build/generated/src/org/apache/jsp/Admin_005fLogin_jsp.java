package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Admin_005fLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                <link rel=\"stylesheet\" href=\"bootstrap.min.css\">\n");
      out.write("            <script src=\"validation.js\"></script>\n");
      out.write("        <style>\n");
      out.write("        body\n");
      out.write("            {\n");
      out.write("                background-image:url(Image/Login1.jpg);\n");
      out.write("                background-size: cover;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                padding: 60px;\n");
      out.write("                opacity: 80%;\n");
      out.write("            }\n");
      out.write("            .container\n");
      out.write("            {\n");
      out.write("                padding:20px;\n");
      out.write("                margin: 50px;\n");
      out.write("                margin-top: 100px;\n");
      out.write("                background-color: grey;\n");
      out.write("                border-radius: 30px;\n");
      out.write("                opacity:80%;\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            input[type=submit]\n");
      out.write("            {\n");
      out.write("                background-color:black;\n");
      out.write("                color:white;\n");
      out.write("            \n");
      out.write("            }       \n");
      out.write("            label\n");
      out.write("            {\n");
      out.write("               color:black; \n");
      out.write("            }\n");
      out.write("            h1\n");
      out.write("            {\n");
      out.write("                color:white;\n");
      out.write("            }\n");
      out.write("            span\n");
      out.write("            {\n");
      out.write("                color:red;\n");
      out.write("            }\n");
      out.write("           \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      \n");
      out.write("    \n");
      out.write("    <form action=\"Login\" method=\"post\">\n");
      out.write("    <div class=\"row\">         \n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-6\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <a style=\"float:right\" href=\"Admin_Header.jsp\"> <span class=\"btn btn-danger form-control\"><b>X</b></span></a>                            \n");
      out.write("                    <br>\n");
      out.write("                    <center><h1 style=\"font-family: Arial Black\"><b>Login</b></h1></center>\n");
      out.write("                    <br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-12\">\n");
      out.write("                <label><b>Username</b><span>*</span></label>\n");
      out.write("                <input type=\"text\" name=\"uname\" placeholder=\"Enter Email\" class=\"form-control\" onkeypress=\"javascript:return isAlphanumeric(event)\" required=\"\">\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("                    <br>\n");
      out.write("           \n");
      out.write("            <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-12\">\n");
      out.write("                <label><b>Password</b><span>*</span></label>\n");
      out.write("                <input type=\"password\" name=\"pwd\" placeholder=\"Enter Password\" class=\"form-control\"  required=\"\">\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-12\">\n");
      out.write("                 <label style=\"color:skyblue\"><a href=\"Forget.jsp\">Forget Password?</a></label>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("            </div>\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                <center><input type=\"submit\"  name=\"btn\" value=\"Login\" class=\"form-control\"></center>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-12\">\n");
      out.write("                <center><label>Don't have an account?</label><span style=\"color:skyblue\"><a href=\"Admin_Signup.jsp\">signup now</a></span></center>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        <div class=\"col-sm-3\">\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    </form>\n");
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
