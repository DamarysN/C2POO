package pe.edu.upeu.secc7;

//Usuario
public class PUsuario {

    private String nombre;
    private PRol rol;

    public PUsuario(String nombre, PRol rol) {
        this.nombre = nombre;
        this.rol = rol;
    }

    public PRol getRol() {
        return rol;
    }

    public String getNombre() {
        return nombre;
    }
}