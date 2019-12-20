<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="/WEB-INF/jsp/common/header.jsp" />
<body>
	<img id="bookmark" src="img/Bookmark.gif" height="35" width="150">
	<h1>HELLO EVERYBODY REVIEW A BOOK!</h1>



	<div id="main-content">

		<div id="bookcover">
			<img src="img/forDummies.png" />
		</div>
		<div id="links">
		<h4>
			<a id="link" href="review">PLEASE LEAVE REVIEW YA NUT!</a>

		</h4>
		<h4><a id="link" href="https://www.youtube.com/watch?v=oHg5SJYRHA0">Click here to listen to Weird Al's audio book of Squirrel Cigar Parties For Dummies!</a></h4>
	</div>
		<div id="review">
			<c:forEach items="${review}" var="r">
				<div id="individual">
					<div id="head">
						<h4>${r.title }</h4>
					</div>
					<div>
						<p>by ${r.username} on ${r.formattedDate} at
							${r.formattedTime}</p>
						<c:forEach begin="1" end="${r.rating}">
							<img src="img/startransparent.png">
						</c:forEach>
						<p>${r.text }</p>
						<c:choose>
							<c:when test="${r.rating<=3}">

								<img src="img/offensive.jpg" />
							</c:when>
							<c:when test="${r.rating>=4}">
							
								<img src="img/3yX.gif" />
							</c:when>
						</c:choose>
					</div>
				</div>
			</c:forEach>

		</div>
	</div>


</body>
<c:import url="/WEB-INF/jsp/common/footer.jsp" />
