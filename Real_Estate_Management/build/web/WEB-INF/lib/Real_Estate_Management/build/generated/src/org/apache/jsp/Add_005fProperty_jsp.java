package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;

public final class Add_005fProperty_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Vendor_Header.jsp");
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
      out.write("        <nav class=\"navbar navbar-expand-lg\"  style=\"background-color:orange\">\n");
      out.write(" \n");
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
      out.write("          <a class=\"nav-link\" href=\"Add_Property.jsp\">Add Property</a>\n");
      out.write("        </li>\n");
      out.write("         <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"Vendor_bookinglist.jsp\">Bookinglist</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item dropdown\">\n");
      out.write("            <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expands>\n");
      out.write("               List\n");
      out.write("            </a>\n");
      out.write("            <ul class=\"dropdown-menu\">\n");
      out.write("                <li><a class=\"dropdown-item\" href=\"Add_Propertylist.jsp\">Propertylist</a></li>\n");
      out.write("                \n");
      out.write("              \n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("              </ul>\n");
      out.write("      <form class=\"d-flex\" role=\"search\">\n");
      out.write("        <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("        <button class=\"btn btn-outline-danger\" type=\"submit\">Logout</button>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("                <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("                background-image: url(Image/Property.jpg);\n");
      out.write("               background-size: cover;\n");
      out.write("                opacity:0.8;\n");
      out.write("             \n");
      out.write("            }\n");
      out.write("            .container\n");
      out.write("            {\n");
      out.write("                background-color: white;\n");
      out.write("                padding:20px;\n");
      out.write("                background-color:white;\n");
      out.write("                border-radius:20px;\n");
      out.write("                margin:10px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            input[type=submit],[type=reset]\n");
      out.write("             {\n");
      out.write("                 color:white;\n");
      out.write("            }\n");
      out.write("            h1\n");
      out.write("            {\n");
      out.write("                font-family:Britannic Bold;\n");
      out.write("            }\n");
      out.write("            span\n");
      out.write("            {\n");
      out.write("                color:red;\n");
      out.write("            }\n");
      out.write("            </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"Add_Property\" method=\"Post\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-3\"></div>\n");
      out.write("            <div class=\"col-sm-6\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <a style=\"float:right\" href=\"Vendor_Header.jsp\"> <span class=\"btn btn-danger form-control\"><b>X</b></span></a>\n");
      out.write("            <br>\n");
      out.write("            <center><h1 style=\"color:brown\"><b>Add Property</b></h1></center>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            \n");
      out.write("            <div class=\"col-sm-6\">\n");
      out.write("                <label><b>Property Name</b><span style=\"color:red\">*</span></label>\n");
      out.write("                <input type=\"text\" name=\"pname\" placeholder=\"Enter Property\" class=\"form-control\"  onkeypress=\"javascript: return isString(event)\" required=\"\">\n");
      out.write("            </div>\n");
      out.write("             <div class=\"col-sm-6\">\n");
      out.write("                <label><b>Property Image</b><span style=\"color:red\">*</span></label>\n");
      out.write("                <input type=\"file\" name=\"pimage\" class=\"form-control\" required=\"\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("       \n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("                <label><b>Description</b><span style=\"color:red\">*</span></label>\n");
      out.write("                <textarea name=\"pdesc\" class=\"form-control\" placeholder=\"Enter Description\"  onkeypress=\"javascript:return isAlphanumeric(event)\" required=\"\"></textarea>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("                <label><b>Property Category</b><span style=\"color:red\">*</span></label>\n");
      out.write("                <select class=\"form-control\" name=\"p_cat\">\n");
      out.write("                    <option>Select</option>\n");
      out.write("                    ");
 
          Connection cn=null;
          Statement st=null;
     int id=1;
       try
    {
       Class.forName("com.mysql.jdbc.Driver");
       cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_realestate", "root", "root");
        st=cn.createStatement();
        String sql="select * from tbl_add_category";
        ResultSet rs=st.executeQuery(sql);
        while(rs.next())
        {
           
      
            
                
      
      out.write("\n");
      out.write("                     <option>");
      out.print(rs.getString("categoryname"));
      out.write("</option>\n");
      out.write("                     ");

        }
      }catch(Exception ex)
     {
            out.println(ex.toString());
     }
    

    
    
    
      out.write("\n");
      out.write("                      \n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("             <div class=\"col-sm-4\">\n");
      out.write("                <label><b>Property Age</b><span style=\"color:red\">*</span></label>\n");
      out.write("                <input type=\"number\" name=\"age\" class=\"form-control\" placeholder=\"Enter Property Age\"  onkeypress=\"javascript:return isNumber(event)\" required=\"\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"row\">\n");
      out.write("             <div class=\"col-sm-4\">\n");
      out.write("                 <label><b>Location</b><span style=\"color:red\">*</span></label>\n");
      out.write("                <input type=\"text\" name=\"p_loc\" class=\"form-control\"  placeholder=\"Enter Location\"  onkeypress=\"javascript:return isString(event)\" required=\"\">\n");
      out.write("             </div>\n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("                <label><b>Price</b><span style=\"color:red\">*</span></label>\n");
      out.write("                <input type=\"number\" name=\"price\" class=\"form-control\" placeholder=\"Enter Price\" onkeypress=\"function isFloat(event)\" required=\"\" >\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("                <label><b>Property Status</b><span style=\"color:red\">*</span></label>\n");
      out.write("                <input type=\"text\" name=\"p_status\" class=\"form-control\" placeholder=\"Enter Status\"  onkeypress=\"javascript:return isString(event)\" required=\"\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <b><label>Owner Details</label></b>\n");
      out.write("                <br>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                  <div class=\"col-sm-4\">\n");
      out.write("                      <label>Name<span>*</span></label>\n");
      out.write("                <input type=\"text\" name=\"owner_name\" class=\"form-control\" placeholder=\"Enter Name\"  onkeypress=\"javascript:return isString(event)\" required=\"\">\n");
      out.write("            </div>\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                    <label>Contact Number<span>*</span></label>\n");
      out.write("                    <input type=\"text\" name=\"owner_contact\" class=\"form-control\"  minlength=\"10\" maxlength=\"10\" pattern=\"[7-9]{1}[0-9]{9}\" \n");
      out.write("       title=\"Phone number with 7-9 and remaing 9 digit with 0-9\" placeholder=\"Enter Contact Number\" onkeypress=\"javascript:return isNumber(event)\" required=\"\" >\n");
      out.write("            </div>\n");
      out.write("              <div class=\"col-sm-4\">\n");
      out.write("                  <label>Address<span>*</span></label>\n");
      out.write("                <textarea name=\"owner_address\" class=\"form-control\" placeholder=\"Enter Address\"  required=\"\"></textarea>\n");
      out.write("            </div>  \n");
      out.write("      </div>\n");
      out.write("                <br>\n");
      out.write("                <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-12\">\n");
      out.write("                <label><b>Documentation<span>*</span></b></label>\n");
      out.write("                <input type=\"file\" name=\"docu\" class=\"form-control\" placeholder=\"\" required=\"\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("  \n");
      out.write("                     <input type=\"submit\" value=\"Add Property\" name=\"btn\" class=\"btn btn-success\">\n");
      out.write("         \n");
      out.write("              <input type=\"submit\" value=\"Update\" name=\"btn\" class=\"btn btn-primary\">\n");
      out.write("         \n");
      out.write("         \n");
      out.write("             <input type=\"reset\" value=\"Delete\" name=\"btn\" class=\"btn btn-danger\">\n");
      out.write("        \n");
      out.write("          \n");
      out.write("        \n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("            <div class=\"col-sm-3\"></div>\n");
      out.write("            </div>\n");
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
