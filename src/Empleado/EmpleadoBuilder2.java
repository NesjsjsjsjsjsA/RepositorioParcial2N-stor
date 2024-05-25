package src.Empleado;

public class EmpleadoBuilder2 implements BuilderEmpleado{

    private Empleado2 emp;

    @Override
    public void crearUSuario()
    {
        System.out.println("Seremos 02");
    }

    @Override
    public void crearContrasena() {
        System.out.println("321");
    }

    @Override
    public void AsignarPuesto()
    {
        System.out.println("Capitán,atención al cliente");
    }

    @Override
    public void comunicacionFActible()
    {
        System.out.println("Solo con Equipo 1 :(");
    }

    @Override
    public Empleado crear(Empleado Empleado) {
        return Empleado;
    }
}
