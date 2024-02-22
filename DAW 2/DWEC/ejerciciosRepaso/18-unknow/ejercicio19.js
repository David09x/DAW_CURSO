function ejercicio19(){

    var numeros =[38,14,26,11,33,1,42,29,23];
    var maximo=0;
    var minimo= 99;
    for (let index = 0; index < numeros.length; index++) {
       if(numeros[index]>maximo){
        maximo=numeros[index];
       }else if(numeros[index]<minimo){
        minimo=numeros[index];
       }else{
        continue;
       }
    }
    document.getElementById("numerosMyM").innerHTML="el numero maximo es " + maximo + " y el numero mino es " + minimo; 
}