package pe.edu.upeu.repository;

import pe.edu.upeu.modelo.Alumno;

import java.util.ArrayList;
import java.util.List;

public class AlumnoRepository {

    private static AlumnoRepository instance = new AlumnoRepository();

    public static AlumnoRepository getInstance() {
        if (instance == null) {
            instance = new AlumnoRepository();
        }
        return instance;
    }

    List<Alumno> alumnos = new ArrayList<>();

    // CREATE
    public void agregarAlumno(Alumno a) {
        alumnos.add(a);
    }

    // READ
    public List<Alumno> listarAlumnos() {
        return alumnos;
    }

    // UPDATE
    public void actualizarAlumno(Alumno a, int index) {
        alumnos.set(index, a);
    }

    // DELETE
    public void eliminarAlumno(int index) {
        alumnos.remove(index);
    }

    public void eliminarTodo() {
        alumnos.clear();
    }

    public void datosPredeterminados() {
        alumnos.add(new Alumno(
                "Raul Pérez Gonzales",
                "PEGR110615HSLRNL A3",
                "Secundaria",
                "Colegio Nacional",
                "María Gonzales",
                "989362543"
        ));

        alumnos.add(new Alumno(
                "Luis Gómez Mamani",
                "GOML091114HNEMMS A2",
                "Secundaria",
                "Escuela Estatal",
                "Carlos Gómez",
                "901248773"
        ));
    }

    public int getAlumnos() {
        return alumnos.size();
    }
}