<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Ajouter Projet</h1>

<%--<c:set var="cxt" value="${pageContext.request.contextPath}" /> ${cxt}/--%>

<form:form method="POST" action ="saveProjet" modelAttribute="p">
	<p>Titre : <form:input path="titre"/></p>
	<p>Etat : <form:input path="etat"/></p>
	
    <form:select path="departement.id">
    <form:options items="${liste}" itemValue="id" itemLabel="nom" />
       </form:select>
    <br>
	<input type="submit" value="Ajouter" >
</form:form>

</body>
</html>