function ejercicio24(){
    var fila = document.getElementById("fila").value;
    var columna = document.getElementById("columna").value;

    var arrayBomba= new Array(5);
    for(var i = 0 ; i <=5;i++){
        arrayBomba[i] = new Array(5);
    }

    arrayBomba[1][1]="x";
    arrayBomba[0][4]="x";
    arrayBomba[2][4]="x";
    arrayBomba[3][2]="x";
    arrayBomba[4][3]="x";
    arrayBomba[5][2]="x";
    
    if(arrayBomba[fila][columna]=="x"){
        document.getElementById("resultado").innerHTML= "encontrastes bomba"
    }else{
        document.getElementById("resultado").innerHTML= "no encontraste bomba"
    }
   
}