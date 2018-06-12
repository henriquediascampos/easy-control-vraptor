    
let tipo = "";

$("[class*='ec_margin-']").each(function (){
    let valor = 0;
    let classes = $(this).attr("class");
    classes = classes.split(" ");
    
    classes.forEach(classe => {
        index = classe.split("-");
        if(index[0] === 'ec_margin'){
            switch(index[1]) {
                case "left":
                    valor = index[2];
                    tipo = "-" + index[1]; 
                    break;
                case "right":
                    valor = index[2];
                    tipo = "-" + index[1];
                    break;
                case "top":
                    valor = index[2];
                    tipo = "-" + index[1];
                    break;
                case "bottom":
                    valor = index[2];
                    tipo = "-" + index[1];
                    break;
                default:
                    valor = index[1];
                    tipo = "";
                    break;
            }
            valor = parseInt(valor);
            $( this ).css("margin" + tipo, valor)
        }           
    });
});

/*
$( "[class*='margin-']" ).css("margin" + tipo,function (){
    let teste = $(this).attr("id");
    let valor = 0;
    let classes = $(this).attr("class");
    classes = classes.split(" ");
    classes.forEach(classe => {
        index = classe.split("-");
        if(index[0] === 'margin'){
            switch(index[1]) {
                case "left":
                    valor = index[2];
                    tipo = "-" + index[1]; 
                    break;
                case "right":
                    valor = index[2];
                    tipo = "-" + index[1];
                    break;
                case "top":
                    valor = index[2];
                    tipo = "-" + index[1];
                    break;
                case "bottom":
                    valor = index[2];
                    tipo = "-" + index[1];
                    break;
                default:
                    valor = index[1];
                    tipo = "";
                    break;
            }
        }           
    });
    return valor * 1;
})

            if(classe.indexOf("margin-top-") > -1){
                index = classe.split("-");
                valor = index[2];
                tipo = index[1];                
            }

            if(classe.indexOf("margin-bottom-") > -1){
                index = classe.split("-");
                valor = index[2];
                tipo = index[1];                
            }

            if(classe.indexOf("margin-right-") > -1){
                index = classe.split("-");
                valor = index[2];
                tipo = index[1];
            }
            
            if(classe.indexOf("margin-left-") > -1){
                index = classe.split("-");
                valor = index[2];
                tipo = index[1];                
            }*/