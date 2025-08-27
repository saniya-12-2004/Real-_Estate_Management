<%-- 
    Document   : Vendor_Signup
    Created on : 2 Jan, 2025, 3:13:59 PM
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
                background-image:url(Image/Signup2.jpg);
               background-size: cover;
                background-repeat: no-repeat;
               opacity:60%;
            }
            .container
            {
                padding:20px;
                margin:50px;
                border:solid 3px black;
                border-radius:50px;
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
          <script>
var check = function() {
  if (document.getElementById('password').value ==
    document.getElementById('confirm_password').value) {
    document.getElementById('message').style.color = 'black';
    document.getElementById('message').innerHTML = 'Password Matching';
  } else {
    document.getElementById('message').style.color = 'black';
    document.getElementById('message').innerHTML = 'Password not matching';
  }
}        </script>
    </head>
    <body>
        <form action="Vendor_Signup" method="post">
         <div class="row">
            <div class="col-sm-1"></div>
            <div class="col-sm-5">
                
            
                <div class="container">
                    <a style="float:right" href="Vendor_Header.jsp"> <span class="btn btn-danger form-control"><b>X</b></span></a>                            
                    <br>
                    <center><h1 style="font-family: Arial Black"><b>Sign Up</b></h1></center>
                    <br>
            <div class="row">
            
            
            
            
            <div class="col-sm-12">
                <label><b>Vendor Name</b><span>*</span></label>
                <input type="text" name="vname" placeholder="Enter Name" class="form-control" onkeypress="javascript:return isString(event)" required="">
            </div>
            </div>
            <br>
            <div class="row">
            <div class="col-sm-6">
                <label><b>Email</b><span>*</span></label>
                <input type="email" name="vmail" placeholder="Enter Email" class="form-control"  required="">
            </div>
            <div class="col-sm-6">
                <label><b>Gender</b><span>*</span></label>
                <br>
                <select class="form-control" name="gen">
                    <option>Select</option>
                    <option>Male</option>
                    <option>Female</option>
                    <option>Others</option>
                    
                </select>
                <br>  
            </div>
            </div>
            <br>
            <div class="row">
            <div class="col-sm-6">
                <label><b>Password</b><span>*</span></label>
  <input type="password" name="vpass" placeholder="Enter Password" id="password" onkeyup="check()" class="form-control"  required="">                </span>
            </div>
            <div class="col-sm-6">
                <label><b>Conform Password</b><span>*</span></label>
                <input type="password" name="vcpass" placeholder="Conform Password" id="confirm_password" onkeyup="check()" class="form-control" required="">
                <span id="message"></span>
            </div>
            </div>
            <br>
     
            <br>
            <div class="row">
            <div class="col-sm-6">
                <label><b>City</b><span>*</span></label>
                <input type="text" name="vcity" placeholder="Enter City" class="form-control" onkeypress="javascript:return isString(event)" required="">
            </div>
            
            
          
            <div class="col-sm-6">
                <label><b>Address</b><span>*</span></label>
                <textarea name="vadd" class="form-control" placeholder="Enter Address"  required=""></textarea>

            </div>
            </div>
            <br>
            <div class="row">
            <div class="col-sm-12">
                <label><b>Contact No.</b><span>*</span></label>
<input type="text" name="vcontact" minlength="10" maxlength="10" class="form-control" pattern="[7-9]{1}[0-9]{9}" 
       title="Phone number with 7-9 and remaing 9 digit with 0-9"  placeholder="Enter Number" onkeypress="javascript:return isContactno(event)" required=""> 
            </div>
            </div>
            <br>
            <div class="row">
                <div class="col-sm-4"></div>
                 <div class="col-sm-4">
                <b><input type="submit"  name="btn" value="Sign Up" class="form-control"></b>
            </div>
            </div>
        
        </div>
    
     </div>
            <div class="col-sm-6"></div>
        </div>
        </form>
    </body>
</html>
