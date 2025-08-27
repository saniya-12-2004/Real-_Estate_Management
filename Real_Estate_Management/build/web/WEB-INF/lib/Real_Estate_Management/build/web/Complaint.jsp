<%-- 
    Document   : Complaint
    Created on : 30 Dec, 2024, 1:07:26 PM
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
                       .S
                       {
              background-size: cover;
                          background-image: url(Image/Complaint.jpg);
                          border-bottom-left-radius:10px;
                          border-top-left-radius:10px;
                          
                      }
                      
                        body
                      {
                              background-color:skyblue;
                             
                      }
                      .B 
                      {
                          border-bottom-right-radius:10px;
                          border-top-right-radius:10px;
                          

                          

                            background-color: white;    
                      } 
                      input[type=submit]
                      {
                          background-color:navy;
                          color:white;
                      }
                      .conatiner
                      {
                          margin-top:30px;

                      }
                      h1
                      {
                          font-family: Algerian;
                      }
                      span
             {
                 color:red;
             }

        </style>
  
    </head>
    <body>
        <form action="Complaint" method="post">
         <div class="row">
            <div class="col-sm-3"></div>
            <div class="col-sm-6">
        <div class="container">
            <br>
            <center><h1 style="color:navy" ><b>Complaint</b></h1></center>
        <br>
        <div class="row">
            <div class="col-sm-6 S">
                            </div>
            
            <div class="col-sm-6 B">
                <br>
                <a style="float:right" href="User_Header.jsp"> <span class="btn btn-danger form-control"><b>X</b></span></a>
                
                  <br>
                  <br>

                <div class="row">
            <div class="col-sm-12">
                <label><b>Name</b><span>*</span></label>
                <input type="text" name="uname" placeholder="Enter Name" class="form-control" onkeypress="javascript:return isString(event)" required="">
            </div>
        </div>
        <br>
        <div class="row">
            <div class="col-sm-12">
                <label><b>Subject</b><span>*</span></label>
                <input type="text" name="c_subject" placeholder="Enter Subject" class="form-control" onkeypress="javascript:return isString(event)" required="">
            </div>
        </div>
        <br>
            <div class="row">
            <div class="col-sm-12">
                <label><b>Description</b><span>*</span></label>
                <textarea name="c_desc" class="form-control" placeholder="Enter Description" onkeypress="javascript:return isAlphanumeric(event)" required=""></textarea>
            </div>
        </div>
        <br>
        <div class="row">
            <%
             SimpleDateFormat date=new SimpleDateFormat("yyyy-MM-dd");
             Date date1=new Date();
             String date2=date.format(date1);
            %>
             <div class="col-sm-12">
                 <label><b>Date</b><span>*</span></label>
                 <input type="date" max="<%=date2%>" min="<%=date2%>" name="c_date" class="form-control"  placeholder="" required="">
             </div>
        </div>
        <br>
        <div class="row">
                     <div class="col-sm-12">
             <center><input type="Submit" value="Complaint" name="btn" class="btn btn form control "></center>
            </div>
            </div>
        <br>
        </div>
            </div>
        </div>
            </div>
            <div class="col-sm-3"></div>
            </div>
        </form> 
    </body>
</html>
