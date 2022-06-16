package com.company;

public class CuentaCorriente extends Cuenta implements ImpuestoGravable{
    private double descubiertoPermitido=1000.00;

    public double getDescubiertoPermitido() {
        return descubiertoPermitido;
    }

    public void setDescubiertoPermitido(double descubiertoPermitido) {
        this.descubiertoPermitido = descubiertoPermitido;
    }

    @Override
    public void extraer(double monto) {
        if(informarSaldo() + descubiertoPermitido >= monto){
            setSaldo(informarSaldo()-monto);
            System.out.println("tu saldo disponible es:"+ getSaldo());
        }
        else {
            System.out.println("La cuenta está sobregirada");
        }
    }

    public double gravar(double porcentaje){
        double montoDescontar = getSaldo() * porcentaje;
        setSaldo(getSaldo() - montoDescontar);
        return montoDescontar;

    }
}
