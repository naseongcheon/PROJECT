<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type"content="text/html; charset=UTF-8">
</head>
<body>
	<table border="1">
	<tr>
	 <th>제목</th>
	 <th>내용</th>
	<tr>
	 <td>아이디</td>
	 <td>${ student.id }</td>
	<tr>
	 <td>number</td> <td>${ student.studentNumber }</td>
	<tr>
	 <td>name</td> <td>${ student.studentName }</td>
	<tr>
	 <td>email</td> <td>${ student.email }</td>
	</table>
</body>
</html>