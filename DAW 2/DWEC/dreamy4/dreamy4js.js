window.onload = function(){
tabla();
   
}
var paises = ["Espanya","USA","Italia","UK","Irlanda"];
var capitales = ["Madrid", "Washington","Roma","Londres","Dublin"]
function tabla(){
    var textos = document.getElementById("content");
    while(textos.hasChildNodes()){
        textos.removeChild(textos.firstChild);
    } 

    var tabla = document.createElement("table");
    tabla.style.border ="1px solid black";
    tabla.style.width = "100%"
    tabla.style.textAlign = "center"
    tabla.style.borderCollapse = "collapse"
    tabla.style.marginTop = "15px";
    var thead = document.createElement('thead');
   
  var tbody = document.createElement("tbody");
  tabla.appendChild(thead);
  tabla.appendChild(tbody);
  textos.appendChild(tabla);

  var row_1 = document.createElement('tr');
 
  var heading_1 = document.createElement('th');
  heading_1.innerHTML = "Paises";
  var heading_2 = document.createElement('th');
  heading_2.innerHTML = "Capitales";

  
  row_1.appendChild(heading_1);
  row_1.appendChild(heading_2);
  thead.appendChild(row_1);
  
  for (let index = 0; index < paises.length; index++) {
    var row_2 = document.createElement('tr');
   
    var row_2_data_1 = document.createElement('td');
    row_2_data_1.innerHTML = paises[index];
    var row_2_data_2 = document.createElement('td');
    row_2_data_2.innerHTML = capitales[index];
  
    
    row_2.appendChild(row_2_data_1);
    row_2.appendChild(row_2_data_2);
    tbody.appendChild(row_2)
    row_2_data_1.style.border = "1px solid black";
    row_2_data_2.style.border = "1px solid black";
  }
 

}