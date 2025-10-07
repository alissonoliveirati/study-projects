public class Gerente extends Funcionario {
    
    public Gerente(String nome, String emailString, String senha) {
        super(nome, emailString, senha);
        setAdmin(true);
    }
    
    public void consultarVendas(Vendedor vendedor) {
        System.out.println("Consultando vendas como gerente...");
        vendedor.getVendasFeitas();
        System.out.println("Total de vendas do vendedor: " + vendedor.getVendasFeitas());
    }
    
    public void gerarRelatorioFinanceiro(Vendedor vendedor, Atendente atendente) {
        //vendedor.getVendasFeitas();
        atendente.getValorEmCaixa();
        System.out.println("Relatório financeiro gerado.");
        //System.out.println("Total de vendas do vendedor: " + vendedor.getVendasFeitas());
        consultarVendas(vendedor);
        System.out.println("Total em caixa do atendente: R$" + atendente.getValorEmCaixa());
    }

    
}
