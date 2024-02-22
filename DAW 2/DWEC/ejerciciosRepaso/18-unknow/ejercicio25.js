function getRandomArbitrary(min, max) {
    return Math.random() * (max - min) + min;
  }


function ejercicio25(){

    var arrayPrimitiva = [];
    
    var resultado = "";
    for(var i =  0; i <= 6 ; i++){
        arrayPrimitiva.push(getRandomArbitrary(1,50));
    }

    for (let index = 0; index < arrayPrimitiva.length; index++) {
        resultado += parseInt(arrayPrimitiva[index]).toString() + " ";
        
    }
    document.getElementById("resultado").innerHTML= resultado;
}