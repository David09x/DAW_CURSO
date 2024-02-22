public class Tarea {

    private String nombreTarea;
    private boolean tareaTerminada;

    public Tarea(String nombreTarea,  boolean tareaTerminada) {
        this.nombreTarea = nombreTarea;
        this.tareaTerminada = tareaTerminada;
    }

    public String getNombreTarea() {
        return nombreTarea;
    }

    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }


    public boolean isTareaTerminada() {
        return tareaTerminada;
    }

    public void setTareaTerminada(boolean tareaTerminada) {
        this.tareaTerminada = tareaTerminada;
    }

    @Override
    public String toString(){
        return "Tarea: " + nombreTarea + "\n" + "Realizada: " + tareaTerminada;
    }
}
