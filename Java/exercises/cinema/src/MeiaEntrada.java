public class MeiaEntrada extends Ingresso {

    public MeiaEntrada(double valor, String nomeDoFilme, String tipoAudio) {
        super(valor, nomeDoFilme, tipoAudio);
    }

    @Override
    public double valorReal() {
        return getValor() / 2;
    }
    
}
