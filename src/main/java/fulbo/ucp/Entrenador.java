package fulbo.ucp;

public class Entrenador 
    extends IntegranteSeleccion{

    private String nacionalidad="";//TODO: CREAR GETTER Y SETTER

    /*********************Inicio De Encapsulacion*********************/
    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /*********************Fin De Encapsulacion*********************/


    public Entrenador( String pNom, String pApe, int pH, double pSB, String pNacio){
        super(pNom, pApe, pH, pSB);

    }

    public Entrenador( String pNom, String pApe, double pSB, String pNacio){
        super(pNom,pApe,pSB);
    }

    public double sueldoNeto(){//TODO
        
        
        return 0.1;
        
    }


    
    public void mostrarDatos(){ //TODO
        
    }

    public String rolEntrenamiento(){ //TODO
    
        return "";
    }
}