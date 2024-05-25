package src.Empleado;

public class EmpleadoBuilder1 implements BuilderEmpleado{
    @Override
    public void crearUSuario()
    {
        System.out.println("EL usuario es con 01");
    }

    @Override
    public void crearContrasena()
    {
    System.out.println("1234");
    }

    @Override
    public void AsignarPuesto()
    {
        System.out.println("Capitán,atención al cliente...");
    }

    @Override
    public void comunicacionFActible()
    {
        System.out.println("Podemos hablar con el CEO y con el equipo2");
    }

    @Override
    public Empleado crear(Empleado Empleado) {
        return Empleado;
    }
}
