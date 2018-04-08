/**
 * 
 */

$(document).ready(function(){
    $("#btnBuscar").click(function(){
      var pais = $("#nomePais").val();
      buscar(pais);
    });
});

function buscar(nome){
    $.get("pais/bucarNome", nome, function(retorno){
        alert(retorno);
  });

}
function salvar(pais){
  nome= pais;
  data = {nome};
  $.get("pais/salvar", data,
  function(data){
      alert("Data: " + data);
  });
}