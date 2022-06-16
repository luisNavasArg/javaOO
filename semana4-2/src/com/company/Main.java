package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Cliente cliente = new Cliente(125,95681064,209568106,"JUan","Perez");
    Cuenta cuenta1 = new CajaAhorro();

    cuenta1.setCliente(cliente);
    System.out.println(cuenta1);
    cuenta1.setSaldo(125000);
    cuenta1.extraer(1250.25);

    Cuenta corriente1 = new CuentaCorriente();
    corriente1.setCliente(cliente);
    corriente1.setSaldo(250000);
    corriente1.extraer(255000);
    }
}
