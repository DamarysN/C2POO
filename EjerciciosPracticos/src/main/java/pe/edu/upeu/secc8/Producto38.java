package pe.edu.upeu.secc8;

//Producto
public class Producto38 {

    private String nombre;
    private int stock;

    public Producto38(String nombre, int stock) {
        this.nombre = nombre;
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return nombre + " (Stock: " + stock + ")";
    }
}