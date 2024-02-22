function Hospital(nombre,ciudad,num_pacientes){
    //constructor de la clase hospital
    this.nombre = nombre;
    this.ciudad= ciudad;
    this.num_pacientes = num_pacientes;

    function numeroIngresados(array){
        this.num_pacientes = array.length;
    }
    this.numeroIngresados = numeroIngresados;
    function darAltaPaciente(array,dniP){
        for (let i = 0; i < array.length; i++) {
            if(array[i].dni == dniP){ 
                array.splice(i,1);
                console.log("paciente dado de alta");
            }
        }
        this.numeroIngresados(array);
    }
    this.darAltaPaciente = darAltaPaciente
    function añadirPaciente(array,paciente){
        array.push(paciente);
    }
    this.añadirPaciente = añadirPaciente;

}
    

function paciente(dni,nombre,enfermedad){
    //Constructor del paciente
    this.dni = dni;
    this.nombre = nombre;
    this.enfermedad = enfermedad;  

}
var pacientes = new Array();
var uno = new Hospital("TODOS LOS SANTOS","Gandia",pacientes.length);
var pacienteuno= new paciente("123456","abhi","tonteria");
var pacientedos= new paciente("789010","miguel","ganas de vivir")
var pacientetres= new paciente("123456789","bacho","todo un poco")

uno.añadirPaciente(pacientes,pacienteuno)
uno.añadirPaciente(pacientes,pacientedos)
uno.añadirPaciente(pacientes,pacientetres)
uno.numeroIngresados(pacientes);
console.log("numero de pacientes: " +uno.num_pacientes);
uno.darAltaPaciente(pacientes,"789010");
console.log("numero de pacientes: " +uno.num_pacientes);
