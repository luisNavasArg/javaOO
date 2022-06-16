package com.company;

public abstract class Cuenta {
    private double saldo;
    private Cliente cliente;
    public void depositar(double monto){
        saldo += monto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double informarSaldo(){
        return saldo;
    }
    public abstract void extraer(double monto);
}
