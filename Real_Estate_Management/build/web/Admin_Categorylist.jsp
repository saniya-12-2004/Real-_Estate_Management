<%-- 
    Document   : Admin_Categorylist
    Created on : 24 Jan, 2025, 11:31:25 AM
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
        <%@include file="Admin_Header.jsp" %>
         <style>
  body
     {
         background-color: skyblue;
     }
        h2
     {
         font-family: Algerian;
     }
                                 
</style> 
    </head>
    <body>
        <div class="row">
            <div class="col-sm-2"></div>
        <div class="col-sm-8">
        <div class="conatiner"><br><br>
            
            <center><h2><b>Category List</b></h2></center>
            <br>
             <table class="table table-success table-striped">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Category Name</th>
      <th scope="col">Description</th>
      <th scope="col">Image</th>
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
        String sql="select * from tbl_add_category";
        ResultSet rs=st.executeQuery(sql);
        while(rs.next())
        {
           
      
            
                
      %>
     <tr>
 <form action="Add_Category" method="post">
      <th scope="row"><%=id++%></th>
 <input type="hidden" name="catid" value="<%=rs.getString("cid")%>">
        <th><input type="text" name="cname" value="<%=rs.getString("categoryname")%>" class="form-control"></th>
        <th><input type="text" name="cdesc" value="<%=rs.getString("description")%>" class="form-control"></th>
        <th><input type="text" name="cimage" value="<%=rs.getString("image")%>" class="form-control"></th>
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
    <div class="col-sm-2"></div>
        </div>
     </tbody>
</table>
     
    </body>
</html>
