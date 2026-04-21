public class EmpleadoPorHoras extends Empleado{
    int horas;

    public EmpleadoPorHoras(String nombre, int horas) {
        super(nombre);
        this.horas = horas;
    }

    // Sobreescribimos el metodo de calcularSalario
    @Override
    public double calcularSalario() {
        return horas * 20;
    }
}
