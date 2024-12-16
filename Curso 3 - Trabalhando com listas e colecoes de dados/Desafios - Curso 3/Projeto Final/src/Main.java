import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int operacao = 1;

        Scanner comprando = new Scanner(System.in);
        CartãoDeCrédito cartao = new CartãoDeCrédito();

        while (operacao == 1){
            if (cartao.getLimite()>0) {
                Compra compra = new Compra();
                System.out.println("Digite o nome do item:");
                String nomeItem = comprando.nextLine();
                compra.setItem(nomeItem);
                System.out.println("Digite o valor do item:");
                double valorItem = comprando.nextDouble();
                compra.setValor(valorItem);
                if (valorItem<= cartao.getLimite()) {
                    System.out.println("Compra realizada!");
                    cartao.getCompras().add(compra);
                    cartao.setLimite(cartao.getLimite() - valorItem);
                    System.out.println("Digite 1 para continuar, ou 0 para finalizar a compra.");
                    operacao = comprando.nextInt();
                    comprando.nextLine();
                } else {
                    System.out.println("Saldo insuficiente para realizar a compra.");
                    operacao = 0;
                }
            }
        }
        if (operacao == 0){
            System.out.println("Seu cartão possui " + cartao.getLimite() + " reais de limite restante.");
            System.out.println("Você comprou os seguintes itens:");
            Collections.sort(cartao.getCompras());
            System.out.println(cartao.getCompras());
        }
    }
}