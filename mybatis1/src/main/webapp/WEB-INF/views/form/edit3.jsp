<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPEhtml>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="/common.css"/>
<style>
form { width: 600px; margin: auto;
box-shadow: 0 0 4px lightgray, 2px 2px 4px gray; overflow: auto; }
div.title { font-size: 20pt; padding: 10px; background-color: #eee; }
table { margin: 20px; }
td { min-width: 100; padding: 5px; }
td:nth-child(1) { text-align: right; }
button { margin: 5px 0 20px 20px; }
div.message { border-radius: 10px; padding: 12px; margin: 10px; 
background-color: #ffa; border: 1px solid #cc0; }    
</style>
</head>
<body>
<div class="container">
<form:form method="post" modelAttribute="student">
<div class="title">학생정보</div>
<table>
<tr>
<td>id</td>
<td><form:input path="id" readonly="true" disabled="true"/></td>
</tr>
<tr>
<td>학번</td>
<td><form:input path="studentNumber"/></td>
</tr>
<tr>
<td>이름</td>
<td><form:input path="name"/></td>
</tr>
<tr>
<td>학과</td>
<td>
<form:select path="departmentId"
items="${ departments }" itemLabel="departmentName" itemValue="id"/>
</td>
<tr>
<td>학년</td>
<td><form:input path="year"/></td>
</tr>
</table>
<button type="submit"class="btn">저장</button>

<c:if test="${ not empty message }">
<div class="message">
          ${ message }
</div>
</c:if>
</form:form>
</div>
</body>
</html>
