package pe.edu.upeu.secc6;
import java.util.ArrayList;

//Computadora
public class Computadora {

    private ArrayList<Conectable28> perifericos = new ArrayList<>();

    public void agregarDispositivo(Conectable28 d) {
        perifericos.add(d);
    }

    public void conectarTodos() {
        for (Conectable28 d : perifericos) {
            d.conectar();
            System.out.println(d.getNombreDispositivo() + " conectado");
        }
    }

    public void desconectarTodos() {
        for (Conectable28 d : perifericos) {
            d.desconectar();
            System.out.println(d.getNombreDispositivo() + " desconectado");
        }
    }

    public void mostrarEstado() {
        for (Conectable28 d : perifericos) {
            System.out.println(d.getNombreDispositivo() +
                    " -> " + (d.estaConectado() ? "Conectado" : "Desconectado"));
        }
    }
}