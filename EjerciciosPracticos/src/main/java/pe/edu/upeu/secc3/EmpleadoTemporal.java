package pe.edu.upeu.secc3;

//Empleado temporal
public class EmpleadoTemporal extends Empleado13 {

    private int horasTrabajadas;
    private double tarifaHora;

    public EmpleadoTemporal(String nombre, String id, double salarioBase, int horasTrabajadas, double tarifaHora) {
        super(nombre, id, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (horasTrabajadas * tarifaHora);
    }
}