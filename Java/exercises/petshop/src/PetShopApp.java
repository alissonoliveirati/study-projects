public class PetShopApp {

    public static void imprimirMenu() {
        String menu = """
                ====== PetShop - Máquina de Banho ======
                1 - Colocar pet na máquina de banho
                2 - Retirar pet da máquina de banho
                3 - Dar banho no pet
                4 - Abastecer água (+2L)
                5 - Abastecer shampoo (+2L)
                6 - Verificar nível de água
                7 - Verificar nível de shampoo
                8 - Verificar se tem pet na máquina
                9 - Limpar máquina de banho
                0 - Sair
                ========================================
                Escolha uma opção:
                """;
        System.out.println(menu);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
