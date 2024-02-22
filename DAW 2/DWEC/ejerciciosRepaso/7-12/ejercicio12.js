function getRandomArbitrary(min, max) {
    return Math.random() * (max - min) + min;
  }

function ejercicio12(){
    var arrayNumeros =[];

    for (let index = 0; index <= 100; index++) {
        var numero =  Math.floor(getRandomArbitrary(0,10));
        if(index >=25 && index <= 75){
            arrayNumeros.push(0);
        }else{
            arrayNumeros.push(numero);
        }
    }

    for (let index = 0; index < arrayNumeros.length; index++) {
        console.log(arrayNumeros[index]);
        
    }
}