function ejercicio4(){
    var numeroEntrante = document.getElementById("numeroDado").value;
    var numeroDecimal = parseFloat(numeroEntrante).toFixed(2);
  
    document.getElementById("numeroEntero").innerHTML = numeroDecimal.toString();
}