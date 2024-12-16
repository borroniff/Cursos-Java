package Exercício2;

public class testeBanco {
    public static void main(String[] args) {
        ContaCorrente minhaConta = new ContaCorrente();
        minhaConta.saldo = 1000;
        minhaConta.tarifaMensal = 10;

        minhaConta.sacar(100);
        minhaConta.depositar(500);
        minhaConta.cobrarTarifa();
        minhaConta.consultarSaldo();
    }
}
