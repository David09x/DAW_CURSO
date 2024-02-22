public class domicilio {

    private String calle;
    private int numero;
    private int piso;
    private String puerta;
    private int codigo_postal;
    private String poblacion;
    private String provincia;


    public domicilio() {
    }


    public domicilio(String calle, int numero, int piso, String puerta, int codigo_postal, String poblacion,
            String provincia) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.puerta = puerta;
        this.codigo_postal = codigo_postal;
        this.poblacion = poblacion;
        this.provincia = provincia;
    }


    public String getCalle() {
        return calle;
    }


    public void setCalle(String calle) {
        this.calle = calle;
    }


    public int getNumero() {
        return numero;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }


    public int getPiso() {
        return piso;
    }


    public void setPiso(int piso) {
        this.piso = piso;
    }


    public String getPuerta() {
        return puerta;
    }


    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }


    public int getCodigo_postal() {
        return codigo_postal;
    }


    public void setCodigo_postal(int codigo_postal) {
        this.codigo_postal = codigo_postal;
    }


    public String getPoblacion() {
        return poblacion;
    }


    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }


    public String getProvincia() {
        return provincia;
    }


    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    
    public void imprimirDomicilio(){

        System.out.println(this.getCalle() + " "+ this.getNumero() + " " + this.getPiso() + " " + 
        this.getPuerta() + " " + this.getCodigo_postal() + " " + this.getPoblacion() + " " + this.getProvincia());

    }
    


    
    
}
