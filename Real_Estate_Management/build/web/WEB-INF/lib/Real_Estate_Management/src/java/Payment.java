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
public class Payment extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        
        String UPI=req.getParameter("pay");
        String Credit_Card=req.getParameter("pay");
        String Cash_On_Delivery=req.getParameter("pay");
        String event=req.getParameter("btn");
        
        
        out.println(UPI);       
        out.println(Credit_Card);       
        out.println(Cash_On_Delivery);       
        
        database db=new database();
        out.println(db.connectdb());
       
        if(event.equals("Payment"))
        {
            if(UPI.equals("UPI"))    
            {
               resp.sendRedirect("UPI.jsp");
            }
            else if(Credit_Card.equals("credit card"))
            {
               resp.sendRedirect("Credit_Card.jsp");
            }
            else
            {
               out.println("Plz Select Method");    
            }
        
        }
    }
   
    
    
}
