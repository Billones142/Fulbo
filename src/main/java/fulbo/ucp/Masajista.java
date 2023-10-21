package fulbo.ucp;

public class Masajista extends IntegranteSeleccion{
    public Masajista(String pNom, String pApe, int pH, double pSB) {
        super(pNom, pApe, pH, pSB);
    }

    public Masajista(String pNom, String pApe, double pSB) {
        super(pNom, pApe, pSB);
    }
    
    String titulacion;

    /********************Comienzo encapsulacion********************/
    public void setTitulacion(String nacionalidad) {
        this.titulacion = nacionalidad;
    }

    public String getTitulacion() {
        return titulacion;
    }
    /**********************Fin encapsulacion**********************/

    public String rolEntrenamiento() { //TODO
        return "";
    }

    public String mostrarDatos() { //TODO
        return "";
    }
}