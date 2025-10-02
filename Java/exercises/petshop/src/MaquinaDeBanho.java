public class MaquinaDeBanho {

    private int nivelAgua;
    private int nivelShampoo;
    private boolean maquinaPrecisaDeLimpeza;
    private Pet petNaMaquina;

    public MaquinaDeBanho() {
        nivelAgua = 30;
        nivelShampoo = 10;
        maquinaPrecisaDeLimpeza = false;
        petNaMaquina = null;
    }

    public void colocarPet(Pet pet) {
        if (petNaMaquina == null && maquinaPrecisaDeLimpeza == false) {
            petNaMaquina = pet;
            System.out.println("Pet " + pet.getNome() + " colocado na máquina de banho.");
        } else if (petNaMaquina != null) {
            System.out.println("A máquina já está ocupada com o pet " + petNaMaquina.getNome() + ".");
        } else if (maquinaPrecisaDeLimpeza) {
            System.out.println("A máquina precisa de limpeza antes de colocar um novo pet.");
        }
    }

    public void retirarPet() {
        if (petNaMaquina != null) {
            System.out.println("Pet " + petNaMaquina.getNome() + " retirado da máquina de banho.");
            petNaMaquina = null;
            maquinaPrecisaDeLimpeza = true;
        } else {
            System.out.println("Não há nenhum pet na máquina para retirar.");
        }
    }

    public void darBanho() {
        if (petNaMaquina == null) {
            System.out.println("Não há nenhum pet na máquina para dar banho.");
        } else if (petNaMaquina != null) {
            if (nivelAgua >= 10 && nivelShampoo >= 2) {
                nivelAgua -= 10;
                nivelShampoo -= 2;
                petNaMaquina.setEstaLimpo(true);
                System.out.println("O pet " + petNaMaquina.getNome() + " recebeu um banho.");
            } else {
                System.out.println("Nível de água ou shampoo insuficiente para dar banho.");
            }
        }
    }

    public void abastecerAgua() {
        if (nivelAgua == 30) {
            System.out.println("O nível de água já está cheio.");
        } else  {
            nivelAgua += 2;
            System.out.println("Nível de água abastecido. Nível atual: " + nivelAgua);
        }
    }

    public void abastecerShampoo() {
        if (nivelShampoo == 10) {
            System.out.println("O nível de shampoo já está cheio.");
        } else {
            nivelShampoo += 2;
            System.out.println("Nível de shampoo abastecido. Nível atual: " + nivelShampoo);
        }
    }

    public void verificarNivelAgua() {
        System.out.println("Nível de água atual: " + nivelAgua);
    }

    public void verificarNivelShampoo() {
        System.out.println("Nível de shampoo atual: " + nivelShampoo);
    }

    public void verificarSeTemPet() {
        if (petNaMaquina != null) {
            System.out.println("A máquina está ocupada com o pet " + petNaMaquina.getNome() + ".");
        } else {
            System.out.println("A máquina está vazia.");
        }
    }

    public void limparMaquina() {
        if (maquinaPrecisaDeLimpeza) {
            nivelAgua -= 3;
            nivelShampoo -= 1;
            maquinaPrecisaDeLimpeza = false;
            System.out.println("A máquina de banho foi limpa.");
        } else {
            System.out.println("A máquina de banho não precisa de limpeza.");
        }
    }
}
