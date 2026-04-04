package pe.edu.upeu.secc5;
import java.util.ArrayList;

public class Main23 {

    public static void main(String[] args) {

        ArrayList<Figura23> figuras = new ArrayList<>();

        figuras.add(new FCirculo("Rojo", 5));
        figuras.add(new FRectangulo("Azul", 4, 6));
        figuras.add(new FTriangulo("Verde", 3, 4, 5));

        for (Figura23 f : figuras) {
            System.out.println(f.descripcion());
            System.out.println("Perímetro: " + f.calcularPerimetro());
            System.out.println("------------------");
        }
    }
}