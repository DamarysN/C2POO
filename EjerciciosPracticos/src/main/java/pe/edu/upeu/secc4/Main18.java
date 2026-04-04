package pe.edu.upeu.secc4;
import java.util.ArrayList;

public class Main18 {

    public static void main(String[] args) {

        ArrayList<Notificacion18> pendientes = new ArrayList<>();

        pendientes.add(new NotifEmail("Dama", "Hola!", "Saludo"));
        pendientes.add(new NotifSMS("Alex", "Tu código es 0000", "925600597"));
        pendientes.add(new NotifPush("Luis", "Nueva alerta", "🔔"));
        pendientes.add(new NotifWhatsApp("Jhonatan", "Mensaje importante", "917121809"));

        for (Notificacion18 n : pendientes) {
            n.enviar();
        }
    }
}