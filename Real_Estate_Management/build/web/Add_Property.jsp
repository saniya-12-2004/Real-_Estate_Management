<%-- 
    Document   : Add_Property
    Created on : 27 Dec, 2024, 4:30:19 PM
    Author     : DELL
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
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
                background-image: url(Image/Property.jpg);
               background-size: cover;
                opacity:0.8;
             
            }
            .container
            {
                background-color: white;
                padding:20px;
                background-color:white;
                border-radius:20px;
                margin:10px;
                
            }
            input[type=submit],[type=reset]
             {
                 color:white;
            }
            h1
            {
                font-family:Britannic Bold;
            }
            span
            {
                color:red;
            }
            </style>
    </head>
    <body>
        <form action="Add_Property" method="Post">
        <div class="row">
            <div class="col-sm-3"></div>
            <div class="col-sm-6">
        <div class="container">
            <a style="float:right" href="Vendor_Header.jsp"> <span class="btn btn-danger form-control"><b>X</b></span></a>
            <br>
            <center><h1 style="color:brown"><b>Add Property</b></h1></center>
        <br>
        <div class="row">
            
            <div class="col-sm-6">
                <label><b>Property Name</b><span style="color:red">*</span></label>
                <input type="text" name="pname" placeholder="Enter Property" class="form-control"  onkeypress="javascript: return isString(event)" required="">
            </div>
             <div class="col-sm-6">
                <label><b>Property Image</b><span style="color:red">*</span></label>
                <input type="file" name="pimage" class="form-control" required="">
            </div>
        </div>
        <br>
       
        <div class="row">
            <div class="col-sm-4">
                <label><b>Description</b><span style="color:red">*</span></label>
                <textarea name="pdesc" class="form-control" placeholder="Enter Description"  onkeypress="javascript:return isAlphanumeric(event)" required=""></textarea>
            </div>
            <div class="col-sm-4">
                <label><b>Property Category</b><span style="color:red">*</span></label>
                <select class="form-control" name="p_cat">
                    <option>Select</option>
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
                     <option><%=rs.getString("categoryname")%></option>
                     <%
        }
      }catch(Exception ex)
     {
            out.println(ex.toString());
     }
    

    
    
    %>
                      
                </select>
            </div>
             <div class="col-sm-4">
                <label><b>Property Age</b><span style="color:red">*</span></label>
                <input type="number" name="age" class="form-control" placeholder="Enter Property Age"  onkeypress="javascript:return isNumber(event)" required="">
            </div>
        </div>
        <br>
        <div class="row">
             <div class="col-sm-4">
                 <label><b>Location</b><span style="color:red">*</span></label>
                <input type="text" name="p_loc" class="form-control"  placeholder="Enter Location"  onkeypress="javascript:return isString(event)" required="">
             </div>
            <div class="col-sm-4">
                <label><b>Price</b><span style="color:red">*</span></label>
                <input type="number" name="price" class="form-control" placeholder="Enter Price" onkeypress="function isFloat(event)" required="" >
            </div>
            <div class="col-sm-4">
                <label><b>Property Status</b><span style="color:red">*</span></label>
                <input type="text" name="p_status" class="form-control" placeholder="Enter Status"  onkeypress="javascript:return isString(event)" required="">
            </div>
        </div>
        <br>
        <b><label>Owner Details</label></b>
                <br>
                <div class="row">
                  <div class="col-sm-4">
                      <label>Name<span>*</span></label>
                <input type="text" name="owner_name" class="form-control" placeholder="Enter Name"  onkeypress="javascript:return isString(event)" required="">
            </div>
                <div class="col-sm-4">
                    <label>Contact Number<span>*</span></label>
                    <input type="text" name="owner_contact" class="form-control"  minlength="10" maxlength="10" pattern="[7-9]{1}[0-9]{9}" 
       title="Phone number with 7-9 and remaing 9 digit with 0-9" placeholder="Enter Contact Number" onkeypress="javascript:return isNumber(event)" required="" >
            </div>
              <div class="col-sm-4">
                  <label>Address<span>*</span></label>
                <textarea name="owner_address" class="form-control" placeholder="Enter Address"  required=""></textarea>
            </div>  
      </div>
                <br>
                <div class="row">
            <div class="col-sm-12">
                <label><b>Documentation<span>*</span></b></label>
                <input type="file" name="docu" class="form-control" placeholder="" required="">
            </div>
        </div>
        <br>
            
            
  
                     <input type="submit" value="Add Property" name="btn" class="btn btn-success">
         
              <input type="submit" value="Update" name="btn" class="btn btn-primary">
         
         
             <input type="reset" value="Delete" name="btn" class="btn btn-danger">
        
          
        

        <br>
        </div>
        </div>
            
            <div class="col-sm-3"></div>
            </div>
        </form>
    </body>
</html>
