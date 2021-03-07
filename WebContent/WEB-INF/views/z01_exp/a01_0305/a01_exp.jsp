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
<!-- 
[하] 1. 스프링 MVC로 회원 정보 리스트 출력하세요.
	WebContent/WEB-INF/views/a01_start/a10_memList.jsp 구현함
 -->
<!-- 
[하] 2. DI를 이용해서 Book의 생성자를 통해서 데이터를 할당하고 출력처리하세요.
 -->
<!-- 
[하] 3. DI를 이용해서 Computer객체에 부품(Cpu, Ram, Hdd 객체)를 할당하여 
        Computer의 showInfo()메서드를 통해서 출력 처리하세요.
        컴퓨터명 @@@에 포함된
        Cpu 이름은 @@, 사양은 @@@
        Ram는 이름은 @@, 사양은 @@@
        Hdd는 이름은 @@, 사양은 @@@
        입니다.
 -->
</body>
</html>