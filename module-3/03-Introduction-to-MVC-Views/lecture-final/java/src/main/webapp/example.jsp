<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Extra Example</title>
</head>
<body>

<c:forEach begin="1" end="1000" var="num">
	<c:set var="adjustedNum" value="${1001 - num}"/>
	<p>${adjustedNum} JSPs are Awesome!</p>
	<c:if test="${adjustedNum > 500}">
		<div>BIG NUMBER
			<c:choose>
				<c:when test="${adjustedNum % 2 == 0}">
					 - Even!
				</c:when>
				<c:otherwise>
					- Odd!
				</c:otherwise>
			</c:choose>
		</div>
	</c:if>
</c:forEach>

</body>
</html>