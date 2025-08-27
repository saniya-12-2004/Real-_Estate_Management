<%-- 
    Document   : Booking
    Created on : 29 Dec, 2024, 8:37:43 PM
    Author     : DELL
--%>

<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Real Estate Management</title>
        <%@include file="User_Header.jsp"%>
        <style>
             body
             
             {
                background-image: url(Image/booking.jpg);
                 opacity: 0.8;
                 background-size: cover;
             }
                      
             .container
             {
                
                 margin-top: 10px;
                 padding: 10px;
                 padding: 20px;
             }
             h1
             {
                  font-family: Algerian;
                  color:black;
                  font-family: Bookman Old Style;
                  size:A5;
             }
            
             .S
             {
                 background-image: url(Image/Property.jpg);
                 background-size: cover;
    
                 border-top-left-radius:10px;
                 border-bottom-left-right:10px;
                 
             }
             .B
             {
                 background-color:grey;
                 padding: 15px;
                  border-top-right-radius:10px;
                 border--bottom-right-radius:10px;
            
             }
             label
             {
                 color:white;
             }
             input[type=submit]
             {
                 background-color:black;
                 size:10px;
                 color:white;
             }
             span
             {
                 color:red;
             }
        </style>
    </head>
    <body>
        <form action="Booking" method="post">
       <div class="row">
           
            <div class="col-sm-3"></div>
            <div class="col-sm-6">
                <div class="container">
                                                 <center><h1><b>Booking</b></h1></center>

                     
                    <div class="row">
                        <div class="col-sm-6 S">
                            </div>
                        <div class="col-sm-6 B" >
                            <a style="float:right" href="User_propertyview.jsp"> <span class="btn btn-danger form-control"><b>X</b></span></a>                            
                             <br>
                             <br>
             <div class="row">
            
  
                    
                    
                    <div class="col-sm-12">
                <label><b>Property Name</b><span>*</span></label>
                <input type="text" name="pname" value="<%=session.getAttribute("pname")%>" placeholder="Enter Property Name" class="form-control"  onkeypress="javascript:return isString(event)" required="">
            </div>
             </div>
                            <br>
              <div class="row">
                    <div class="col-sm-6">
                <label><b>Description</b><span>*</span></label>
                  <textarea name="pdesc"  class="form-control" placeholder="Enter Description" onkeypress="javascript:return isAlphanumeric(event)" required=""><%=session.getAttribute("descr")%></textarea>
            </div>
         
           
                 <div class="col-sm-6">
                <label><b>Category</b><span>*</span></label>
 
                <input type="text" class="form-control" name="b_cat" value="<%=session.getAttribute("catname")%>">
                                    </div>
              </div
              <br><br>
              <div class="row">
             <div class="col-sm-6">
                 <label><b>Location</b><span>*</span></label>
                 <input type="text" value="<%=session.getAttribute("loc")%>" name="p_loc" class="form-control"  placeholder="Enter Location" onkeypress="javascript:return isString(event)" required="">
             </div>
            <div class="col-sm-6">
                <label><b>Price</b><span>*</span></label>
                <input type="text" value="<%=session.getAttribute("price")%>" name="p_price" class="form-control" placeholder="Enter Price"  pattern="[0-9]+(\.[0-9]{1,2})?$"  required="">
            </div>
            </div>
            <br>
            <label><b>Owner Details</b></label>
        <br>
           <div class="row">
                <div class="col-sm-6">  
                     <label>Name<span>*</span></label>
                     <input type="text" value="<%=session.getAttribute("oname")%>" name="owner_name" class="form-control"  placeholder="Enter Name" onkeypress="javascript:return isString(event)" required=""> 
                     </div>
                <div class="col-sm-6">
                     <label>Contact No.<span>*</span></label>
                     <input type="text" name="owner_contact" value="<%=session.getAttribute("ocontact")%>" minlength="10"maxlength="10" class="form-control" pattern="[7-9]{1}[0-9]{9}" 
       title="Phone number with 7-9 and remaing 9 digit with 0-9"  placeholder="Enter Number" onkeypress="javascript:return isContactno(event)" required=""> 
                </div></div>
        <br>
        <div class="row">
             <%
             SimpleDateFormat date=new SimpleDateFormat("yyyy-MM-dd");
             Date date1=new Date();
             String date2=date.format(date1);
            %>
                <div class="col-sm-6">
                <label>Address<span>*</span></label>
                <textarea name="owner_address"  class="form-control" placeholder="Enter Address"  required=""><%=session.getAttribute("oaddress")%></textarea>
      
            </div>
            <div class="col-sm-6">
                 <label>Booking Date<span>*</span></label>
                 <input type="date" max="<%=date2%>" min="<%=date2%>" name="b_date" class="form-control"  placeholder="" required="">
            </div>
            </div>
        <br>
        <div class="row">
                       
                           <div class="col-sm-12">
                               <label><b>Documentation</b><span>*</span></label>
                               <input type="file" name="doc" class="form-control"  placeholder=" " required=""> 
                       </div>
            </div>
        <br>
        <div class="row">
                    
            <div class="col-sm-12">
             <center><input type="Submit" value="Booknow" name="btn" class="btn btn-light form control "></center>
            </div>
            </div>
        
        </div>
                    </div>
                </div>
            </div>
                
        <div class="col-sm-3"></div>
            </div>
        </form>
    </body>
</html>
