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

<h1>Ajouter un Employé</h1>

<%--<c:set var="cxt" value="${pageContext.request.contextPath}" /> ${cxt}/--%>

<form:form method="POST" action ="saveEmploye" modelAttribute="e">
	<p>Nom et Prénom : <form:input path="nom"/></p>
	    <br>
	
	<h2>Fonction :</h2>
	 <form:select path="fonction">  
        <form:option value="technicien" label="technicien"/>  
        <form:option value="manager" label="manager"/>  
        <form:option value="ingenieur" label="ingenieur"/>  
        </form:select>  
           <br>
       <h2>Département :</h2> 
    <form:select path="departement.id">
    <form:options items="${liste}" itemValue="id" itemLabel="nom" />
       </form:select>
    <br>
    <h2>Projet :</h2> 
    <form:select path="projet.id">
    <form:options items="${listeProjet}" itemValue="id" itemLabel="titre" />
       </form:select>
    <br>
	<input type="submit" value="Ajouter" >
</form:form>

</body>
</html>