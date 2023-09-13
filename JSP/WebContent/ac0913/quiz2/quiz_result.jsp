<%@page import="beans.Account"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz_result.jsp</title>
</head>
<body>
	<%!
		Account[] acs = new Account[] {
			new Account("admin", "qwe"),
			new Account("itbank", "it"),
			new Account("user", "1234")
		};
	
		public Account login(Account user) {
			for (int i = 0; i < acs.length; i++) {
				if (acs[i].equals(user)) {
					return acs[i];
				}
			}
			
			return null;
		}
	%>
	
	<jsp:useBean id="user" class="beans.Account"/>
	<jsp:setProperty property="*" name="user"/>
	
	<%
		user = login(user);
		
		if (user != null) {
			RequestDispatcher rd;
			rd = request.getRequestDispatcher("quiz_success.jsp");
			rd.forward(request, response);
		}
		else {
			response.sendRedirect("quiz_fail.jsp");
		}
	%>
	
</body>
</html>