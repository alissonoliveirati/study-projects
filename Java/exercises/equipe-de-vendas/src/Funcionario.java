public class Funcionario {
    
    private String nome;
    private String email;
    private String senha;
    private boolean isAdmin;

    public Funcionario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public void realizarLogin(String email, String senha) {
        if (this.email.equals(email) && this.senha.equals(senha)) {
            System.out.printf("%s (%s) realizou login.%n", nome, getClass().getSimpleName());
        } else {
            System.out.println("Falha no login. Verifique suas credenciais.");
        }
    }

    public void realizarLogoff() {
        System.out.printf("%s (%s) realizou logoff.%n", nome, getClass().getSimpleName());
    }

    public void alterarDados(String novoNome, String novoEmail) {
        this.nome = novoNome;
        this.email = novoEmail;
        System.out.println("Dados alterados com sucesso!");
    }

    public void alterarSenha(String novaSenha) {
        this.senha = novaSenha;
        System.out.println("Senha alterada com sucesso!");
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

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
