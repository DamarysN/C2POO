package pe.edu.upeu.secc7;

public class Main34 {
    public static void main(String[] args) {

        OCalculadora calc = new OCalculadora();

        double a = 10;
        double b = 5;

        System.out.println("Suma: " + calc.calcular(a, b, Operacion34.SUMA));
        System.out.println("Resta: " + calc.calcular(a, b, Operacion34.RESTA));
        System.out.println("Multiplicación: " + calc.calcular(a, b, Operacion34.MULTIPLICACION));
        System.out.println("División: " + calc.calcular(a, b, Operacion34.DIVISION));
    }
}