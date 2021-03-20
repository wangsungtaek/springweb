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
	<h2>스프링 컨트롤러 선언</h2>
	
	<table>
		<tr><th>타이틀</th></tr>
		<tr><td>
			<select>
				<option value="0">물건선택</option>
				<c:forEach var="fruit" items="${fruits}">
					<option value="${fruit.price}">
						${fruit.name}(${fruit.price})		
					</option>
				</c:forEach>
			</select>
		<tr>
		</tr>
	</table>
</body>
</html>