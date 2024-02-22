function  ejercicio14(){

    var palabras = ["la","cosa","esta","mal"];
    var resultado = "";
    for (let index = 0; index < palabras.length; index++) {
        resultado = resultado.concat(palabras[index]);
    }

    document.getElementById("palabraDada").innerHTML = resultado;
}