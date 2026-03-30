package pe.edu.upeu.composicion;

public class Casa {
    private Habitacion habitacion;

    Casa() {
        this.habitacion = new Habitacion();
    }

    public static void main(String[] args) {
        Casa miCasa = new Casa();
        System.out.println("Habitaciones de " +miCasa.habitacion.tamanho+" m2");
    }
}
