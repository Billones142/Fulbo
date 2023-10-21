package fulbo.ucp;

import java.util.ArrayList;

public class SeleccionAFA {
    public SeleccionAFA(String pPresidente) {
        super();
        setPresidente(pPresidente);
    }

    private ArrayList<IntegranteSeleccion> seleccionado= new ArrayList<>();
    private String presidente;

    /********************Comienzo encapsulacion********************/
    private void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setSeleccionado(ArrayList<IntegranteSeleccion> seleccionado) {
        this.seleccionado = seleccionado;
    }

    public ArrayList<IntegranteSeleccion> getSeleccionado() {
        return seleccionado;
    }
    /**********************Fin encapsulacion**********************/

    public void mostrarNomina() { //TODO
        
    }

    public void agregarIntegrante(IntegranteSeleccion pIntegrante) { //TODO
        getSeleccionado().add(pIntegrante);
    }

    public void quitarIntegrante(IntegranteSeleccion pIntegrante) { //TODO
        for (int i = 0; i < getSeleccionado().size(); i++) {
            if (getSeleccionado().get(i) == pIntegrante) {
                getSeleccionado().remove(i);
                break;
            }
        }
    }

    public void liquidarSueldos() { //TODO
        
    }

    public void conocerRol(String pApellido) { //TODO
        
    }
}