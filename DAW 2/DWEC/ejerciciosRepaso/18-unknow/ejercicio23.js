function ejercicio23(){
    var resultado = 0;

    while (resultado < 1000) {
     var  numero = parseFloat(prompt('Introduce un numero:'));
  
      if (isNaN(numero)) {
        console('Por favor, introduce un numero adecuado');
        continue;
      }
      resultado += numero;
      console.log(resultado);
    }

    document.getElementById("numeroFinal").innerHTML="has superado los 1000";

}