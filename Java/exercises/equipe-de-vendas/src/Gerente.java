public class Gerente extends Funcionario {
    
    public Gerente(String nome, String emailString, String senha) {
        super(nome, emailString, senha);
        setAdmin(true);
    }
    
    public void consultarVendas(Vendedor vendedor) {
        System.out.println("Consultando vendas como gerente...");
        System.out.println("Total de vendas do vendedor " + vendedor.getNome() + ": " + vendedor.getVendasFeitas());
    }
    
    public void gerarRelatorioFinanceiro(Atendente atendente) {
        atendente.getValorEmCaixa();
        System.out.println("Relatório financeiro gerado.");
        System.out.println("Gerente responsável: " + getNome());
        System.out.println("Total em caixa do atendente " + atendente.getNome() + ": R$" + atendente.getValorEmCaixa());
    }

    
}
