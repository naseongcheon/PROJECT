<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPEhtml>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="/common.css"/>
<style>
td:nth-child(1),td:nth-child(5),td:nth-child(7),td:nth-child(8) { text-align: center; }
</style>
</head>
<body>
<div class="container">
<h1>수강목록</h1>
<table class="list">
<thead>
<tr>
<th>id</th>
<th>신청일</th>
<th>학번</th>
<th>이름</th>
<th>강좌id</th>
<th>강좌명</th>
<th>학점</th>
<th>점수</th>
</tr>
</thead>
<tbody>
<c:forEach var="register" items="${ registers }">
<tr>
<td>${ register.id }</td>
<td><fmt:formatDate pattern="yyyy-MM-dd" value="${ register.createDate }"/></td>
<td>${ register.student.studentNumber }</td>
<td>${ register.student.name }</td>
<td>${ register.course.id }</td>
<td>${ register.course.courseName }</td>
<td>${ register.course.unit }</td>
<td>${ register.grade }</td>
</tr>
</c:forEach>
</tbody>
</table>
</div>
</body>
</html>
