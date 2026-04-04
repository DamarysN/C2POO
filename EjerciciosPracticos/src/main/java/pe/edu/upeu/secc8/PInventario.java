package pe.edu.upeu.secc8;
import java.util.ArrayList;
import java.util.Iterator;

//Inventario
public class PInventario implements Iterable<Producto38> {

    private ArrayList<Producto38> productos = new ArrayList<>();

    public void agregarProducto(Producto38 p) {
        productos.add(p);
    }

    private class IteradorDisponible implements Iterator<Producto38> {

        private int posicion = 0;

        @Override
        public boolean hasNext() {
            while (posicion < productos.size() &&
                    productos.get(posicion).getStock() <= 0) {
                posicion++;
            }
            return posicion < productos.size();
        }

        @Override
        public Producto38 next() {
            return productos.get(posicion++);
        }
    }

    @Override
    public Iterator<Producto38> iterator() {
        return new IteradorDisponible();
    }
}