<%-- 
    Document   : Payment
    Created on : 14 Jan, 2025, 2:32:48 PM
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
            
            body
            {
               background-image:url(Image/Payment.jpg);
               background-repeat: no-repeat;
               background-size: cover;
               opacity:0.7;
            }    
            
            .container
            {
                background-color:white;
                margin-top: 100px;
                border-radius: 20px;
               
            }
            h1
            {
                color:blue;
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
        </style>
     
    </head>
    <body>
        <form action="Payment" method="post">
            <div class="row">
        <div class="col-sm-3"></div>
            <div class="col-sm-6">
        <div class="container">
            <br>
            <a style="float:right" href="Booking.jsp"> <span class="btn btn-danger form-control"><b>X</b></span></a>
                 
                 <br>
                 <br>
                 <center> <h1 style="font-family: Wide Latin">Payment</h1></center>
                 <br>
         <div class="row">
             
            <div class="col-sm-12">
                <input type="radio" name="pay" value="UPI"><b>UPI</b>
                <br>
                <br>
                <input type="radio" name="pay" value="credit card"><b>Credit Card</b>
                <br>
                <br>
                <input type="radio" name="pay" value="cash on delivery"><b>Cash On Delivery</b>
            
                <br>
                <br>
            </div>
        </div>
                 <br>
                  <div class="row"> 
                      <div class="col-sm-3"></div>    
            <div class="col-sm-5">
                <center><input type="submit" value="Payment" name="btn" class="btn btn form-control"></center>
            </div>
                  <div class="col-sm-4"></div>      
        </div>
                 <br>
            </div>
        </div>
            <div class="col-sm-3"</div>
        </div>
    </form>
        
    </body>
</html>
