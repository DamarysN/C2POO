package pe.edu.upeu.secc4;

//ImpuestoUSA
public class ImpuestoUSA extends CalculadoraImpuesto19 {

    private double tasa;

    public ImpuestoUSA(double tasa) {
        super("USA");
        this.tasa = tasa;
    }

    @Override
    public double calcularImpuesto(double monto) {
        return monto * tasa;
    }

    @Override
    public String getDescripcion() {
        return "Sales Tax USA (" + (tasa * 100) + "%)";
    }
}