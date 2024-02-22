function ejercicio2(){
    var numeroEntrante = document.getElementById("numeroDado").value;
    if(isNaN(numeroEntrante)){
        document.getElementById("numeroEntero").innerHTML ="El numero dado no es un numero";
    }else{
        if(parseInt(numeroEntrante) != numeroEntrante){
            document.getElementById("numeroEntero").innerHTML ="El numero dado no es un entero";
        }else{
            document.getElementById("numeroEntero").innerHTML ="El numero dado es un entero";
        }
        
    }
}