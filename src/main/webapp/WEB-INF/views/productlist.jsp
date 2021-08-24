<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false"%>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- <link type="text/css" rel="stylesheet" href="bootstrap.css"> -->
<link href="${pageContext.request.contextPath}/resources/css/bootstrap.css" rel="stylesheet">

<title>All Products</title>

</head>

<body>
	<%@ include file="header.jsp"%>

	<div class="container">
		<div class="mx-auto p-5" style="border: 1px solid #cbccd4">
			<table class="table table-bordered">
				<thead class="thead-dark">
					<tr>
						<th>Sl. No.</th>
						<th>Product Name</th>
						<th>Price</th>
						<th>Description</th>
						<th>Update</th>
						<th>Delete</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="obj" items="${allProducts}">
						<tr>
							<td><c:out value="${obj.productId}" /></td>
							<td><c:out value="${obj.productName}" /></td>
							<td><c:out value="${obj.productPrice}" /></td>
							<td><c:out value="${obj.productDescription}" /></td>
							<td><a class="btn btn-primary" href="updateproduct/${obj.productId}">Update</a></td>
							<td><a class="btn btn-danger" href="deleteproduct/${obj.productId}">Delete</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>