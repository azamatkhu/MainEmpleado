public class EmpleadoAsalariado extends Empleado {
    double salario = 0;

    public EmpleadoAsalariado(String nombre, int salario) {
        super(nombre);
        this.salario = salario;
    }

    // Sobreescribimos el metodo de calcularSalario
    @Override
    public double calcularSalario() {
        return salario / 12;
    }
}
