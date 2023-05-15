<%@page import="org.springframework.ui.Model"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="js/time.js" ></script>
<link rel="stylesheet" href="css/datetime.css" type="text/css" />
<title>Date</title>
</head>
<body>
	<h1 class="date" style="width:100%; text-align: center;">
		<c:out value="${date}" />
	</h1>
</body>
</html>