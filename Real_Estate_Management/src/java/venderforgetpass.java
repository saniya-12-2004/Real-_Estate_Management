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

/**
 *
 * @author DELL
 */
public class venderforgetpass extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
         PrintWriter out=resp.getWriter();

      String User_name=req.getParameter("usn");
       
        String New_password=req.getParameter("unp");
        String Confirm_Password=req.getParameter("ucp");
                String event=req.getParameter("btn");
                 out.println(User_name);
                  
        out.println(New_password);
        out.println(Confirm_Password);
        
        database db=new database();
        out.println(db.connectdb());
        
        if(event.equals("Change Password"))
     {

     Connection cn=null;
      Statement st=null;
         try{
          Class.forName("com.mysql.jdbc.Driver");
    cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_realestate","root","root");
    st=cn.createStatement();
    String sql="select * from tbl_vendor_signup where vendor_name='"+User_name.toString()+"'";
             ResultSet rs=st.executeQuery(sql);
             if(rs.next())
             {
                 String update=db.Update("update tbl_vendor_signup set passwd='"+New_password.toString()+"', cpasswd='"+Confirm_Password.toString()+"' where vendor_name='"+User_name.toString()+"'","Recored Updated");
                 out.println("password Changed");
                 resp.sendRedirect("Vendor_Login.jsp");
                
             }
             else
             {
                 out.println("Incorrect Username And Password");
             }
    }catch(Exception ex)
    {
   out.println(ex.toString());
    }
    }
        
        
    }
    
}