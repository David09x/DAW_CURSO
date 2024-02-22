document.addEventListener("DOMContentLoaded", function () {
    document.getElementById("formulario").addEventListener('submit', validarFormulario);
});


function selected(){
    const listaDeHorasDisponibles = [
        "2023-11-15T09:00",
        "2023-11-15T10:00",
        "2023-11-15T11:00",
        "2023-11-15T12:00",
        "2023-11-15T13:00",
        "2023-11-15T14:00",
        "2023-11-15T15:00",
        "2023-11-15T16:00",
        "2023-11-15T17:00",
        "2023-11-15T18:00",
        "2023-11-15T19:00",
        // Añade más horas disponibles según necesites
    ];
    const selectFecha = document.getElementById('fecha');

    listaDeHorasDisponibles.forEach((hora, index) => {
        const option = document.createElement('option');
        option.value = hora;
        option.text = `15 de noviembre a las ${hora.split('T')[1].substring(0, 5)}`;
        selectFecha.appendChild(option);
    });
}
function mostrarDatos() {
    var fecha = document.getElementById("fecha").selectedIndex;
    var fecha2 = document.getElementById("fecha").options;
    var nombre = document.getElementById('responsable').value;
    var telefono = document.getElementById("telefono").value;
    var correo = document.getElementById("correo").value;
    var personasRecibidas = document.getElementById("num_personas").value;
   var observaciones =  document.getElementById('observaciones').value;
    if (comprobarNombre() && comprobarTelefono() && comprobarCorreo() && comprobarNumeroPersonas() && comprobarCheckBox() && comprobarTextArea()) {
        alert("hora y fecha:" + fecha2[fecha].text + "\n" +"nombre: " + nombre + "\n" + "telefono: " + telefono + "\n" + "correo: " + correo + "\n" + "personas apuntadas: " + personasRecibidas + "\n" + "termino menor aceptado" + "\n" + "Observaciones: " + observaciones +"\n")
    }else{
        alert("Por favor, ingrese todos los campos");
    }
}





function comprobarNombre() {
    var nombreRecibido = document.getElementById("responsable").value;
    var error;
    if (nombreRecibido.length == 0) {
        error = document.getElementById("errNombre");
        error.innerHTML =  "error en el nombre"
        error.style.color ="red";
        return false;
    } else if (nombreRecibido.length < 3) {
        error = document.getElementById("errNombre");
        error.innerHTML = "tiene que tener mas de 3"
        error.style.color ="red";
        return false;
    }
        document.getElementById("errNombre").innerHTML = ""
   
    return true;

}

function comprobarTelefono() {
    var telefonoRecibido = document.getElementById("telefono").value;
    var error;
    if (telefonoRecibido.length != 9 || isNaN(Number(telefonoRecibido))) {
        error = document.getElementById("errTel");
        error.innerHTML = "mal telefono";
        error.style.color= "red"
        return false;
    }
    document.getElementById("errTel").innerHTML = ""
    return true;

}

function comprobarCorreo() {
    var correoRecibido = document.getElementById("correo").value;
    var error;
    if (correoRecibido.length == 0) {
        error =document.getElementById("errEmail");
        error.innerHTML = "error en el email";
        error.style.color = "red";
        return false;
    } else if (correoRecibido.length < 10) {
       error =  document.getElementById("errEmail")
        error.innerHTML = "tiene que tener mas de 10 letras el email";
        error.style.color = "red"
        return false;
    }
    document.getElementById("errEmail").innerHTML = ""
    return true;
}

function comprobarNumeroPersonas() {
    var personasRecibidas = document.getElementById("num_personas").value;
    var error;
    if (personasRecibidas == "") {
        error = document.getElementById("errNumero")
        error.innerHTML = "expecifica el numero de personas";
        error.style.color = "red";
        return false;
    }
    document.getElementById("errNumero").innerHTML = "";
    return true;
}

function comprobarCheckBox() {

    var terminos = document.getElementById("menores");
    var error ;
    if (!terminos.checked) {
       error = document.getElementById("errCheck")
        error.innerHTML = "no se ha comprobado";
        error.style.color = "red";
        return false;
    }
    document.getElementById("errCheck").innerHTML = ""
    return true;

}

function comprobarTextArea() {
    var comentario = document.getElementById('observaciones').value;
    var error;
    if (comentario == "" || comentario.length <= 10 || comentario.length >= 100) {
       error =  document.getElementById("errComentarios")
       error.innerHTML = "debe ser entre 10 y 100 caracteres";
       error.style.color = "red";
        return false;
    }
    document.getElementById("errComentarios").innerHTML = ""
    return true;
}
