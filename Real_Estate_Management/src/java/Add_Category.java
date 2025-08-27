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
public class Add_Category extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        
        String Category_name=req.getParameter("cname");
        String Category_image=req.getParameter("cimage");
        String Category_description=req.getParameter("cdesc");
       String Cat_id=req.getParameter("catid");
        String event=req.getParameter("btn");
        
        out.println(Category_name);
        out.println(Category_image);
        out.println(Category_description);
        out.println(Cat_id);
   
        database db=new database();
        out.println(db.connectdb());
        
        if(event.equals("Add Category"))
        {
            String insert=db.Insert("insert into tbl_add_category(categoryname,description,image) values ('"+Category_name+"','"+Category_description+"','Image/"+Category_image+"')", "Record Inserted");
            out.println(insert);
            resp.setContentType("text/html;charset=UTF-8");
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Record Inserted');");
                    out.println("location='Admin_Bookinglist.jsp';");
                    out.println("</script>");
        }
        if(event.equals("Delete"))
        {
            String delete=db.Delete("delete from tbl_add_category where cid='"+Cat_id+"'","Record Deleted");
            out.println(delete);
            resp.setContentType("text/html;charset=UTF-8");
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Record Deleted');");
                    out.println("location=' Admin_Categorylist.jsp';");
                    out.println("</script>");
        }
        if(event.equals("Update"))
        {
            String update=db.Update("update tbl_add_category set categoryname='"+Category_name+"',description='"+Category_description+"',image='"+Category_image+"'where cid='"+Cat_id+"'","Record Updated");
            out.println(update);
            resp.setContentType("text/html;charset=UTF-8");
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Record Updated');");
                    out.println("location='Admin_Categorylist.jsp';");
                    out.println("</script>");
        }
    }
    
}
