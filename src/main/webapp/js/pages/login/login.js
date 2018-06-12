
function eventos(){
    $("#btnEntrar").on("click", ()=>{
        alert('patos');
    });

    $("#btnEntrar").click(()=>{
        alert('patos');
    });
}
$(document).ready(function(){
    eventos();

    
}); 

function fazerLogin(){
    $.get("login/fazerLogin/", function(retorno){
        if(retorno)
            $('#view-port').load("pais.jsp");  
    });
}