package pe.edu.upeu.secc4;

//ImpuestoMexico
public class ImpuestoMexico extends CalculadoraImpuesto19 {

    public ImpuestoMexico() {
        super("México");
    }

    @Override
    public double calcularImpuesto(double monto) {
        return monto * 0.16;
    }

    @Override
    public String getDescripcion() {
        return "IVA México (16%)";
    }
}