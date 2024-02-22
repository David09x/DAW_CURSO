window.onload = function (){
    imagenesRandom();
}
var imagenes = ['john.jpg','fernando.jpg','cueva.jpg']
function imagenesRandom(){
    var textos = document.getElementById("content");
    while(textos.hasChildNodes()){
        textos.removeChild(textos.firstChild);
    } 
    var randomImagen = getImage();
    var imagenNueva = document.createElement("img");
    imagenNueva.src = randomImagen;
    textos.appendChild(imagenNueva);
}

function getImage() {
    var numeroRandom = Math.floor(Math.random() * imagenes.length);
    return imagenes[numeroRandom];
  }