package pe.edu.upeu.secc5;

//Triangulo
public class FTriangulo extends Figura23 {

    private double a, b, c;

    public FTriangulo(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calcularArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double calcularPerimetro() {
        return a + b + c;
    }
}