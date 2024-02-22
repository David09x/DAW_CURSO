function ejercicio22(){
    var operacion = document.getElementById("operacion").value;
    var numeroP = document.getElementById("numero1").value;
    var numeroS = document.getElementById("numero2").value;
    var resultado = 0;
    switch(operacion){
        case "sumar":
            resultado = parseInt(numeroP) + parseInt(numeroS);
            document.getElementById("res").innerHTML = resultado.toString();
           break; 
        case "restar":
            resultado = parseInt(numeroP) - parseInt(numeroS);
            document.getElementById("res").innerHTML = resultado.toString();
            break;
        case "dividir":
            resultado = parseInt(numeroP) / parseInt(numeroS);
            document.getElementById("res").innerHTML = resultado.toString();
            break;
        case "multiplicar":
            resultado = parseInt(numeroP) * parseInt(numeroS);
            document.getElementById("res").innerHTML = resultado.toString();
            break;
    }
}