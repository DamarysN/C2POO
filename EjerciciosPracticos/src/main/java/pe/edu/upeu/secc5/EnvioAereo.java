package pe.edu.upeu.secc5;

//EnvioAereo
public class EnvioAereo extends Envio24 {

    public EnvioAereo(String origen, String destino, double peso, double distanciaKm) {
        super(origen, destino, peso, distanciaKm);
    }

    @Override
    public double calcularCosto() {
        return peso * distanciaKm * 0.05;
    }

    @Override
    public int calcularTiempoEntrega() {
        return (int)(distanciaKm / 800);
    }
}