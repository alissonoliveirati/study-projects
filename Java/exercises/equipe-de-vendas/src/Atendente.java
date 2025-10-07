public class Atendente extends Funcionario {
    
    private double valorEmCaixa;

    public Atendente(String nome, String emailString, String senha) {
        super(nome, emailString, senha);
        setAdmin(false);
    }

    public void receberPagamento(double valor) {
        valorEmCaixa += valor;
        System.out.println("Pagamento recebido: R$" + valor);
    }

    public double getValorEmCaixa() {
        return valorEmCaixa;
    }

}
