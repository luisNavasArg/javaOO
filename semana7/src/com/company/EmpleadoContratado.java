package semana7.src.com.company;
public class EmpleadoContratado extends Empleado{
    private Double importePorHora;
    private Integer horasTrabajadas;
    private Double relacionImpuesto;

    public EmpleadoContratado(String nombre, String apellido, Integer legajo, Double importePorHora,Integer horasTrabajadas) {
        super(nombre, apellido, legajo);
        this.importePorHora=importePorHora;
        this.horasTrabajadas=horasTrabajadas;
        this.relacionImpuesto=0.93;
    }

    @Override
    public Double calcularSueldo() {
        return (this.importePorHora * horasTrabajadas)*this.relacionImpuesto;
    }

}
