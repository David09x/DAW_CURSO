function ejercicio8() {
    var array = [[1,2,3,4,5],[1,2,3,4,5],[1,2,3,4,5]];
    var resultado = "";
 
        array.forEach((numero) => numero.forEach(element =>resultado =  resultado +  ("c"+element)));
            
    
    document.getElementById("numeroEntero").innerHTML = resultado;
}