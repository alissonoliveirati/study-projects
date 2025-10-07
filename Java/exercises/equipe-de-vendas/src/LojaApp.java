public class LojaApp {
    public static void main(String[] args) throws Exception {
        
        // Criando instâncias de funcionários
        Gerente gerente = new Gerente("Alice", "alice@example.com", "senha123");
        Vendedor vendedor = new Vendedor("Bob", "bob@example.com", "senha456");
        Vendedor vendedor2 = new Vendedor("David", "david@example.com", "senha101");
        Atendente atendente = new Atendente("Charlie", "charlie@example.com", "senha789");

        // Simulando operações
        System.out.println();
        System.out.println("Início das operações na loja...\n");
        gerente.realizarLogin("alice@example.com", "senha123");
        vendedor.realizarLogin("bob@example.com", "senha456");
        vendedor2.realizarLogin("david@example.com", "senha101");
        atendente.realizarLogin("charlie@example.com", "senha789");
        System.out.println();

        vendedor.registrarVenda();
        atendente.receberPagamento(150.0);
        System.out.println();

        vendedor2.registrarVenda();
        atendente.receberPagamento(200.0);
        System.out.println();

        vendedor.registrarVenda();
        atendente.receberPagamento(50.0);
        System.out.println();

        vendedor.consultarVendas();
        vendedor2.consultarVendas();
        System.out.println();

        gerente.consultarVendas(vendedor);
        System.out.println();
        gerente.consultarVendas(vendedor2);
        System.out.println();
        gerente.gerarRelatorioFinanceiro(atendente);
        System.out.println();

        atendente.alterarDados("Charlie Updated", "charlie.updated@example.com");
        atendente.alterarSenha("newSenha789");
        System.out.println();

        atendente.realizarLogoff();
        vendedor.realizarLogoff();
        vendedor2.realizarLogoff();
        gerente.realizarLogoff();
        System.out.println();


    }
}
