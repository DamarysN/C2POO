package pe.edu.upeu.secc5;

//Rectangulo
public class FRectangulo extends Figura23 {

    private double ancho;
    private double alto;

    public FRectangulo(String color, double ancho, double alto) {
        super(color);
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return ancho * alto;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (ancho + alto);
    }
}