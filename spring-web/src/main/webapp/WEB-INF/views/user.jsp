<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>user info</title>

<style>
        body {
            background-image: url('<c:url value="/resources/images/bg.webp"/>');
            background-size: cover; /* Ensures the image covers the entire page */
            background-repeat: no-repeat; /* Prevents tiling */
            background-position: center center; /* Centers the image */
            background-attachment: fixed; /* Optional: keeps the image fixed on scroll */
            margin: 0;
            padding: 0;
        }
    </style>

</head>
<body>
	<div align="center">
	<h1>Welcome to ${user} User page</h1>
	<p>Page served on ${d}</p>
	
	<a href="spring">click here for one more view</a>
	</div>

</body>
</html>