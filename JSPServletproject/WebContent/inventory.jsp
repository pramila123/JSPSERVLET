<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1 style="color: green">Add Pizza To Inventory</h1>
	<hr>
	<form action="addinventory" method="post" enctype="multipart/form-data">
		<table>
			<tr>
				<td>Category_Id</td>
				<td><select name="category">
						<option value="">Choose an option</option>
						<option value="Veg">Veg</option>
						<option value="Non-Veg">Non-Veg</option>
				</select></td>
			</tr>
			<tr>
				<td>Pizza Name</td>
				<td><input type="text" name="pizzaname"></td>
			</tr>
			<tr>
				<td>Pizza Price</td>
				<td><input type="text" name="price"></td>
			</tr>
			
			<tr>
				<td>Image</td>
				<td><input type="file" value="Browse" name="image"></td>
			</tr>
			<tr>
			
			<td><input type="submit" value="Add"> </td>
			</tr>
		</table>

	</form>
</body>
</html>