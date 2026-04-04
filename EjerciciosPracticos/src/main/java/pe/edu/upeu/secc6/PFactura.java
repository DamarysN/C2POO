package pe.edu.upeu.secc6;

//Factura
public class PFactura implements Pagable29, PImprimible, PExportable {

    private String cliente;
    private double monto;
    private boolean pagado = false;

    public PFactura(String cliente, double monto) {
        this.cliente = cliente;
        this.monto = monto;
    }

    @Override
    public double calcularMonto() {
        return monto * 1.18;
    }

    @Override
    public boolean procesarPago() {
        if (!pagado) {
            pagado = true;
            System.out.println("Pago procesado para " + cliente);
            return true;
        }
        System.out.println("La factura ya está pagada");
        return false;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo factura...");
        System.out.println(formatear());
    }

    @Override
    public String formatear() {
        return "Cliente: " + cliente +
                " | Total: $" + calcularMonto();
    }

    @Override
    public String exportar(String formato) {
        return "Exportando factura de " + cliente + " a formato " + formato;
    }

    @Override
    public String getFormato() {
        return "PDF";
    }
}