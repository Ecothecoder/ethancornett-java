<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="common/header.jsp">
	<c:param name="pageTitle">All Customers List</c:param>
	<c:param name="activeNav" value="customers" />
</c:import>



<form class="form-inline" method="GET" action="customerSearch">
	<div>
		<input class="form-control" name="search" placeholder="Search">
	</div>
	<div>
		<label for="sort">Sort By</label> <select class="form-control"
			name="sort">
			<option value="last_name">LastName</option>
			<option value="email">Email</option>
			<option value="active">Active</option>
		</select>
	</div>
	<input class="btn btn-primary" name="submit" value="Submit"
		type="submit" />
</form>
<table class="table">
	<tr>
		<th>Name</th>
		<th>Email</th>
		<th>Active</th>
	</tr>
	<c:forEach items="${customers}" var="c">
		<tr>
			<td>${c.firstName} ${c.lastName}</td>
			<td>${c.email}</td>
			<c:choose>
			<c:when test="${c.active}">
			<td>Yes</td>
			</c:when>
			<c:otherwise>
			<td>No</td>
			</c:otherwise>
			</c:choose>
		</tr>
	</c:forEach>
</table>

<c:import url="common/footer.jsp" />