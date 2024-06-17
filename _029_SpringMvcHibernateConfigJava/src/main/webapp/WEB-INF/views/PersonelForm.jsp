<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ekle - Guncellenme</title>
</head>
<body>
	<h2>Ekle - Guncellenme</h2>
	<table style="width: 100%">
		<form:form action="kaydet" method="post" modelAttribute="personel">
			<form:hidden path="id" />
			<tr>
				<td>ADI</td>
				<td><form:input path="adi" /></td>
			</tr>

			<tr>
				<td>SOYADI</td>
				<td><form:input path="soyadi" /></td>
			</tr>

			<tr>
				<td>EMAIL</td>
				<td><form:input path="email" /></td>
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" value="Kaydet" /></td>
			</tr>
		</form:form>
	</table>
</body>
</html>