package pe.edu.upeu.secc3;
import java.util.ArrayList;

public class Main14 {

    public static void main(String[] args) {

        VAutomovil auto = new VAutomovil("Toyota", "Corolla", 5, 15, 4);
        VAutobus bus = new VAutobus("Volvo", "X1", 5, 2);
        VMotocicleta moto = new VMotocicleta("Yamaha", "R15", 40, 150);

        double km = 100;
        double precio = 5;

        System.out.println(auto.descripcion());
        System.out.println("Costo: " + auto.costoViaje(km, precio));

        System.out.println(bus.descripcion());
        System.out.println("Costo: " + bus.costoViaje(km, precio));

        System.out.println(moto.descripcion());
        System.out.println("Costo: " + moto.costoViaje(km, precio));

        ArrayList<Vehiculo14> flota = new ArrayList<>();
        flota.add(auto);
        flota.add(bus);
        flota.add(moto);

        int total = 0;
        for (Vehiculo14 v : flota) {
            total += v.getCapacidad();
        }

        System.out.println("Capacidad total: " + total);
    }
}