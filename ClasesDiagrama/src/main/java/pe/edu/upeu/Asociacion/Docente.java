package pe.edu.upeu.Asociacion;

public class Docente {

    public void ensenhar(Estudiante estudiante){
        System.out.println("Enseñar a "+estudiante.getNombre()+"");
    }

    public static void main(String[] args){
        Docente docente = new Docente();
        Estudiante estudiante = new Estudiante("Juan");
        docente.ensenhar(estudiante);
    }
}
