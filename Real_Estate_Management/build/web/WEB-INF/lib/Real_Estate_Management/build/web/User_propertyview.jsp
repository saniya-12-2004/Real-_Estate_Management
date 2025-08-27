<%-- 
    Document   : User_propertyview
    Created on : 12 Feb, 2025, 12:58:12 PM
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
             
             .property
             {
                 display:inline-block;
                 margin:10px;
                 border: black;
             }
             .conatiner
             {
                 margin: 20px;
                              }
             body
             {
background-color: lavender;}            
             h2
             {
                 color: blue;
                 
                
             }
         </style>
    </head>
    <body>
       
        <div class="conatiner">
            <center><h2><b>Property View</b></h2></center>
            
            <%
             Connection cn=null;
             Statement st=null;
             
           try
            {
                     Class.forName("com.mysql.jdbc.Driver");
                     cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_realestate", "root", "root");
                     st=cn.createStatement();
                     String sql="select * from tbl_add_property where category='"+session.getAttribute("cname")+"'";
                     ResultSet rs=st.executeQuery(sql);
                     while(rs.next())
                     {
                     
                    
             %>
            <div class="property">
                 <form action="Viewpages" method="post">
            <div class="row">
                <div class="col-sm-12">
                     <img src="<%=rs.getString("property_image")%>" height="200" width="200">
                    <br>
                    <p>Property Name:<%=rs.getString("property_name")%></p>
                    <textarea class="form-control">Description:<%=rs.getString("description")%></textarea>
                    <p>Property Category:<%=rs.getString("category")%></p>
                    <p>Location:<%=rs.getString("location")%></p>
                    <p>Price:<%=rs.getString("price")%></p>
                    <p>Property Status:<%=rs.getString("pstatus")%></p>
                    <p>Property age:<%=rs.getString("age")%></p>
                    <p>Owner Name:<%=rs.getString("owner_name")%></p>
                    <p>Owner Contact:<%=rs.getString("owner_contact")%></p>
                    <textarea class="form-control">Owner Address:<%=rs.getString("owner_address")%></textarea>
                    
                    <a  href="<%=rs.getString("documentation")%>">Documentation</a>
                    <br>
                    <input type="hidden" name="pname" value="<%=rs.getString("property_name")%>">
                    <input type="hidden" name="descr" value="<%=rs.getString("description")%>">
                    <input type="hidden" name="catname" value="<%=rs.getString("category")%>">
                    <input type="hidden" name="loc" value="<%=rs.getString("location")%>">
                    <input type="hidden" name="price" value="<%=rs.getString("price")%>">
                    <input type="hidden" name="oname" value="<%=rs.getString("owner_name")%>">
                    <input type="hidden" name="ocontact" value="<%=rs.getString("owner_contact")%>">
                    <input type="hidden" name="oaddress" value="<%=rs.getString("owner_address")%>">
                    <input type="hidden" name="vpid" value="<%=rs.getString("vid")%>">
                    <input type="submit" name="btn" class="btn btn-primary form-control" value="Buy now">
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
