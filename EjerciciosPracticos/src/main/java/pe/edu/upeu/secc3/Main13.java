package pe.edu.upeu.secc3;

public class Main13 {
    public static void main(String[] args) {

        EmpleadoFijo emp1 = new EmpleadoFijo("Dama", "001", 1000, 200);
        EmpleadoTemporal emp2 = new EmpleadoTemporal("Alex", "002", 500, 40, 10);
        Gerente emp3 = new Gerente("Jhonatan", "003", 1500, 500, 5);

        System.out.println("Empleado Fijo: " + emp1.calcularSalario());
        System.out.println("Empleado Temporal: " + emp2.calcularSalario());
        System.out.println("Gerente: " + emp3.calcularSalario());
    }
}