function ejercicio17() {

    var arrayProductos = [["juego1", 85],
    ["juego2", 99],
    ["juego3", 45],
    ["juego4", 55],
    ["juego5", 88]];
    var arrayPrecios = [];

    for (var i = 0; i < arrayProductos.length; i++) {
        for (let j = 0; j < arrayProductos.length; j++) {
            if (arrayProductos[i][j] >= 75) {
                arrayPrecios.push(arrayProductos[i])
            } else {
                continue;
            }
        }
    }

    for (let index = 0; index < arrayPrecios.length; index++) {
        
        for (let j = 0; j < arrayPrecios.length; j++) {
            var resultado = arrayPrecios[index][j] * 0.9; 
            console.log(arrayPrecios[index] + "precio con rebaja es " + resultado);
        }
        
    }
}