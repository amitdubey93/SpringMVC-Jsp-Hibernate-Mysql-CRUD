<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored = "false" %>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link href="${pageContext.request.contextPath}/resources/css/bootstrap.css" rel="stylesheet">
<title>Home Page</title>

</head>

<body>
	<%@ include file="header.jsp"%>

	<div class="container">
		<div class="mx-auto p-5" style="border: 1px solid #cbccd4">
			<form action="addproduct" method="post">
				<!-- <div class="form-group">
					<label for="productId">Product Id</label> <input type="text"
						class="form-control" id="productId" name="productId"
						placeholder="Product Id">
				</div> -->
								<div class="form-group">
					<label for="productName">Product Name</label> <input type="text"
						class="form-control" id="productName" name="productName"
						placeholder="Product Name">
				</div>
				<div class="form-group">
					<label for="productPrice">Price</label> <input type="text"
						class="form-control" id="productPrice" name="productPrice"
						placeholder="Price">
				</div>

				<div class="form-group">
					<label for="productDescription">Product Description :</label>
					<textarea class="form-control" id="productDescription"
						name="productDescription" rows="3"
						placeholder="Product Desciption"></textarea>
				</div>
				<!-- <div class="form-group">
					<label for="productImage">Upload Image</label> <input
						type="file" class="form-control-file" id="productImage" name="productImage">
				</div> -->
				<input type="submit" value="Submit" class="btn btn-primary">
			</form>
			<%-- ${pageContext.request.contextPath} --%>
		</div>
	</div>
</body>
</html>