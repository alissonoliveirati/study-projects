public class Carro {
    private boolean isLigado;
    private int velocidade;
    private int marcha;
    private final int MAX_VELOCIDADE = 120;

    public Carro() {
        isLigado = false;
        velocidade = 0;
        marcha = 0;
    }

    public void ligar() {
        if (!isLigado) {
            isLigado = true;
            System.out.println("Carro ligado");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    public void desligar() {
        if (isLigado && marcha != 0 && velocidade != 0) {
            System.out.println("Desligue o carro apenas quando estiver parado e em ponto morto (marcha 0).");
        } else if (isLigado && marcha == 0 && velocidade == 0) {
            isLigado = false;
           System.out.println("Carro desligado");
        } else if (!isLigado) {
            System.out.println("O carro já está desligado.");
        }
    }
    
    public void acelerar() {
        if (isLigado) {
            if (velocidade == 0 && marcha == 0) {
                System.out.println("Avance a marcha para 1");
            } else if (velocidade >= 0 && velocidade < 20 && marcha == 1) {
                velocidade += 10;
            } else if (velocidade >= 20 && velocidade < 40 && marcha == 2) {
                velocidade += 10;
            } else if (velocidade >= 40 && velocidade < 60 && marcha == 3) {
                velocidade += 10;
            } else if (velocidade >= 60 && velocidade < 80 && marcha == 4) {
                velocidade += 10;
            } else if (velocidade >= 80 && velocidade < 100 && marcha == 5) {
                velocidade += 10;
            } else if (velocidade >= 100 && velocidade < MAX_VELOCIDADE && marcha == 6) {
                velocidade += 10;
            } else if (velocidade == MAX_VELOCIDADE) {
                System.out.println("Velocidade máxima atingida: " + MAX_VELOCIDADE + " km/h");
            } else {
                System.out.println("Avance para a marcha " + (marcha + 1) + ".");
            }
        } else {
            System.out.println("O carro está desligado. Não é possível acelerar.");
        }
    }


    public void diminuirVelocidade() {
        if (isLigado) {
            if (velocidade <= MAX_VELOCIDADE && marcha == 6) {
                velocidade -= 10;
            } else if (velocidade < 100 && velocidade >= 80 && marcha == 5) {
                velocidade -= 10;
            } else if (velocidade < 80 && velocidade >= 60 && marcha == 4) {
                velocidade -= 10;
            } else if (velocidade < 60 && velocidade >= 40 && marcha == 3) {
                velocidade -= 10;
            } else if (velocidade < 40 && velocidade >= 20 && marcha == 2) {
                velocidade -= 10;
            } else if (velocidade <= 20 && velocidade > 0 && marcha == 1) {
                velocidade -= 10;
            } else if (velocidade == 0) {
                System.out.println("O carro já está parado.");
            } else {
                System.out.println("Reduza a marcha para diminuir a velocidade.");
            }
        } else {
            System.out.println("O carro está desligado. Não é possível diminuir a velocidade.");
        }
    }

    public void trocarMarcha(int novaMarcha) {
        if (novaMarcha < 0 || novaMarcha > 6) {
            System.out.println("Marcha inválida. Escolha entre 0 e 6.");
            return;
        }
        marcha = novaMarcha;
        System.out.println("Carro na marcha: " + novaMarcha);
    }

    public void virarEsquerda() {
        if (isLigado && velocidade > 0 && velocidade <= 40) {
            System.out.println("Carro virou à esquerda");
        } else if (!isLigado) {
            System.out.println("O carro está desligado. Não é possível virar.");
        } else {
            System.out.println("O carro está em alta velocidade. Não é possível virar.");
        }
    }

    public void virarDireita() {
        if (isLigado && velocidade > 0 && velocidade <= 40) {
            System.out.println("Carro virou à direita");
        } else if (!isLigado) {
            System.out.println("O carro está desligado. Não é possível virar.");
        } else {
            System.out.println("O carro está em alta velocidade. Não é possível virar.");
        }
    }

    public void painel() {
        System.out.println("Carro está " + (isLigado ? "ligado" : "desligado"));
        System.out.println("Velocidade: " + velocidade + " km/h");
        System.out.println("Marcha: " + marcha);
    }

}
