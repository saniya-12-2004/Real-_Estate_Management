/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author DELL
 */
public class Vendor_Login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       PrintWriter out=resp.getWriter();
        String Vendor_username=req.getParameter("vname");
        String Vendor_password=req.getParameter("vpwd");
        out.println(Vendor_username);
        out.println(Vendor_password);
        
         String event=req.getParameter("btn");
        
        Connection cn=null;
        Statement st=null;
        
        HttpSession session=req.getSession();
           
         if(event.equals("Login"))
         {
            try
    {
       Class.forName("com.mysql.jdbc.Driver");
       cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_realestate", "root", "root");
        st=cn.createStatement();
        String sql="select * from tbl_vendor_signup where email='"+Vendor_username+"' and passwd='"+Vendor_password+"'";
        ResultSet rs=st.executeQuery(sql);
        if(rs.next())
        {
            session.setAttribute("vid", rs.getString("vid"));
            resp.sendRedirect("Add_Property.jsp");
        }
        else
        {
        resp.setContentType("text/html;charset=UTF-8");
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Login Fail');");
                    out.println("location='Vendor_Login.jsp';");
                    out.println("</script>");
        }
    }catch(Exception ex)
    {
            out.println(ex.toString());
    }
         
         }
        
                }
}

   

