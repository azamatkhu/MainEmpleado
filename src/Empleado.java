// Creamos una clase abstracto. Luego, cuando creamos otras clases lo implementamos.
public abstract class Empleado {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularSalario();
}
