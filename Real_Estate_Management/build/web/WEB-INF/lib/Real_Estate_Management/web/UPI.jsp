<%-- 
    Document   : UPI
    Created on : 14 Jan, 2025, 3:27:36 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Real Estate Managemenr</title>
         <%@include file="User_Header.jsp"%>
        <style>
         .container
            {
                background-color:white;
                margin-top: 140px;
                border-radius: 20px;
                
            }
            h1
            {
                color:blue;
             
                background-image:url(Image/UPI_Png3.jpg);
                background-repeat: no-repeat;
                 background-position:70px center;
             padding-left:60px;
             margin-left:20px;
                
            }
            input[type=submit]
            {
                background-color:blue;
                color: white;
            }
             span
             {
                 color:red;
             }
             .S
             {
               background-image:url(Image/UPI7.jpg);
               background-size: cover;
               background-repeat: no-repeat;
             
               
             }
             body
             {
                 background: linear-gradient(to bottom right, #00ffff 0%, #6666ff 100%); 
                  height:1000px;
                  
             }
            
        </style>
    </head>
    <body>
         <form action="UPI" method="post">
              <div class="row">
            <div class="col-sm-3"></div>
            <div class="col-sm-6">
                    <div class="container">
                         <div class="row">
                              
                   <div class="col-sm-6 S">
                   </div>
                    <div class="col-sm-6 P">
                        <br>
                        <a style="float:right" href="Credit_Card.jsp"><span class="btn btn-danger form-control"><b>X</b></span></a>
             
              <br>
              <center><h1 style="font-family: Wide Latin">UPI</h1></center>
                 <br>
        <div class="row">
            <div class="col-sm-12">
                <label><b>UPI id</b><span>*</span></label>
                <input type="text" 

 name="uid" placeholder="Enter UPI id" class="form-control"    required="">
            </div>
        </div>
        <br>
        <div clas="row">
            <div class="col-sm-12">
                <label><b>Amount</b><span>*</span></label>
                <input type="text" name="amt" value="<%=session.getAttribute("tamount")%>" placeholder="Enter Amount" class="form-control" onkeypress="javascript:return isNumber(event)" required="">
            </div>
        </div>
        <br>
        <div class="row">     
            <div class="col-sm-12">
                <center><input type="submit" value="Payment" name="btn" class="btn btn form control"></center>
            </div>
        </div>
        <br>
        </div>
                        
        <div class="col-sm-3">
        </div>
        </div>
                </div>
            </div>
              </div>
         </form>
    </body>
    
</html>
