package fulbo.ucp;

abstract class IntegranteSeleccion {
    public IntegranteSeleccion(String pNom, String pApe, int pH, double pSB) {
        super();
        setNombre(pNom);
        setApellido(pApe);
        setSueldoBasico(pSB);
        setHijos(pH);
    }

    public IntegranteSeleccion(String pNom, String pApe, double pSB) {
        super();
        setNombre(pNom);
        setApellido(pApe);
        setSueldoBasico(pSB);
        setHijos(0);
    }
    
    String nombre;
    String apellido;
    int hijos;
    double sueldoBasico;

    /*********************Inicio De Encapsulacion*********************/
    protected void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    protected void setHijos(int hijos) {
        this.hijos = hijos;
    }

    public int getHijos() {
        return hijos;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    protected void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }
    /*********************Fin De Encapsulacion*********************/

    public abstract String rolEntrenamiento();

    protected double adicionalHijos(){
        return getHijos()*5000;
    }

    protected double aportes(){ //TODO
        
    }

    public double sueldoNeto(){ //TODO
        
    }

    protected String apeYnom(){ //TODO
        return getApellido()+ " " + getNombre();
    }

    public void mostrarDatos(){ //TODO
        
    }
}