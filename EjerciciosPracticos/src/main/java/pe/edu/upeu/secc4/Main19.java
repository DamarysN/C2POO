package pe.edu.upeu.secc4;
import java.util.ArrayList;

public class Main19 {

    public static void main(String[] args) {

        ArrayList<CalculadoraImpuesto19> calculadoras = new ArrayList<>();

        calculadoras.add(new ImpuestoMexico());
        calculadoras.add(new ImpuestoEspana());
        calculadoras.add(new ImpuestoUSA(0.08));

        double monto = 1000;

        for (CalculadoraImpuesto19 c : calculadoras) {
            double impuesto = c.calcularImpuesto(monto);

            System.out.println(c.getDescripcion());
            System.out.println("Impuesto: " + impuesto);
            System.out.println("Total: " + (monto + impuesto));
            System.out.println("---------------------");
        }
    }
}