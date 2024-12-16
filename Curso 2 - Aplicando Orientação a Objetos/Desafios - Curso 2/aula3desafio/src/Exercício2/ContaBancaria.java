package Exercício2;

public class ContaBancaria {
    //2 - Crie uma classe ContaBancaria com métodos para realizar operações bancárias como
    // depositar(), sacar() e consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente
    // que herda da classe ContaBancaria. Adicione um metodo específico para a subclasse,
    // como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.

    protected double saldo;

    public void depositar(double deposito){
        saldo += deposito;
        System.out.println("Depósito concluído!");
        System.out.println("Seu novo saldo é de " + saldo + " reais.");
    }

    public void sacar(double saque){
        if (saque<=saldo){
            saldo -= saque;
            System.out.println("Saque concluído!");
            System.out.println("Seu novo saldo é de " + saldo + " reais.");
        } else {
            System.out.println("É impossível realizar este saque.");
        }
    }

    public void consultarSaldo(){
        System.out.println("Seu saldo atual é de " + saldo + " reais.");
    }
}
