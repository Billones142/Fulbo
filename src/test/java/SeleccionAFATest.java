import static org.junit.Assert.*;

import org.junit.Test;

import fulbo.ucp.Entrenador;
import fulbo.ucp.Jugador;
import fulbo.ucp.Masajista;
import fulbo.ucp.SeleccionAFA;


public class SeleccionAFATest {
    @Test
    public void sueldosJugadorConPremioTest() {
        SeleccionAFA seleccionAFA= new SeleccionAFA("Escaloni");
        Jugador messi= new Jugador("Lionel", "Messi", 3, 200000, "Delantero", true);
        seleccionAFA.agregarIntegrante(messi);

        String nomina= "--------------------------------------------------------------------------------------\r\n" + //
                "Resumen de sueldos a pagar:\r\n" + //
                "--------------------------------------------------------------------------------------\r\n" + //
                "Messi, Lionel - Sueldo Básico: $200000.0 - Hijos: 3 - Jugador - Delantero (Premio habilitado)\r\n" + //
                "Sueldo Neto: $260000.0\r\n" + //
                "--------------------------------------------------------------------------------------\r\n" + //
                "Monto total a pagar en concepto de sueldos: $ 260000.0\r\n" + //
                "--------------------------------------------------------------------------------------";

        String nominaCreada= seleccionAFA.liquidarSueldos();

        assertEquals(nomina, nominaCreada);
    }

    @Test
    public void sueldoJugadorSinPremioTest() {
        SeleccionAFA seleccionAFA= new SeleccionAFA("Escaloni");
        Jugador dybala= new Jugador("Paulo", "Dybala", 120000, "Delantero", false);
        seleccionAFA.agregarIntegrante(dybala);

        String nomina= "--------------------------------------------------------------------------------------\r\n" + //
                "Resumen de sueldos a pagar:\r\n" + //
                "--------------------------------------------------------------------------------------\r\n" + //
                "Dybala, Paulo - Sueldo Básico: $120000.0 - Jugador - Delantero\r\n" + //
                "Sueldo Neto: $74000.0\r\n" + //
                "--------------------------------------------------------------------------------------\r\n" + //
                "Monto total a pagar en concepto de sueldos: $ 74000.0\r\n" + //
                "--------------------------------------------------------------------------------------";

        String nominaCreada= seleccionAFA.liquidarSueldos();

        assertEquals(nomina, nominaCreada);
    }

    @Test
    public void sueldoEntrenadorTest() {// TODO
        SeleccionAFA seleccionAFA= new SeleccionAFA("Escaloni");
        Entrenador escaloni= new Entrenador("Lionel Sebastián", "Escaloni", 2, "Argentina");

        seleccionAFA.agregarIntegrante(escaloni);

        String nomina= "--------------------------------------------------------------------------------------\r\n" + //
                "Resumen de sueldos a pagar:\r\n" + //
                "--------------------------------------------------------------------------------------\r\n" + //
                "Dybala, Paulo - Sueldo Básico: $120000.0 - Jugador - Delantero\r\n" + //
                "Sueldo Neto: $74000.0\r\n" + //
                "--------------------------------------------------------------------------------------\r\n" + //
                "Monto total a pagar en concepto de sueldos: $ 74000.0\r\n" + //
                "--------------------------------------------------------------------------------------";

        String nominaCreada= seleccionAFA.liquidarSueldos();

        assertEquals(nomina, nominaCreada);
    }

    @Test
    public void sueldoMasajistaTest() {// TODO
        SeleccionAFA seleccionAFA= new SeleccionAFA("Escaloni");
        Masajista masajista= new Masajista("Roberto" ,"Rodriguez", 1, 50000);
        masajista.setTitulacion("Fisioterapeuta");

        seleccionAFA.agregarIntegrante(masajista);

        String nomina= "--------------------------------------------------------------------------------------\r\n" + //
                "Resumen de sueldos a pagar:\r\n" + //
                "--------------------------------------------------------------------------------------\r\n" + //
                "Dybala, Paulo - Sueldo Básico: $120000.0 - Jugador - Delantero\r\n" + //
                "Sueldo Neto: $74000.0\r\n" + //
                "--------------------------------------------------------------------------------------\r\n" + //
                "Monto total a pagar en concepto de sueldos: $ 74000.0\r\n" + //
                "--------------------------------------------------------------------------------------";

        String nominaCreada= seleccionAFA.liquidarSueldos();

        assertEquals(nomina, nominaCreada);
    }
}