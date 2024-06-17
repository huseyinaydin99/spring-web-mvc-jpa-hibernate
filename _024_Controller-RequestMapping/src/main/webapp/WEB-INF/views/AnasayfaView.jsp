<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>SpringMVC - Bootstrap</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
		<h2>Spring MVC</h2>
		<div class="alert alert-success">
			<strong>${mesaj1}</strong>
		</div>
		<div class="alert alert-info">
			<strong>${mesaj2}</strong>
		</div>
		<div class="alert alert-warning">
			<strong>${mesaj3}</strong>
		</div>
		<div class="alert alert-danger">
			<strong>-----</strong>
		</div>
	</div>

</body>
</html>