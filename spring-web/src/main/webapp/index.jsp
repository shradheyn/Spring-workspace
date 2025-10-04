<html>
<head>
<title>Spring mvc application</title> 
<style>
	body {
	font-family: Arial, sans-serif;
	margin: 20px;
	background-color: #f9f9f9;
}

.container {
	max-width: 600px;
	margin: auto;
	padding: 20px;
	background-color: #fff;
	border-radius: 8px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	text-align: center;
}

h2 {
	color: #333;
}

.custom-hr {
	border: none;
	height: 2px;
	background-color: #4CAF50;
	margin: 20px 0;
}

.spacer {
	height: 20px;
}

.button-link {
	display: inline-block;
	padding: 10px 20px;
	font-size: 16px;
	color: #fff;
	background-color: #4CAF50;
	border-radius: 5px;
	text-decoration: none;
	transition: background-color 0.3s ease;
}

.button-link:hover {
	background-color: #45a049;
}
</style>
</head>
<body>
<div class="container">
  <h2>Spring Web MVC Application</h2>
  <hr class="custom-hr">
  <div class="spacer"></div>

  <!-- Invokes Controller mapped with name 'raj' -->
  <a class="button-link" href="shradhey" role="button">Hello World</a>
  
    <!-- Invokes Controller mapped with name 'noida' -->
  <a class="button-link" href="noida" role="button">Noida page</a>
  
    <a class="button-link" href="register" role="button">user registration</a>
     <a class="button-link" href="user" role="button">user info</a>  
     <br> <br>
     <a class="button-link" href="reservation" role="button">user reservation</a>
     <a class="button-link" href="login" role="button">login</a>
     
</div>
</body>
</html>
