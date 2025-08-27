<%-- 
    Document   : Admin_Propertylist
    Created on : 27 Jan, 2025, 12:02:01 PM
    Author     : DELL
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Real Estate Management</title>
         <%@include file="Admin_Header.jsp"%>
           <style>
  body
     {
         background-color: skyblue;
     }
     .conatiner
     {
         margin: 20px;
         margin-top: 10px;
     }
        
</style> 

    </head>
    <body>
      <div class="row">
         
        <div class="col-sm-12">
        <div class="conatiner"><br><br>
            
            <center><h2><b>Property List</b></h2></center>
            <br>
             <table class="table table-success table-striped">
                 
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
        String sql="select * from tbl_add_property";
        ResultSet rs=st.executeQuery(sql);
        while(rs.next())
        {
           
      
            
                
      %>
     <tr>
      <th scope="row"><%=id++%></th>
      <td><%=rs.getString("property_name")%></td>
       <td><%=rs.getString("property_image")%></td>
      <td><%=rs.getString("description")%></td>
      <td><%=rs.getString("category")%></td>
      <td><%=rs.getString("location")%></td>
      <td><%=rs.getString("price")%></td>
      <td><%=rs.getString("pstatus")%></td>
      <td><%=rs.getString("age")%></td>
      <td><%=rs.getString("owner_name")%></td>
      <td><%=rs.getString("owner_contact")%></td>
      <td><%=rs.getString("owner_address")%></td>
      <td><%=rs.getString("documentation")%></td>
      

      
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
    
        </div>
     </tbody>
    </body>
</html>
