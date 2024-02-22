function ejercicio13(){

    var animal = document.getElementById("animalDado").value;

    var array = ["perro","gato","leon","tigre"];

    if(!array.includes(animal)){
        document.getElementById("animalBuscado").innerHTML= "no esta el animal";
    }else{
        document.getElementById("animalBuscado").innerHTML= " esta el animal";
    }

}