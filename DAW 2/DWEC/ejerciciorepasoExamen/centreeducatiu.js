const colleccioAlumnes = {
  "alumnes": [
    {
      "nom": "Pere",
      "cognoms": "Martínez Soler",
      "dni": "12345678A",
      "data_naixement": "1998-03-15",
      "sexe": "Home",
      "nota_mitja": 8.5
    },
    {
      "nom": "Marta",
      "cognoms": "Gimeno Ramon",
      "dni": "98765432B",
      "data_naixement": "1999-07-22",
      "sexe": "Dona",
      "nota_mitja": 7.2
    },
    {
      "nom": "Jordi",
      "cognoms": "Fuster Vidal",
      "dni": "56789012C",
      "data_naixement": "2000-05-10",
      "sexe": "Home",
      "nota_mitja": 6.8
    },
    {
      "nom": "Anna",
      "cognoms": "Llopis Ferrer",
      "dni": "34567890D",
      "data_naixement": "1997-11-28",
      "sexe": "Dona",
      "nota_mitja": 9.0
    },
    {
      "nom": "Enric",
      "cognoms": "Serra Moreno",
      "dni": "13579246E",
      "data_naixement": "1998-09-05",
      "sexe": "Home",
      "nota_mitja": 7.5
    },
    {
      "nom": "Clara",
      "cognoms": "Vidal Roig",
      "dni": "24680135F",
      "data_naixement": "1999-02-18",
      "sexe": "Dona",
      "nota_mitja": 8.2
    },
    {
      "nom": "Marc",
      "cognoms": "Moll Navarro",
      "dni": "98765432G",
      "data_naixement": "2000-07-01",
      "sexe": "Home",
      "nota_mitja": 6.5
    },
    {
      "nom": "Elena",
      "cognoms": "Ferrer Gil",
      "dni": "12345678H",
      "data_naixement": "1997-04-12",
      "sexe": "Dona",
      "nota_mitja": 9.5
    },
    {
      "nom": "Lluís",
      "cognoms": "Soler Roselló",
      "dni": "87654321I",
      "data_naixement": "1998-08-24",
      "sexe": "Home",
      "nota_mitja": 7.8
    },
    {
      "nom": "Silvia",
      "cognoms": "Fuster Tormo",
      "dni": "56789012J",
      "data_naixement": "1999-01-30",
      "sexe": "Dona",
      "nota_mitja": 8.9
    },
    {
      "nom": "Carles",
      "cognoms": "Tortosa Gisbert",
      "dni": "10987654K",
      "data_naixement": "2000-04-05",
      "sexe": "Home",
      "nota_mitja": 7.0
    },
    {
      "nom": "Laura",
      "cognoms": "Gómez Ferrer",
      "dni": "54321098L",
      "data_naixement": "1997-10-18",
      "sexe": "Dona",
      "nota_mitja": 8.0
    },
    {
      "nom": "Xavier",
      "cognoms": "Navarro Vidal",
      "dni": "98765432M",
      "data_naixement": "1998-06-28",
      "sexe": "Home",
      "nota_mitja": 7.3
    },
    {
      "nom": "Eva",
      "cognoms": "Ferrer Tormo",
      "dni": "12345678N",
      "data_naixement": "1999-03-08",
      "sexe": "Dona",
      "nota_mitja": 8.7
    },
    {
      "nom": "Roger",
      "cognoms": "Soler Martí",
      "dni": "87654321O",
      "data_naixement": "2000-02-14",
      "sexe": "Home",
      "nota_mitja": 6.7
    },
    {
      "nom": "Aina",
      "cognoms": "Vidal Ferrer",
      "dni": "13579246P",
      "data_naixement": "1997-09-30",
      "sexe": "Dona",
      "nota_mitja": 9.2
    },
    {
      "nom": "Ricard",
      "cognoms": "Tormo Fuster",
      "dni": "24680135Q",
      "data_naixement": "1998-12-11",
      "sexe": "Home",
      "nota_mitja": 7.9
    },
    {
      "nom": "Sara",
      "cognoms": "Ferrer Serra",
      "dni": "98765432R",
      "data_naixement": "1999-05-20",
      "sexe": "Dona",
      "nota_mitja": 8.4
    },
    {
      "nom": "Aleix",
      "cognoms": "Soler Martínez",
      "dni": "56789012S",
      "data_naixement": "2000-08-07",
      "sexe": "Home",
      "nota_mitja": 6.0
    },
    {
      "nom": "Júlia",
      "cognoms": "Gisbert Soler",
      "dni": "34567890T",
      "data_naixement": "1997-01-25",
      "sexe": "Dona",
      "nota_mitja": 8.6
    }
  ]
}

function generarAlumnes() {
  return colleccioAlumnes.alumnes;
}

function nouAlumne() {

}

function inserirAlumne() {

}

function eliminarAlumne() {

}

/*funciones*/

function pintarTabla() {
  var contenido = document.getElementById("wrapper");
  var taula = document.createElement("table");
  var alumnes = generarAlumnes();
  contenido.appendChild(taula);
  var fila;
  var celda;
  for (let index = 0; index < alumnes.length; index++) {
    fila = document.createElement("tr");

    celda = document.createElement("td");
    celda.innerHTML = alumnes[index].nom;
    fila.appendChild(celda);

    celda = document.createElement("td");
    celda.innerHTML = alumnes[index].cognoms;
    fila.appendChild(celda);

    celda = document.createElement("td");
    celda.innerHTML = alumnes[index].dni;
    fila.appendChild(celda);

    celda = document.createElement("td");
    celda.innerHTML = alumnes[index].data_naixement;
    fila.appendChild(celda);

    celda = document.createElement("td");
    celda.innerHTML = alumnes[index].sexe;
    fila.appendChild(celda);

    celda = document.createElement("td");
    celda.innerHTML = alumnes[index].nota_mitja;
    celda.className = "cNota";
    fila.appendChild(celda);

    taula.appendChild(fila)
  }


}



/*function notaMedia(nota){
  var nota = document.querySelectorAll("td.cNota");
  for (var index = 0; index < nota.length; index++) {
        if(parseFloat(nota[index].textContent) >=nota){
          nota[index].parentNode.style.color ="red";
        }
      
  }

}*/

function marcarNota(nota) {
  var files = document.querySelectorAll("td.cNota");
  for (let i = 0; i < files.length; i++) {
    if (parseFloat(files[i].textContent) >= nota) {
      files[i].parentNode.style.color = "red";
    }

  }
}

document.addEventListener("DOMContentLoaded", () => {
  pintarTabla();
  marcarNota(7);
});
