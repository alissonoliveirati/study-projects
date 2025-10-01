public class ContaBancaria {

private final int numeroConta;
private double saldoTotal;
private double saldo;
private double limiteChequeEspecial;
private double chequeEspecial;
private boolean usandoChequeEspecial;

public ContaBancaria(double depositoInicial) {
    numeroConta = (int) (Math.random() * 10000); // Gera um número de conta aleatório entre 0 e 9999
    this.saldo = depositoInicial;
    if (depositoInicial <= 500.00) {
        this.limiteChequeEspecial = 50.00;
    } else if (depositoInicial > 500.00) {
        this.limiteChequeEspecial = depositoInicial * 0.5;
    }
    chequeEspecial = limiteChequeEspecial;
    saldoTotal = saldo + chequeEspecial;
    this.usandoChequeEspecial = false;
    System.out.printf("%nConta criada com sucesso! Número da conta: %d%nSaldo inicial: R$ %.2f%nCheque especial disponível: R$ %.2f%n%n", numeroConta, saldo, chequeEspecial);
}

public void consultarSaldo() {
    System.out.printf("%nSeu saldo total atual é: R$ %.2f%nSaldo disponível: R$ %.2f%nSaldo do cheque especial: R$ %.2f%n%n", saldoTotal, saldo, chequeEspecial);
    if (usandoChequeEspecial) {
        System.out.println("Atenção: Você está utilizando o cheque especial.");
        System.out.println();
    }
}

public void consultarChequeEspecial() {
    System.out.printf("%nSeu limite do cheque especial é: R$ %.2f%nSaldo disponível do cheque especial: R$ %.2f%n%n", limiteChequeEspecial, chequeEspecial);
    if (usandoChequeEspecial) {
        System.out.println("Atenção: Você está utilizando o cheque especial.");
        System.out.printf("Valor utilizado do cheque especial: R$ %.2f%n%n", limiteChequeEspecial - chequeEspecial);
    }
}

public void depositar(double valor) {
    if (valor > 0 && usandoChequeEspecial) {
        chequeEspecial += valor;
        if (chequeEspecial > limiteChequeEspecial) {
            saldo += chequeEspecial - limiteChequeEspecial;
            chequeEspecial = limiteChequeEspecial;
            saldoTotal = saldo + chequeEspecial;
            usandoChequeEspecial = false;
        }
    } else if (valor > 0 && !usandoChequeEspecial) {
        saldo += valor;
        saldoTotal = saldo + chequeEspecial;
    }
}

public boolean sacar(double valor) {
    if (valor > 0 && valor <= saldoTotal) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            double valorRestante = valor - saldo;
            saldo = 0;
            chequeEspecial -= valorRestante;
            usandoChequeEspecial = true;
        }
        saldoTotal = saldo + chequeEspecial;
        return true;
    }
    return false;
}

public boolean pagarConta(double valor) {
    return sacar(valor);
}

}