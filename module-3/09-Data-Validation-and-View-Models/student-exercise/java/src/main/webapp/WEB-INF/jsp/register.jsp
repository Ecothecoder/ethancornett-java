<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:import url="common/header.jsp">
	<c:param name="pageTitle">Register</c:param>
	<c:param name="activeNav" value="register" />
</c:import>

<h2>New User Registration</h2>

<c:url var="registrationurl" value="/register" />
<form:form id="registration" action="${registrationurl}" method="POST"
	modelAttribute="formData">
	<div>
		<label for="firstName">FIRST NAME: </label>
		<form:input type="text" name="firstName" id="firstName"
			path="firstName" required="required" />
		<form:errors path="firstName" class="error" />

	</div>
	<div>
		<label for="lastName">LAST NAME: </label>
		<form:input type="text" name="lastName" id="lastName"
			required="required" path="lastName" />
		<form:errors path="lastName" class="error" />
	</div>

	<div>
		<label for="email">EMAIL: </label>
		<form:input type="email" name="email" id="email" path="email"
			required="required" />
		<form:errors path="email" class="error" />

	</div>
	<div>
		<label for="verify">VERIFY EMAIL: </label>
		<form:input type="text" name="verify" id="verify" required="required"
			path="emailVerification" />
		<form:errors path="emailMatching" class="error" />
	</div>
	<div>
		<label for="password">PASSWORD: </label>
		<form:input type="password" name="password" id="password"
			required="required" path="password" />
		<form:errors path="password" class="error" />
	</div>

	<div>
		<label for="verifyp">VERIFY PASSWORD: </label>
		<form:input type="password" name="verifyp" id="verifyp"
			required="required" path="passwordVerification" />
		<form:errors path="password" class="error" />
	</div>

	<div>
		<label for="birthDate">BIRTH DATE: </label>
		<form:input type="date" name="birthDate" id="birthDate"
			required="required" path="birthDate" />
		<form:errors path="birthDate" class="error" />
	</div>
	<div>
		<label for="ticketNum">TICKET NUMBER: </label>
		<form:input type="number" name="ticketNum" id="ticketNum"
			required="required" path="ticketNum" />
		<form:errors path="ticketNum" class="error" />
	</div>


	<div>
		<button type="submit">Submit Forum</button>
	</div>

</form:form>

<c:import url="common/footer.jsp" />