package pe.edu.upeu.secc1;
import java.util.ArrayList;
import java.util.Collections;

public class ListaCompras01 {

    private ArrayList<String> products = new ArrayList<>();

    public void agregarProducto(String producto) {
        producto = producto.toLowerCase();

        if (!products.contains(producto)) {
            products.add(producto);
            System.out.println("Producto agregado: " + producto);
        } else {
            System.out.println("El producto ya existe: " + producto);
        }
    }

    public void eliminarProducto(String producto) {
        producto = producto.toLowerCase();

        if (products.remove(producto)) {
            System.out.println("Producto eliminado: " + producto);
        } else {
            System.out.println("Producto no encontrado: " + producto);
        }
    }

    public boolean buscarProducto(String producto) {
        producto = producto.toLowerCase();
        return products.contains(producto);
    }

    public int contarProductos() {
        return products.size();
    }

    public void ordenarAlfabeticamente() {
        Collections.sort(products);
    }

    public void mostrarProductos() {
        System.out.println("Lista de compras:");
        for (String p : products) {
            System.out.println("- " + p);
        }
    }
}