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
        
        this.setNombre(pNom);

    }

    public Entrenador( String pNom, String pApe, double pSB, String pNacio){
        

    }

    public double sueldoNeto(){
        
        
        return ; //TODO
        
    }


    
    public void mostrarDatos(){ //TODO
        
    }

    public String rolEntrenamiento(){ //TODO
    
        return String;
    }
}