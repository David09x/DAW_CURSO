function Aeropuerto(nombre,ciudad,numeroVuelos){
    this.nombre = nombre;
    this.ciudad= ciudad;
    this.numeroVuelos = numeroVuelos;


}

function Vuelo(codigo,hora_llegada,hora_salida){
    this.codigo= codigo;
    this.hora_llegada = hora_llegada;
    this.hora_salida = hora_salida;

    function modificarHoraLLegada(string){
        this.hora_llegada = string;
    }
    this.modificarHoraLLegada = modificarHoraLLegada;
    function modificarHoraSalida(string){
        this.hora_salida = string;
    }
    this.modificarHoraSalida= modificarHoraSalida;
    function comprobarHoras(){
        horaLlegada1= hora_llegada.substring(0,2);
        //console.log(horaLlegada1)
        horaSalida1= hora_salida.substring(0,2);
        //console.log(horaSalida1)
        horaLlegada2= hora_llegada.substring(3,5);
        //console.log( horaLlegada2)
        horaSalida2= hora_salida.substring(3,5);
        //console.log(horaSalida2)
        if (parseInt(horaLlegada1)!=parseInt(horaSalida1)) {
            if(parseInt(horaLlegada1)<parseInt(horaSalida1)){
                console.log("hora mala la ponemos a 00")
                this.modificarHoraLLegada("00:00")
                this.modificarHoraSalida("00:00")
            }else{
                console.log("horas correctas")
            }
        }else if(parseInt(horaLlegada2)<parseInt(horaSalida2)){
            console.log("minutos mal la ponemos a 00")
            this.modificarHoraLLegada("00:00")
            this.modificarHoraSalida("00:00")
        }else{
            console.log("horas correctas")
        }
    }
    this.comprobarHoras = comprobarHoras;
    function mostarVuelos(){
        console.log("Codigo: "+this.codigo+" llegada: "+this.hora_llegada+" Salida: "+this.hora_salida);
    }
    this.mostarVuelos = mostarVuelos;
}

var uno = new Vuelo("27","05:40","05:20");
uno.comprobarHoras();
uno.mostarVuelos()
