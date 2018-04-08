/**
 * 
 */

$(document).ready(function(){
    $("#btnBuscar").click(function(){
      var nome = $("#nomePais").val();
      buscar(nome);
    }); 

    $("#btnSalvar").click(function(){
      var nome = $("#pais").val();
      salvar(nome);
    }); 
});

function buscar(nome){ 
  data = {nome};
  $.get("pais/bucarNome", data,
   function(retorno){
    alert(retorno);
  });

}

function salvar(nome){
  data = {nome};
  $.get("pais/salvar", data,
  function(data){
  });
}