

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
import javax.servlet.http.HttpSession;

/**
 *
 * @author DELL
 */
public class Booking extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        String Property_name=req.getParameter("pname");
        String Property_description=req.getParameter("pdesc");
        String Property_Category=req.getParameter("b_cat");
        String Property_Location=req.getParameter("p_loc");
        String Property_Price=req.getParameter("p_price");
      
        String Owner_Name=req.getParameter("owner_name");
        String Owner_Contact=req.getParameter("owner_contact");
        String Owner_Address=req.getParameter("owner_address");
          String Booking_date=req.getParameter("b_date");
        String Documentation=req.getParameter("doc");
        String event=req.getParameter("btn");

        
        out.println(Property_name);
        out.println(Property_description);
        out.println(Property_Category);
        out.println(Property_Location);
         out.println(Property_Price);
       
        out.println(Owner_Name);
        out.println(Owner_Contact);
        out.println(Owner_Address);
        out.println(Booking_date);
        out.println(Documentation);
        
        database db=new database();
        out.println(db.connectdb());
        
        HttpSession session=req.getSession();
        
         if(event.equals("Booknow"))
        {
       Connection cn=null;
          Statement st=null;
   
       try
    {
       Class.forName("com.mysql.jdbc.Driver");
       cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_realestate", "root", "root");
        st=cn.createStatement();
        String sql="select * from tbl_booking where property_name='"+Property_name+"'";
        ResultSet rs=st.executeQuery(sql);
        if(rs.next())
        {
            resp.setContentType("text/html;charset=UTF-8");
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Sorry Property Alredy Booked');");
                    out.println("location='User_ViewCategory.jsp';");
                    out.println("</script>");
       }
        else
        {
        String insert=db.Insert("insert into tbl_booking(property_name,description,category,location,price,owner_name,owner_contact,owner_address,date,documentation,vid,uid) values ('"+Property_name+"','"+Property_description+"','"+Property_Category+"','"+Property_Location+"','"+Property_Price+"','"+Owner_Name+"','"+Owner_Contact+"','"+Owner_Address+"','"+Booking_date+"','Image/"+Documentation+"','"+session.getAttribute("vpid")+"','"+session.getAttribute("uid")+"')", "Record Inserted");  
out.println(insert);
session.setAttribute("tamount", Property_Price);
resp.setContentType("text/html;charset=UTF-8");
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Record Inserted');");
                    out.println("location='Payment.jsp';");
                    out.println("</script>");
        }
      }catch(Exception ex)
     {
            out.println(ex.toString());
     }
                
            
            
            

        }
           
    }
    
}
