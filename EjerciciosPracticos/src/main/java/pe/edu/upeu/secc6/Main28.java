package pe.edu.upeu.secc6;

public class Main28 {
    public static void main(String[] args) {

        Computadora pc = new Computadora();

        pc.agregarDispositivo(new CTeclado());
        pc.agregarDispositivo(new CMouse());
        pc.agregarDispositivo(new CImpresora());
        pc.agregarDispositivo(new CMemoriaUSB());

        pc.conectarTodos();
        pc.mostrarEstado();

        System.out.println("-----");

        pc.desconectarTodos();
        pc.mostrarEstado();
    }
}