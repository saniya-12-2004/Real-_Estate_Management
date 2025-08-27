<%-- 
    Document   : Add_Propertylist
    Created on : 27 Jan, 2025, 11:13:02 AM
    Author     : DELL
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Real Estate Management</title>
        <%@include file="Vendor_Header.jsp"%>               
<style>
  body
     {
         background-color: skyblue;
     }
                    
</style>
    </head>
    <body>
        <div class="row">
            <div class="col-sm-1"></div>
        <div class="col-sm-10">
        <div class="conatiner"><br><br>
            
            <center><h2><b>Property List</b></h2></center>
            <br>
             <table class="table table-bordered">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Property Name</th>
       <th scope="col">Property Image</th>
      <th scope="col">Description</th>
      <th scope="col">Property Category</th>
      <th scope="col">Property Age</th>
      <th scope="col">Location</th>
      <th scope="col">Price</th>
      <th scope="col">Property Status</th>
      <th scope="col">Name</th>
      <th scope="col">Contact Number</th>
      <th scope="col">Address</th>
      <th scope="col">Documentation</th>
      <th scope="col">Update</th>
      <th scope="col">Delete</th>

    </tr>
  </thead>
 <tbody>
      <% 
          Connection cn=null;
          Statement st=null;
     int id=1;
       try
    {
       Class.forName("com.mysql.jdbc.Driver");
       cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_realestate", "root", "root");
        st=cn.createStatement();
        String sql="select * from tbl_add_property where vid='"+session.getAttribute("vid")+"'";
        ResultSet rs=st.executeQuery(sql);
        while(rs.next())
        {
           
      
            
                
      %>
     <tr>
 <form action="Add_Property" method="post">
      <th scope="row"><%=id++%></th>
      <input type="hidden" name="propertyid" value="<%=rs.getString("pid")%>">
      <th scope="row"><input type="text" name="pname" value="<%=rs.getString("property_name")%>"class="form-control"></th>
      <th scope="row"><input type="text" name="pimage" value="<%=rs.getString("property_image")%>"class="form-control"></th>
      <th scope="row"><input type="text" name="pdesc" value="<%=rs.getString("description")%>"class="form-control"></th>
      <th scope="row"><input type="text" name="p_cat" value="<%=rs.getString("category")%>" class="form-control"></th>
      <th scope="row"><input type="text" name="p_loc" value="<%=rs.getString("location")%>"class="form-control"></th>
      <th scope="row"><input type="text" name="price" value="<%=rs.getString("price")%>" class="form-control"></th>
      <th scope="row"><input type="text" name="p_status" value="<%=rs.getString("pstatus")%>"class="form-control"></th>
      <th scope="row"><input type="text" name="age" value="<%=rs.getString("age")%>"class="form-control"></th>
      <th scope="row"><input type="text" name="owner_name" value="<%=rs.getString("owner_name")%>"class="form-control"></th>
      <th scope="row"><input type="text" name="owner_contact" value="<%=rs.getString("owner_contact")%>"class="form-control"></th>
      <th scope="row"><input type="text" name="owner_address" value="<%=rs.getString("owner_address")%>"class="form-control"></th>
      <th scope="row"><input type="text" name="docu" value="<%=rs.getString("documentation")%>"class="form-control"></th>
     

      <td><input type="submit" name="btn" class="btn btn-success" value="Update"></td>
      <td><input type="submit" name="btn" class="btn btn-danger"  value="Delete"></td>
 </form>
    </tr>
    <%
        }
      }catch(Exception ex)
     {
            out.println(ex.toString());
     }
    

    
    
    %>
    </div>
    </div>
    <div class="col-sm-1"></div>
        </div>
     </tbody>
</table>
     
    </body>
</html>
