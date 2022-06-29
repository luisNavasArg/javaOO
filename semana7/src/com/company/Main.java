package semana7.src.com.company;

public class Main {

    public static void main(String[] args) {

        EmpleadoFactory empleadoFactory = EmpleadoFactory.getInstance();
        Empresa empresa = new Empresa("DH");
        empresa.agregarEmpleado(empleadoFactory.crearEmpleado(EmpleadoFactory.CODIGO_EMPLEADO_POR_HORA));
        empresa.agregarEmpleado(empleadoFactory.crearEmpleado(EmpleadoFactory.CODIGO_EMPLEADO_POR_HORA));
        empresa.agregarEmpleado(empleadoFactory.crearEmpleado(EmpleadoFactory.CODIGO_EMPLEADO_POR_HORA));
        System.out.println(empresa.calcularSueldoTotales());
        System.out.println(empleadoFactory.crearEmpleado(EmpleadoFactory.CODIGO_EMPLEADO_POR_HORA));
    }
}
