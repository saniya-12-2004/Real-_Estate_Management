<%-- 
    Document   : Forget
    Created on : 21 Feb, 2025, 10:34:57 PM
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
          
            .container
            {
                padding:20px;
                margin:50px;
            }
           
            body
            {
                background-color: skyblue;
            }
                       
            
             
                
            
            h1
            {
                color:orange;
            }
           
           
        </style>
    </head>
    <body>
       
         <div class="row">
            <div class="col-sm-3"></div>
            <div class="col-sm-6">
        <div class="container">
    <h1>Forget Password</h1>
    <form action="Forget_Password" method="post">
        <div class="row">
            <div class="col-sm-12">
        <label>Username:</label>
         <input type="email" name="username"  placeholder="Enter email" class="form-control"  required="">
            </div>
        </div>
        
        <br>
         <div class="row">
            <div class="col-sm-12">
        <label>New Password:</label>
        <input type="password" name="newPassword" placeholder="Conform Password" class="form-control" required="">
            </div>
         </div>
        <br>
         <div class="row">
            <div class="col-sm-12">
         <label>Confirm Password:</label>
        <input type="password" name="conPassword" placeholder="Conform Password" class="form-control" required="">
            </div>
         </div>
        <br>
         <div class="row">
            <div class="col-sm-12">
        <input type="submit"  name="btn"  value="Change Password" class="btn btn-primary form control">
            </div>
         </div>
    </form>
        </div>
            </div>
         </div>
    </body>
</html>

