public class Vendedor extends Funcionario {
    
    private int vendasFeitas;
    private boolean isAdmin = false;


    public Vendedor(String nome, String emailString, String senha) {
        super(nome, emailString, senha);
    }

}