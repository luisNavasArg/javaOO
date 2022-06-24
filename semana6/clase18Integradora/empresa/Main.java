package empresa.empresa;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
       Empresa empresa = new Empresa();
       Reserva r1 = new Reserva();
       r1.setCodigo("1234rd");
       r1.setCantPersonas(3);
       r1.setEstacionInicio("Buenos Aires");
       r1.setEstacionFinal("Bragado");

        Reserva r2 = new Reserva();
        r2.setCodigo("1234rd");
        r2.setCantPersonas(3);
        r2.setEstacionInicio("Buenos Aires");
        r2.setEstacionFinal("Mercedes");

        empresa.agregarReserva(r1);
        empresa.agregarReserva(r2);

        System.out.println("REacudacion total: "+ empresa.reacudacionTotal());
        System.out.println("Cantidad de veces que pasaron por Buenos Aires "+empresa.cantVecesRecorrida("Calafate"));

    }
}
