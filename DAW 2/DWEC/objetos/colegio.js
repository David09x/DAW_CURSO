function colegio(nombre,numeroAulas,numeroAlumnos){
    this.nombre =nombre;
    this.numeroAulas=numeroAulas;
    this.numeroAlumnos=numeroAlumnos;

    function anyadirAlumno(alumno,array){
        array.push(alumno);
    }
    this.anyadirAlumno =anyadirAlumno;
    function alumnosMatriculados(array){
        this.numeroAlumnos=array.length;
    }
    this.alumnosMatriculados= alumnosMatriculados;
    function buscarNotaAlumno(dniP,array,nota){
        for (let index = 0; index < array.length; index++) {
            if(array[index].dni == dniP){
                array[index].modificarNotaMedia(nota)
               console.log("nota modificada")
               break;
            }
        }
    }
    this.buscarNotaAlumno= buscarNotaAlumno;
}


function alumno(dni,nombre,notaMedia){
    this.dni= dni;
    this.nombre= nombre;
    this.notaMedia = notaMedia;
    
    function modificarNotaMedia(nota){
        this.notaMedia=nota;
    }
   this.modificarNotaMedia= modificarNotaMedia;
    function mostarAlumnoDatos(){
        console.log("DNI: "+this.dni+" Nombre: "+this.nombre+" Nota Media: "+this.notaMedia);
    }
    this.mostarAlumnoDatos = mostarAlumnoDatos;
 
}
let alumnosDentro = new Array();
var colegio1 = new colegio("Escolapias","10",alumnosDentro.length)
var uno = new alumno("29391230","abhi",2);
var dos = new alumno("9102310","miguel",1);
colegio1.anyadirAlumno(uno,alumnosDentro);
colegio1.anyadirAlumno(dos,alumnosDentro);
colegio1.alumnosMatriculados(alumnosDentro);
uno.mostarAlumnoDatos();
colegio1.buscarNotaAlumno("29391230",alumnosDentro,5);
uno.mostarAlumnoDatos();

