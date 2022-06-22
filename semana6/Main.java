package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Equipo equipo = new Equipo("Argentina");
    equipo.addJugador(new Jugador(1,"Dibu",true,false));
    equipo.addJugador(new Jugador(10,"Messi",true,false));
    equipo.addJugador(new Jugador(12,"Masche",true,true));
    equipo.addJugador(new Jugador(7,"De paul",true,false));
    equipo.addJugador(new Jugador(3,"Juan",true,true));
    equipo.mostrarJugadoresTitulares();
    }
}
