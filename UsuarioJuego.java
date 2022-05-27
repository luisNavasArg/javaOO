public class UsuarioJuego {
    private String nombre;
    private String clave;
    private int puntaje, nivel;
    public UsuarioJuego(String nombre, String clave){
        this.nombre=nombre;
        this.clave=clave;
        this.puntaje=0;
        this.nivel=0;
    }

    public int getNivel() {
        return nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void aumentarPuntaje(){
        this.puntaje++;
    }
    public void subirNivel(){
        this.nivel++;
    }
    public void bonus(){
        this.puntaje+=3;
    }
    public boolean entrarJuego(String nombre, String clave){
            return this.nombre.equals(nombre) && this.clave.equals(clave);
    }

}

