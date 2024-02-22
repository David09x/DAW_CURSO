function ejercicio9() {

    var arrayNumeros = [];
    var filas = 3;
    var arrayInterno;
    for (let i = 0; i < filas; i++) {
        arrayInterno = [];
        for (let j = 0; j <=5; j++) {
            arrayInterno.push(j);
            
        }
        arrayNumeros.push(arrayInterno);
    }
    for (let i = 0; i < arrayNumeros.length; i++) {
        for (let j = 0; j <= arrayNumeros.length; j++) {
            console.log(arrayNumeros[i][j]);
            
        }
    }
}