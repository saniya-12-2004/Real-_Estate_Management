/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
public class Vendor_Signup extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
          PrintWriter out=resp.getWriter();
        String Vendor_id=req.getParameter("vid");
        String Vendor_name=req.getParameter("vname");
        String Vendor_email=req.getParameter("vmail");
        String Vendor_password=req.getParameter("vpass");
        String Vendor_cpassword=req.getParameter("vcpass");
         String Vendor_city=req.getParameter("vcity");
        String Vendor_address=req.getParameter("vadd");
        String Vendor_contact=req.getParameter("vcontact");
        String Vendor_Gender=req.getParameter("gen");
        String event=req.getParameter("btn");
         out.println(Vendor_id);
        out.println(Vendor_name);
        out.println(Vendor_email);
        out.println(Vendor_password);
        out.println(Vendor_cpassword);
        out.println(Vendor_city);
        out.println(Vendor_address);
        out.println(Vendor_contact);
         out.println(Vendor_Gender);
        
        database db=new database();
        out.println(db.connectdb());
        
        if(event.equals("Sign Up"))
        {
            String insert=db.Insert("insert into tbl_vendor_signup(vendor_name,email,passwd,cpasswd,gender,address,city,contact) values ('"+Vendor_name+"','"+Vendor_email+"','"+Vendor_password+"','"+Vendor_cpassword+"','"+Vendor_Gender+"','"+Vendor_address+"','"+Vendor_city+"','"+Vendor_contact+"')", "Record Inserted");
            out.println(insert);
            resp.setContentType("text/html;charset=UTF-8");
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Account Created');");
                    out.println("location='Vendor_Login.jsp';");
                    out.println("</script>");
        }
    }

    
}
