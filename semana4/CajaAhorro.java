package com.company;

public class CajaAhorro extends Cuenta{
    public static final double INTERESES_CAJA_AHORRO =1.2;

    public void extraer(double monto){
        if(informarSaldo() >= monto){
            setSaldo(informarSaldo() - monto);
            System.out.println("Tu saldo disponoble es: "+ getSaldo());
        }
    }
    public void cobrarIntereses(){
        setSaldo(informarSaldo() *  CajaAhorro.INTERESES_CAJA_AHORRO);
    }

}
