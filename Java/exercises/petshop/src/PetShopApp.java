
import java.util.Scanner;

public class PetShopApp {

    public static void imprimirMenu() {
        System.out.println("");
        String menu = """
                ====== PetShop - Máquina de Banho ======
                1 - Colocar pet na máquina de banho
                2 - Retirar pet da máquina de banho
                3 - Dar banho no pet
                4 - Abastecer água (+2L)
                5 - Abastecer shampoo (+2L)
                6 - Verificar níveis
                7 - Verificar se há pet na máquina
                8 - Limpar máquina de banho
                0 - Sair
                ========================================
                Escolha uma opção:
                """;
        System.out.print(menu);
    }

    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        MaquinaDeBanho maquina = new MaquinaDeBanho();
        
        Pet pet1 = new Pet("Rex", "Cachorro");
        Pet pet2 = new Pet("Mia", "Gato");
        Pet pet3 = new Pet("Perna", "Coelho");

        boolean continuar = true;

        while (continuar) {
            imprimirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1 -> {
                    System.out.printf("Escolha um pet para colocar na máquina (1: %s - %s, 2: %s - %s, 3: %s - %s):", pet1.getNome(), pet1.getTipo(), pet2.getNome(), pet2.getTipo(), pet3.getNome(), pet3.getTipo());
                    int escolhaPet = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha
                switch (escolhaPet) {
                    case 1 -> maquina.colocarPet(pet1);
                    case 2 -> maquina.colocarPet(pet2);
                    case 3 -> maquina.colocarPet(pet3);
                    default -> System.out.println("Opção inválida.");
                }
                }
                case 2 -> maquina.retirarPet();
                case 3 -> maquina.darBanho();
                case 4 -> maquina.abastecerAgua();
                case 5 -> maquina.abastecerShampoo();
                case 6 -> { 
                    maquina.verificarNivelAgua();
                    maquina.verificarNivelShampoo();
                }
                case 7 -> maquina.verificarSeTemPet();
                case 8 -> maquina.limparMaquina();
                case 0 -> {
                    continuar = false;
                    System.out.println("Saindo do sistema. Até mais!");
                }
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
