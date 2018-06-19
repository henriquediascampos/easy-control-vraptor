function openNav() {
    document.getElementById("mySidenav").style.width = "250px";
}

function closeNav() {
    document.getElementById("mySidenav").style.width = "0";
}

function eventos(){
    $(".btn-menu").click (()=>{
        if($(".menu-lateral").hasClass("is-open")){
            $(".menu-lateral").removeClass("is-open");
            $("#menu-close").addClass("ocultar");
            $("#menu-open").removeClass("ocultar");
            $("#login").addClass("ocultar");
        }else{
            $(".menu-lateral").addClass("is-open");
            $("#menu-close").removeClass("ocultar");
            $("#menu-open").addClass("ocultar");
            $("#login").removeClass("ocultar");            
        }
    });

    $('#login').click(()=>{
        $('#view-port').load("login.jsp");
        //location.reload();
    });

    $('#fazerCadastro').click(()=>{
        $('#view-port').load("pais.jsp");
    });

    $("#btnEntrar").click(()=>{
        fazerLogin();
    });
}

$(document).ready(function(){
    eventos();
    //$('#view-port').load("login.jsp");
});