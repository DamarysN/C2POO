package pe.edu.upeu.secc6;

public class Main29 {
    public static void main(String[] args) {

        PFactura factura = new PFactura("Dama", 1000);

        Pagable29 p = factura;
        PImprimible i = factura;
        PExportable e = factura;

        System.out.println("Monto: " + p.calcularMonto());
        p.procesarPago();

        i.imprimir();

        System.out.println(e.exportar(e.getFormato()));
    }
}