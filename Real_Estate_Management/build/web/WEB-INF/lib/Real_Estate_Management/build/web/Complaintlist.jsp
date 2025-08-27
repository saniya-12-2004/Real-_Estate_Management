<%-- 
    Document   : Complaintlist
    Created on : 27 Jan, 2025, 3:48:32 PM
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
            
            <center><h2><b>Complaint List</b></h2></center>
            <br>
             <table class="table">
                 
    <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Name</th>
      <th scope="col">Subject</th>
      <th scope="col">Description</th>
      <th scope="col">Date</th>
      
      

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
        String sql="select * from tbl_complaint";
        ResultSet rs=st.executeQuery(sql);
        while(rs.next())
        {
           
      
            
                
      %>
     <tr>
         <form action="Add_Property" method="post">
      <th scope="row"><%=id++%></th>
      <input type="hidden" name="compid" value="<%=rs.getString("complaint_id")%>">
      <td><%=rs.getString("name")%></td>
      <td><%=rs.getString("sub")%></td>
      <td><%=rs.getString("description")%></td>
      <td><%=rs.getString("complaint_date")%></td>
      

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
    </body>
</html>
