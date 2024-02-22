function ejercicio1 (){
    var numeroDado = document.getElementById("numeroDado").value;
    
    if(numeroDado >0 && numeroDado <51){
        document.getElementById("numeroCuadrado").innerHTML= "el cuadrado del numero es " + numeroDado*numeroDado;
    }else{
        document.getElementById("numeroCuadrado").innerHTML = "el numero dado es mayor que 50 y menor que 0";
    }

}