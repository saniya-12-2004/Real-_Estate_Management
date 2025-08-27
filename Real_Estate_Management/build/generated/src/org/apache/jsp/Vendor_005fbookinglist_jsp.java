package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public final class Vendor_005fbookinglist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Real Estate Management</title>\n");
      out.write("          ");
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
      out.write("         <a href=\"index.html\" class=\"btn btn-danger\" type=\"submit\">Logout</a>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("         <style>\n");
      out.write("  body\n");
      out.write("     {\n");
      out.write("         background-color: skyblue;\n");
      out.write("     }\n");
      out.write("                    \n");
      out.write("</style> \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-2\"></div>\n");
      out.write("        <div class=\"col-sm-8\">\n");
      out.write("        <div class=\"conatiner\"><br><br>\n");
      out.write("            \n");
      out.write("            <center><h2><b>Booking List</b></h2></center>\n");
      out.write("            <br>\n");
      out.write("             <table class=\"table table-bordered\">\n");
      out.write("                 \n");
      out.write("    <thead>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"col\">#</th>\n");
      out.write("      <th scope=\"col\">Property Name</th>\n");
      out.write("      <th scope=\"col\">Description</th>\n");
      out.write("      <th scope=\"col\">Property Category</th>\n");
      out.write("      <th scope=\"col\">Location</th>\n");
      out.write("      <th scope=\"col\">Price</th>\n");
      out.write("      <th scope=\"col\">Name</th>\n");
      out.write("      <th scope=\"col\">Contact Number</th>\n");
      out.write("      <th scope=\"col\">Address</th>\n");
      out.write("      <th scope=\"col\">Documentation</th>\n");
      out.write("      \n");
      out.write("\n");
      out.write("    </tr>\n");
      out.write("  </thead>\n");
      out.write("  <tbody>\n");
      out.write("      ");
 
          Connection cn=null;
          Statement st=null;
     int id=1;
       try
    {
       Class.forName("com.mysql.jdbc.Driver");
       cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_realestate", "root", "root");
        st=cn.createStatement();
        String sql="select * from tbl_booking where vid='"+session.getAttribute("vid")+"'";
        ResultSet rs=st.executeQuery(sql);
        while(rs.next())
        {
           
      
            
                
      
      out.write("\n");
      out.write("     <tr>\n");
      out.write("      <th scope=\"row\">");
      out.print(id++);
      out.write("</th>\n");
      out.write("      <td>");
      out.print(rs.getString("property_name"));
      out.write("</td>\n");
      out.write("      <td>");
      out.print(rs.getString("description"));
      out.write("</td>\n");
      out.write("      <td>");
      out.print(rs.getString("category"));
      out.write("</td>\n");
      out.write("      <td>");
      out.print(rs.getString("location"));
      out.write("</td>\n");
      out.write("      <td>");
      out.print(rs.getString("price"));
      out.write("</td>\n");
      out.write("    \n");
      out.write("      <td>");
      out.print(rs.getString("owner_name"));
      out.write("</td>\n");
      out.write("      <td>");
      out.print(rs.getString("owner_contact"));
      out.write("</td>\n");
      out.write("      <td>");
      out.print(rs.getString("owner_address"));
      out.write("</td>\n");
      out.write("      <td>");
      out.print(rs.getString("documentation"));
      out.write("</td>\n");
      out.write("      \n");
      out.write("\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    ");

        }
      }catch(Exception ex)
     {
            out.println(ex.toString());
     }
    

    
    
    
      out.write("\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-2\"></div>\n");
      out.write("        </div>\n");
      out.write("     </tbody>\n");
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
