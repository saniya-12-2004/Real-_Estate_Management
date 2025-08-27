
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
import javax.servlet.http.HttpSession;

/**
 *
 * @author DELL
 */
public class Viewpages extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       PrintWriter out=resp.getWriter();
       
       String event=req.getParameter("btn");
       
        HttpSession session=req.getSession();
       if(event.equals("View"))
       {
           session.setAttribute("cname", req.getParameter("cname"));
           resp.sendRedirect("User_propertyview.jsp");
       }
       
       if(event.equals("Buy now"))
       {
           
                    session.setAttribute("pname", req.getParameter("pname"));
                    session.setAttribute("descr", req.getParameter("descr"));
                    session.setAttribute("catname", req.getParameter("catname"));
                    session.setAttribute("loc", req.getParameter("loc"));
                    session.setAttribute("price", req.getParameter("price"));
                    session.setAttribute("oname", req.getParameter("oname"));
                    session.setAttribute("ocontact", req.getParameter("ocontact"));
                    session.setAttribute("oaddress", req.getParameter("oaddress"));
                    session.setAttribute("vpid", req.getParameter("vpid"));
                    resp.sendRedirect("Booking.jsp");
       }
      
    }

  
}
