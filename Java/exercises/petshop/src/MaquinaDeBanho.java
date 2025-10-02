public class MaquinaDeBanho {

    private int nivelAgua;
    private int nivelShampoo;
    private boolean precisaDeLimpeza;
    private Pet petNaMaquina;

    public MaquinaDeBanho() {
        nivelAgua = 30;
        nivelShampoo = 10;
        precisaDeLimpeza = false;
        petNaMaquina = null;
    }

    public void colocarPet();

    public void retirarPet();

    public void darBanho();

    public void abastecerAgua();

    public void abastecerShampoo();

    public void verificarNivelAgua();

    public void verificarNivelShampoo();

    public void verificarSeTemPet();

    public void limparMaquina();
}
