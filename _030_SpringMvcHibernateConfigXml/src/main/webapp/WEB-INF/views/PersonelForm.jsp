<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Ekle - Guncellenme</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h2>Ekle - Guncellenme</h2>

		<form:form action="kaydet" method="post" modelAttribute="personel">
			<form:hidden path="id" />
			<div class="form-group">
				<label class="control-label col-sm-2" for="email">ADI:</label>
				<div class="col-sm-10">
					<form:input path="adi" />
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2" for="pwd">SOYADI:</label>
				<div class="col-sm-10">
					<form:input path="soyadi" />
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2" for="pwd">EMAIL:</label>
				<div class="col-sm-10">
					<form:input path="email" />
				</div>
			</div>

			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-default">Kaydet</button>
				</div>
			</div>
		</form:form>
	</div>
</body>
</html>