package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public final class Complaint_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("          <a class=\"nav-link active\" aria-current=\"page\" href=\"#\">Home</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"Booking.jsp\">Booking</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"Payment.jsp\">Payment</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"Credit_Card.jsp\">Credit Card</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"UPI.jsp\">UPI</a>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("          <a class=\"nav-link\" href=\"Complaint.jsp\">Complaint</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"Feedback.jsp\">Feedback</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item dropdown\">\n");
      out.write("            <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expands>\n");
      out.write("               Dropdown\n");
      out.write("            </a>\n");
      out.write("            <ul class=\"dropdown-menu\">\n");
      out.write("                <li><a class=\"dropdown-item\" href=\"#\">Action</a></li>\n");
      out.write("                <li><a class=\"dropdown-item\" href=\"#\">Another Action</a></li>\n");
      out.write("                <li><hr class=\"dropdown-divider\"></li>\n");
      out.write("                <li><a class=\"dropdown-item\" href=\"#\">Something else here</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("      </ul>\n");
      out.write("      <form class=\"d-flex\" role=\"search\">\n");
      out.write("        <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("        <button class=\"btn btn-outline-success\" type=\"submit\">Search</button>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("                       .S\n");
      out.write("                       {\n");
      out.write("              background-size: cover;\n");
      out.write("                          background-image: url(Image/Complaint.jpg);\n");
      out.write("                          border-bottom-left-radius:10px;\n");
      out.write("                          border-top-left-radius:10px;\n");
      out.write("                          \n");
      out.write("                      }\n");
      out.write("                      \n");
      out.write("                        body\n");
      out.write("                      {\n");
      out.write("                              background-color:skyblue;\n");
      out.write("                             \n");
      out.write("                      }\n");
      out.write("                      .B \n");
      out.write("                      {\n");
      out.write("                          border-bottom-right-radius:10px;\n");
      out.write("                          border-top-right-radius:10px;\n");
      out.write("                          \n");
      out.write("\n");
      out.write("                          \n");
      out.write("\n");
      out.write("                            background-color: white;    \n");
      out.write("                      } \n");
      out.write("                      input[type=submit]\n");
      out.write("                      {\n");
      out.write("                          background-color:navy;\n");
      out.write("                          color:white;\n");
      out.write("                      }\n");
      out.write("                      .conatiner\n");
      out.write("                      {\n");
      out.write("                          margin-top:30px;\n");
      out.write("\n");
      out.write("                      }\n");
      out.write("                      h1\n");
      out.write("                      {\n");
      out.write("                          font-family: Algerian;\n");
      out.write("                      }\n");
      out.write("                      span\n");
      out.write("             {\n");
      out.write("                 color:red;\n");
      out.write("             }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("  \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"Complaint\" method=\"post\">\n");
      out.write("         <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-3\"></div>\n");
      out.write("            <div class=\"col-sm-6\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <br>\n");
      out.write("            <center><h1 style=\"color:navy\" ><b>Complaint</b></h1></center>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-6 S\">\n");
      out.write("                            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"col-sm-6 B\">\n");
      out.write("                <br>\n");
      out.write("                <a style=\"float:right\" href=\"User_Header.jsp\"> <span class=\"btn btn-danger form-control\"><b>X</b></span></a>\n");
      out.write("                \n");
      out.write("                  <br>\n");
      out.write("                  <br>\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-12\">\n");
      out.write("                <label><b>Name</b><span>*</span></label>\n");
      out.write("                <input type=\"text\" name=\"uname\" placeholder=\"Enter Name\" class=\"form-control\" onkeypress=\"javascript:return isString(event)\" required=\"\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-12\">\n");
      out.write("                <label><b>Subject</b><span>*</span></label>\n");
      out.write("                <input type=\"text\" name=\"c_subject\" placeholder=\"Enter Subject\" class=\"form-control\" onkeypress=\"javascript:return isString(event)\" required=\"\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-12\">\n");
      out.write("                <label><b>Description</b><span>*</span></label>\n");
      out.write("                <textarea name=\"c_desc\" class=\"form-control\" placeholder=\"Enter Description\" onkeypress=\"javascript:return isAlphanumeric(event)\" required=\"\"></textarea>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            ");

             SimpleDateFormat date=new SimpleDateFormat("yyyy-MM-dd");
             Date date1=new Date();
             String date2=date.format(date1);
            
      out.write("\n");
      out.write("             <div class=\"col-sm-12\">\n");
      out.write("                 <label><b>Date</b><span>*</span></label>\n");
      out.write("                 <input type=\"date\" max=\"");
      out.print(date2);
      out.write("\" min=\"");
      out.print(date2);
      out.write("\" name=\"c_date\" class=\"form-control\"  placeholder=\"\" required=\"\">\n");
      out.write("             </div>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"row\">\n");
      out.write("                     <div class=\"col-sm-12\">\n");
      out.write("             <center><input type=\"Submit\" value=\"Complaint\" name=\"btn\" class=\"btn btn form control \"></center>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("        <br>\n");
      out.write("        </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-3\"></div>\n");
      out.write("            </div>\n");
      out.write("        </form> \n");
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
