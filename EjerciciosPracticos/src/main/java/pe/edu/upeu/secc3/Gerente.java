package pe.edu.upeu.secc3;

//Gerente
public class Gerente extends Empleado13 {

    private double bonoGerencial;
    private int empleadosACargo;

    public Gerente(String nombre, String id, double salarioBase, double bonoGerencial, int empleadosACargo) {
        super(nombre, id, salarioBase);
        this.bonoGerencial = bonoGerencial;
        this.empleadosACargo = empleadosACargo;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bonoGerencial;
    }
}