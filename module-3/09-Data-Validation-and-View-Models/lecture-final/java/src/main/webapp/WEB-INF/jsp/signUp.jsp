<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Awesome Mailing List</title>
		<style>
			.error {
				color:red;
			}
		</style>
	</head>
	<body>	
		<c:url var="mailingListSubmitUrl" value="/signUp"/>
		<form:form id="signUp" action="${mailingListSubmitUrl}" method="POST" modelAttribute="formData">
			<div>
				<label for="name">Name</label>
				<form:input id="name" name="name" type="text" path="name" required="required"/>
				<form:errors path="name" class="error"/>		
			</div>
			<div>
				<label for="email">Email Address</label>
				<form:input id="email" name="email" type="text" path="email"/>
				<form:errors path="email" class="error"/>				
			</div>
			<div>
				<label for="verify">Verify Email</label>
				<form:input id="verify" type="text" path="emailVerification"/>
				<form:errors path="emailMatching" class="error"/>				
			</div>
			<div>
				<label for="phone">Phone Number</label>
				<form:input id="phone" name="phone" type="text" path="phone" placeholder="XXX-XXX-XXXX"/>	
				<form:errors path="phone" class="error"/>			
			</div>
			<div>
				<label for="age">Age</label>
				<form:input id="age" name="age" type="text" path="age"/>	
				<form:errors path="age" class="error"/>			
			</div>
			<div>
				<label for="startDate">Start Subscription On</label>
				<form:input id="startDate" type="date" path="subscriptionStartDate"/>	
				<form:errors path="subscriptionStartDate" class="error"/>			
			</div>
			<div>
				<input type="submit" value="Sign Me Up!"/>
			</div>
		</form:form>
	</body>
</html>