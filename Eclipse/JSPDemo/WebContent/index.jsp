<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to HTML Web Page</h1>
<%!int a,b,sum; %>
<%
a=10;
b=20;
  sum = a+b;
	out.println("Welcome to JSP page");
	out.println("<font color=red>Sum of two number is "+sum+"</font>");
%>
<br/>
<font color="blue" size="6">
The sum of a is <%=a %> and b is <%=b  %> and sum is <%=sum %>
</font>
</body>
</html>