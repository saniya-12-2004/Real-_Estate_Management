<%-- 
    Document   : Feedback
    Created on : 30 Dec, 2024, 1:46:55 PM
    Author     : DELL
--%>

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
                          background-image: url(Image/feedback1.jpg);
                          border-bottom-left-radius:10px;
                          border-top-left-radius:10px;
                          padding:20px;
                          margin-top:20px;

                      }
                      
                        body
                      {
                              background-color:skyblue;
                              background-image: url(Image/feedback2.jpg);
                              background-size: cover;
                            

                      }
                      .B 
                      {
                          border-bottom-right-radius:10px;
                          border-top-right-radius:10px;
                       
                            padding:20px;
                          
margin-top:20px;

                            background-color:white;    
                      } 
                      input[type=submit]
                      {
                          background-color:green;
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
        <form action="Feedback" method="post">
<div class="row">
            <div class="col-sm-3"></div>
            <div class="col-sm-6">
        <div class="container">
            <br>
            <br>
            <br>
            <center><h1 style="color:white" ><b>Feedback</b></h1></center>
       
        <div class="row">
            <div class="col-sm-6 B">
                <a style="float:right" href="User_Header.jsp"> <span class="btn btn-danger form-control"><b>X</b></span></a>
                <br>
                <br>
                <div class="row">
            <div class="col-sm-12">
                <label ><b>Rating</b><span>*</span></label>
                <select class="form-control" name="rating">
                    <option>Select</option>
                     <option>Excellent</option>
                      <option>Good</option>
                       <option>Average</option>
                        <option>Poor</option>
                </select>
            </div>
        </div>
        <br>
       
        <div class="row">
            <div class="col-sm-12">
                <label><b>Comments</b><span>*</span></label>
                <input type="text" name="comment" placeholder="Enter Commments" class="form-control" onkeypress="javascript:return isString(event)">
            </div>
        </div> 
        <br>
        <br>
        <div class="row">
                     <div class="col-sm-12">
             <input type="Submit" value="Send Feedback" name="btn" class="btn btn form control ">
            </div>
            </div>
        
                
            </div>
            <div class="col-sm-6 S">
                
            </div>
        </div>
        </div>
            </div>
            <div class="col-sm-3"></div>
            </div>
        </form>
            </body>
</html>
