package com.company;

public class Cliente {
    private int numeroCliente,dni, cuit;
    private String nombre, apellido;

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public Cliente(int numeroCliente, int dni, int cuit, String nombre, String apellido) {
        this.numeroCliente = numeroCliente;
        this.dni = dni;
        this.cuit = cuit;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "numeroCliente=" + numeroCliente +
                ", dni=" + dni +
                ", cuit=" + cuit +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
