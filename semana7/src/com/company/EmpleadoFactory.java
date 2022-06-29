package semana7.src.com.company;

public class EmpleadoFactory {
    public static final String CODIGO_EMPLEADO_RELACION = "EMP-RD";
    public static final String CODIGO_EMPLEADO_POR_HORA="EMP-PH";
    private static EmpleadoFactory instance;
    private EmpleadoFactory(){

    }
    public static EmpleadoFactory getInstance(){
        if(instance==null){
            instance = new EmpleadoFactory();
        }
        return instance;
    }
    public Empleado crearEmpleado(String codigo){
        switch (codigo){
            case CODIGO_EMPLEADO_RELACION:
                return new EmpleadoRelacionDependencia("Luis","Navas",2563);
            case CODIGO_EMPLEADO_POR_HORA:
                return new EmpleadoContratado("Mary","Lopez",36985,7.00,20);
            default:return null;
        }
    }
}
