package pe.edu.upeu.secc2;

public class RelojDigital07 {

    private int horas;
    private int minutos;
    private int segundos;

    private int alarmaH = -1;
    private int alarmaM = -1;

    public RelojDigital07(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public void avanzarSegundo() {
        segundos++;

        if (segundos >= 60) {
            segundos = 0;
            minutos++;
        }

        if (minutos >= 60) {
            minutos = 0;
            horas++;
        }

        if (horas >= 24) {
            horas = 0;
        }
    }

    public String mostrarFormato24h() {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }

    public String mostrarFormato12h() {
        String ampm = (horas >= 12) ? "PM" : "AM";
        int h = horas % 12;
        if (h == 0) h = 12;

        return String.format("%02d:%02d:%02d %s", h, minutos, segundos, ampm);
    }

    public void configurarAlarma(int h, int m) {
        this.alarmaH = h;
        this.alarmaM = m;
    }

    public boolean verificarAlarma() {
        return horas == alarmaH && minutos == alarmaM && segundos == 0;
    }
}