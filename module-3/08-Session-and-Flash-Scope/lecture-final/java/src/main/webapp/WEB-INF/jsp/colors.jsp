<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Favorite Color Picker</title>

<style>

body {
	background-color: ${backgroundColor == null? "white" : backgroundColor};
}


</style>

</head>
<body>

	<form method="POST">
	
		<select name="colorChoice">
			<option value="darksalmon">Dark Salmon</option>
			<option value="papayawhip">Papaya Whip</option>
			<option value="olivedrab">Olive Drab</option>
			<option value="cornflowerblue">Cornflower Blue</option>
			<option value="thistle">Thistle</option>
		</select>
	
		<button type="submit">Make It So</button>
	
	</form>

</body>
</html>