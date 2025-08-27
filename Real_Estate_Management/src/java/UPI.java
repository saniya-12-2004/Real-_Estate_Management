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
public class UPI extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         PrintWriter out=resp.getWriter();
        String UPI_id=req.getParameter("uid");
        String Amount=req.getParameter("amt");
        String event=req.getParameter("btn");

        out.println(UPI_id);
         out.println(Amount);
         
         database db=new database();
        out.println(db.connectdb());
        
        if(event.equals("Payment"))
        {
         String insert=db.Insert("insert into  tbl_upi(id,amount) values ('"+UPI_id+"','"+Amount+"')", "Record Inserted");

            out.println(insert);
            resp.setContentType("text/html;charset=UTF-8");
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Payment Successful');");
                    out.println("location='mybookinglist.jsp';");
                    out.println("</script>");
        }
    }

   
}
