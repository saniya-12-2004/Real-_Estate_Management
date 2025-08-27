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
public class Add_Property extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                PrintWriter out=resp.getWriter();
        String Property_id=req.getParameter("propertyid");        
        String Property_name=req.getParameter("pname");
        String Property_image=req.getParameter("pimage");
        String Property_description=req.getParameter("pdesc");
        String Property_Category=req.getParameter("p_cat");
        String Property_Location=req.getParameter("p_loc");
        String Property_Price=req.getParameter("price");
        String Property_Status=req.getParameter("p_status");
        String Owner_Name=req.getParameter("owner_name");
        String Owner_Contact=req.getParameter("owner_contact");
        String Owner_Address=req.getParameter("owner_address");
        String Property_age=req.getParameter("age");
        String Documentation=req.getParameter("docu");
        String event=req.getParameter("btn");
       
        out.println(Property_name);
        out.println(Property_image);
        out.println(Property_description);
        out.println(Property_Category);
        out.println(Property_Location);
         out.println(Property_Price);
        out.println(Property_Status);
        out.println(Owner_Name);
        out.println(Owner_Contact);
        out.println(Owner_Address);
        out.println(Property_age);
        out.println(Documentation);
         out.println(Property_id);
        database db=new database();
        out.println(db.connectdb());
        
        HttpSession session=req.getSession();
        
        if(event.equals("Add Property"))
        {
String insert=db.Insert("insert into tbl_add_property(property_name,property_image,description,category,location,price,pstatus,age,owner_name,owner_contact,owner_address,documentation,vid) values ('"+Property_name+"','Image/"+Property_image+"','"+Property_description+"','"+Property_Category+"','"+Property_Location+"','"+Property_Price+"','"+Property_Status+"','"+Property_age+"','"+Owner_Name+"','"+Owner_Contact+"','"+Owner_Address+"','Image/"+Documentation+"','"+session.getAttribute("vid")+"')", "Record Inserted");  
out.println(insert);
resp.setContentType("text/html;charset=UTF-8");
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Record Inserted');");
                    out.println("location=' Vendor_bookinglist.jsp';");
                    out.println("</script>");
        }
        
if(event.equals("Delete"))
        {
            String delete=db.Delete("delete from tbl_add_property where pid='"+Property_id+"'", "Record Deleted");
            out.println(delete);
            resp.setContentType("text/html;charset=UTF-8");
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Record Deleted');");
                    out.println("location='  Add_Propertylist.jsp';");
                    out.println("</script>");
        }
if(event.equals("Update"))
        {
            String update=db.Update("update tbl_add_property set property_name='"+Property_name+"',property_image='"+Property_image+"',description='"+Property_description+"',category='"+Property_Category+"',location='"+Property_Location+"',price='"+Property_Price+"',pstatus='"+Property_Status+"',age='"+Property_age+"',owner_name='"+Owner_Name+"',owner_contact='"+Owner_Contact+"',owner_address='"+Owner_Address+"',documentation='"+Documentation+"' where pid='"+Property_id+"'","Record Updated");
            out.println(update);
            resp.setContentType("text/html;charset=UTF-8");
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Record Updated');");
                    out.println("location='  Add_Propertylist.jsp';");
                    out.println("</script>");
        }
    }

    
}
