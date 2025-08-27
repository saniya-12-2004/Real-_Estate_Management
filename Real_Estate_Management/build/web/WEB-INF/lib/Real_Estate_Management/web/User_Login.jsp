<%-- 
    Document   : User_Login
    Created on : 2 Jan, 2025, 10:30:39 AM
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
                background-image:url(Image/login3.jpg);
                background-size: cover; 
                background-repeat: no-repeat;
                opacity: 80%;
                
            }
            .container
            {
                padding-left:150px;
                margin: 50px;
                margin-top: 150px;
            }
            input[type=submit]
            {
                background-color:orange;
                color:white;
                border-radius: 10px;
            }       
            label
            {
               color:white; 
            }
            h1
            {
                color:orange;
            }
           span
           {
               color:red;
           }
        </style>
    </head>
    <body>
       <form action="User_Login" method="post">
         <div class="row">  
             
            <div class="col-sm-6">
                <br> 
                <br>
                <br>
                <br>
                <br>
                <br>
                <br>
                <center><iframe src="Image/Logo1.jpg" width="140" height="140"></iframe><h2 style="color:white">Login To Unlock Your Dream Home</h2>
                <p style="color:white">Login now and discover your perfect haven with exclusive listings and expert guidance. </p></center>
            </div>
            <div class="col-sm-4">
                <div class="container">
                    <a style="float:right"> <span class="btn btn-danger form-control"><b>X</b></span></a>                            
                    <br>
                    <center><h1 style="font-family: Arial Black"><b>Login</b></h1></center>
                    <br>
            <div class="row">
            <div class="col-sm-12">
                <label><b>Username</b><span>*</span></label>
                <input type="email" name="uname" placeholder="Enter Email" class="form-control"  required="">
            </div>
            </div>
                    <br>
            <div class="row">
            <div class="col-sm-12">
                <label><b>Password</b><span>*</span></label>
                <input type="password" name="upass" placeholder="Enter Password" class="form-control" required="">
            </div>
            </div>
            
            <div class="row">
            <div class="col-sm-12">
                <label style="color:blue"><a href="User_Forget.jsp">Forget Password?</a></label>
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
                <center><label>Don't have an account?</label><span style="color:skyblue"><a href="User_Signup.jsp">signup now</a></span></center>
            </div>
            </div>
                </div>
            </div>
        <div class="col-sm-1">
            
        </div>
    </div>
       </form>    
    </body>
</html>
