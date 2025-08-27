<%-- 
    Document   : User_Header
    Created on : 27 Dec, 2024, 2:57:14 PM
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

    </head>
    <body>
       <nav class="navbar navbar-expand-lg" style="background-color:skyblue">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Real Estate Management</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="index.html">Home</a>
        </li>
        <li>
            <a class="nav-link" href="User_ViewCategory.jsp">View Category</a>
        </li>
         <li>
            <a class="nav-link" href="User_propertyview.jsp">View Property</a>
        </li>
         <li>
            <a class="nav-link" href="Booking.jsp">Booking</a>
        </li>
        
         <li>
            <a class="nav-link" href="UPI.jsp">upi</a>
        </li>
         <li>
            <a class="nav-link" href="Credit_Card.jsp">Credit card</a>
        </li>
        <li>
          <a class="nav-link" href="Complaint.jsp">Complaint</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="Feedback.jsp">Feedback</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="mybookinglist.jsp">Mybooking</a>
        </li>
        

        
        
      </ul>
      <form class="d-flex" role="search">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <a href="index.html" class="btn btn-danger" type="submit">Logout</a>
      </form>
    </div>
  </div>
</nav>
    </body>
</html>
