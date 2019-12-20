<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="pageTitle" value="Product List View" />
</c:import>

<div id="card-page">
	<c:url value="/products" var="baseLink" />
	<c:import url="/WEB-INF/jsp/common/filters.jsp">
		<%-- Modify the baseRoute to apply filters to the current route. --%>


		<c:param name="baseRoute" value="${baseLink}" />
	</c:import>

	<div class="main-content">
		<!-- Container for Sorting Choices
         
         Each link should take the user to this current page and use any combination of the following
         querystring parameters to sort the page:
            - sortOrder (string) - PriceLowToHigh,PriceHighToLow,RatingHighToLow
    	-->
		<div id="sorting-options">
			<h3>Sort By</h3>
			<ul>
				<c:url value="/products" var="lowToHighLink">
					<c:param name="sortOrder" value="priceLowToHigh" />
				</c:url>

				<c:url value="/products" var="highToLowLink">
					<c:param name="sortOrder" value="priceHighToLow" />
				</c:url>
				<c:url value="/products" var="ratingLink">
					<c:param name="sortOrder" value="ratingHighToLow" />
				</c:url>
				<li><a href="${lowToHighLink}">Price - Low to High</a></li>
				<li><a href="${highToLowLink }">Price - High to Low</a></li>
				<li><a href="${ratingLink }">Rating - High to Low</a></li>
			</ul>
		</div>

		<!-- Container for all of the Products -->
		<!-- The list of products is available using the `products` variable -->
		<div id="grid">

			<!-- 
			The following HTML shows different examples of what HTML could be rendered based on different rules. 
			For purposes of demonstration we've written it out so you can see it when you load the page up. 
			-->

			<!-- Standard Product -->
			<c:forEach items="${products}" var="product">
				<c:if test="${product.remainingStock>=6}">
					<div class="tile ">
						<!-- Link to the Detail page using the product id (e.g. products/detail?id=1) -->
						<!--  foreach loop thatholds for each loops that will cycle through all the problems -->
						<a class="product-image" href="products/detail?id=${product.id}">
							<img
							src="<c:url value="/images/product-images/${product.imageName}" />" />
						</a>
						<div class="details">
							<!-- loooooooop? -->
							<p class="name">${product.name}</p>





							<fmt:formatNumber var="Stars" value="${product.averageRating}"
								maxFractionDigits="0" />
							<!-- .filled will make the star solid -->
							<div class="rating">
								<c:forEach begin="1" end="${Stars}">
									<span class="filled">&#9734;</span>
								</c:forEach>
								<c:forEach begin="1" end="${5 - Stars}">
									<span>&#9734;</span>
								</c:forEach>
							</div>
							<p class="price">$${product.price }</p>
						</div>
					</div>
				</c:if>
				<c:choose>
					<c:when
						test="${product.remainingStock<=5&&product.remainingStock>=1 }">
						<div class="tile ">
							<!--  THIS IS WHERE THE NEXT IF STATEMENT STARTS -->
							<!-- Include this if the product is considered a Top Seller -->
							<!--if it's a top seller do this-->
							<span class="banner top-seller">Top Seller!</span>

							<!-- Link to the Detail page using the product id (e.g. products/detail?id=1) -->
							<a class="product-image" href="products/detail?id=${product.id}">
								<img
								src="<c:url value="/images/product-images/${product.imageName}" />" />
							</a>
							<div class="details">
								<p class="name">${product.name}</p>

								<!-- .filled will make the star solid -->
								<div class="rating">
									<c:forEach begin="1" end="${Stars}">
										<span class="filled">&#9734;</span>
									</c:forEach>
									<c:forEach begin="1" end="${5 - Stars}">
										<span>&#9734;</span>
									</c:forEach>
								</div>
								<!--  THIS IS WHERE THE IF STATEMENT ENDS -->
								<!--  THIS IS WHERE THE NEXT IF STATEMENT STARTS -->
								<!-- Include this if the remaining quantity is greater than 0, but less than or equal to 5 -->
								<span class="product-alert">Only
									${product.remainingStock} left!</span>
								<p class="price">$${product.price }</p>
							</div>
							<!--  THIS IS WHERE THE IF STATEMENT ENDS -->
						</div>
					</c:when>
					<c:when test="${product.remainingStock==0}">
						<!-- Add the .sold-out class if the remaining quantity is 0 -->
						<div class="tile sold-out">
							<!--  THIS IS WHERE THE NEXT IF STATEMENT STARTS -->
							<!-- Include this if the remaining quantity is 0 -->
							<span class="banner">Sold Out</span>

							<!-- Link to the Detail page using the product id (e.g. products/detail?id=1) -->
							<a class="product-image" href="products/detail?id=${product.id}">
								<img
								src="<c:url value="/images/product-images/${product.imageName}" />" />
							</a>
							<div class="details">
								<p class="name">${product.name }</p>

								<!-- .filled will make the star solid -->
								<div class="rating">
									<c:forEach begin="1" end="${Stars}">
										<span class="filled">&#9734;</span>
									</c:forEach>
									<c:forEach begin="1" end="${5 - Stars}">
										<span>&#9734;</span>
									</c:forEach>
								</div>

								<p class="price">$${product.price }</p>
							</div>
							<!--  THIS IS WHERE THE IF STATEMENT ENDS -->
						</div>
					</c:when>
				</c:choose>
			</c:forEach>
		</div>
	</div>
</div>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />