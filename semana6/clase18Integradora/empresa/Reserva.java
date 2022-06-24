package empresa.empresa;

public class Reserva {
    private String codigo,estacionInicio,estacionFinal;
    private int cantPersonas;
    private Double descuento = 0.8;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEstacionInicio() {
        return estacionInicio;
    }

    public void setEstacionInicio(String estacionInicio) {
        this.estacionInicio = estacionInicio;
    }

    public String getEstacionFinal() {
        return estacionFinal;
    }

    public void setEstacionFinal(String estacionFinal) {
        this.estacionFinal = estacionFinal;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public double getPrecio(){
        double precio = 50 * cantPersonas;
        if(fueCompleto()){
            precio = precio * descuento;
        }
        return precio;
    }
    public boolean fueCompleto(){
        return (estacionInicio.equals("Buenos Aires") && estacionFinal.equals("Bragado") || estacionInicio.equals("Bragado") && estacionFinal.equals("Buenos Aires"));
    }
}
