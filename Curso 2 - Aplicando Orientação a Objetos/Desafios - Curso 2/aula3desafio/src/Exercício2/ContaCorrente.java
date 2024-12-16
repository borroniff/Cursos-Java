package Exercício2;

public class ContaCorrente extends ContaBancaria{

    protected double tarifaMensal;

    public void cobrarTarifa(){
        saldo -= tarifaMensal;
        System.out.println("Tarifa mensal de " + tarifaMensal + " cobrada. O novo saldo é de " +
                saldo + " reais.");
    }
}
