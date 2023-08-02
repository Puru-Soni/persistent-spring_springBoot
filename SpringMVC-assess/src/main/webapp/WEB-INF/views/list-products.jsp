<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<style>
.form-list {
	margin-bottom: 20px;
	margin-left: -10px;
	margin-right: -10px;
}

.form-list .form-group {
	display: inline-block;
	width: 18%;
	padding-left: 10px;
	padding-right: 10px;
}

.form-list .form-group input {
	width: 100%;
	font-size: 13px;
	height: 38px;
	box-sizing: border-box;
	padding-left:15px;
	padding-right:15px;
}

button {
	display: inline-block;
	background-color:#2196F3;
	color: #fff;
	border: none;
	padding: 10px 25px;
	text-transform: uppercase;
	font-weight: 700;
	cursor:pointer;
}

.container {
	width: 90%;
	margin: 0 auto;
	text-align: left;
}

h3 {
	color: #616161;
	font-size: 28px;
	margin-bottom: 20px;
}
table#product-list {border-collapse: collapse;width: 100%;background-color: #fff;box-shadow: 0px 4px 5px 0px #ededed;}

table th, table td {
    border-bottom: 1px solid #e9e9e9;
    padding: 12px 15px;
}

table th {
    border-bottom: 2px solid #62a6c4;
    background-color: #e5f7ff;
}
</style>
</head>
<body>
	<div class="container">
		<h3>Product Search</h3>
		<form action="searchProduct" method="post">
			<div class="form-list">
				<div class="form-group">
					<input name="category" id="category"
						placeholder="Category"  />
				</div>
				<div class="form-group">
					<input name="type" id="type" placeholder="Type" />
				</div>
				<button type="submit" id="search">Search</button>
			</div>
			<table id="product-list">
				<tr>
					<th>Name</th>
					<th>Description</th>
					<th>Category</th>
					<th>Type</th>
					<th>Cost</th>
				</tr>
				<c:forEach var="tempProduct" items="${products}">
					<tr>
						<td>${tempProduct.name}</td>
						<td>${tempProduct.description}</td>
						<td>${tempProduct.category}</td>
						<td>${tempProduct.type}</td>
						<td><fmt:formatNumber type="number" pattern="###.00"
								value="${tempProduct.cost}" /></td>

					</tr>
				</c:forEach>
			</table>
		</form>


	</div>

</body>

</html>








