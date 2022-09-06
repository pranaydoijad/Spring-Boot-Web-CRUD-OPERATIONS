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
  <script>
      
	function verifyPassword() {
		//alert("hello");
		var pw1 = document.getElementById("pwd").value;
		var pw2 = document.getElementById("cpwd").value;
		//alert("hello2");

		//check empty password field  
		if (pw1 == "" || pw2 == "") {
			document.getElementById("message").innerHTML = "**Fill the password please!";
			return false;
		}
		if (pw1 != pw2) {
			document.getElementById("message").innerHTML = "**password does not match";
			return false;
		}
		
	}
</script>
   <style>
.flex-container {
  display: flex;
  background-color: pink;
    padding: 10px 0px 10px 0px ;
    margin: 10px;
    
}

.flex-container > div {
  background-color: #f1f1f1;
  margin: 10px 50px 0px 50px;
  padding: 10px 10px 10px 10px ;
  font-size: 20px;
}
</style> 
    
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
  <div class="jumbotron">
    <h1>Twitter</h1>
  </div>  
</div>
<div class="container">
<div class="flex-container-md-6">

    <div class="md-6">  
		<form action="validate2" method="post" onsubmit="return verifyPassword()">
		<div class="col-xs-4">
  <label for="usr">Name:</label><br>
  <input type="text" class="form-control" id="id" name="id"><br>

  <label for="pwd">Password:</label><br>
  <input type="password" class="form-control" id="pwd" name="pwd"><br>

  <label for="pwd">Confirm Password:</label><br>
  <input type="password" class="form-control" id="cpwd"><br>
     <span id="message" style="color: red">
				</span> <br>
			
    		
			<input type="submit" class="btn btn-primary" value="Register">
            </div>
		</form>
	
    </div> 
  
<div class="md-6"> 
  <form action="loginvalidate" method="post" >
<div class="col-xs-4">
  <label for="usr">Name:</label><br>
  <input type="text" class="form-control" id="usr"  name="id"><br>

  <label for="pwd">Password:</label><br>
  <input type="password" class="form-control" id="pwd"  name="pwd"><br>

      <!-- Simple link -->
      <a href="updatepass">Change Password?</a><br><br>
   
  <!-- Submit button -->
  <button type="button" class="btn btn-primary">Sign in</button>

      </div>
</form>
</div>
</div>
  </div> 




</body>
</html>