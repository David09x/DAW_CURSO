function ejercicio21(){

    var numeros =[38,14,26,11,33,1,42,29,23];
    var aux;
    for (let i = 0; i < numeros.length; i++) {
        for(let j= 0; j < numeros.length;j++){
            if(numeros[i]<numeros[j]){
                aux = numeros[i];
                numeros[i]=numeros[j];
                numeros[j]=aux;
            }  
        }
        
    }
    for (let i = 0; i < numeros.length; i++) {
        console.log(numeros[i]);
    }
}