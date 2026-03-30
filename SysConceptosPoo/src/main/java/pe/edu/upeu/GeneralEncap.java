package pe.edu.upeu;
import pe.edu.upeu.encapsulamiento.Persona;
import pe.edu.upeu.encapsulamiento.PersonaX;

public class GeneralEncap {
    public static void main(String[] args) {
        Persona pObj = new Persona(); //pObj es un objeto
        /*Aplicar encapsulamiento; para acceder a las variables  */
        pObj.setNombre("Dario");
        pObj.setEdad(48);

        PersonaX pObjX = new PersonaX();
        pObjX.setNombre("David");
        pObjX.setEdad(30);

        System.out.println(pObj.getNombre()+"\t"+pObj.getEdad());
    }
}
