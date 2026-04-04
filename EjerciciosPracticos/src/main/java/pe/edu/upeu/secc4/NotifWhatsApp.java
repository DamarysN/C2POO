package pe.edu.upeu.secc4;

//NotifWhatsApp
public class NotifWhatsApp extends Notificacion18 {

    private String numTelefono;

    public NotifWhatsApp(String destinatario, String mensaje, String numTelefono) {
        super(destinatario, mensaje);
        this.numTelefono = numTelefono;
    }

    @Override
    public void enviar() {
        System.out.println("WhatsApp a " + numTelefono +
                " | Mensaje: " + formatear());
    }

    @Override
    public String formatear() {
        return "[WhatsApp] " + mensaje;
    }
}