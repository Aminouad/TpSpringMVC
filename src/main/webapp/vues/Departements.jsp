<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Liste des Départements</h1>
<table border="1">
<thead><tr><th>ID</th><th>Nom</th><th></th><th></th></thead>
<tbody>
<c:forEach items="${liste }" var="v">
	<tr><td>${v.id }</td><td>${v.nom }</td><td><a href='Projets/${v.id}'>liste des projets</a></td> 
	 
	

</tr>
</c:forEach>
</tbody>
</table>
<a href='addProjet'>ajouter projet</a>
<a href="Contrats">ajouter employee</a>
</body>
</html>