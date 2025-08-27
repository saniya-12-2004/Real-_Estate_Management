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
public class Credit_Card extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        String Card_no=req.getParameter("cno");
        String Cardholder_name=req.getParameter("ca_name");
        String Card_expiry_date =req.getParameter("ca_date");
        String CVV =req.getParameter("cvv");
        String Amount =req.getParameter("amt");
        String event=req.getParameter("btn");

        out.println(Card_no);
        out.println(Cardholder_name);
        out.println(Card_expiry_date);
        out.println(CVV);
         out.println(Amount);
         
         database db=new database();
        out.println(db.connectdb());
        
       if(event.equals("Payment"))
        {
         String insert=db.Insert("insert into tbl_credit_card (id,cardholder_name,expiry_date,cvv,amount) values ('"+Card_no+"','"+Cardholder_name+"','"+Card_expiry_date+"','"+CVV+"','"+Amount+"')", "Record Inserted");

            out.println(insert);
            resp.setContentType("text/html;charset=UTF-8");
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Payment Successful');");
                    out.println("location=' mybookinglist.jsp';");
                    out.println("</script>");
        }
    }

    
}
