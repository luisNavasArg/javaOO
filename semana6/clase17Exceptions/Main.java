package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Mary","Lopez","95684231",125000.00);
        System.out.println(cliente);
        try{
            cliente.comprar(25000.00);
        }catch(ClienteException e){
            e.printStackTrace();
        }
        System.out.println("Continuamos en la aplicación");
        try{
            cliente.pagarDeuda(1200000.00);
        }catch(ClienteException y){
            y.printStackTrace();
        }
        System.out.println(cliente.getDeuda());


    }
}
