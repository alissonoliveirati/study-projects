public sealed abstract class Relogio permits RelogioEUA, RelogioBrasileiro {
    
    protected int hora;
    protected int minuto;
    protected int segundo;

    public Relogio(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public String getHora() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        } else {
            System.out.println("Hora inválida. Deve estar entre 0 e 23.");
        }
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        } else {
            System.out.println("Minuto inválido. Deve estar entre 0 e 59.");
        }
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
        } else {
            System.out.println("Segundo inválido. Deve estar entre 0 e 59.");
        }
    }

    public abstract Relogio conversorRelogio(Relogio outroRelogio);


}
