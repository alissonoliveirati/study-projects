public class Atendente extends Funcionario {
    

    private double valorEmCaixa;
    private boolean isAdmin = false;

    public Atendente(String nome, String emailString, String senha) {
        super(nome, emailString, senha);
    }

    
}
