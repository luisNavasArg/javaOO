package com.company;

public class Empleado {
    private String nombre,apellido;
    private static int legajo=0;
    private int id;
    private double sueldo, deducciones;

    public Empleado(String nombre, String apellido, double sueldo, double deducciones){
        //inicializa mos los atributos
        this.nombre=nombre;
        this.apellido=apellido;
        this.sueldo=sueldo;
        this.deducciones=deducciones;
        this.id=++legajo;

    }

    public  int getId() {
        return this.id;
    }
    public  void setId(int id) {
        this.id = id;
    }
    public double calcularSueldo(){
        return this.sueldo - this.deducciones;
    }
    public double calcularSueldo(double premio){
        return this.calcularSueldo() + premio;
    }
}
