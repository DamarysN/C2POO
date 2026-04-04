package pe.edu.upeu.secc7;
import java.util.EnumSet;

//Rol
public enum PRol {

    ADMIN(EnumSet.allOf(Permiso35.class)),
    EDITOR(EnumSet.of(Permiso35.LEER, Permiso35.ESCRIBIR)),
    VIEWER(EnumSet.of(Permiso35.LEER));

    private EnumSet<Permiso35> permisos;

    PRol(EnumSet<Permiso35> permisos) {
        this.permisos = permisos;
    }

    public boolean tienePermiso(Permiso35 permiso) {
        return permisos.contains(permiso);
    }

    public void agregarPermiso(Permiso35 permiso) {
        permisos.add(permiso);
    }

    public String mostrarPermisos() {
        return permisos.toString();
    }
}