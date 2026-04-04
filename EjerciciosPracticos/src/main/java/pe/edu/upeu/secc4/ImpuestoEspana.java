package pe.edu.upeu.secc4;

//ImpuestoEspana
public class ImpuestoEspana extends CalculadoraImpuesto19 {

    public ImpuestoEspana() {
        super("España");
    }

    @Override
    public double calcularImpuesto(double monto) {
        return monto * 0.21;
    }

    @Override
    public String getDescripcion() {
        return "IVA España (21%)";
    }
}