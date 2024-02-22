import java.util.ArrayList;

public class Usuario {

    private String nom;
    private String Apellidos;
    private Material tiene;
    private ArrayList<Material> historialRecogidas = new ArrayList<>();

    public Usuario(String nom, String apellidos) {
        this.nom = nom;
        Apellidos = apellidos;
    }

    public Usuario(String nom, String apellidos, Biblioteca tiene, ArrayList<Material> historialRecogidas) {
        this.nom = nom;
        Apellidos = apellidos;
        this.tiene = tiene;
        this.historialRecogidas = historialRecogidas;
    }

    public String getNom() {
        return nom;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public Material getTiene() {
        return tiene;
    }

    public ArrayList<Material> getHistorialRecogidas() {
        return historialRecogidas;
    }

    public void setTiene(Material tiene) {
        this.tiene = tiene;
    }

    public void setHistorialRecogidas(Material a) {
        historialRecogidas.add(a);
    }
}
