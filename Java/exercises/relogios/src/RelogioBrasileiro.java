public non-sealed class RelogioBrasileiro extends Relogio {

    public RelogioBrasileiro(int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
    }

    @Override
    public Relogio conversorRelogio(final Relogio outroRelogio) {
        this.segundo = outroRelogio.segundo;
        this.minuto = outroRelogio.minuto;
        switch (outroRelogio) {
            case RelogioEUA relogioEUA -> this.hora = (relogioEUA.getAmPm().equals("PM")) ? relogioEUA.hora + 12 : relogioEUA.hora;
            case RelogioBrasileiro relogioBrasileiro -> this.hora = relogioBrasileiro.hora;
        }
        return this;
    }

    @Override
    public String toString() {
        return String.format("Horário Brasileiro: %s", getHora());
    }
    
}
