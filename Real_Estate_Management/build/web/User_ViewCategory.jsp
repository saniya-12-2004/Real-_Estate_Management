<%-- 
    Document   : User_ViewCategory
    Created on : 11 Feb, 2025, 9:58:09 PM
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
         <%@include file="User_Header.jsp"%>
         <style>
             
             .category
             {
                 display:inline-block;
                 margin:10px;
             }
             .conatiner
             {
                 margin: 20px;
                              }
             body
             {
    background-color: #ff33cc;
    background-size: cover;
             }
                        h2
             {
                 color: black;
             }
         </style>
    </head>
    <body>
        <br>
        <div class="conatiner">
            <center><h2><b>Category View</b></h2></center>
            <br>
            <%
             Connection cn=null;
             Statement st=null;
             
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
            <div class="category">
                <form action="Viewpages" method="post">
            <div class="row">
                <div class="col-sm-12">
                    <img src="<%=rs.getString("image")%>" height="200" width="200">
                    <br>
                    <p>Category Name:<%=rs.getString("categoryname")%></p>
                   
                    <p>Description:<%=rs.getString("description")%></p>
                    <input type="hidden" name="cname" value="<%=rs.getString("categoryname")%>">
                    <input type="submit" name="btn" class="btn btn-primary form control" value="View">
                </div>
            </div>
                </form>
            </div>
                    <% 
                    
                     }
            }catch(Exception ex)
            {
                 out.println(ex.toString());
            }
                    %>
        </div>
    </body>
</html>
