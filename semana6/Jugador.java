package com.company;

public class Jugador implements Comparable<Jugador>{
    private int numCamiseta;
    private String nombre;
    private boolean titular,lesionado;

    public Jugador(int numCamiseta, String nombre, boolean titular, boolean lesionado) {
        this.numCamiseta = numCamiseta;
        this.nombre = nombre;
        this.titular = titular;
        this.lesionado = lesionado;
    }

    public int getNumCamiseta() {
        return numCamiseta;
    }

    public void setNumCamiseta(int numCamiseta) {
        this.numCamiseta = numCamiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTitular() {
        return titular;
    }

    public void setTitular(boolean titular) {
        this.titular = titular;
    }

    public boolean isLesionado() {
        return lesionado;
    }

    public void setLesionado(boolean lesionado) {
        this.lesionado = lesionado;
    }

    @Override
    public int compareTo(Jugador jugador) {
        return this.nombre.compareTo(jugador.nombre);
      /*  if(this.numCamiseta > jugador.numCamiseta){
            return 1;
        }
        if(this.numCamiseta < jugador.numCamiseta){
            return -1;
        }
        return 0;*/
    }

    @Override
    public String toString() {
        return "numCamiseta" + numCamiseta +", nombre " + nombre;
    }
}
