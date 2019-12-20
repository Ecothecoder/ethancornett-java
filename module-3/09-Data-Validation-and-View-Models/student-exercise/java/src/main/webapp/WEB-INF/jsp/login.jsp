<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:import url="common/header.jsp">
	<c:param name="pageTitle">Login</c:param>
	<c:param name="activeNav" value="login" />

</c:import>


<h2>Login</h2>
<c:url var="loginurl" value="/login" />
<form:form id="signUp" action="${loginurl}" method="POST"
	modelAttribute="formData">
	<div>
		<label for="email">EMAIL: </label>
		<form:input type="email" name="email" path="email"
			required="required" />
		<form:errors path="email" class="error" />

	</div>
	<div>
		<label for="password">PASSWORD: </label>
		<form:input type="password" name="password" required="required"
			path="password" />
		<form:errors path="password" class="error" />
	</div>
	<div>
		<button type="submit">Submit Forum</button>
	</div>

</form:form>



<c:import url="common/footer.jsp" />