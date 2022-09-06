<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
 
  
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
    
        <div class="container">
<nav class="navbar navbar-expand-sm navbar-dark bg-dark">
  
   <!-- <img src="/src/main/webapp/pages/cart1.png" alt="Logo" style="width:40px;" class="rounded-pill"> -->
    <div class="collapse navbar-collapse" id="mynavbar">
      <ul class="navbar-nav me-auto">
        <li class="nav-item">
         <h1> <a class="nav-link" href="#">Home</a></h1>
        </li>
      </ul>
      <!--<ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" href="#">Log Out</a>
      </li>
      </ul>-->
    </div>
    </nav>
  </div>
<div class="container">

  <form action="deletevalidate" method="post" >
    <div class="form-group">
      <label for="username">username</label>
      <input type="text" class="form-control" id="id" placeholder="Enter id" name="id">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pwd">
    </div>
    
    <!-- <div class="checkbox">
      <label><input type="checkbox" name="remember"> Remember me</label>
    </div> -->
    <input type="submit" class="btn btn-primary" value="Delete Account">
  </form>
</div>

</body>
</html>