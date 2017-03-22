<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home Page</title>
</head>
<body>
	<jsp:include page="_header.jsp"></jsp:include>
     <jsp:include page="_menu.jsp"></jsp:include>
     <h3>Welcome to The Book Store</h3>
     <b>This web application includes:</b>
     <ul>
     	<li>Login</li>
     	<li>Book List</li>
     	<li>Create Book</li>
     	<li>Edit Book</li>
     	<li>Delete Book</li>
     </ul>
     <jsp:include page="_footer.jsp"></jsp:include>
</body>
</html>