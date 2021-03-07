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

<script type="text/javascript">
<%--
 
 
--%>
//
	$(document).ready(function(){
	  
	});
</script>
</head>
<body>
	<div class="jumbotron text-center">
		<h2>부트스트랩 form</h2>
	</div>
	<div class="container">
		<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
			<form class="form-inline" method="post" action="${path}/empList.do">
				<input class="form-control mr-sm-2" type="text" name="ename" value="${param.ename}" placeholder="사원명">
				<input class="form-control mr-sm-2" type="text" name="job" value="${param.job}" placeholder="직책명">
				<button class="btn btn-success" type="submit">Search</button>
			</form>
		</nav>
		<table class="table table-hover">
			<thead>
				<tr class="table-success text-center">
					<th>사원번호</th>
					<th>사원명</th>
					<th>직업</th>
					<th>월급</th>
					<th>부서번호</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="emp" items="${emplist}">
				<tr class="text-center">
					<td>${emp.empno}</td>
					<td>${emp.ename}</td>
					<td>${emp.job}</td>
					<td>${emp.sal}</td>
					<td>${emp.deptno}</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>