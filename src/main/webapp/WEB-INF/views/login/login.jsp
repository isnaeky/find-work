<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Iniciar Sesion</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet"
	href="<c:url value="/resources/assets/css/main.css" />" />
<link rel="icon" type="image/png" href="./resources/images/favicon.png">
</head>
<body  style=" background-image: url('./resources/images/fond.jpg'); background-size: cover;">
	<div id="page-wrapper">
		<jsp:include page="/WEB-INF/views/repeat/header.jsp"></jsp:include>

		<!-- Main -->
		<section id="main" class="container medium">
			<header>
				<h2 style="color: white;">Iniciar Sesion</h2>
				<p style="color: white;">La experiencia del usuario nos catalogo en lo mejor.</p>
			</header>
			<div class="box">
				<form method="post" action="/formlogin">
					<div class="row gtr-50 gtr-uniform">
						<div class="col-6 col-12-mobilep">
							<input type="text" name="users" id="users" value=""
								placeholder="Usuario" />
						</div>
						<div class="col-6 col-12-mobilep">
							<input type="password" name="pass" id="pass" value=""
								placeholder="Password" />
						</div>
						
						<div class="col-12">
							<ul class="actions special">
								<li><input type="submit" value="Login" /></li>
								<li><input type="reset" value="Reset" class="alt"></li>
							</ul>
						</div>
					</div>
				</form>
			</div>
		</section>

		<jsp:include page="/WEB-INF/views/repeat/footer.jsp"></jsp:include>
	</div>
</body>
</html>