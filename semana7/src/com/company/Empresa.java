package semana7.src.com.company;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String razonSocial;
    private List<Empleado> empleados;

    public Empresa(String razonSocial) {
        this.razonSocial = razonSocial;
        empleados = new ArrayList<>();
    }
    public Double calcularSueldoTotales(){
        Double sueldosTotales = 0.0;
        for (Empleado empleado:empleados ) {
            sueldosTotales += empleado.calcularSueldo();
        }
        return sueldosTotales;
    }
    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

}
