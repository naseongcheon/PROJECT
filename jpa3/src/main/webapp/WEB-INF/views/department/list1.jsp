<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url var="R" value="/"/>
<!DOCTYPEhtml>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${R}common.css"/>
</head>
<body>
<div class="container">
<c:forEach var="department" items="${ departments }">
<h3>${ department.id } - ${ department.name }</h3>

<table class="list">
<thead>
<tr>
<th>id</th>
<th>학번</th>
<th>이름</th>
<th>학과</th>
<th>전화</th>
<th>성별</th>
<th>이메일</th>
</tr>
</thead>
<tbody>
<c:forEach var="student" items="${ department.students }">
<tr>
<td>${ student.id }</td>
<td>${ student.studentNo }</td>
<td>${ student.name }</td>
<td>${ student.department.name }</td>
<td>${ student.phone }</td>
<td>${ student.sex }</td>
<td>${ student.email }</td>
</tr>
</c:forEach>
</tbody>
</table>
</c:forEach>
</div>
</body>
</html>
