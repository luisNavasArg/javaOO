package com.company;

public class Yate extends Embarcacion implements Comparable{
    private int cantCamarotes;

    public Yate(int anioFabricacion, Double eslora, Double valorBase, Double valorAdicional, Capitan capitan, int cantCamarotes) {
        super(anioFabricacion, eslora, valorBase, valorAdicional, capitan);
        this.cantCamarotes = cantCamarotes;
    }

    public int getCantCamarotes() {
        return cantCamarotes;
    }

    public void setCantCamarotes(int cantCamarotes) {
        this.cantCamarotes = cantCamarotes;
    }
    @Override
    public int compareTo(Object y2){
        return this.cantCamarotes - ((Yate)y2).getCantCamarotes();

    }
}
