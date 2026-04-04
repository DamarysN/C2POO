package pe.edu.upeu.secc1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ejer02 {

    public static void main(String[] args) {

        ArrayList<Double> temps = new ArrayList<>(
                Arrays.asList(28.5, 31.2, 29.8, 33.1, 30.5, 27.9, 35.0)
        );

        double promedio = temps.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0);

        double max = Collections.max(temps);
        double min = Collections.min(temps);

        long diasCalurosos = temps.stream()
                .filter(t -> t > 30)
                .count();

        int sube = 0;
        int baja = 0;

        for (int i = 0; i < temps.size() - 1; i++) {
            if (temps.get(i + 1) > temps.get(i)) {
                sube++;
            } else if (temps.get(i + 1) < temps.get(i)) {
                baja++;
            }
        }

        String tendencia;
        if (sube > baja) {
            tendencia = "Subiendo";
        } else if (baja > sube) {
            tendencia = "Bajando";
        } else {
            tendencia = "Estable";
        }

        System.out.println("Temperaturas: " + temps);
        System.out.println("Promedio: " + promedio);
        System.out.println("Máxima: " + max);
        System.out.println("Mínima: " + min);
        System.out.println("Días > 30°C: " + diasCalurosos);
        System.out.println("Tendencia: " + tendencia);
    }
}