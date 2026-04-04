package pe.edu.upeu.secc5;

//Envio
public abstract class Envio24 {

    protected String origen;
    protected String destino;
    protected double peso;
    protected double distanciaKm;
    protected String estado = "Preparando";

    public Envio24(String origen, String destino, double peso, double distanciaKm) {
        this.origen = origen;
        this.destino = destino;
        this.peso = peso;
        this.distanciaKm = distanciaKm;
    }

    public abstract double calcularCosto();
    public abstract int calcularTiempoEntrega();

    public String generarGuia() {
        return "Envío desde " + origen + " a " + destino +
                " | Costo: $" + calcularCosto() +
                " | Tiempo: " + calcularTiempoEntrega() + "h" +
                " | Estado: " + estado;
    }
}