package pe.edu.upeu.secc4;

//Notificacion
public class Notificacion18 {

    protected String destinatario;
    protected String mensaje;

    public Notificacion18(String destinatario, String mensaje) {
        this.destinatario = destinatario;
        this.mensaje = mensaje;
    }

    public void enviar() {
        System.out.println("Enviando a " + destinatario);
    }

    public String formatear() {
        return mensaje;
    }
}