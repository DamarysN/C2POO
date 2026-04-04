package pe.edu.upeu.secc5;
import java.util.ArrayList;

public class Main24 {

    public static void main(String[] args) {

        ArrayList<Envio24> envios = new ArrayList<>();

        envios.add(new EnvioTerrestre("Lima", "Cusco", 10, 1100));
        envios.add(new EnvioAereo("Lima", "Miami", 5, 4200));
        envios.add(new EnvioMaritimo("Callao", "Shanghai", 100, 17000));

        for (Envio24 e : envios) {
            System.out.println(e.generarGuia());
            System.out.println("------------------------");
        }
    }
}