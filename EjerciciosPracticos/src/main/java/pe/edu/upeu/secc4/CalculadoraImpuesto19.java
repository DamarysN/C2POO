package pe.edu.upeu.secc4;

//CalculadoraImpuesto
public class CalculadoraImpuesto19 {

    protected String pais;

    public CalculadoraImpuesto19(String pais) {
        this.pais = pais;
    }

    public double calcularImpuesto(double monto) {
        return 0; // se sobrescribe
    }

    public String getDescripcion() {
        return "Impuesto genérico de " + pais;
    }
}