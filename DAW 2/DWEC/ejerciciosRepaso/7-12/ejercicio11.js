function getRandomArbitrary(min, max) {
    return Math.random() * (max - min) + min;
  }

function ejercicio11(){
    var arrayNumeros = [];

    for (let index = 0; index <= 25; index++) {
        var numero = Math.floor(getRandomArbitrary(0,101));
        if(!arrayNumeros.includes(numero)){
            arrayNumeros.push(numero);
        }
    }

    for (let index = 0; index < arrayNumeros.length; index++) {
        console.log(arrayNumeros[index]);
        
    }
}