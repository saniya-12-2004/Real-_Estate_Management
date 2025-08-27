<%-- 
    Document   : User_Signup
    Created on : 2 Jan, 2025, 10:29:57 AM
    Author     : DELL
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
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
                background-image:url(Image/signup3.jpg);
                background-size: cover;
                background-repeat: no repeat;
            }
            .container
            {
                padding:20px;
                margin:50px;
            }
            input[type=submit]
            {
                background-color:orange;
                color:white;
            
            }   
              
                       
            label
            {
               color:brown; 
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
         <script>
var check = function() {
  if (document.getElementById('password').value ==
    document.getElementById('confirm_password').value) {
    document.getElementById('message').style.color = 'white';
    document.getElementById('message').innerHTML = 'Password Matching';
  } else {
    document.getElementById('message').style.color = 'white';
    document.getElementById('message').innerHTML = 'Password not matching';
  }
}        </script>
    </head>
    <body>
        <form action="User_Signup" method="post">
          <div class="row">         
            <div class="col-sm-6">
                <br> 
                <br>
                <br>
                <br>
                <br>
                <center><iframe src="Image/logo2.jpg" width="140" height="140"></iframe><br><h2 style="color:white"><b>Welcome To Our Real Estate World</b></h2>
                    <p style="color:white">"Explore,discover,and own your dream home with us"</p>
                    <p style="color:white" font-family="Algerian">Join us today and discover a world of possibilities.</p></center>
            </div>
            <div class="col-sm-4">
                <div class="container">
                    <a style="float:right"> <span class="btn btn-danger form-control"><b>X</b></span></a>                            
                    <br>
                    <center><h1 style="font-family: Arial Black"><b>Sign Up</b></h1></center>
                    <br>
          
            
            <div class="row">
            <div class="col-sm-12">
                <label><b>User Name</b><span>*</span></label>
                <input type="text" name="uname"  placeholder="Enter Name" class="form-control" onkeypress="javascript:return isString(event)" required="">
            </div>
            </div>
            <br>
            <div class="row">
            <div class="col-sm-6">
                <label><b>Email</b><span>*</span></label>
                <input type="email" name="umail" placeholder="Enter Email" class="form-control" required="">
            </div>
            <div class="col-sm-6">
                <label><b>Gender</b><span>*</span></label>
                <br>
                <input type="radio"  name="gender" value="Male" class="form control">Male 
                 <input type="radio" name="gender" value="Female" class="form control">Female
                  <input type="radio" name="gender" value="Others" class="form control">Others
            </div>
            </div>
            <br>
            <div class="row">
            <div class="col-sm-6">
                <label><b>Password</b><span>*</span></label>
  <input type="password" name="vpass" placeholder="Enter Password" id="password" onkeyup="check()" class="form-control"  required="">                </span>
                </span>
            </div>
            <div class="col-sm-6">
                <label><b>Conform Password</b><span>*</span></label>
<input type="password" name="vcpass" placeholder="Conform Password" id="confirm_password" onkeyup="check()" class="form-control" required="">
                <span id="message"></span>                
            </div>
            </div>
            <br>
     
            
            <div class="row">
            <div class="col-sm-6">
                <label><b>City</b><span>*</span></label>
                <input type="text" name="ucity" placeholder="Enter City" class="form-control" onkeypress="javascript:return isString(event)" required="">
            </div>
            
            
          
            <div class="col-sm-6">
                <label><b>Address</b><span>*</span></label>
<textarea name="uadd" class="form-control" placeholder="Enter Address"  required=""></textarea>
            </div>
            </div>
            <br>
            <div class="row">
            <div class="col-sm-12">
                <label><b>Contact No.</b><span>*</span></label>
<input type="text" name="ucontact" minlength="10"maxlength="10" class="form-control" pattern="[7-9]{1}[0-9]{9}" 
       title="Phone number with 7-9 and remaing 9 digit with 0-9"  placeholder="Enter Number" onkeypress="javascript:return isContactno(event)" required=""> 
            </div>
            </div>
            <br>
            <div class="row">
            <div class="col-sm-12">
                <input type="submit"  name="btn" value="Sign Up" class="form control">

                   
            </div>
            </div>
        
        </div>
    </div>
            <div class="col-sm-2"></div>
        </div>
        </form>
  
    </body>
</html>
