function getRandomArbitrary(min, max) {
    return Math.random() * (max - min) + min;
  }

function ejercicio10(){

    var arrayNumeros = [];
    var arrayNumeros2 = []
    arrayNumeros2[0] = 0  ;
    arrayNumeros2[1] = 0;
    arrayNumeros2[2] = 0;
    arrayNumeros2[3] = 0;
    arrayNumeros2[4] = 0;
    arrayNumeros2[5] = 0;
    arrayNumeros2[6] = 0;
    arrayNumeros2[7] = 0;
    arrayNumeros2[8] = 0;
    arrayNumeros2[9] = 0;
    for (let index = 0; index <= 100; index++) {
        arrayNumeros[index] = Math.floor(getRandomArbitrary(0,10));
    }
    
    for (let index = 0; index < arrayNumeros.length; index++) {
        var total = arrayNumeros[index];
        arrayNumeros2[total] += 1;
    }
    for (let index = 0; index <= arrayNumeros2.length; index++) {
        console.log("numero de"+ index +"en el array" + arrayNumeros2[index])
        
    }
  
}