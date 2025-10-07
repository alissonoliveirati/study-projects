public class RelogioApp {
    public static void main(String[] args) throws Exception {
        
        Relogio relogioBrasileiro = new RelogioBrasileiro(14, 30, 0);
        Relogio relogioEUA = new RelogioEUA(2, 30, 0);
        
        System.out.println(relogioBrasileiro);
        System.out.println(relogioEUA);
        
        relogioEUA.conversorRelogio(relogioBrasileiro);
        System.out.println("Após conversão para horário dos EUA:");
        System.out.println(relogioEUA);
        
        relogioBrasileiro.conversorRelogio(relogioEUA);
        System.out.println("Após conversão para horário Brasileiro:");
        System.out.println(relogioBrasileiro);

    }
}
