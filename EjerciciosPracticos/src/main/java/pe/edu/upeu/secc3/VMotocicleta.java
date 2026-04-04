package pe.edu.upeu.secc3;

//Motocicleta
public class VMotocicleta extends Vehiculo14 {

    private int cilindrada;

    public VMotocicleta(String marca, String modelo, double consumoKmLitro, int cilindrada) {
        super(marca, modelo, 2, consumoKmLitro); // capacidad típica
        this.cilindrada = cilindrada;
    }

    @Override
    public String descripcion() {
        return super.descripcion() + " | Cilindrada: " + cilindrada + "cc";
    }
}