<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz.jsp</title>
</head>
<body>
	<%--
		quiz.jsp			id/pw를 입력 받을 form을 작성
							입력한 데이터는 quiz_result.jsp로 전송
							단, POST로 전송
		
		quiz_result.jsp		선언부에 문자열로 id/pw를 3개 정도 생성
							전달 받은 데이터와 일치하는 정보가 있으면 
							화면에 xx님 로그인을 출력 
	
	 --%>

	<h1>Quiz</h1>
	<hr>
	
	<form action="quiz_result.jsp" method="POST">
		<p><input name="userid" placeholder="ID" required></p>
		<p><input name="userpw" type="password" placeholder="PW" required></p>
	
		<button>전송</button>
	</form>

</body>
</html>