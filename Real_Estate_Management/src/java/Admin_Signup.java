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
public class Admin_Signup extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        String Admin_id=req.getParameter("aid");
        String Admin_name=req.getParameter("aname");
        String Admin_email=req.getParameter("mail");
        String Admin_password=req.getParameter("pass");
        String Admin_cpassword=req.getParameter("cpass");
         String Admin_Gender=req.getParameter("gen");
         String Admin_city=req.getParameter("acity");
        String Admin_address=req.getParameter("aadd");
        String Admin_contact=req.getParameter("acontact");
        String event=req.getParameter("btn");
         out.println(Admin_id);
        out.println(Admin_name);
        out.println(Admin_email);
        out.println(Admin_password);
        out.println(Admin_cpassword);
        out.println(Admin_Gender);
        out.println(Admin_city);
        out.println(Admin_address);
        out.println(Admin_contact);
        
        database db=new database();
        out.println(db.connectdb());
        
        
        if(event.equals("Sign Up"))
        {
            
             String insert=db.Insert("insert into tbl_admin_signup(admin_name,email,passwd,cpasswd,gender,address,city,contact) values ('"+Admin_name+"','"+Admin_email+"','"+Admin_password+"','"+Admin_cpassword+"','"+Admin_Gender+"','"+Admin_address+"','"+Admin_city+"','"+Admin_contact+"')", "Record Inserted");
            out.println(insert);
            resp.setContentType("text/html;charset=UTF-8");
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Account Created');");
                    out.println("location=' Admin_Login.jsp';");
                    out.println("</script>");

            }
        }
    
    }