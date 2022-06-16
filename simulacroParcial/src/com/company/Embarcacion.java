package com.company;

public abstract class Embarcacion {
    private int anioFabricacion;
    private Double eslora, valorBase, valorAdicional;
    private Capitan capitan;
    public static final int EMBARCACION_NUEVA =2020;
    //constructor



    public Embarcacion(int anioFabricacion, Double eslora, Double valorBase, Double valorAdicional, Capitan capitan) {
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
        this.valorBase = valorBase;
        this.valorAdicional = valorAdicional;
        this.capitan = capitan;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public Double getEslora() {
        return eslora;
    }

    public void setEslora(Double eslora) {
        this.eslora = eslora;
    }

    public Double getValorBase() {
        return valorBase;
    }

    public void setValorBase(Double valorBase) {
        this.valorBase = valorBase;
    }

    public Double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(Double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public Capitan getCapitan() {
        return capitan;
    }

    public void setCapitan(Capitan capitan) {
        this.capitan = capitan;
    }

    //Métodos
    public double calcularValorDeAlquiler(){
        double montoAlquiler = valorBase;
        if(anioFabricacion > EMBARCACION_NUEVA){
            montoAlquiler += valorAdicional;
        }
        return montoAlquiler;
    }

}
