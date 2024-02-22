window.onload = function() {
    enlaces();
    imagenDinamica();
    textosPrincipal();
    eliminarFavorite();
}

function enlaces(){
        
    var enlace = document.getElementsByTagName("a");
    var numeroEnlaces = 0;
    for (let index = 0; index < enlace.length; index++) {
            numeroEnlaces++; 
    }
    alert(numeroEnlaces);
}

function imagenDinamica(){
      document.querySelectorAll("#header img").forEach(function(item) {
            item.src = "images/JuanBautista.jpg";
          })           

}

function textosPrincipal(){
    var textos = document.querySelectorAll('#menu span');
    for (let index = 0; index < textos.length; index++) {
        textos[index].innerHTML ="hola que ase";  
    }
}

function eliminarFavorite(){
    var hijo = document.querySelectorAll(".submenu2");
    var padre = hijo[1].parentNode;
    var hijo2 = hijo[1];
    padre.removeChild(hijo2);
    
    var selected = document.getElementsByTagName("h3");
    selected[1].parentNode.removeChild(selected[1]);
}

