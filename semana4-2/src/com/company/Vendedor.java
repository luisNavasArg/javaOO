package com.company;

public class Vendedor extends Empleado{
    private int comision;
    private double importeVentas;
    public Vendedor(String nombre,String apellido, double sueldo,double deducciones, int comision, double importeVentas ){
        super(nombre, apellido,sueldo,deducciones);
        this.comision=comision;
        this.importeVentas=importeVentas;
    }
    public String Vendedor(String nombre, String dni, int id){
        return "sdsds";
    }

}
