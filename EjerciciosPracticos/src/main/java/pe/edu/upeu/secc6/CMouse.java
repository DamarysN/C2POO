package pe.edu.upeu.secc6;

//Mouse
public class CMouse implements Conectable28 {

    private boolean conectado = false;

    @Override
    public void conectar() {
        conectado = true;
    }

    @Override
    public void desconectar() {
        conectado = false;
    }

    @Override
    public boolean estaConectado() {
        return conectado;
    }

    @Override
    public String getNombreDispositivo() {
        return "Mouse USB";
    }
}