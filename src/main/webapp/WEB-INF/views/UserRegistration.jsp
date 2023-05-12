<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User_Registration</title>
</head>
<body>
<table>
<tr><td><%@ include file="Header.jsp" %></td></tr>
<tr><td><h1>User Registration</h1></td></tr>
</table>
<form action="userRegistration" method="post">
<table border="1" bordercolor="Blue">
<tr><td>Name</td><td><input type="text" name="name"/></td></tr>
<tr><td>City</td><td><input type="text" name="city"/></td></tr>
<tr><td>Email</td><td><input type="text" name="email"/></td></tr>
<tr><td>Mobile</td><td><input type="text" name="mobile"/></td></tr>
<tr><td><input type="submit" value="save" class="btn"/></td>
<td>
<%
if(request.getAttribute("msg")!=null){
out.println(request.getAttribute("msg"));
}
%>
</td>
</tr>
</table>
</form>
</body>
</html>