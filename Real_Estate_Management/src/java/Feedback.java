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
public class Feedback extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         PrintWriter out=resp.getWriter();
        String Rating=req.getParameter("rating");
        String Comments=req.getParameter("comment");
        String event=req.getParameter("btn");
        out.println(Rating);
        out.println(Comments);
        
        database db=new database();
        out.println(db.connectdb());
        
        
        if(event.equals("Send Feedback"))
        {
         String insert=db.Insert("insert into tbl_feedback(rating,comments) values ('"+Rating+"','"+Comments+"')", "Record Inserted");

            out.println(insert);
            resp.setContentType("text/html;charset=UTF-8");
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Record Inserted');");
                    out.println("location='Feedback.jsp';");
                    out.println("</script>");
        }
    }

   

}
