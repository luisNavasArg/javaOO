public class Main {
    public static void main(String[] args) {
        char tema = 's';
        int valor;
        valor=10;
        double num=5.6;
        double result;
        result =num/valor;
        int edad=49;
        String nombre="Jan";

        //Estructura de desición
        if(edad < 18){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Aún eres menor de edad");
        }

        switch (nombre){
            case "Luis":
                System.out.println("Bienvenido Luis");
                break;
            case "Juan":
                System.out.println("Bienvenido Juan");
                break;
            default:
                System.out.println("Bienvenido extraño");
        }
        //Estructura de control explicación partes
        for(int a=0; a < 8; a++){
            System.out.println(a);
        }

        System.out.println("Nuestro resultado es:"+result);
        System.out.println("Hello world!");
        System.out.println("Bienvenido "+ nombre);
    }
}