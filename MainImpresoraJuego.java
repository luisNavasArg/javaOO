import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      /*  UsuarioJuego jugador = new UsuarioJuego("Luis","123456");
        if(jugador.entrarJuego("Luis","123456")){
            System.out.println("Bienvenid@ "+ jugador.getNombre());
        }else{
            System.out.println("La clave o el nombre están incorrecto!");
        }
        for (int a=0; a< 10; a++){
            jugador.aumentarPuntaje();
            System.out.println("Aumentamos un punto "+ jugador.getPuntaje());
            if(jugador.getPuntaje() == 8){
                jugador.subirNivel();
            }
        }
        System.out.println("La cantidad de puntos es: " + jugador.getPuntaje());
        System.out.println("El jugador se encuentra en el nivel  "+ jugador.getNivel());*/

        Impresora impresora = new Impresora("impresorahp","HP","320lh");

        System.out.println(impresora.getNombre());
        System.out.println(impresora.imprimir());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Agrega el nombre de la impresora");
        String nombre=scanner.nextLine();
        System.out.println("Agrega la marca de la impresora");
        String marca=scanner.nextLine();
        System.out.println("Agrega el modelo de la impresora");
        String modelo=scanner.nextLine();
        Impresora impresora2 = new Impresora(nombre, marca,modelo);
        System.out.println("Soy la impresora " + impresora2.getNombre());
        impresora2.setEncendida(true);
        impresora2.setTienePapel(true);
        impresora2.setTieneTinta(true);
        System.out.println(impresora2.imprimir());
        System.out.println(impresora2.caulcularTinta());
        System.out.println(impresora.caulcularTinta());
        System.out.println(Impresora.numero);
        Impresora.agregarTinta();//Puedo llamara la función static sin crearun objeto
        //no te permite usar un atributo de la clase porque depende de un objeto
        System.out.println(Impresora.numero);
    }
}