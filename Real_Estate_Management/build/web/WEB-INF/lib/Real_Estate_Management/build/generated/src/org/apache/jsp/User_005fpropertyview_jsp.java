package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public final class User_005fpropertyview_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Real Estate Management</title>\n");
      out.write("         ");
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
      out.write("         <style>\n");
      out.write("             \n");
      out.write("             .property\n");
      out.write("             {\n");
      out.write("                 display:inline-block;\n");
      out.write("                 margin:10px;\n");
      out.write("                 border: black;\n");
      out.write("             }\n");
      out.write("             .conatiner\n");
      out.write("             {\n");
      out.write("                 margin: 20px;\n");
      out.write("                              }\n");
      out.write("             body\n");
      out.write("             {\n");
      out.write("background-color: lavender;}            \n");
      out.write("             h2\n");
      out.write("             {\n");
      out.write("                 color: blue;\n");
      out.write("                 \n");
      out.write("                \n");
      out.write("             }\n");
      out.write("         </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <br>\n");
      out.write("        <div class=\"conatiner\">\n");
      out.write("            <center><h2><b>Property View</b></h2></center>\n");
      out.write("            \n");
      out.write("            ");

             Connection cn=null;
             Statement st=null;
             
           try
            {
                     Class.forName("com.mysql.jdbc.Driver");
                     cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_realestate", "root", "root");
                     st=cn.createStatement();
                     String sql="select * from tbl_add_property where category='"+session.getAttribute("cname")+"'";
                     ResultSet rs=st.executeQuery(sql);
                     while(rs.next())
                     {
                     
                    
             
      out.write("\n");
      out.write("            <div class=\"property\">\n");
      out.write("                 <form action=\"Viewpages\" method=\"post\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-12\">\n");
      out.write("                     <img src=\"");
      out.print(rs.getString("property_image"));
      out.write("\" height=\"200\" width=\"200\">\n");
      out.write("                    <br>\n");
      out.write("                    <p>Property Name:");
      out.print(rs.getString("property_name"));
      out.write("</p>\n");
      out.write("                    <textarea class=\"form-control\">Description:");
      out.print(rs.getString("description"));
      out.write("</textarea>\n");
      out.write("                    <p>Property Category:");
      out.print(rs.getString("category"));
      out.write("</p>\n");
      out.write("                    <p>Location:");
      out.print(rs.getString("location"));
      out.write("</p>\n");
      out.write("                    <p>Price:");
      out.print(rs.getString("price"));
      out.write("</p>\n");
      out.write("                    <p>Property Status:");
      out.print(rs.getString("pstatus"));
      out.write("</p>\n");
      out.write("                    <p>Property age:");
      out.print(rs.getString("age"));
      out.write("</p>\n");
      out.write("                    <p>Owner Name:");
      out.print(rs.getString("owner_name"));
      out.write("</p>\n");
      out.write("                    <p>Owner Contact:");
      out.print(rs.getString("owner_contact"));
      out.write("</p>\n");
      out.write("                    <textarea class=\"form-control\">Owner Address:");
      out.print(rs.getString("owner_address"));
      out.write("</textarea>\n");
      out.write("                    \n");
      out.write("                    <a  href=\"");
      out.print(rs.getString("documentation"));
      out.write("\">Documentation</a>\n");
      out.write("                    <br>\n");
      out.write("                    <input type=\"hidden\" name=\"pname\" value=\"");
      out.print(rs.getString("property_name"));
      out.write("\">\n");
      out.write("                    <input type=\"hidden\" name=\"descr\" value=\"");
      out.print(rs.getString("description"));
      out.write("\">\n");
      out.write("                    <input type=\"hidden\" name=\"catname\" value=\"");
      out.print(rs.getString("category"));
      out.write("\">\n");
      out.write("                    <input type=\"hidden\" name=\"loc\" value=\"");
      out.print(rs.getString("location"));
      out.write("\">\n");
      out.write("                    <input type=\"hidden\" name=\"price\" value=\"");
      out.print(rs.getString("price"));
      out.write("\">\n");
      out.write("                    <input type=\"hidden\" name=\"oname\" value=\"");
      out.print(rs.getString("owner_name"));
      out.write("\">\n");
      out.write("                    <input type=\"hidden\" name=\"ocontact\" value=\"");
      out.print(rs.getString("owner_contact"));
      out.write("\">\n");
      out.write("                    <input type=\"hidden\" name=\"oaddress\" value=\"");
      out.print(rs.getString("owner_address"));
      out.write("\">\n");
      out.write("                    <input type=\"hidden\" name=\"vpid\" value=\"");
      out.print(rs.getString("vid"));
      out.write("\">\n");
      out.write("                    <input type=\"submit\" name=\"btn\" class=\"btn btn-primary form-control\" value=\"Buy now\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                 </form>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("                    ");
 
                    
                     }
            }catch(Exception ex)
            {
                 out.println(ex.toString());
            }
                    
      out.write("\n");
      out.write("        </div>\n");
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
