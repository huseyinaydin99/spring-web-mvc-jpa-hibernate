<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Personel Listesi</h1>

	<a href="ekle">EKLE</a>
	<table style="width: 100%">
		<tr>
			<td>Sira</td>
			<td>Id</td>
			<td>Adi</td>
			<td>Soyadi</td>
			<td>Email</td>
			<td>-----</td>
		</tr>
		<c:forEach var="personel" items="${personelListe}" varStatus="sayac">
			<tr>
				<td>${sayac.index+1}</td>
				<td>${personel.id}</td>
				<td>${personel.adi}</td>
				<td>${personel.soyadi}</td>
				<td>${personel.email}</td>
				<td>
					<a href="guncelleme?id=${personel.id}">DUZENLE</a> - 
					<a href="silme?id=${personel.id}">SIL</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>