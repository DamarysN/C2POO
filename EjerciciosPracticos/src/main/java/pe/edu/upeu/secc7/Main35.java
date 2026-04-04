package pe.edu.upeu.secc7;

public class Main35 {
    public static void main(String[] args) {

        PUsuario admin = new PUsuario("Dama", PRol.ADMIN);
        PUsuario editor = new PUsuario("Axel", PRol.EDITOR);
        PUsuario viewer = new PUsuario("Jhonatan", PRol.VIEWER);

        verificarAcceso(admin, Permiso35.ELIMINAR);
        verificarAcceso(editor, Permiso35.ELIMINAR);
        verificarAcceso(viewer, Permiso35.LEER);

        System.out.println("Permisos EDITOR: " + editor.getRol().mostrarPermisos());

        editor.getRol().agregarPermiso(Permiso35.ELIMINAR);

        verificarAcceso(editor, Permiso35.ELIMINAR);
    }

    public static void verificarAcceso(PUsuario u, Permiso35 p) {
        if (u.getRol().tienePermiso(p)) {
            System.out.println(u.getNombre() + " tiene permiso: " + p);
        } else {
            System.out.println(u.getNombre() + " NO tiene permiso: " + p);
        }
    }
}