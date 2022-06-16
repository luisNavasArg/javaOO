package com.company;

public class Velero extends Embarcacion{
    private int cantMastiles;
    public static final int CANT_MASTILES_VELERO_GRANDE=4;

    public Velero(int anioFabricacion, Double eslora, Double valorBase, Double valorAdicional, Capitan capitan) {
        super(anioFabricacion, eslora, valorBase, valorAdicional, capitan);
    }

    public int getCantMastiles() {
        return cantMastiles;
    }

    public void setCantMastiles(int cantMastiles) {
        this.cantMastiles = cantMastiles;
    }
    public boolean evaluarSiEsGrande(){
        return this.cantMastiles > CANT_MASTILES_VELERO_GRANDE;
    }
}
