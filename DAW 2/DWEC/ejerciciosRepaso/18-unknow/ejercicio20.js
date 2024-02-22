function ejercicio20(){
    var peso = document.getElementById("peso").value;
    var altura = document.getElementById("altura").value;

    var resultado = peso/(altura*altura);

    document.getElementById("totalIMC").innerHTML= resultado.toFixed(2);
    
}