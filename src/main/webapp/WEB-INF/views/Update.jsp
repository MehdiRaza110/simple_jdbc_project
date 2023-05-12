
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Here</title>
</head>
<body>
<table>
<tr><td><%@ include file="Header.jsp" %></td></tr>
<tr><td><h1>Update Mobile Here</h1></td></tr>
</table>
<form action="updateUser" method="post">
<table border="1" bordercolor="red" >
<tr><td>Mobile</td><td><input type="text" name="mobile"/></td></tr>
<tr><td><input type="submit" value="update" class="btn"/></td></tr>
</table>
</form>
</body>
</html>