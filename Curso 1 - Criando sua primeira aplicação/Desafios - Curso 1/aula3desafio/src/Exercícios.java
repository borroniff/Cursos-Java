import java.util.Scanner;

public class Exercícios {
    public static void main(String[] args) {

    /* 1 - Crie um programa que solicite ao usuário digitar um número. Se o número for positivo,
    exiba "Número positivo", caso contrário, exiba "Número negativo". */
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = leitura.nextInt();
        if (numero > 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }

    /* 2 - Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma
    mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior. */
        Scanner numeros = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num1 = numeros.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = numeros.nextInt();
        if (num1>num2) {
            System.out.println("São diferentes e o primeiro é maior.");
        } else if (num2>num1) {
            System.out.println("São diferentes e o segundo é maior.");
        } else {
            System.out.println("São iguais.");
        }


    /* 3 - Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado"
    e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área
    com base na opção selecionada. */
        Scanner opcao = new Scanner(System.in);
        System.out.println("Digite 1 para calcular área do quadrado. Digite 2 para calcular área do círculo:");
        int escolha = opcao.nextInt();
        if (escolha == 2) {
            System.out.println("Digite o valor do raio:");
            double raio = opcao.nextDouble();
            double area = 3.14 * ( raio * raio);
            System.out.println("A área do círculo é igual a " + area);
        } else {
            System.out.println("Digite o valor do lado:");
            double lado = opcao.nextDouble();
            double area2 = lado*lado;
            System.out.println("A área do quadrado é igual a " + area2);
        }

        /* 4 - Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10. */
        Scanner n = new Scanner(System.in);
        System.out.println("Digite um número:");
        int nro = n.nextInt();
        int k = 1;
        while (k < 11) {
            System.out.println(nro * k);
            k+=1;
        }

    /* 5 - Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o
    número é par ou ímpar e exiba uma mensagem correspondente. */
        Scanner hey = new Scanner(System.in);
        System.out.println("Digite um número:");
        int nmr = hey.nextInt();
        if (nmr%2==0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é impar");
        }

        /* 6 - Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.*/
        Scanner uai = new Scanner(System.in);
        System.out.println("Digite um número:");
        int nu = uai.nextInt();
        int resposta = 1;
        for (int i = 2; i < nu+1; i++) {
            resposta = resposta * i;
        }
        System.out.println(resposta);

    }
}