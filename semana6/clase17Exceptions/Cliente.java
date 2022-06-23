package com.company;

public class Cliente {
    private String dni, nombre,apellido;
    private Double saldoEnCuenta,limite,deuda;
    public Cliente(String nombre, String apellido, String dni, Double limite){
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.limite=limite;
        deuda=0.00;
        saldoEnCuenta=0.00;
    }
    public void comprar(Double importe) throws ClienteException{
       /* if(importe <= limite){
            deuda+=importe;
        }else {
            System.out.println(" No tienes limite suficiente");
        }*/
        if(importe > limite){
            throw new ClienteException();
        }
        deuda+=importe;
    }
    public void pagarDeuda(Double importe)throws ClienteException{
        if(importe > deuda){
            throw new ClienteException();
        }
        deuda-=importe;
    }

    public Double getDeuda() {
        return deuda;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", saldoEnCuenta=" + saldoEnCuenta +
                ", limite=" + limite +
                ", deuda=" + deuda +
                '}';
    }
}
