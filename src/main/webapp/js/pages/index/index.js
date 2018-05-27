function openNav() {
    document.getElementById("mySidenav").style.width = "250px";
}

function closeNav() {
    document.getElementById("mySidenav").style.width = "0";
}

function evenct(){
    $(".btn-menu").click (()=>{
        if($(".menu-lateral").hasClass("is-open")){
            $(".menu-lateral").removeClass("is-open");
            $("#menu-close").addClass("ocultar");
            $("#menu-open").removeClass("ocultar");
        }else{
            $(".menu-lateral").addClass("is-open");
            $("#menu-close").removeClass("ocultar");
            $("#menu-open").addClass("ocultar");
        }
    });
}

$(document).ready(function(){
    evenct();
});