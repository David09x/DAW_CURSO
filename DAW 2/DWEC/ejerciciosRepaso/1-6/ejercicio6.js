function ejercicio6(){
    var numeroEntrante = document.getElementById("numeroDado").value;
    var numeroEntrante2 = document.getElementById("numeroDado2").value;

    if(isNaN(numeroEntrante) || isNaN(numeroEntrante2)){
        document.getElementById("numeroEntero").innerHTML ="El numero dado no es un numero";
    }else{
        if(parseInt(numeroEntrante) > parseInt(numeroEntrante2)){
            var resultado = parseInt(numeroEntrante) /parseInt(numeroEntrante2);
            var resultado2 = parseInt(numeroEntrante) % parseInt(numeroEntrante2);
            document.getElementById("numeroEntero").innerHTML= "el resultado es" + resultado +  "y el resto es" + resultado2;

        }else{
            var resultado = parseInt(numeroEntrante2) /parseInt(numeroEntrante);
            var resultado2 = parseInt(numeroEntrante2) %parseInt(numeroEntrante);
            document.getElementById("numeroEntero").innerHTML= "el resultado es" + resultado +  "y el resto es" + resultado2;
        }
    }
}