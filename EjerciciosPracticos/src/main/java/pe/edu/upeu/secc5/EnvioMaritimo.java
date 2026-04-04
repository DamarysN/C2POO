package pe.edu.upeu.secc5;

//EnvioMaritimo
public class EnvioMaritimo extends Envio24 {

    public EnvioMaritimo(String origen, String destino, double peso, double distanciaKm) {
        super(origen, destino, peso, distanciaKm);
    }

    @Override
    public double calcularCosto() {
        return peso * distanciaKm * 0.01;
    }

    @Override
    public int calcularTiempoEntrega() {
        return (int)(distanciaKm / 30);
    }
}