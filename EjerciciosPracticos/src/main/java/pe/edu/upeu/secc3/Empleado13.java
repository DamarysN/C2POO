package pe.edu.upeu.secc3;

//Empleado
public class Empleado13 {

    protected String nombre;
    protected String id;
    protected double salarioBase;

    public Empleado13(String nombre, String id, double salarioBase) {
        this.nombre = nombre;
        this.id = id;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }
}