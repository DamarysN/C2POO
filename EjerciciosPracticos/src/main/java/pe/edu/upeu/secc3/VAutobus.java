package pe.edu.upeu.secc3;

//Autobus
public class VAutobus extends Vehiculo14 {

    private int pisos;

    public VAutobus(String marca, String modelo, double consumoKmLitro, int pisos) {
        super(marca, modelo, pisos * 40, consumoKmLitro); // capacidad automática 🔥
        this.pisos = pisos;
    }

    @Override
    public String descripcion() {
        return super.descripcion() + " | Pisos: " + pisos;
    }
}