package pe.edu.upeu.secc8;

public class Main38 {
    public static void main(String[] args) {

        PInventario inventario = new PInventario();

        inventario.agregarProducto(new Producto38("Laptop", 5));
        inventario.agregarProducto(new Producto38("Mouse", 0));
        inventario.agregarProducto(new Producto38("Teclado", 3));
        inventario.agregarProducto(new Producto38("Monitor", 0));

        for (Producto38 p : inventario) {
            System.out.println(p);
        }
    }
}