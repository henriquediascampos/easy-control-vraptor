<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="css/cadastro/cadastro.css">    
    <link rel="stylesheet" href="css/padroes.css">
    <link rel="stylesheet" href="css/fields.css"> 
    <title>pais</title>
</head>
<body>
<div class="div-flex flex-colunm">
    <fieldset class="div-flex larg-alt-full flex-colunm grupo-info-obrigatorio"> <legend>Usuário:</legend>
        <div class="ec_margin-top-10">
            <input class="field-2" id="nomeSobrenomeUsuario" type="text" placeholder="Nome & Sobrenome" maxlength="50"> 
        </div>
        <div class="ec_margin-top-10">
            <input class="field-2" id="email" type="email" placeholder="seuEmail@Email.com"> 
        </div>
        <div class="ec_margin-top-10">
            <input class="field-2" id="senha" type="password" placeholder="Senha"> 
        </div>
        <div class="ec_margin-top-10">
            <input class="field-2" id="confirmarSenha" type="password" placeholder="Repetir senha"> 
        </div>
        <div class="ec_margin-top-10">
            <input id="receberNotificacao" type="checkbox"> 
            <label for="receberNotificacao">Desejo receber notificações</label>
        </div>

        <div>
            <input id="politicasPrivacidade" type="checkbox"> 
            <label for="politicasPrivacidade">Aceito as políticas de privacidade </label>
        </div>
    </fieldset>
    <fieldset > <title>salvar</title>
        <br>
        <h1 class="text-size-15">objeto salvo:</h1>
        <br>      
        <input id="pais" type="text"> 
        <br>    
        <button id="btnSalvar">salvar</button>
    </fieldset>
</div>

</body> 
</html>
<script type="text/javascript"  src="jquery-3.3.1.min.js"></script>
<script type="text/javascript"  src="js/pages/pais/pais.js"></script>
<script type="text/javascript"  src="js/pages/funcoesPadroes.js"></script>

