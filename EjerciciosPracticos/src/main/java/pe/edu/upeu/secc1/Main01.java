package pe.edu.upeu.secc1;

public class Main01 {
    public static void main(String[] args) {

        ListaCompras01 lista = new ListaCompras01();

        lista.agregarProducto("Jugo");
        lista.agregarProducto("Galletas");
        lista.agregarProducto("Huevos");
        lista.agregarProducto("Jugo");

        lista.mostrarProductos();

        lista.eliminarProducto("Huevos");

        System.out.println("Está Galletas? " + lista.buscarProducto("Galletas"));
        System.out.println("Total productos: " + lista.contarProductos());

        lista.ordenarAlfabeticamente();
        lista.mostrarProductos();
    }
}
