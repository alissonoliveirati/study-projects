public class Ingresso {

    private final double valor;
    private final String nomeDoFilme;
    private final String tipoAudio;

    public Ingresso(double valor, String nomeDoFilme, String tipoAudio) {
        this.valor = valor;
        this.nomeDoFilme = nomeDoFilme;
        this.tipoAudio = tipoAudio;
    }

    public double getValor() {
        return valor;
    }

    public String getNomeDoFilme() {
        return nomeDoFilme;
    }

    public String getTipoAudio() {
        return tipoAudio;
    }

    public double valorReal() {
        return valor;
    }
    
    @Override
    public String toString() {
        return "Filme: " + nomeDoFilme + ", Tipo de Áudio: " + tipoAudio + ", Valor: R$" + valor;
    }

}
