<%-- 
    Document   : Add_Category
    Created on : 27 Dec, 2024, 3:16:57 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Real Estate Management</title>
        <%@include file="Admin_Header.jsp" %>
        <style>
            body
            {
                  background-image:url(Image/Category.jpg); 
                  background-image: cover;
                  background-repeat:no-repeat;
                  background-size: 1700px 900px;
                  margin-top:0px;
                  opacity: 90%;
                 
            }
            .container
            {
                background-color:skyblue;
                padding:15px;
                margin-top:30px;
                border-radius:10px;
                margin-top:50px;
               /* border:  solid 10px black;*/
            }
            input[type=submit]
            {
                background-color:blue;
                 color:white;
            }
            
            
           span
           {
               color:red;
           }
            
            
           
        </style>
    </head>
    <body>
        <form action="Add_Category" method="post">
        <div class="row">
            <div class="col-sm-3"></div>
            <div class="col-sm-6">
        <div class="container">
            <a style="float:right" href="Admin_Header.jsp"><span class="btn btn-danger"><b>X</b></span></a>
            <br>
            <center><h1 style="font-family:Franklin Gothic Heavy"><b>Add Category</b></h1></center>
        <br>
        
     
       
        <div clas="row">
            <div class="col-sm-12">
                <label><b>Category Name</b><span style="color:red">*</span></label>
                <input type="text" name="cname" placeholder="Enter Category" class="form-control" onkeypress="javascript:return isString(event)" reqired="">
            </div>
        </div>
        <br>
        <div clas="row">
            <div class="col-sm-12">
                <label><b>Image</b><span style="color:red">*</span></label>
                <input type="file" name="cimage" class="form-control" required="">
            </div>
        </div>
        <br>
        <div clas="row">
            <div class="col-sm-12">
                <label><b>Description</b><span style="color:red">*</span></label>
                <textarea name="cdesc" class="form-control" placeholder="Enter Description" onkeypress="javascript:return isAlphanumeric(event)" required=""></textarea>
            </div>
        </div>
        <br>
        <div class="row">     
            <div class="col-sm-12">
                <center><input type="submit" value="Add Category" name="btn" class="btn btn form control"></center>
            </div>
        </div>
            </div>
            <div class="col-sm-3"></div>
        </div>
        </form>
    </body>
</html>
