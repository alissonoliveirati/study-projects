public class Vendedor extends Funcionario {
    
    private int vendasFeitas;

    public Vendedor(String nome, String emailString, String senha) {
        super(nome, emailString, senha);
        setAdmin(false);
    }

    public void registrarVenda() {
        vendasFeitas++;
        System.out.println("Venda registrada com sucesso. Total de vendas: " + vendasFeitas);
    }

    public int getVendasFeitas() {
        return vendasFeitas;
    }



}