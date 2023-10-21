package fulbo.ucp;

public class Entrenador 
    extends IntegranteSeleccion{
    public Entrenador( String pNom, String pApe, int pH, double pSB, String pNacio){
        super(pNom, pApe, pH, pSB);
        setNacionalidad(pNacio);
    }

    public Entrenador( String pNom, String pApe, double pSB, String pNacio){
        super(pNom,pApe,pSB);
        setNacionalidad(pNacio);
    }

    private String nacionalidad;

    /*********************Inicio De Encapsulacion*********************/
    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /*********************Fin De Encapsulacion*********************/

    public double sueldoNeto(){
        return aportes() + adicionalHijos();
    }


    
    public String mostrarDatos(){ //TODO
        return "";
    }

    public String rolEntrenamiento(){ //TODO
        return "";
    }
}