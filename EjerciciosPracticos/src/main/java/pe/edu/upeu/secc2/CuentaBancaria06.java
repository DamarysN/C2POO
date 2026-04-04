package pe.edu.upeu.secc2;
import java.util.ArrayList;

public class CuentaBancaria06 {

    private String titular;
    private double saldo;
    private String numeroCuenta;
    private ArrayList<String> movimientos = new ArrayList<>();

    public CuentaBancaria06(String titular, String numeroCuenta, double saldoInicial) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setTitular(String titular) {
        if (titular != null && !titular.isEmpty()) {
            this.titular = titular;
        }
    }

    public boolean depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            movimientos.add("Depósito: +$" + monto);
            return true;
        }
        return false;
    }

    public boolean retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            movimientos.add("Retiro: -$" + monto);
            return true;
        }
        return false;
    }

    public boolean transferir(CuentaBancaria06 destino, double monto) {
        if (this.retirar(monto)) {
            destino.depositar(monto);
            movimientos.add("Transferencia enviada: -$" + monto + " a " + destino.getTitular());
            return true;
        }
        return false;
    }

    public ArrayList<String> getMovimientos() {
        return movimientos;
    }
}