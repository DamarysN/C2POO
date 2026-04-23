package pe.edu.upeu.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Alumno {

    private String nombre;
    private String curp;
    private String nivel;
    private String escuela;
    private String tutorNombre;
    private String tutorTelefono;

    public Alumno(String nombre, String curp) {
        this.nombre = nombre;
        this.curp = curp;
    }

    @Override
    public String toString() {
        return String.format("%-30s | %-18s | %-15s",
                nombre, curp, nivel);
    }
}