public class Pet {

    private final String nome;
    private final String tipo; // Ex: "Cachorro", "Gato"
    private boolean estaLimpo;

    public Pet(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        this.estaLimpo = false; // Inicialmente, o pet não está limpo
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isEstaLimpo() {
        return estaLimpo;
    }

    public void setEstaLimpo(boolean estaLimpo) {
        this.estaLimpo = estaLimpo;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", estaLimpo=" + estaLimpo +
                '}';
    }
    
}
