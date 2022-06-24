package empresa.empresa;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Reserva> reservas;
    public Empresa(){
        reservas =new ArrayList<>();
    }
    public int cantVecesRecorrida(String estacion){
        int cant =0;
        for (Reserva reserva:reservas) {

            if((reserva.getEstacionFinal().equals(estacion) || reserva.getEstacionInicio().equals(estacion))){
                cant++;
            }

        }
        return cant;
    }
    public Double reacudacionTotal(){
        double total=0;
        for (Reserva reserva:reservas) {
            total += reserva.getPrecio();
        }
        return total;
    }
    public void agregarReserva(Reserva reserva){
        reservas.add(reserva);
    }
}
