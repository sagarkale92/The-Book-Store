<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Book List</title>
</head>
<body>
	<jsp:include page="_header.jsp"></jsp:include>
    <jsp:include page="_menu.jsp"></jsp:include>
    <h3>Book List</h3>
    <table border="1" cellpadding="5" cellspacing="1">
    	<tr>
    		<th>Code</th>
    		<th>Name</th>
    		<th>Price</th>
    	</tr>
    	<c:forEach items="${bookList}" var="book">
    		<tr>
	    		<th>${book.code}</th>
	    		<th>${book.name}</th>
	    		<th>${book.price}</th>
    		</tr>
    	</c:forEach>
    </table>
    <jsp:include page="_footer.jsp"></jsp:include>
</body>
</html>