
import java.util.Scanner;



public class BancoApp {

    public static void imprimirMenu() {
            String menu = """
                    ====== Banco App ======
                    1 - Consultar Saldo
                    2 - Consultar Cheque Especial
                    3 - Depositar
                    4 - Sacar
                    5 - Pagamento de Conta
                    6 - Sair
                    =======================
                    """;
            System.out.println(menu);
        }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem-vindo ao Banco App!");
        System.out.println("Vamos criar sua conta bancária. Digite o valor inicial de depósito:");
        double depositoInicial = scanner.nextDouble();
        //scanner.nextLine(); // Consumir a quebra de linha

        ContaBancaria conta = new ContaBancaria(depositoInicial);
        boolean continuar = true;

        while (continuar) {
            imprimirMenu();
            System.out.println("Escolha uma opção:");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    conta.consultarSaldo();
                    break;
                case 2:
                    conta.consultarChequeEspecial();
                    break;
                case 3:
                    System.out.println("Digite o valor a ser depositado:");
                    double valorDeposito = scanner.nextDouble();
                    scanner.nextLine(); // Consumir a quebra de linha
                    conta.depositar(valorDeposito);
                    System.out.println("Depósito realizado com sucesso!");
                    break;
                case 4:
                    System.out.println("Digite o valor a ser sacado:");
                    double valorSaque = scanner.nextDouble();
                    scanner.nextLine(); // Consumir a quebra de linha
                    if (conta.sacar(valorSaque)) {
                        System.out.println("Saque realizado com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente para saque.");
                    }
                    break;
                case 5:
                    System.out.println("Digite o valor da conta a ser paga:");
                    double valorConta = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Digite a descrição da conta:");
                    String descricaoConta = scanner.nextLine();
                    if (conta.pagarConta(valorConta)) {
                        System.out.println("Pagamento realizado com sucesso!");
                        System.out.printf("Descrição da conta: %s%n", descricaoConta);
                        System.out.println("Valor pago: R$ " + valorConta);
                        System.out.printf("Nº da autenticação: %d%n", (int)(Math.random() * 1000000));
                        System.out.println("Obrigado por pagar sua conta em dia!");
                        conta.consultarSaldo();
                    } else {
                        System.out.println("Saldo insuficiente para pagamento.");
                    }
                    break;
                case 6:
                    continuar = false;
                    System.out.println("Obrigado por usar o Banco App. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}

