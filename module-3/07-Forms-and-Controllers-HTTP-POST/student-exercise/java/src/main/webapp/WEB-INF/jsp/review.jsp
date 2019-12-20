<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<c:import url="/WEB-INF/jsp/common/header.jsp" />

<body>
	<div id="main-content" class="main-content-review">


		<c:url value="/" var="homeUrl"/>
		<form action="${homeUrl }" method="POST">

			<div id="formGroup">
					<h2>HWAT DIDJA THINK?</h2>
				<div>
					<label for="username">USERNAME: </label> <input type="text"
						name="username" id="username" required />
				</div>
				<div>
					<label for="rating">RATING: </label> <select type="text"
						name="rating">
						<c:forEach begin="1" end="5" var="option">
						<option>${option}</option>
						</c:forEach>
						</select>
				</div>
				<div>
					<label for="title">TITLE: </label> <input type="text"
						name="title" id="title" required />
				</div>
				<div>
				<label for="text">TEXT! </label><input type="text" name="text" required/>
				</div>
				<div>
					<button type="submit" >Submit Review!</button>
				</div>
			</div>

	</form>
</div>


</body>

</html>