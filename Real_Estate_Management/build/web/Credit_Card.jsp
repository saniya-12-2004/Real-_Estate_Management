<%-- 
    Document   : Payment
    Created on : 29 Dec, 2024, 11:34:52 PM
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
       
 background: linear-gradient(to bottom right, #ff99ff 0%, #66ffff 100%);
         height:1000px;
                  
            
              
            }    
            
            .container
            {
                background-color:white;
                margin-top: 50px;
                border-radius: 20px;
               
            }
           
            
           
                 h1
            {
                color:blue;
             
                background-image:url(Image/credit_logo1.jpg);
                background-repeat: no-repeat;
                 background-position:40px center;
             padding-left:50px;
            
                
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
               background-image:url(Image/creditc.jpg);
               background-size: cover;
               background-repeat: no-repeat;
            
             }
        </style>
    </head>
    <body>
        <form action="Credit_Card" method="post">
        <div class="row">
            <div class="col-sm-3"></div>
            <div class="col-sm-6">
                <div class="container">
                <div class="row">
                   <div class="col-sm-6 S">
                   </div>
                    <div class="col-sm-6 P">
                        <br>
                        <a style="float:right" href="Payment.jsp"> <span class="btn btn-danger form-control"><b>X</b></span></a>
                 
                 <br>
                 <br>
                 <center> <h1 ><b>Credit Card</b></h1></center>
                 <br>
        <div class="row">
            <div class="col-sm-12">
                <label><b>Card No</b><span>*</span></label>
                <input type="text" minlength="16" maxlength="16" name="cno" placeholder="Enter number" class="form-control" onkeypress="javascript:return isNumber(event)" required="">
            </div>
        </div>
        <br>
        <div clas="row">
            <div class="col-sm-12">
                <label><b>Cardholder Name</b><span>*</span></label>
                <input type="text" name="ca_name" placeholder="Enter Name" class="form-control" onkeypress="javascript:return isString(event)" required="">
            </div>
        </div>
        <br>
        <div clas="row">
            <div class="col-sm-12">
                <label><b>Card Expiry Date</b><span>*</span></label>
                <input type="date" name="ca_date" class="form-control" required="">
            </div>
        </div>
        <br>
        <div clas="row">
            <div class="col-sm-12">
                <label><b>CVV</b><span>*</span></label>
                <input type="text" name="cvv" placeholder="Enter CVV" maxlength="3" minlength="3" class="form-control" onkeypress="javascript:return isNumber(event)" required="">
            </div>
        </div>
        <br>
        <div clas="row">
            <div class="col-sm-12">
                <label><b>Amount</b><span>*</span></label>
                <input type="text" value="<%=session.getAttribute("tamount")%>" name="amt" placeholder="Enter Amount" class="form-control"  onkeypress="return isFloat(event)"   required="">
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
                    </div>
                </div>
        </div></div>
            <div class="col-sm-3"></div>
        </div>
    </form>
    </body>
</html>
