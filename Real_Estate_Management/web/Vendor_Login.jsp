<%-- 
    Document   : Vendor_Login
    Created on : 2 Jan, 2025, 3:14:31 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Real Estate Management</title>
                <link rel="stylesheet" href="bootstrap.min.css">
                 <script src="validation.js"></script>
        <style>
        body
            {
                background-image:url(Image/login2.jpg);
                background-size: cover;
                background-repeat: no-repeat;
                padding: 60px;
                opacity: 60%;
            }
            .container
            {
                padding:20px;
                margin: 30px;
                margin-top: 100px;
                border:solid 3px black;
                border-radius: 50px;
                background-color: white;
                
                
            }
            input[type=submit]
            {
                background-color:navy;
                color:white;
            
            }       
            label
            {
               color:black; 
            }
            h1
            {
                color:navy;
            }
            span
            {
                color:red;
            }
            </style>

    </head>
    <body>
        <form action="Vendor_Login" method="post">
        <div class="row">         
                

            <div class="col-sm-5">
                <div class="container">
                    <a style="float:right" href="Vendor_Header.jsp"> <span class="btn btn-danger form-control"><b>X</b></span></a>                            
                    <br>
                    <center><h1 style="font-family: Arial Black"><b>Login</b></h1></center>
                    <br>
            <div class="row">
            <div class="col-sm-12">
                <label><b>Username</b><span>*</span></label>
                <input type="email" name="vname" placeholder="Enter Email" class="form-control"   required="">
            </div>
            </div>
                    <br>
            <div class="row">
            <div class="col-sm-12">
                <label><b>Password</b><span>*</span></label>
                <input type="password" name="vpwd" placeholder="Enter password" class="form-control"  required="" >
                          </div>
                </div>
      
            
            <div class="row">
            <div class="col-sm-12">
                 <label style="color:skyblue"><a href="Vendor_Forget.jsp">Forget Password?</a></label>
            </div>
            </div>
            <br>
            <div class="row">
            <div class="col-sm-4">
            </div>
                <div class="col-sm-4">
                <center><input type="submit"  name="btn" value="Login" class="form-control"></center>
            </div>
            </div>
            <div class="row">
            <div class="col-sm-12">
                <center><label>Don't have an account?</label><span style="color:skyblue"><a href="Vendor_Signup.jsp">signup now</a></span></center>
            </div>
            </div>
                </div>
            </div>
        <div class="col-sm-7">
            
        </div>
    </div>
        </form>
    </body>
</html>
