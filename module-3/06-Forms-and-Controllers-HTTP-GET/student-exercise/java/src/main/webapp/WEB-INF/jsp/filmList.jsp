<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="common/header.jsp">
	<c:param name="pageTitle">All Films List</c:param>
	<c:param name="activeNav" value="films" />
</c:import>

<form class="form-inline" method="GET" action="filmSearch">
	<div>
		<label for="minLength">Minimum Length</label> <input
			class="form-control" name="minLength" type="number" />
	</div>
	<div>
		<label for="maxLength">Maximum Length</label> <input
			class="form-control" name="maxLength" type="number" />
	</div>
	<div>
		<label for="genre">Genre</label> <select class="form-control"
			name="genre">
			<c:forEach items="${genres}" var="name">
				<option value="${name}">${name}</option>
			</c:forEach>
		</select>
	</div>
	<input class="btn btn-primary" name="submit" value="Submit"
		type="submit" />
</form>
<table class="table">
	<tr>
		<th>Name</th>
		<th>Description</th>
		<th>Release Year</th>
		<th>Length</th>
		<th>Rating</th>
	</tr>
	<c:forEach items="${films}" var="film">
		<tr>
			<td>${film.title}</td>
			<td>${film.description}</td>
			<td>${film.releaseYear}</td>
			<td>${film.length}</td>
			<td>${film.rating}</td>
		</tr>
	</c:forEach>
</table>






<c:import url="common/footer.jsp" />