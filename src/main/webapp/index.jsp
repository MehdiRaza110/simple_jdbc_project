<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>welcome</title>
<style>
    .btn:hover{
    	background-color: red;
    	color:white;
    }
  </style>
</head>
<body>
<h1>Login</h1>
<form action="userGet" method="post">
<table border="1">
<tr><td>Email</td><td><input type="email" name="email"/></td></tr>
<tr><td>Password</td><td><input type="password" name="password"/></td></tr>
<tr><td><input type="submit" value="Find" class="btn"></td>


<td>
<%
if(request.getAttribute("chk")==null){
	out.println("Enter Email and Password..");
}else if(request.getAttribute("chkEmail").equals(true)){
	out.println("Please Check your Password");
}
else
out.println("Wrong Email and Password try again");
		

%>
</td>
</tr>
</table>
</form>
</body>
</html>