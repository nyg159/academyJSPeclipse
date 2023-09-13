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
		String site = "quiz_fail.jsp";
	
		if (user != null) {
			site = "quiz_success.jsp";
		}
		
		response.sendRedirect(site);
	%>

</body>
</html>