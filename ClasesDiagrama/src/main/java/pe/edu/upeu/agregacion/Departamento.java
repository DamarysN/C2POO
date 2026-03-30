package pe.edu.upeu.agregacion;
import java.util.ArrayList;

public class Departamento {
    private ArrayList<Docente> docentes;

    public Departamento() {
        this.docentes = new ArrayList<>();
    }

    void agregarDocente(Docente docente) {
        docentes.add(docente);
    }

    void listarDocentes() {
        for (Docente docente : docentes) {
            System.out.println(docente.nombre);
        }
    }

    public static void main(String[] args) {
        Departamento departamento = new Departamento();
        Docente docente = new Docente("Juan");
        departamento.agregarDocente(docente);
        departamento.agregarDocente(new Docente("Pedro"));
        departamento.agregarDocente(new Docente("Raul"));
        departamento.listarDocentes();
    }
}
