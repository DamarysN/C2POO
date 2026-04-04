package pe.edu.upeu.secc4;

//NotifSMS
public class NotifSMS extends Notificacion18 {

    private String numTelefono;

    public NotifSMS(String destinatario, String mensaje, String numTelefono) {
        super(destinatario, mensaje);
        this.numTelefono = numTelefono;
    }

    @Override
    public void enviar() {
        System.out.println("SMS a " + numTelefono +
                " | Mensaje: " + formatear());
    }

    @Override
    public String formatear() {
        return "[SMS] " + mensaje;
    }
}