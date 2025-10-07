public class Vendedor extends Funcionario {
    
    private int vendasFeitas;

    public Vendedor(String nome, String emailString, String senha) {
        super(nome, emailString, senha);
        setAdmin(false);
    }

    public void registrarVenda() {
        vendasFeitas++;
        System.out.println("Venda registrada com sucesso para " + getNome() + ". Total de vendas: " + vendasFeitas);
    }

    public int getVendasFeitas() {
        return vendasFeitas;
    }

    public void consultarVendas() {
        System.out.println("Total de vendas realizadas por " + getNome() + ": " + vendasFeitas);
    }



}