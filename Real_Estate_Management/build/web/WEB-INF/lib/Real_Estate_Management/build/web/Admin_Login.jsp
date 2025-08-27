<%-- 
    Document   : Admin_Login
    Created on : 2 Jan, 2025, 12:31:28 AM
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
                background-image:url(Image/Login1.jpg);
                background-size: cover;
                background-repeat: no-repeat;
                padding: 60px;
                opacity: 80%;
            }
            .container
            {
                padding:20px;
                margin: 50px;
                margin-top: 100px;
                background-color: grey;
                border-radius: 30px;
                opacity:80%;
                
                
            }
            input[type=submit]
            {
                background-color:black;
                color:white;
            
            }       
            label
            {
               color:black; 
            }
            h1
            {
                color:white;
            }
            span
            {
                color:red;
            }
           
        </style>
    </head>
    <body>
      
    
    <form action="Login" method="post">
    <div class="row">         
            <div class="col-sm-3">
                
            </div>
            <div class="col-sm-6">
                <div class="container">
                    <a style="float:right"> <span class="btn btn-danger form-control"><b>X</b></span></a>                            
                    <br>
                    <center><h1 style="font-family: Arial Black"><b>Login</b></h1></center>
                    <br>
            <div class="row">
            <div class="col-sm-12">
                <label><b>Username</b><span>*</span></label>
                <input type="text" name="uname" placeholder="Enter Email" class="form-control" onkeypress="javascript:return isAlphanumeric(event)" required="">
            </div>
            </div>
                    <br>
           
            <div class="row">
            <div class="col-sm-12">
                <label><b>Password</b><span>*</span></label>
                <input type="password" name="pwd" placeholder="Enter Password" class="form-control"  required="">
            </div>
            </div>
            
            <div class="row">
            <div class="col-sm-12">
                 <label style="color:skyblue"><a href="Forget.jsp">Forget Password?</a></label>
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
                <center><label>Don't have an account?</label><span style="color:skyblue"><a href="Admin_Signup.jsp">signup now</a></span></center>
            </div>
            </div>
                </div>
            </div>
        <div class="col-sm-3">
            
        </div>
    </div>
    </form>
    </body>
</html>
