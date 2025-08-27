package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Payment_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/User_Header.jsp");
  }

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
      out.write("        ");
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
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <nav class=\"navbar navbar-expand-lg\" style=\"background-color:skyblue\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"#\">Real Estate Management</a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("      <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link active\" aria-current=\"page\" href=\"index.html\">Home</a>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("            <a class=\"nav-link\" href=\"User_ViewCategory.jsp\">View Category</a>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("          <a class=\"nav-link\" href=\"Complaint.jsp\">Complaint</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"Feedback.jsp\">Feedback</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"mybookinglist.jsp\">Mybooking</a>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("      </ul>\n");
      out.write("      <form class=\"d-flex\" role=\"search\">\n");
      out.write("        <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("        <a href=\"index.html\" class=\"btn btn-danger\" type=\"submit\">Logout</a>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("               background-image:url(Image/Payment.jpg);\n");
      out.write("               background-repeat: no-repeat;\n");
      out.write("               background-size: cover;\n");
      out.write("               opacity:0.7;\n");
      out.write("            }    \n");
      out.write("            \n");
      out.write("            .container\n");
      out.write("            {\n");
      out.write("                background-color:white;\n");
      out.write("                margin-top: 100px;\n");
      out.write("                border-radius: 20px;\n");
      out.write("               \n");
      out.write("            }\n");
      out.write("            h1\n");
      out.write("            {\n");
      out.write("                color:blue;\n");
      out.write("            }\n");
      out.write("            input[type=submit]\n");
      out.write("            {\n");
      out.write("                background-color:blue;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("             span\n");
      out.write("             {\n");
      out.write("                 color:red;\n");
      out.write("                \n");
      out.write("             }\n");
      out.write("        </style>\n");
      out.write("     \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"Payment\" method=\"post\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("        <div class=\"col-sm-3\"></div>\n");
      out.write("            <div class=\"col-sm-6\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <br>\n");
      out.write("            <a style=\"float:right\" href=\"Booking.jsp\"> <span class=\"btn btn-danger form-control\"><b>X</b></span></a>\n");
      out.write("                 \n");
      out.write("                 <br>\n");
      out.write("                 <br>\n");
      out.write("                 <center> <h1 style=\"font-family: Wide Latin\">Payment</h1></center>\n");
      out.write("                 <br>\n");
      out.write("         <div class=\"row\">\n");
      out.write("             \n");
      out.write("            <div class=\"col-sm-12\">\n");
      out.write("                <input type=\"radio\" name=\"pay\" value=\"UPI\"><b>UPI</b>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <input type=\"radio\" name=\"pay\" value=\"credit card\"><b>Credit Card</b>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <input type=\"radio\" name=\"pay\" value=\"cash on delivery\"><b>Cash On Delivery</b>\n");
      out.write("            \n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                 <br>\n");
      out.write("                  <div class=\"row\"> \n");
      out.write("                      <div class=\"col-sm-3\"></div>    \n");
      out.write("            <div class=\"col-sm-5\">\n");
      out.write("                <center><input type=\"submit\" value=\"Payment\" name=\"btn\" class=\"btn btn form-control\"></center>\n");
      out.write("            </div>\n");
      out.write("                  <div class=\"col-sm-4\"></div>      \n");
      out.write("        </div>\n");
      out.write("                 <br>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("            <div class=\"col-sm-3\"</div>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
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
