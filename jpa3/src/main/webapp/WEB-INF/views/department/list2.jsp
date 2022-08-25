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
<table class="list">
<thead>
<tr>
<th>id</th>
<th>학과명</th>
<th>단축명</th>
<th>전화</th>
</tr>
</thead>
<tbody>
<c:forEach var="department" items="${ departments }">
<tr>
<td>${ department.id }</td>
<td>${ department.name }</td>
<td>${ department.shortName }</td>
<td>${ department.phone }</td>
</tr>
</c:forEach>
</tbody>
</table>
</div>
</body>
</html>
