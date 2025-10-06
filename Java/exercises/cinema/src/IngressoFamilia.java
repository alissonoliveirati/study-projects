public class IngressoFamilia extends Ingresso {

    private final int quantidade;

    public IngressoFamilia(double valor, String nomeDoFilme, String tipoAudio, int quantidade) {
        super(valor, nomeDoFilme, tipoAudio);
        this.quantidade = quantidade;
    }

    @Override
    public double valorReal() {
        if (quantidade < 3) {
            return getValor() * quantidade; // Sem desconto para menos de 3 ingressos
        } 
        return getValor() * quantidade * 0.95; // 5% de desconto para o ingresso família
    }

    @Override
    public String toString() {
        return "Filme: " + getNomeDoFilme() + ", Tipo de Áudio: " + getTipoAudio() + ", Valor por Ingresso: R$" + getValor() + ", Quantidade: " + quantidade;
    }
    
}
