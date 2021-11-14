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
<c:set var="context" value="${pageContext.request.contextPath}" />

<h1>Liste des Projet</h1>
<h2>Département: ${dep.getNom()} </h2>
<table border="1">
<thead><tr><th>ID</th><th>Titre</th><th>Etat</th><th></th></thead>
<tbody>
<c:forEach items="${liste }" var="p">
	<tr><td>${p.id }</td><td>${p.titre }</td><td>${p.etat }</td></tr>
</c:forEach>
</tbody>
</table>
<a href='${context}/addProjet'>ajouter projet</a>
<br>
<a href="Contrats">Ajouter employee</a>
<br>
<a href="${context}/Departements">Liste des départements</a>
</body>
</html>