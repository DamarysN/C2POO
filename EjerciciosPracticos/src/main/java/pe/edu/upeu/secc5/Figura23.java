package pe.edu.upeu.secc5;

//Figura
public abstract class Figura23 {

    protected String color;

    public Figura23(String color) {
        this.color = color;
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    public String descripcion() {
        return color + " | Área: " + calcularArea();
    }
}