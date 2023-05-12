<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.sql.ResultSet" %> 



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Registered Users</title>
</head>
<body>
<table>
<tr><td><%@ include file="Header.jsp" %></td></tr>
<tr><td><h1>All Users Here</h1></td></tr>
</table>
<table border="1">
<tr>
<th>Name</th>
<th>City</th>
<th>Email</th>
<th>Mobile</th>
<th>Delete</th>
<th>Update</th>
</tr>
<%

ResultSet res=(ResultSet)request.getAttribute("res");

while(res.next()){
	

%>


<tr>
<td>
<%=res.getString(1) %>
</td>
<td>
<%=res.getString(2) %>
</td>
<td>
<%=res.getString(3) %>
</td>
<td>
<%=res.getString(4) %>
</td>
<td>
<a href="delete?emailid=<%=res.getString(3)%>">delete</a>
</td>
<td>
<a href="updateUser?email=<%=res.getString(3)%>">update</a>
</td>
</tr>
<%} %>

</table>
</body>
</html>