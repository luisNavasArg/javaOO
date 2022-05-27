package mispaquetes;

import modelo.Auto;

public class Main {
    public static String saludar(String nombre){
        return "Hola, bienvenid@ "+ nombre;
    }
    public static double calcularPromedio(int[] lista){
        double result;
        double suma=0.0;
        for (int i : lista) {
            suma = (suma + i);
        }
        result=suma/lista.length;
        return result;
    }
    public static void main(String[] args) {

        System.out.println(saludar("Mariano"));
        int[] numeros =new int[6];
        numeros[0]=90;
        numeros[1]=12;
        numeros[2]=34;
        numeros[3]=258;
        numeros[4]=258;
        numeros[5]=258;
         int[] numeros2 ={4,3,1,4,5};
        System.out.println("El promedio de los numeros es: "+ calcularPromedio(numeros2));
        System.out.println("nuestro promedio es: " +calcularPromedio(numeros));
        String[] arregloA;//Declaración del arreglo
        arregloA=new String[4];//Creación o construcción del arreglo

        //Llenado del arreglo
        arregloA[0]="hola";//inicialización arreglo en la posición 0
        arregloA[1]="casa";//inicialización arreglo en la posición 1
        arregloA[2]="perro";//inicialización arreglo en la posición 2
        arregloA[3]="oso";//inicialización arreglo en la posición 3

        //Declaración, Inicialización y Creación del arreglo
        String[] nombres ={"Carlos","Julian","Cristian","Miguel"};


        for(int b=0; b < nombres.length; b++){
            System.out.println("Hola "+ nombres[b]);
        }

        for(String nombre:nombres)
            System.out.println("Ahora con el forEach hola, "+nombre);
        //Obteniendo información del arreglo
        System.out.println("Valor arreglo en la posición 0: "+arregloA[0]);
        System.out.println("Valor arreglo en la posición 1: "+arregloA[1]);
        System.out.println("Valor arreglo en la posición 2: "+arregloA[2]);
        System.out.println("Valor arreglo en la posición 3: "+arregloA[3]);
        int veces=0;
        while(veces < nombres.length){
            System.out.println("Hola " + nombres[veces]);
            veces++;
        }
        Auto auto = new Auto("red","yellow");
        auto.setColor("Amarillo");
        System.out.println(auto.getColor());
    }
}