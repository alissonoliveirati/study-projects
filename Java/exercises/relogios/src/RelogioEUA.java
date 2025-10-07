public non-sealed class RelogioEUA extends Relogio {

    private String amPm;
    
    public RelogioEUA(int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
    }

    @Override
    public void setHora(int hora) {
        this.amPm = (hora >= 12) ? "PM" : "AM";
        if (hora == 0) {
            this.hora = 12; // Meia-noite em formato 12 horas
        } else if (hora > 12) {
            this.hora = hora - 12; // Converter para formato 12 horas
        } else {
            this.hora = hora; // Manter a hora como está
        }
    }

    @Override
    public String getHora() {
        return String.format("%02d:%02d:%02d %s", hora, minuto, segundo, amPm);
    }

    @Override
    public Relogio conversorRelogio(Relogio outroRelogio) {
        this.segundo = outroRelogio.segundo;
        this.minuto = outroRelogio.minuto;
        switch (outroRelogio) {
            case RelogioEUA relogioEUA -> {
                this.amPm = relogioEUA.amPm;
                relogioEUA.getHora();
            }
            case RelogioBrasileiro relogioBrasileiro -> this.setHora(relogioBrasileiro.hora);
        }
        return this;
    }

    @Override
    public String toString() {
        return String.format("Horário dos EUA: %s", getHora());
    }

    public String getAmPm () {
        return amPm;
    }
}
