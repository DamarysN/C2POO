package pe.edu.upeu.secc5;

//EnvioTerrestre
public class EnvioTerrestre extends Envio24 {

    public EnvioTerrestre(String origen, String destino, double peso, double distanciaKm) {
        super(origen, destino, peso, distanciaKm);
    }

    @Override
    public double calcularCosto() {
        return peso * distanciaKm * 0.02;
    }

    @Override
    public int calcularTiempoEntrega() {
        return (int)(distanciaKm / 60);
    }
}