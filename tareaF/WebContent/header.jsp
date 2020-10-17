<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<header>
 <nav class="navbar navbar-expand-md navbar-dark"
  style="background-color:LIGHTSALMON">
  <div>
   <a href="https://www.javaguides.net" class="navbar-brand"> Todo App</a>
  </div>

  <ul class="navbar-nav navbar-collapse justify-content-end">
   <li><a href="<%= request.getContextPath() %>/login" class="btn btn-sm btn-outline-light" >Login</a></li> 
   <li><a href="<%= request.getContextPath() %>/register" class="btn btn-sm btn-outline-light" >Signup</a></li>
  </ul>
 </nav>
</header>
</body>
</html>