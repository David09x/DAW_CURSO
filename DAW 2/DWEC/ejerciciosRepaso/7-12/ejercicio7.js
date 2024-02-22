function  ejercicio7(){
    var array = [];
    var resultado = "";
    var columnas = 5;
    var filas = 3
   for (let i = 0; i <  filas; i++) {
    array[i]  =  [];
    for (let j = 0; j< columnas; j++) {
            array[i][j] = "f"+(i+1)+"c"+(j+1);        
            resultado += array[i][j];
         
    }
    resultado = resultado+ "<br>";
   }
   document.getElementById("numeroEntero").innerHTML= resultado;
}