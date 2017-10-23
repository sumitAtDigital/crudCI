<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add film</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<h1 style="text-align: center;">Welcome to SpringBoot MVC - Mysql</h1><br>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
  
    <ul class="nav navbar-nav">
  <li><a href="/"><span class="glyphicon glyphicon-home"></span> Home</a></li>
  <li><a href="/index">
      <span class="glyphicon glyphicon-list"></span> List
</a></li>
  <li><a href="/new">
      <span class="glyphicon glyphicon-plus"></span> ADD Film 
</a></li>
    </ul>
     <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>
<div class="container">
<form action="/new" method="post"> 
 <table class="table table-hover">
        <tr><th>Film ID</th><td><input type="text"  name="filmid"></td></tr>
       <tr><th>Film name</th><td><input type="text"  name="filmname"></td></tr>
       <tr><th>Language</th><td><input type="text"  name="language"></td></tr>
       <tr><th>Budget</th><td><input type="text"  name="budget"></td></tr>
       <tr><td></td><td><button class="btn btn-lg btn-info" onclick="/new"><span class="glyphicon glyphicon-plus"></span></button></td></tr>     
  </table>      
</form>
</div>
<hr>

</body>
</html>