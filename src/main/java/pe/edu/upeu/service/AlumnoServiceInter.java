package pe.edu.upeu.service;

import pe.edu.upeu.modelo.Alumno;

import java.util.List;

public interface AlumnoServiceInter {
    void save(Alumno a);
    List<Alumno> findAll();
    void update(Alumno a, int index);
    void delete(int index);
}