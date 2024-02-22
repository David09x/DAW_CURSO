function ejercicio16(){
    var arrayNombres = ["David","Abhi","Miguel","Bachana","Alhassan","Santi","Anais","Paula"];

    var resultado = arrayNombres.filter((elemento) => elemento.length >=6);
    console.log(resultado);
}