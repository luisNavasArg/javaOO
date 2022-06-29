package semana7.src.com.company;

public class EmpleadoRelacionDependencia extends Empleado{
    private Double sueldoMensual;

    public EmpleadoRelacionDependencia(String nombre, String apellido, Integer legajo) {
        super(nombre, apellido, legajo);
        this.sueldoMensual = 1000.00;
    }
    /*
    public EmpleadoRelacionDependencia(){
        super("Luis","Navas", 1254);
    }*/


    @Override
    public Double calcularSueldo() {
        return sueldoMensual;
    }
}
