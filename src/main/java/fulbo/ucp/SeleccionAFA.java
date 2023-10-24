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

    public void agregarIntegrante(IntegranteSeleccion pIntegrante) {
        getSeleccionado().add(pIntegrante);
    }
    
    public void quitarIntegrante(IntegranteSeleccion pIntegrante) {
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

    public String mostrarNomina() {
        StringBuilder nominacompleta= new StringBuilder("");
        double montoTotal= 0;

        nominacompleta.append("--------------------------------------------------------------------------------------\r\n" + //
                "Resumen de sueldos a pagar:\r\n" + //
                "--------------------------------------------------------------------------------------\r\n");

        for (int i = 0; i < getSeleccionado().size(); i++) {
            IntegranteSeleccion integrante= getSeleccionado().get(i);
            /*nominacompleta.append(
            integrante.getApellido()+ ", " + integrante.getNombre() + " - Sueldo Básico: $" +
            integrante.getSueldoBasico() + (integrante.getHijos() > 0? " - Hijos: " + integrante.getHijos() : ""));
            

            if (integrante instanceof Jugador) {
                Jugador jugador= (Jugador)integrante;
                nominacompleta.append(" - Jugador - " + jugador.getPosicionTactica() + 
                (jugador.getPremio()? " (Premio habilitado)" : "") + "\r\n");
            }else

            if (integrante instanceof Entrenador) {
                Entrenador entrenador= (Entrenador)integrante;
                nominacompleta.append("Entrenador - Nacionalidad: " + entrenador.getNacionalidad());
            }else

            if (integrante instanceof Masajista) {
                Masajista masajista= (Masajista)integrante;
                nominacompleta.append("Masajista" + " - Titulación: " + masajista.getTitulacion());*/
            nominacompleta.append(integrante.mostrarDatos());


            nominacompleta.append("Sueldo Neto: $" + integrante.sueldoNeto() + "\r\n");
            montoTotal+= integrante.sueldoNeto();
        }

        nominacompleta.append("--------------------------------------------------------------------------------------\r\n" +
                "Monto total a pagar en concepto de sueldos: $ " + montoTotal + "\r\n" +
                "--------------------------------------------------------------------------------------");

        return nominacompleta.toString();
    }
}