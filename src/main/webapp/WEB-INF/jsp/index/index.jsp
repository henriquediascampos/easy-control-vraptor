<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html lang="pt-br">
<head>
<link rel="stylesheet" href="css/estilos.css">
<link rel="stylesheet" href="css/padroes.css">
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
<title>VRaptor Blank Project</title>
</head>
<body>
<div class="view larg-alt-full">
	<header>
		<div class="menu">
			<div class="div-flex  div-nav">
				<div class="logo">
					<img src="./imagens/logo.png" alt="">
				</div>
				<div class="div-ul">
					<ul>
						<li><a id="home">HOME</a></li>
						<li><a id="">LOGIN</a></li>
						<li><a href="">TESTE 2</a></li>
						<li><a href="">TESTE 3</a></li>
					</ul>
				</div>
			</div>
			<div >
				<img class="div-lapis" src="./imagens/lapis.png" alt="">
			</div>
		</div>
	</header>
	<section class="div-flex flex-colunm larg-alt-full ec_margin-top-15">
		<div class=" div-flex larg-alt-full padding-t">
			<div class="menu-lateral div-flex flex-colunm">
				<div class="div-flex flex-row-rev">
					<img id="menu-open" class="btn-menu" src="./imagens/menuicon.png" alt="Menu">
				
					<img id="menu-close"  class="btn-menu ocultar" src="./imagens/close_icon.png" alt="Menu">				
				</div>
				<div class="div-flex larg-full">
					<ul class="list-itens larg-full">
						<li class="larg-full">
							<a id="login" class="item-menu">Login</a>
						</li>
					</ul>
				</div>
			</div>
			<div class="div-flex larg-alt-full content-center">
			
				<div id="view-port" class="view-port div-flex content-center">
						<div class=" div-flex content-center">
							<jsp:include page =  "../login/login.jsp" /> 
						</div>	

				</div>
			</div>
		</div>
		<footer class="div-flex rodape"></footer>
	</section>
</div>
</body>
</html>
<script type="text/javascript"  src="jquery-3.3.1.min.js"></script>
<script type="text/javascript"  src="js/pages/index/index.js"></script>
<script type="text/javascript"  src="js/pages/funcoesPadroes.js"></script>
