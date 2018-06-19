
function eventos(){

}
$(document).ready(function(){
    eventos();

    $('#email').on('keydown', function (e){
        if( e.keyCode == 13){
            $('#senha').focus();
        }
    });
    $('#senha').on('keydown', function (e){
        if( e.keyCode == 13){
            $('#btnEntrar').focus();
        }
    });
    
}); 

function fazerLogin(){
    $.get("login/fazerLogin/", function(retorno){
        if(retorno)
            $('#view-port').load("pais.jsp");  
    });
}