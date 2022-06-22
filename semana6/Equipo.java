package com.company;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private List<Jugador> jugadores;
    public Equipo(String nombre){
        this.nombre=nombre;
        //inicializamosla lista vacía
        jugadores = new ArrayList<>();
    }
    public void addJugador(Jugador j){
        jugadores.add(j);
    }
    public void mostrarJugadoresTitulares(){
        System.out.println("Jugadores");
        jugadores.sort(null);
        for (Jugador j:jugadores) {
            System.out.println(j);
        }

    }

    public Integer getCantidadJugadoresLesionados(){
        Integer contador=0;
        for (Jugador jugador:jugadores) {
            if(jugador.isLesionado() && jugador.isTitular()){
                contador++;
            }
        }
        return contador;
    }
}
