<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix= "fmt" uri= "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<link href="common.css"rel="stylesheet">
<script src="common.js"></script>
<title>AA</title>
</head>
<body>
<h1>안녕하세요</h1>
<h3>${ message }</h3>
<h3><fmt:formatDate pattern= "yyyy-MM-dd HH:mm:ss" value= "${ now }" /></h3>
</body>
</html>