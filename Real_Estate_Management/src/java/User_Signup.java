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
public class User_Signup extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   
    PrintWriter out=resp.getWriter();
        String User_id=req.getParameter("uid");
        String User_name=req.getParameter("uname");
        String User_email=req.getParameter("umail");
        String User_password=req.getParameter("pass2");
        String User_cpassword=req.getParameter("pass2");
         String User_city=req.getParameter("ucity");
        String User_address=req.getParameter("uadd");
        String User_contact=req.getParameter("ucontact");
        String User_Gender=req.getParameter("gender");
        String event=req.getParameter("btn");
         out.println(User_id);
        out.println(User_name);
        out.println(User_email);
        out.println(User_password);
        out.println(User_cpassword);
        out.println(User_city);
        out.println(User_address);
        out.println(User_Gender);
        
        
        database db=new database();
        out.println(db.connectdb());
        
         if(event.equals("Sign Up"))
        {
            String insert=db.Insert("insert into tbl_user_signup(user_name,email,passwd,cpasswd,gender,address,city,contact) values ('"+User_name+"','"+User_email+"','"+User_password+"','"+User_cpassword+"','"+User_Gender+"','"+User_address+"','"+User_city+"','"+User_contact+"')", "Record Inserted");
            out.println(insert);
            resp.setContentType("text/html;charset=UTF-8");
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Account Created');");
                    out.println("location='User_Login.jsp';");
                    out.println("</script>");
        }
          
    }
}
