package pe.edu.upeu.secc5;

//Circulo
public class FCirculo extends Figura23 {

    private double radio;

    public FCirculo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}