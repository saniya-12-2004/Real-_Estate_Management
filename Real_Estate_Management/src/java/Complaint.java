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
public class Complaint extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        String Name=req.getParameter("uname");
        String Complaint_subject=req.getParameter("c_subject");
        String Complaint_description=req.getParameter("c_desc");
        String Complaint_date=req.getParameter("c_date");
        String event=req.getParameter("btn");
         out.println(Name);
        out.println(Complaint_subject);
        out.println(Complaint_description);
        out.println(Complaint_date);

        database db=new database();
        out.println(db.connectdb());
        
        if(event.equals("Complaint"))
        {
            String insert=db.Insert("insert into tbl_complaint(name,sub,description,complaint_date) values ('"+Name+"','"+Complaint_subject+"','"+Complaint_description+"','"+Complaint_date+"')", "Record Inserted");
            out.println(insert);
            resp.setContentType("text/html;charset=UTF-8");
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Record Inserted');");
                    out.println("location='Complaint.jsp';");
                    out.println("</script>");
        }

    }
}
