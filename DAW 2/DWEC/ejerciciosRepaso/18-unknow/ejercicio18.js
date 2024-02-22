function ejercicio18(){
    var nota = document.getElementById("notaAlumno").value;
    
    if(isNaN(nota)){
        document.getElementById("calificacion").innerHTML="la nota no es un numero";
    }else{
        if(nota>= 0 && nota <5){
            document.getElementById("calificacion").innerHTML="insuficiente";
        }else if(nota >=5 && nota<7){
           
                document.getElementById("calificacion").innerHTML="bien";
        }else if(nota >=7 && nota <=9){
                document.getElementById("calificacion").innerHTML="notable";
       }else{
            document.getElementById("calificacion").innerHTML="excelente/MH";
       }
    }
}
   

