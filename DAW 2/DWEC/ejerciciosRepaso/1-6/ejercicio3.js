function financial(x) {
    return Number.parseFloat(x).toFixed(2);
  }

function ejercicio3(){
    var numeroEntrante = document.getElementById("numeroDado").value;
    if(isNaN(numeroEntrante)){
        document.getElementById("numeroEntero").innerHTML ="El numero dado no es un numero";
    }else{
       var numero = financial(numeroEntrante);
      document.getElementById("numeroEntero").innerHTML = numero;
       
    }
}

