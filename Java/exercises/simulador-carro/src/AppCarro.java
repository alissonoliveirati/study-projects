
import java.util.Scanner;

public class AppCarro {

    public static void imprimirMenu() {
            String menu = """
                    ====== Meu Carro ======
                    1 - Ligar o carro
                    2 - Desligar o carro
                    3 - Acelerar
                    4 - Diminuir velocidade
                    5 - Trocar marcha
                    6 - Virar à esquerda
                    7 - Virar à direita
                    0 - Sair
                    =======================
                    """;
            System.out.println(menu);
        }

    
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            Carro carro = new Carro();
            boolean continuar = true;
            
            while (continuar) {
                imprimirMenu();
                carro.painel();
                System.out.println();
                System.out.print("Escolha uma opção: ");
                int opcao = scanner.nextInt();
                
                switch (opcao) {
                    case 1 -> carro.ligar();
                    case 2 -> carro.desligar();
                    case 3 -> carro.acelerar();
                    case 4 -> carro.diminuirVelocidade();
                    case 5 -> {
                        System.out.print("Digite a nova marcha: ");
                        int novaMarcha = scanner.nextInt();
                        carro.trocarMarcha(novaMarcha);
                    }
                    case 6 -> carro.virarEsquerda();
                    case 7 -> carro.virarDireita();
                    case 0 -> continuar = false;
                    default -> System.out.println("Opção inválida.");
                }
                
                System.out.println();
            }
        }
    }

}
