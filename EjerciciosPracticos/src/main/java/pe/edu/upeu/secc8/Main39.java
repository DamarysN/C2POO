package pe.edu.upeu.secc8;

public class Main39 {
    public static void main(String[] args) {

        ClassPedido39 p = new ClassPedido39.Builder()
                .cliente("Dama")
                .producto("Laptop")
                .cantidad(2)
                .descuento(0.10)
                .direccion("Lima")
                .notas("Entrega rápida")
                .build();

        System.out.println(p);
    }
}