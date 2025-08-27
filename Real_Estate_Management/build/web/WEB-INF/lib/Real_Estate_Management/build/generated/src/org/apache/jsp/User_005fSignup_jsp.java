package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public final class User_005fSignup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Real Estate Management</title>\n");
      out.write("         <link rel=\"stylesheet\" href=\"bootstrap.min.css\">\n");
      out.write("         <script src=\"validation.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("                background-image:url(Image/signup3.jpg);\n");
      out.write("                background-size: cover;\n");
      out.write("                background-repeat: no repeat;\n");
      out.write("            }\n");
      out.write("            .container\n");
      out.write("            {\n");
      out.write("                padding:20px;\n");
      out.write("                margin:50px;\n");
      out.write("            }\n");
      out.write("            input[type=submit]\n");
      out.write("            {\n");
      out.write("                background-color:orange;\n");
      out.write("                color:white;\n");
      out.write("            \n");
      out.write("            }   \n");
      out.write("              \n");
      out.write("                       \n");
      out.write("            label\n");
      out.write("            {\n");
      out.write("               color:brown; \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("                \n");
      out.write("            \n");
      out.write("            h1\n");
      out.write("            {\n");
      out.write("                color:orange;\n");
      out.write("            }\n");
      out.write("           span\n");
      out.write("           {\n");
      out.write("               color:red;\n");
      out.write("           }\n");
      out.write("           \n");
      out.write("        </style>\n");
      out.write("         <script>\n");
      out.write("var check = function() {\n");
      out.write("  if (document.getElementById('password').value ==\n");
      out.write("    document.getElementById('confirm_password').value) {\n");
      out.write("    document.getElementById('message').style.color = 'white';\n");
      out.write("    document.getElementById('message').innerHTML = 'Password Matching';\n");
      out.write("  } else {\n");
      out.write("    document.getElementById('message').style.color = 'white';\n");
      out.write("    document.getElementById('message').innerHTML = 'Password not matching';\n");
      out.write("  }\n");
      out.write("}        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"User_Signup\" method=\"post\">\n");
      out.write("          <div class=\"row\">         \n");
      out.write("            <div class=\"col-sm-6\">\n");
      out.write("                <br> \n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <center><iframe src=\"Image/logo2.jpg\" width=\"140\" height=\"140\"></iframe><br><h2 style=\"color:white\"><b>Welcome To Our Real Estate World</b></h2>\n");
      out.write("                    <p style=\"color:white\">\"Explore,discover,and own your dream home with us\"</p>\n");
      out.write("                    <p style=\"color:white\" font-family=\"Algerian\">Join us today and discover a world of possibilities.</p></center>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <a style=\"float:right\"> <span class=\"btn btn-danger form-control\"><b>X</b></span></a>                            \n");
      out.write("                    <br>\n");
      out.write("                    <center><h1 style=\"font-family: Arial Black\"><b>Sign Up</b></h1></center>\n");
      out.write("                    <br>\n");
      out.write("          \n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-12\">\n");
      out.write("                <label><b>User Name</b><span>*</span></label>\n");
      out.write("                <input type=\"text\" name=\"uname\"  placeholder=\"Enter Name\" class=\"form-control\" onkeypress=\"javascript:return isString(event)\" required=\"\">\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-6\">\n");
      out.write("                <label><b>Email</b><span>*</span></label>\n");
      out.write("                <input type=\"email\" name=\"umail\" placeholder=\"Enter Email\" class=\"form-control\" required=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-6\">\n");
      out.write("                <label><b>Gender</b><span>*</span></label>\n");
      out.write("                <br>\n");
      out.write("                <input type=\"radio\"  name=\"gender\" value=\"Male\" class=\"form control\">Male \n");
      out.write("                 <input type=\"radio\" name=\"gender\" value=\"Female\" class=\"form control\">Female\n");
      out.write("                  <input type=\"radio\" name=\"gender\" value=\"Others\" class=\"form control\">Others\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-6\">\n");
      out.write("                <label><b>Password</b><span>*</span></label>\n");
      out.write("  <input type=\"password\" name=\"vpass\" placeholder=\"Enter Password\" id=\"password\" onkeyup=\"check()\" class=\"form-control\"  required=\"\">                </span>\n");
      out.write("                </span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-6\">\n");
      out.write("                <label><b>Conform Password</b><span>*</span></label>\n");
      out.write("<input type=\"password\" name=\"vcpass\" placeholder=\"Conform Password\" id=\"confirm_password\" onkeyup=\"check()\" class=\"form-control\" required=\"\">\n");
      out.write("                <span id=\"message\"></span>                \n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("     \n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-6\">\n");
      out.write("                <label><b>City</b><span>*</span></label>\n");
      out.write("                <input type=\"text\" name=\"ucity\" placeholder=\"Enter City\" class=\"form-control\" onkeypress=\"javascript:return isString(event)\" required=\"\">\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("          \n");
      out.write("            <div class=\"col-sm-6\">\n");
      out.write("                <label><b>Address</b><span>*</span></label>\n");
      out.write("<textarea name=\"uadd\" class=\"form-control\" placeholder=\"Enter Address\"  required=\"\"></textarea>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-12\">\n");
      out.write("                <label><b>Contact No.</b><span>*</span></label>\n");
      out.write("<input type=\"text\" name=\"ucontact\" minlength=\"10\"maxlength=\"10\" class=\"form-control\" pattern=\"[7-9]{1}[0-9]{9}\" \n");
      out.write("       title=\"Phone number with 7-9 and remaing 9 digit with 0-9\"  placeholder=\"Enter Number\" onkeypress=\"javascript:return isContactno(event)\" required=\"\"> \n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-12\">\n");
      out.write("                <input type=\"submit\"  name=\"btn\" value=\"Sign Up\" class=\"form control\">\n");
      out.write("\n");
      out.write("                   \n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("            <div class=\"col-sm-2\"></div>\n");
      out.write("        </div>\n");
      out.write("        </form>\n");
      out.write("  \n");
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
