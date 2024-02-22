window.addEventListener("load", (event) => {

  CarregarPosts();
  obtenerTodosUsuarios();
});


function CarregarPosts() {
  fetch('https://jsonplaceholder.typicode.com/posts/?_start=0&_end=10')
    .then((response) => response.json())
    .then((json) => {
      var contingut = document.getElementById("contingut");
      var hx, hx2;
      var div1, div2;
      var px;
      var ax, ax2, ax3;

      for (var i = 0; i < json.length; i++) {
        '<div class="card" id="post_"+json[i].id style="width: 18rem;">'
        div1 = document.createElement("div")
        div1.setAttribute("id", "post_" + json[i].id);
        div1.classList.add("card");
        div1.style.width = "18rem";
        div1.style.border = "2px solid black";
        div1.style.margin = "20px 10px"
        contingut.appendChild(div1);
        '<div class="card-body">'
        div2 = document.createElement("div")
        div2.classList.add("card-body");
        div2.setAttribute("id", "ejemplo" + json[i].id);
        div1.appendChild(div2);
        '<h6 class="card-subtitle mb-2 text-muted">Card subtitle</h6>'
        hx2 = document.createElement("h5");
        hx2.classList.add("card-subtitle", "mb-2", "text-muted");
        hx2.classList.add("card-subtitle");
        hx2.innerHTML = "Usuario id " + json[i].userId;
        div2.appendChild(hx2);
        '<p class="card-text">Some quick example text to build on the card title and make up the bulk of the cards content.</p>'
        px = document.createElement("p");
        px.setAttribute("id", "parrafo" + json[i].id);
        px.classList.add("card-text");
        px.innerHTML = json[i].title;
        div2.appendChild(px);
        px2 = document.createElement("p")
        px2.setAttribute("id", "texto" + json[i].id);
        px2.classList.add("card-text");
        px2.innerHTML = json[i].body;
        div2.appendChild(px2);
        '<a href="#" class="card-link">Card link</a>'
        ax = document.createElement("a");
        ax.setAttribute("href", "#");
        ax.classList.add("card-link");
        ax.setAttribute("id", "botonCarta" + json[i].id)
        ax.innerHTML = "carta " + (i + 1);
        div2.appendChild(ax);

        ax2 = document.createElement("a");
        ax2.innerHTML = "editar";
        ax2.classList.add("card-link");
        ax2.addEventListener("click", editar);
        ax2.setAttribute("id", "botonEditar" + json[i].id)
        div2.appendChild(ax2);

        ax3 = document.createElement("a");
        ax3.innerHTML = "borrar";
        ax3.classList.add("card-link");
        ax3.addEventListener("click", borrar);
        ax3.setAttribute("id", "botonBorrar" + json[i].id)
        div2.appendChild(ax3);
        '</div>'
        '</div>'
      }

    });

}

function editar(event) {

  var id = event.target.parentNode.parentNode.id;

  var numero = id.split("_");

  fetch("https://jsonplaceholder.typicode.com/posts/" + numero[1], {
    method: "PUT",
    body: JSON.stringify({
      title: "My PUT request",
      body: "Updating the entire object",
    }),
    headers: {
      "Content-type": "application/json; charset=UTF-8",
    },
  })
    .then((response) => response.json())
    .then((json) => {
      var texto1 = document.getElementById("ejemplo" + numero[1]);
      console.log(texto1)
      var textoagregar = document.getElementById("parrafo" + numero[1])
      texto1.removeChild(textoagregar);
      var textoagregar2 = document.getElementById("texto" + numero[1])
      texto1.removeChild(textoagregar2)
      var boton1 = document.getElementById("botonCarta" + numero[1])
      var boton2 = document.getElementById("botonEditar" + numero[1])
      var boton3 = document.getElementById("botonBorrar" + numero[1])
      texto1.removeChild(boton1)
      texto1.removeChild(boton2)
      texto1.removeChild(boton3)
      px = document.createElement("p");
      px.setAttribute("id", "parrafo" + json.id);
      px.classList.add("card-text");
      px.innerHTML = json.title;
      texto1.appendChild(px);
      px2 = document.createElement("p");
      px2.classList.add("card-text");
      px2.setAttribute("id", "texto" + json.id);
      px2.innerHTML = json.body;
      texto1.appendChild(px2);

      ax = document.createElement("a");
      ax.setAttribute("href", "#");
      ax.classList.add("card-link");
      ax.setAttribute("id", "botonCarta" + numero[1])
      ax.innerHTML = "carta " + (numero[1]);
      texto1.appendChild(ax);

      ax2 = document.createElement("a");
      ax2.innerHTML = "editar";
      ax2.classList.add("card-link");
      ax2.addEventListener("click", editar);
      ax.setAttribute("id", "botonEditar" + numero[1])
      texto1.appendChild(ax2);

      ax3 = document.createElement("a");
      ax3.innerHTML = "borrar";
      ax3.classList.add("card-link");
      ax3.addEventListener("click", borrar);
      ax3.setAttribute("id", "botonBorrar" + numero[1])
      texto1.appendChild(ax3);
    });




}
function borrar(event) {

  var id = event.target.parentNode.parentNode.id;
  var numero = id.split("_");

  alert(id);

  fetch("https://jsonplaceholder.typicode.com/posts/" + numero[1], {
    method: "DELETE",
  }).then((response) => response.json())
    .then((json) => {
      var contenido = document.getElementById("contingut");
      var contenido2 = document.getElementById(id);
      contenido.removeChild(contenido2)
    });
}

function obtenerTodosUsuarios() {
  fetch("https://jsonplaceholder.typicode.com/posts/")
    .then((response) => response.json())
    .then((json) => {
      var tablaRecoger = document.getElementById("tablaAgregar")
      var tabla, tr, tr2,thead,tbody, th, th2, th3, td, td2, td3;

      tabla = document.createElement("table");
      tabla.classList.add("table")
      tablaRecoger.appendChild(tabla);
      tr = document.createElement("tr");
      thead = document.createElement("thead")
      th = document.createElement("th")
      th2 = document.createElement("th")
      th3 = document.createElement("th")
      tabla.appendChild(thead);
      thead.appendChild(tr)
      thead.classList.add("table-dark")
     tr.appendChild(th);
      tr.appendChild(th2);
      tr.appendChild(th3);
      var textoCelda = document.createTextNode("id");
      var textoTitle = document.createTextNode("Title");
      var textoContenido = document.createTextNode("Body");

      th.appendChild(textoCelda);
      th2.appendChild(textoTitle);
      th3.appendChild(textoContenido);
      tbody = document.createElement("tbody");
      tabla.appendChild(tbody);
      for (let i = 0; i < json.length; i++) {
        tr2 = document.createElement("tr")
        tbody.appendChild(tr2);
        td = document.createElement("td");
        td2 = document.createElement("td");
        td3 = document.createElement("td");
        td.innerHTML = json[i].id;
        td2.innerHTML = json[i].title;
        td3.innerHTML = json[i].body;
        tr2.appendChild(td);
        tr2.appendChild(td2);
        tr2.appendChild(td3)
      }
    });
}

