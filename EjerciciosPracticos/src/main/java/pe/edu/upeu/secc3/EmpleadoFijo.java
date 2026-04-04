package pe.edu.upeu.secc3;

//Empleado fijo
public class EmpleadoFijo extends Empleado13 {

    private double bonificacion;

    public EmpleadoFijo(String nombre, String id, double salarioBase, double bonificacion) {
        super(nombre, id, salarioBase);
        this.bonificacion = bonificacion;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bonificacion;
    }
}

