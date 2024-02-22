window.onload = function() {
texto1();
texto2();
texto3();
}

function texto1(){

    var textos = document.getElementById("header");

    while(textos.hasChildNodes()){
        textos.removeChild(textos.firstChild);
    }

    var parrafo = document.createElement("h1");
 // Crear nodo de tipo Text
var contenido2 = document.createTextNode("HOLA HOLA QUE TAL");
// Añadir el nodo Text como hijo del nodo Element
parrafo.appendChild(contenido2);

document.getElementById("header").appendChild(parrafo);
}

function texto2(){
    var textos = document.getElementById("menu");
    while(textos.hasChildNodes()){
        textos.removeChild(textos.firstChild);
    }

    var parrafo = document.createElement("li");
    // Crear nodo de tipo Text
   var contenido2 = document.createTextNode("HOLA HOLA QUE TAL");
   parrafo.style.color ="white";
   // Añadir el nodo Text como hijo del nodo Element
   parrafo.appendChild(contenido2);
   
   document.getElementById("menu").appendChild(parrafo);
   var parrafo2 = document.createElement("li");
   // Crear nodo de tipo Text
  var contenido3 = document.createTextNode("HOLA que ase");
  parrafo2.style.color ="white";
  // Añadir el nodo Text como hijo del nodo Element
  parrafo2.appendChild(contenido3);
  
  document.getElementById("menu").appendChild(parrafo2);

  var parrafo3 = document.createElement("li");
  // Crear nodo de tipo Text
 var contenido4 = document.createTextNode("HOLA COhone");
 parrafo3.style.color ="white";
 // Añadir el nodo Text como hijo del nodo Element
 parrafo3.appendChild(contenido4);
 
 document.getElementById("menu").appendChild(parrafo3);

}

function texto3(){

    var contenido = document.getElementById("content");
    while(contenido.hasChildNodes()){
        contenido.removeChild(contenido.firstChild);
    }
    
var parrafo = document.createElement("p");
 // Crear nodo de tipo Text
var contenido2 = document.createTextNode("Killo el otro dia fui al Medico y me quito el Jamon, las gambas y el vino. Y entonces tu que hicistes killo? Yo? que no voy mas al medico con los mandaos del mercadona.");
// Añadir el nodo Text como hijo del nodo Element
parrafo.appendChild(contenido2);

document.getElementById("content").appendChild(parrafo);
var parrafo2 = document.createElement("p");
 // Crear nodo de tipo Text
var contenido3 = document.createTextNode("Va la mujer a una farmacia y le dice al Farmaceutico. ¿ Me da un bote de arsenico? a lo que el farmaceutico le contesta: Como le voy  a dar un bote de arsenico y para que lo quiere? le contesta: para matar a mi Marido.");

// Añadir el nodo Text como hijo del nodo Element
parrafo2.appendChild(contenido3);

document.getElementById("content").appendChild(parrafo2);

var contenido5 = document.createTextNode("Yo como le voy a dar arsenico para que me acusen de complice? imposible yo no puedo darle arsenico. Le saca 1 foto se le ensenya y era su mujer acostandose con su marido a lo que contesta. Hombre con Receta es otra cosa.")
 var parrafo4 = document.createElement("p");

 parrafo4.appendChild(contenido5);
 document.getElementById("content").appendChild(parrafo4);

var parrafo3 = document.createElement("p");
 // Crear nodo de tipo Text
var contenido4 = document.createTextNode("Veo a mi primo Ramiro despues de 2 semanas y le digo que tal el medico Ramiro? y me dice pues bien me ha dicho que haga mas deporte, que coma mas sano y que como mucho 2 cigarros al dia. Y entonces como lo llevas? pues lo peor que llevo es lo de los 2 cigarros al dia porque yo no he fumado en mi vida. ");
// Añadir el nodo Text como hijo del nodo Element
parrafo3.appendChild(contenido4);

document.getElementById("content").appendChild(parrafo3);
   
}

