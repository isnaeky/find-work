<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Work</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet"
	href="<c:url value="/resources/assets/css/main.css" />" />
<link rel="icon" type="image/png" href="./resources/images/favicon.png">
</head>
<body class="">
	<div id="page-wrapper">
		<jsp:include page="/WEB-INF/views/repeat/header.jsp"></jsp:include>
		<!-- Main -->
		<section id="main" class="container medium">
			<header>
				<h2>Registrar</h2>
				<p>El registrarte te da muchos beneficios exclusivos para ti.</p>
			</header>
			<div class="box">
				<form method="post" action="#">
					<div class="row gtr-50 gtr-uniform">
						<div class="col-6 col-12-mobilep">
							<input type="text" name="nombre" id="nombre" value=""
								placeholder="Nombre" autocomplete="off" />
						</div>
						<div class="col-6 col-12-mobilep">
							<input type="text" name="app" id="app" value=""
								placeholder="Apellido Paterno" autocomplete="off" />
						</div>
						<div class="col-6 col-12-mobilep">
							<input type="text" name="apm" id="apm" value=""
								placeholder="Apellido Materno" autocomplete="off" />
						</div>
						<div class="col-6 col-12-mobilep">
							<input type="email" name="correo" id="correo" value=""
								placeholder="Email" autocomplete="off" />
						</div>
						<div class="col-6 col-12-mobilep" style="padding-left: 38px;">
							<!-- sexo -->
							<h4>Sexo</h4>
						</div>
						<div class="col-6 col-12-mobilep">
							<!-- radiobutton sexo -->
							<input type="radio" id="mujer" name="priority" checked="">
							<label for="mujer">Mujer</label> 
							<input type="radio" id="hombre" name="priority"> 
							<label for="hombre">Hombre</label>
						</div>
						<div class="col-6 col-12-mobilep">
							<input type="text" name="tel" id="tel" value=""
								placeholder="Telefono" autocomplete="off" />
						</div>
						<div class="col-6 col-12-mobilep">
							<input type="text" name="fechaN" id="fechaN" value=""
								placeholder="Fecha de Nacimiento" autocomplete="off" />
						</div>

<!-- 
						<div class="col-12">
							<input type="text" name="subject" id="subject" value=""
								placeholder="Subject" autocomplete="off" />
						</div>
						<div class="col-12">
							<textarea name="message" id="message"
								placeholder="Enter your message" rows="6" autocomplete="off"></textarea>
						</div>-->
						<div class="col-12">
							<ul class="actions special">
								<li><input type="submit" value="Registrar" /></li>
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