<%-- 
    Document   : Admin_Header
    Created on : 27 Dec, 2024, 2:48:26 PM
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
        <nav class="navbar navbar-expand-lg bg-primary">

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
        <li class="nav-item">
          <a class="nav-link" href="Add_Category.jsp">Add Category</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href=" Admin_Bookinglist.jsp">Bookinglist</a>
        </li>
        <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        List
            </a>
            <ul class="dropdown-menu">
                <li><a class="dropdown-item" href="Admin_Categorylist.jsp">Categorylist</a></li>
                <li><a class="dropdown-item" href="Admin_Propertylist.jsp">Propertylist</a></li>
                 <li><a class="dropdown-item" href="Complaintlist.jsp">Complaintlist</a></li>
                  <li><a class="dropdown-item" href="Feedbacklist.jsp">Feedbacklist</a></li>
                
            </ul>
        </li>
               
      </ul>
      <form class="d-flex" role="search">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
         <a href="index.html" class="btn btn-danger" type="submit">Logout</a>
      </form>
    </div>
  </div>
</nav>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>

    </body>
</html>
