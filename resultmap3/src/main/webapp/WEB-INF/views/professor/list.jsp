<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPEhtml>
<html>
<head>
<meta http-equiv="Content-Type"content="text/html; charset=UTF-8">
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="/common.js"></script>
<link rel="stylesheet" type="text/css" href="/common.css"/>
<style>
h3 { margin-bottom: 2px; }
td:nth-child(1),td:nth-child(5) { text-align: center; }
</style>
</head>
<body>
<div class="container">
<h1>교수별담당강좌</h1>
<c:forEach var="professor" items="${ professors }">
<h3>${ professor.id } - ${ professor.professorName }</h3>
<table class="list">
<thead>
<tr>
<th>id</th>
<th>강좌명</th>
<th>학점</th>
<th>시작일</th>
</tr>
</thead>
<tbody>
<c:forEach var="course" items="${ professor.courses }">
<tr>
<td>${ course.id }</td>
<td>${ course.courseName }</td>
<td>${ course.unit }</td>
<td><fmt:formatDate pattern="yyyy-MM-dd" value="${ course.startDate }"/></td>
</tr>
</c:forEach>
</tbody>
</table>
</c:forEach>
</div>
</body>
</html>
