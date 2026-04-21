//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainEmpleado {
    public static void main(String[] args) {
        Empleado empleado1 = new EmpleadoAsalariado("Jose", 1000);
        Empleado empleado2 = new EmpleadoPorHoras("Maria", 200);

        System.out.println("Salario de Empleado 1: " + empleado1.calcularSalario());
        System.out.println("Salario de Empleado 2: " + empleado2.calcularSalario());

    }
}