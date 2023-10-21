import static org.junit.Assert.*;

import org.junit.Test;

import fulbo.ucp.Jugador;
import fulbo.ucp.SeleccionAFA;


public class SeleccionAFATest {
    @Test
    public void nominaJugadorConPremioTest() {// TODO
        SeleccionAFA seleccionAFA= new SeleccionAFA("Escaloni");
        Jugador messi= new Jugador("Lionel", "Messi", 3, 200000, "Delantero", true);
        seleccionAFA.agregarIntegrante(messi);

        String nomina= "--------------------------------------------------------------------------------------\n" + //
                "Resumen de sueldos a pagar:\n" + //
                "--------------------------------------------------------------------------------------\n" + //
                "Messi, Lionel - Sueldo Básico: $200000.0 - Hijos: 3 - Jugador - Delantero (Premio habilitado)\n" + //
                "Sueldo Neto: $260000.0\n" + //
                "--------------------------------------------------------------------------------------\n" + //
                "Monto total a pagar en concepto de sueldos: $ 260000.0\n" + //
                "--------------------------------------------------------------------------------------";
        String nominaCreada= seleccionAFA.mostrarNomina();

        assertEquals(nomina, nominaCreada);
    }

    @Test
    public void nominaJugadorSinPremioTest() {// TODO
        SeleccionAFA seleccionAFA= new SeleccionAFA("Escaloni");
        Jugador dybala= new Jugador("Paulo", "Dybala", 120000, "Delantero", false);
        seleccionAFA.agregarIntegrante(dybala);

        String nomina= "--------------------------------------------------------------------------------------\n" + //
                "Resumen de sueldos a pagar:\n" + //
                "--------------------------------------------------------------------------------------\n" + //
                "Dybala, Paulo - Sueldo Básico: $120000.0 - Jugador - Delantero\n" + //
                "Sueldo Neto: $74000.0\n" + //
                "--------------------------------------------------------------------------------------\n" + //
                "Monto total a pagar en concepto de sueldos: $ 74000.0\n" + //
                "--------------------------------------------------------------------------------------";
        String nominaCreada= seleccionAFA.mostrarNomina();

        assertEquals(nomina, nominaCreada);
    }

    @Test
    public void nominaEntrenadorTest() {// TODO
        
    }

    @Test
    public void nominaMasajistaTest() {// TODO
        
    }
}