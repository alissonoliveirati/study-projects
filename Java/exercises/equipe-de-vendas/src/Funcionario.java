public class Funcionario {
    
    private String nome;
    private String emailString;
    private String senha;
    private boolean isAdmin;

    public Funcionario(String nome, String emailString, String senha) {
        this.nome = nome;
        this.emailString = emailString;
        this.senha = senha;
    }

    public void realizarLogin(String email, String senha) {
        System.out.println("Login realizado com sucesso.");
    }

    public void realizarLogoff() {
        System.out.println("Logoff realizado com sucesso.");
    }

    public void alterarDados() {
        System.out.println("Dados alterados com sucesso.");
    }

    public void alterarSenha() {
        System.out.println("Senha alterada com sucesso.");
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    protected void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getNome() {
        return nome;
    }

    public String getEmailString() {
        return emailString;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmailString(String emailString) {
        this.emailString = emailString;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
