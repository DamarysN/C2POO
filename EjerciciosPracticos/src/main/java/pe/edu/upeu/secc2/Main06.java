package pe.edu.upeu.secc2;

public class Main06 {

    public static void main(String[] args) {

        CuentaBancaria06 cuenta1 = new CuentaBancaria06("Dama", "001", 1000);
        CuentaBancaria06 cuenta2 = new CuentaBancaria06("Alex", "002", 500);

        cuenta1.depositar(200);
        cuenta1.retirar(150);
        cuenta1.transferir(cuenta2, 300);

        cuenta1.retirar(5000);
        cuenta1.depositar(-50);

        System.out.println("=== SALDOS ===");
        System.out.println("Cuenta 1: $" + cuenta1.getSaldo());
        System.out.println("Cuenta 2: $" + cuenta2.getSaldo());

        imprimirMovimientos(cuenta1);
        imprimirMovimientos(cuenta2);
    }

    public static void imprimirMovimientos(CuentaBancaria06 cuenta) {
        System.out.println("\nMovimientos de " + cuenta.getTitular() + ":");
        for (String m : cuenta.getMovimientos()) {
            System.out.println(m);
        }
    }
}