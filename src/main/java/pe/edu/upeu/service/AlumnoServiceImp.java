package pe.edu.upeu.service;

import pe.edu.upeu.modelo.Alumno;
import pe.edu.upeu.repository.AlumnoRepository;

import java.util.List;

public class AlumnoServiceImp implements AlumnoServiceInter {

    AlumnoRepository ar = AlumnoRepository.getInstance();

    private static AlumnoServiceInter instance = new AlumnoServiceImp();

    public static AlumnoServiceInter getInstance() {
        if (instance == null) {
            instance = new AlumnoServiceImp();
        }
        return instance;
    }

    @Override
    public void save(Alumno a) {
        ar.agregarAlumno(a);
    }

    @Override
    public List<Alumno> findAll() {
        if (ar.listarAlumnos().isEmpty()) {
            ar.datosPredeterminados();
        }
        return ar.listarAlumnos();
    }

    @Override
    public void update(Alumno a, int index) {
        ar.actualizarAlumno(a, index);
    }

    @Override
    public void delete(int index) {
        ar.eliminarAlumno(index);
    }
}