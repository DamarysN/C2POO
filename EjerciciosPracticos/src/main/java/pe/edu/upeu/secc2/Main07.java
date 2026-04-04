package pe.edu.upeu.secc2;

public class Main07 {

    public static void main(String[] args) {

        RelojDigital07 reloj = new RelojDigital07(23, 59, 55);

        reloj.configurarAlarma(0, 0);

        for (int i = 0; i < 10; i++) {
            reloj.avanzarSegundo();

            System.out.println("24h: " + reloj.mostrarFormato24h());
            System.out.println("12h: " + reloj.mostrarFormato12h());

            if (reloj.verificarAlarma()) {
                System.out.println("⏰ ¡ALARMA!");
            }
        }
    }
}


