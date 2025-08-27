package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Vendor_005fSignup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap.min.css\">\n");
      out.write("         <script src=\"validation.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("                background-image:url(Image/Signup2.jpg);\n");
      out.write("               background-size: cover;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("               opacity:60%;\n");
      out.write("            }\n");
      out.write("            .container\n");
      out.write("            {\n");
      out.write("                padding:20px;\n");
      out.write("                margin:50px;\n");
      out.write("                border:solid 3px black;\n");
      out.write("                border-radius:50px;\n");
      out.write("                background-color: white;\n");
      out.write("              \n");
      out.write("              \n");
      out.write("            }\n");
      out.write("            input[type=submit]\n");
      out.write("            {\n");
      out.write("                background-color:navy;\n");
      out.write("                color:white;\n");
      out.write("            \n");
      out.write("            }   \n");
      out.write("              \n");
      out.write("                       \n");
      out.write("            label\n");
      out.write("            {\n");
      out.write("               color:black; \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("                \n");
      out.write("            \n");
      out.write("            h1\n");
      out.write("            {\n");
      out.write("                color:navy;\n");
      out.write("            }\n");
      out.write("            span\n");
      out.write("            {\n");
      out.write("                color:red;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("          <script>\n");
      out.write("var check = function() {\n");
      out.write("  if (document.getElementById('password').value ==\n");
      out.write("    document.getElementById('confirm_password').value) {\n");
      out.write("    document.getElementById('message').style.color = 'black';\n");
      out.write("    document.getElementById('message').innerHTML = 'Password Matching';\n");
      out.write("  } else {\n");
      out.write("    document.getElementById('message').style.color = 'black';\n");
      out.write("    document.getElementById('message').innerHTML = 'Password not matching';\n");
      out.write("  }\n");
      out.write("}        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"Vendor_Signup\" method=\"post\">\n");
      out.write("         <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-1\"></div>\n");
      out.write("            <div class=\"col-sm-5\">\n");
      out.write("                \n");
      out.write("            \n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <a style=\"float:right\"> <span class=\"btn btn-danger form-control\"><b>X</b></span></a>                            \n");
      out.write("                    <br>\n");
      out.write("                    <center><h1 style=\"font-family: Arial Black\"><b>Sign Up</b></h1></center>\n");
      out.write("                    <br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"col-sm-12\">\n");
      out.write("                <label><b>Vendor Name</b><span>*</span></label>\n");
      out.write("                <input type=\"text\" name=\"vname\" placeholder=\"Enter Name\" class=\"form-control\" onkeypress=\"javascript:return isString(event)\" required=\"\">\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-6\">\n");
      out.write("                <label><b>Email</b><span>*</span></label>\n");
      out.write("                <input type=\"email\" name=\"vmail\" placeholder=\"Enter Email\" class=\"form-control\"  required=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-6\">\n");
      out.write("                <label><b>Gender</b><span>*</span></label>\n");
      out.write("                <br>\n");
      out.write("                <select class=\"form-control\" name=\"gen\">\n");
      out.write("                    <option>Select</option>\n");
      out.write("                    <option>Male</option>\n");
      out.write("                    <option>Female</option>\n");
      out.write("                    <option>Others</option>\n");
      out.write("                    \n");
      out.write("                </select>\n");
      out.write("                <br>  \n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-6\">\n");
      out.write("                <label><b>Password</b><span>*</span></label>\n");
      out.write("  <input type=\"password\" name=\"vpass\" placeholder=\"Enter Password\" id=\"password\" onkeyup=\"check()\" class=\"form-control\"  required=\"\">                </span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-6\">\n");
      out.write("                <label><b>Conform Password</b><span>*</span></label>\n");
      out.write("                <input type=\"password\" name=\"vcpass\" placeholder=\"Conform Password\" id=\"confirm_password\" onkeyup=\"check()\" class=\"form-control\" required=\"\">\n");
      out.write("                <span id=\"message\"></span>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("     \n");
      out.write("            <br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-6\">\n");
      out.write("                <label><b>City</b><span>*</span></label>\n");
      out.write("                <input type=\"text\" name=\"vcity\" placeholder=\"Enter City\" class=\"form-control\" onkeypress=\"javascript:return isString(event)\" required=\"\">\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("          \n");
      out.write("            <div class=\"col-sm-6\">\n");
      out.write("                <label><b>Address</b><span>*</span></label>\n");
      out.write("                <textarea name=\"vadd\" class=\"form-control\" placeholder=\"Enter Address\"  required=\"\"></textarea>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-12\">\n");
      out.write("                <label><b>Contact No.</b><span>*</span></label>\n");
      out.write("<input type=\"text\" name=\"vcontact\" minlength=\"10\" maxlength=\"10\" class=\"form-control\" pattern=\"[7-9]{1}[0-9]{9}\" \n");
      out.write("       title=\"Phone number with 7-9 and remaing 9 digit with 0-9\"  placeholder=\"Enter Number\" onkeypress=\"javascript:return isContactno(event)\" required=\"\"> \n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-4\"></div>\n");
      out.write("                 <div class=\"col-sm-4\">\n");
      out.write("                <b><input type=\"submit\"  name=\"btn\" value=\"Sign Up\" class=\"form-control\"></b>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("     </div>\n");
      out.write("            <div class=\"col-sm-6\"></div>\n");
      out.write("        </div>\n");
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
