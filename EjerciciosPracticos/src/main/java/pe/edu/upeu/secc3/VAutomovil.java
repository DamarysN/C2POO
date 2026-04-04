package pe.edu.upeu.secc3;

//Automovil
public class VAutomovil extends Vehiculo14 {

    private int numPuertas;

    public VAutomovil(String marca, String modelo, int capacidad, double consumoKmLitro, int numPuertas) {
        super(marca, modelo, capacidad, consumoKmLitro);
        this.numPuertas = numPuertas;
    }

    @Override
    public String descripcion() {
        return super.descripcion() + " | Puertas: " + numPuertas;
    }
}