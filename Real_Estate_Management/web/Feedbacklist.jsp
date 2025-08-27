<%-- 
    Document   : Feedbacklist
    Created on : 27 Jan, 2025, 3:42:41 PM
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
            
            <center><h2><b>Feedback List</b></h2></center>
            <br>
           
             <table class="table">
                 
    <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Rating</th>
      <th scope="col">Comments</th>
      

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
        String sql="select * from tbl_feedback";
        ResultSet rs=st.executeQuery(sql);
        while(rs.next())
        {
           
      
            
                
      %>
     <tr>
      <th scope="row"><%=id++%></th>
      <td><%=rs.getString("rating")%></td>
      <td><%=rs.getString("comments")%></td>
     
      

      
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
