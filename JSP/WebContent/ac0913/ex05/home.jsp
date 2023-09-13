<%@page import="beans.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
	<%
		User user = (User)session.getAttribute("user");
		
		if (user == null) {
			user = new User();
		}
	%>

	<h4>접속 : <%=user.getNick() %></h4>
	
	<form action="login.jsp">
		<p><input name="userid" placeholder="ID" required></p>
		<p><input name="userpw" type="password" placeholder="PW" required></p>
		
		<button>login</button>
	</form>
</body>
</html>