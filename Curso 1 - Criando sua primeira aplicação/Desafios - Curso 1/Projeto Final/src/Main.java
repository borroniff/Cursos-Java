import java.util.Scanner;

public class Main {

    static String nome = "Angelina Borroni Ferreira";
    static String tipoConta = "Corrente";
    static double saldo = 2500.00;

    public static void dadosDoCliente() {
        System.out.println("********************************");
        System.out.println("Dados do cliente:");
        System.out.println("");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo disponível: " + saldo);
        System.out.println("");
    }

    public static void menu() {
        System.out.println("********************************");
        System.out.println("Operações:");
        System.out.println("");
        System.out.println("1 - Consultar saldo.");
        System.out.println("2 - Receber valor.");
        System.out.println("3 - Transferir valor.");
        System.out.println("4 - Sair");
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner operacoes = new Scanner(System.in);
        dadosDoCliente();

        int escolha = 0;

        while (escolha != 4 ) {
            menu();
            System.out.println("Digite a opção desejada: ");
            escolha = operacoes.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("O saldo disponível é de: " + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor do recebimento: ");
                    double recebido = operacoes.nextDouble();
                    saldo += recebido;
                    System.out.println("Seu novo saldo é de R$" + (saldo));
                    break;
                case 3:
                    System.out.println("Digite o valor da transferência: ");
                    double transferido = operacoes.nextDouble();
                    if (transferido > saldo) {
                        System.out.println("Não é possível transferir esse valor.");
                    } else {
                        saldo -= transferido;
                        System.out.println("Seu novo saldo é de R$" + (saldo));
                    }
                    break;
                case 4:
                    System.out.println("Obrigada por utilizar nossos serviços!");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }
}