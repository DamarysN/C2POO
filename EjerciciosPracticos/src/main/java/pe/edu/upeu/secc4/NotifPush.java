package pe.edu.upeu.secc4;

//NotifPush
public class NotifPush extends Notificacion18 {

    private String icono;

    public NotifPush(String destinatario, String mensaje, String icono) {
        super(destinatario, mensaje);
        this.icono = icono;
    }

    @Override
    public void enviar() {
        System.out.println("PUSH a " + destinatario +
                " | Icono: " + icono +
                " | Mensaje: " + formatear());
    }

    @Override
    public String formatear() {
        return "[PUSH] " + mensaje;
    }
}