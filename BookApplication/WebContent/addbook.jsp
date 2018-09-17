<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AddBook</title>
</head>
<body>

	<%
		//the implicit objects available to a jsp file are: request, response, application, exception
		String message = (String) request.getAttribute("myMessage");
		out.println(message+"<br>");
	%>
	PLEASE FILL UP THE BOOK DETAILS:

	<br>
	<form action="addme" method="get">
		ISBN:<input type="text" name="isbn"><br /> BOOK NAME:<input
			type="text" name="bookName"><br> BOOK PRICE:<input
			type="text" name="price"><br> NAME OF AUTHOR:<input
			type="text" name="author"><br> NAME OF PUBLICATION:<input
			type="text" name="publication"><br> <input type="submit"
			name="SUBMIT">
	</form>


</body>
</html>
;
