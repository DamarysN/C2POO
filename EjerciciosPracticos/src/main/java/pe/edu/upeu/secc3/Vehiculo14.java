package pe.edu.upeu.secc3;

//Vehiculo
public class Vehiculo14 {

    protected String marca;
    protected String modelo;
    protected int capacidad;
    protected double consumoKmLitro;

    public Vehiculo14(String marca, String modelo, int capacidad, double consumoKmLitro) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.consumoKmLitro = consumoKmLitro;
    }

    public double costoViaje(double km, double precioLitro) {
        return (km / consumoKmLitro) * precioLitro;
    }

    public String descripcion() {
        return marca + " " + modelo + " - Capacidad: " + capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }
}