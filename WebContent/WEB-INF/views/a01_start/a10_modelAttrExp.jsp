<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<c:set var="path" value="${pageContext.request.contextPath}"/> 
<fmt:requestEncoding value="UTF-8"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${path}/a00_com/bootstrap.min.css" >
<link rel="stylesheet" href="${path}/a00_com/jquery-ui.css" >
<script src="${path}/a00_com/jquery.min.js"></script>
<script src="${path}/a00_com/popper.min.js"></script>
<script src="${path}/a00_com/bootstrap.min.js"></script>
<script src="${path}/a00_com/jquery-ui.js"></script>

</head>
<body>
	<div class="jumbotron text-center">
		<h2>ModelArribute 연습</h2>
	</div>
	<div class="container">
		<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
			<form class="form-inline" method="post">
				<input class="form-control mr-sm-2" type="text" name="ename" value="${emp.ename}">
				<input class="form-control mr-sm-2" type="text" name="job" value="${emp.job}">
				<button class="btn btn-success" type="submit">Search</button>
			</form>
		</nav>
		<table class="table table-hover">
			<thead>
				<tr class="table-success text-center">
					<th>물건명</th><th>가격</th><th>갯수</th>
				</tr>
			</thead>
			<tbody>
				<tr class="text-center">
					<td>${prodInfo.name}</td>
					<td>${prodInfo.price}</td>
					<td>${prodInfo.cnt}</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>