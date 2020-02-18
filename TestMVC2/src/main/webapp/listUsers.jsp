<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
  
<%@page import="java.util.List"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.ArrayList"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste des utilisateurs</title>
</head>
<body>

Liste des utilisateurs 

<c:if test="${empty listUsers}">
Liste vide
</c:if>
<c:if test="${!empty listUsers}">
<table border="1" id="listeUser" cellpadding="5" cellspacing="2">
	<tr bgcolor="#DEA254">
		<td>Login</td>
		<td>Mdp</td>				
	</tr>
	<c:forEach items="${listUsers}" var="user" >
		<tr>
			<td>${user.getLogin()}<br/>
			</td>
			<td>${user.getMdp()}<br/>
			</td>	
			<form action ="deleteUser"/>
			<input type="hidden" name="loginUser" value="${user.getLogin()}"/>
			<td><input type="submit" value ="Supprimer">			
			</form><br><br/>
			</td>					
		</tr>
	</c:forEach>
</c:if>	

</table>

</body>
</html>