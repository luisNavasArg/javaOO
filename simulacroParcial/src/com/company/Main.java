package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Capitan cap = new Capitan("Juan","suárez",125478);
        Comparable yate1 = new Yate(2010,125.4,250.12,125.00,cap,12);
        Comparable yate2 = new Yate(2010,125.4,250.12,125.00,cap,3);
        if(yate1.compareTo(yate2) ==0){
            System.out.println(" Yate1 y dos son lujosos");
        }else if(yate1.compareTo(yate2) > 0){
            System.out.println(" El Yate 1 es más lujoso");
        }
        else{
            System.out.println("Yate 2 es más lujoso");
        }
    }
}
