package fulbo.ucp;

public class Jugador extends IntegranteSeleccion{
    public Jugador(String pNom, String pApe, int pH, double pSB, String pPT, boolean pPrem) {
        super(pNom, pApe, pH, pSB);
        setPosicionTactica(pPT);
        setPremio(pPrem);
    }

    public Jugador(String pNom, String pApe, double pSB, String pPT, boolean pPrem) {
        super(pNom, pApe, pSB);
        setPosicionTactica(pPT);
        setPremio(pPrem);
    }

    private String posicionTactica;
    private Boolean premio;

    /********************Comienzo encapsulacion********************/
    public void setPosicionTactica(String posicionTactica) {
        this.posicionTactica = posicionTactica;
    }

    public String getPosicionTactica() {
        return posicionTactica;
    }

    public void setPremio(Boolean premio) {
        this.premio = premio;
    }

    public Boolean getPremio() {
        return premio;
    }
    /**********************Fin encapsulacion**********************/
    
    public String rolEntrenamiento() { //TODO
        return "";
    }

    public double sueldoNeto() { //TODO
        return aportes() + (getPremio()?getSueldoBasico()*0.3:0) + adicionalHijos();
    }

    public void mostrarDatos() { //TODO
        
    }
}