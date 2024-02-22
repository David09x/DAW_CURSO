window.onload = function() {
textoCabecera();
cambiarColor();
borrarContenido();
}

function textoCabecera(){
    var textos = document.getElementById("header");
    textos.innerHTML="<h1>hola que tal</h1>";
    var links = document.querySelectorAll('#menu li a');
    links[0].innerHTML = "bien y tu?";
    links[1].innerHTML = "aqui andamos esperando";
    links[2].innerHTML = "Cuando nos vamos a casa Miguel?";
    links[3].innerHTML = "ya estic cansat";
    links[4].innerHTML = "abhi: ya son las 8 a casa";
    var links2 = document.querySelectorAll('#sidebar ul li a');
    links2[0].innerHTML = "buenas noches Marcos";
    links2[1].innerHTML = "Buenas noches caballero";
    links2[2].innerHTML = "Yeee que yo vi a Marco de fiesta";
    links2[3].innerHTML = "Buenas Buenas";
    links2[4].innerHTML = "abhi: ya son las 8:30 a casa ya que ya es hora";
}

function cambiarColor(){
    var links2 = document.querySelectorAll('#sidebar ul li a');
    var link = document.querySelectorAll('#menu li a');
    for (let index = 0; index < link.length; index++) {
        link[index].style.color = "red";
        links2[index].style.color =  "blue";
    }

    
}

function borrarContenido(){
    var contenido = document.getElementById("content");

    contenido.innerHTML= "";
    
var parrafo = document.createElement("p");
 // Crear nodo de tipo Text

parrafo.innerHTML  = "Killo el otro dia fui al Medico y me quito el Jamon, las gambas y el vino. Y entonces tu que hicistes killo? Yo? que no voy mas al medico con los mandaos del mercadona.";
// Añadir el nodo Text como hijo del nodo Element
contenido.appendChild(parrafo);

var parrafo1 = document.createElement("p");
 // Crear nodo de tipo Text
parrafo1.innerHTML  = "Va la mujer a una farmacia y le dice al Farmaceutico. ¿ Me da un bote de arsenico? a lo que el farmaceutico le contesta: Como le voy  a dar un bote de arsenico y para que lo quiere? le contesta: para matar a mi Marido. Yo como le voy a dar arsenico para que me acusen de complice? imposible yo no puedo darle arsenico. Le saca 1 foto se le ensenya y era su mujer acostandose con su marido a lo que contesta. Hombre con Receta es otra cosa.";
// Añadir el nodo Text como hijo del nodo Element
contenido.appendChild(parrafo1);

var parrafo2 = document.createElement("p");
 // Crear nodo de tipo Text
parrafo2.innerHTML  = "Veo a mi primo Ramiro despues de 2 semanas y le digo que tal el medico Ramiro? y me dice pues bien me ha dicho que haga mas deporte, que coma mas sano y que como mucho 2 cigarros al dia. Y entonces como lo llevas? pues lo peor que llevo es lo de los 2 cigarros al dia porque yo no he fumado en mi vida. ";
// Añadir el nodo Text como hijo del nodo Element
contenido.appendChild(parrafo2);


   
}
