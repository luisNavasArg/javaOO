public class Impresora {
    private String nombre, marca, modelo;
    public  static int numero;
    private boolean encendida, tienePapel, tieneTinta;

    public Impresora (String nombre, String marca, String modelo){
        this.nombre=nombre;
        this.marca=marca;
        this.modelo=modelo;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isTieneTinta() {
        return tieneTinta;
    }

    public void setTieneTinta(boolean tieneTinta) {
        this.tieneTinta = tieneTinta;
    }

    public boolean isTienePapel() {
        return tienePapel;
    }

    public void setTienePapel(boolean tienePapel) {
        this.tienePapel = tienePapel;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        numero=89;
        this.marca = marca;
    }

    boolean imprimir(){
        if(encendida && tieneTinta && tienePapel){
            return true;
        }else{
            return false;
        }
    }
    String caulcularTinta(){
        if(this.tieneTinta){
            return "Aún hay tinta";
        }else{
            return " NO hay tinta";
        }
    }
     static public void agregarTinta(){
          numero=90;
    }
}
