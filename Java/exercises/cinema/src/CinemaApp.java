public class CinemaApp {
    public static void main(String[] args) throws Exception {
        

        Ingresso ingresso1 = new Ingresso(20.0, "Inception", "Legendado");
        Ingresso ingresso2 = new MeiaEntrada(20.0, "Inception", "Legendado");
        Ingresso ingresso3 = new IngressoFamilia(20.0, "Lion King", "Dublado", 2);
        Ingresso ingresso4 = new IngressoFamilia(20.0, "Lion King", "Dublado", 4);

        System.out.println(ingresso1);
        System.out.println("Valor do ingresso normal: R$" + ingresso1.valorReal());
        System.out.println(ingresso2);
        System.out.println("Valor do meia-entrada: R$" + ingresso2.valorReal());
        System.out.println(ingresso3);
        System.out.println("Valor do ingresso família (2 ingressos): R$" + ingresso3.valorReal());
        System.out.println(ingresso4);
        System.out.println("Valor do ingresso família (4 ingressos): R$" + ingresso4.valorReal());

    }
}
