function ejercicio5(){
    var numeroEntrante = document.getElementById("numeroDado").value;

    if(isNaN(numeroEntrante)){
        document.getElementById("numeroEntero").innerHTML ="El numero dado no es un numero";
    }else{
        var resultado = (numeroEntrante*numeroEntrante) * Math.PI;
        
        document.getElementById("numeroEntero").innerHTML =resultado.toFixed(2).toString();
    }
}