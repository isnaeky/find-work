<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<!-- Header -->
<header id="header" class="alt">
	<h1>
		<a href="/">Find</a> Work by Isnaeky
	</h1>
	<nav id="nav">
		<ul>
			<li><a href="<c:url value="/index" />">Home</a></li>
			<li><a href="#" class="icon solid fa-angle-down">Menu</a>
				<ul>
					<li><a href="generic.html">Generic</a></li>
					<li><a href="/registrar">Registrar</a></li>
					<li><a href="elements.html">Elements</a></li>
					<li><a href="#">Submenu</a>
						<ul>
							<li><a href="#">Option One</a></li>
							<li><a href="#">Option Two</a></li>
							<li><a href="#">Option Three</a></li>
							<li><a href="#">Option Four</a></li>
						</ul></li>
				</ul></li>
			<li><a href="/login" class="button">Iniciar Sesion</a></li>
		</ul>
	</nav>
</header>
</html>