function checkUser(){
    var nombre = document.getElementById("nombre");
    var nombreReg = /^[a-zA-Z0-9_]{3,20}$/;
    if(nombre.value === ''){
        return false
    }
    if(!nombreReg.test(nombre.value)){
        nombre.style.border = "3px solid red";
        return false;
    }
    else{
        nombre.style.border = "3px solid green";
        return true;
    }
    habilitarBoton();
}
function checkEmail(){
    var email = document.getElementById("correo");
    var emailReg = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/
    if (email.value === '') {
        return false;
    }
    if (!emailReg.test(email.value)) {
        email.style.border = "3px solid red";
        return false;
    } 
    else {
        email.style.border = "3px solid green";
        return true;
    }
    habilitarBoton();
}
function checkPasswd(){
    var passwd = document.getElementById("contrasena");
    var passwdReg = /^[a-zA-Z0-9_]{3,20}$/;
    if(passwd.value === ''){
        return false
    }
    if(!passwdReg.test(passwd.value)){
        passwd.style.border = "3px solid red";
        return false;
    }
    else{
        passwd.style.border = "3px solid green";
        return true;
    }
    habilitarBoton();
}
function checkDate(){
    var date = document.getElementById("fecha_nacimiento");
    var dateReg = /^\d{4}-\d{2}-\d{2}$/;
    if(date.value === ''){
        return false
    }
    if(!dateReg.test(date.value)){
        date.style.border = "3px solid red";
        return false;
    }
    else{
        date.style.border = "3px solid green";
        return true;
    }
}
function checkNumber(){
    var numero = document.getElementById("numero");
    var numeroReg = /^[0-9]{9}$/;
    if(numero.value === ''){
        return false
    }
    if(!numeroReg.test(numero.value)){
        numero.style.border = "3px solid red";
        return false;
    }
    else{
        numero.style.border = "3px solid green";
        return true;
    }
}
function checkTerms(){
    var terms = document.getElementById("checkbox");
    var noTerms = document.getElementById("noTerms");

    if (!terms.checked) {
        noTerms.textContent = "Acepta los terminos para seguir";
        noTerms.style.color = "red"
        return false;
    } 
    else {
        noTerms.textContent = ""
        return true;
    }
}
function checkOption(){
    var option1 = document.getElementById("radio1");
    var option2 = document.getElementById("radio2");
    var noOption = document.getElementById("noOption");

    if (!option1.checked && !option2.checked) {
        noOption.textContent = "Selecciona al menos una opcion";
        noOption.style.color = "red"
        return false;
    } 
    else {
        noOption.textContent = ""
        return true;
    }
}
function checkArea(){
    var textArea = document.getElementById("area_texto");
    var textAreaReg = /^[a-zA-Z0-9_]{3,175}$/;
    if(textArea.value === ''){
        return false
    }
    if(!textAreaReg.test(textArea.value)){
        textArea.style.border = "3px solid red";
        return false;
    }
    else{
        textArea.style.border = "3px solid green";
        return true;
    }
}
function alerta(){
    var option1 = document.getElementById("radio1");
    var option2 = document.getElementById("radio2");
    var defOption = "";
    if (option1.checked) {
        defOption = option1;
    } 
    else {
        defOption = option2;
    }
    var selection = document.getElementById("seleccion")
    alert
    (
    "Nombre         : "+document.getElementById("nombre").value+"\n"+
    "Correo         : " + document.getElementById("correo").value+"\n"+
    "Contraseña     : " + document.getElementById("contrasena").value+"\n"+
    "Fecha Nac      : " + document.getElementById("fecha_nacimiento").value+"\n"+
    "Numero Tlf     : " + document.getElementById("numero").value+"\n"+
    "Acepta term    : " + document.getElementById("checkbox").value+"\n"+
    "Opcion elegida : " + defOption.value+"\n"+
    "Segunda Opcion : " + selection.value+"\n"+
    "Texto libre    : " + document.getElementById("area_texto").value
    );
}
function habilitarBoton(){
    var nombreValido = checkUser();
    var emailValido = checkEmail();
    var passwdValido = checkPasswd();
    var dateValido = checkDate();
    var numeroValido = checkNumber();
    var termsValido = checkTerms();
    var optionValido = checkOption();
    var checkAreaValido = checkArea();
    var enviarBtn = document.getElementById("enviarBtn");

    if (nombreValido && emailValido && passwdValido && dateValido && numeroValido && termsValido && optionValido && checkAreaValido){
        enviarBtn.disabled = false;
    }
    else{
        enviarBtn.disabled = true;
    }
}