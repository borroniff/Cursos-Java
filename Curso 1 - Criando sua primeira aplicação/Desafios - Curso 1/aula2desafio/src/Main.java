public class Main {
    public static void main(String[] args) {

        /* Faça como eu fiz: Escreva um programa que converta uma temperatura
        em graus Celsius para Fahrenheit. Utilize variáveis para representar os
        valores das temperaturas e imprima no console o valor convertido de Celsius
        para Fahrenheit. Depois de finalizar, testar e conferir que seu programa
        foi executado com sucesso, crie uma variável inteira para exibir a temperatura
        em Fahrenheit sem casas decimais. Lembre-se que provavelmente você precisará
        fazer um casting de valores. */

        int celsius = 34;
        double fahrenheit = (celsius * 1.8) + 32;
        int temperatura = (int) fahrenheit;
        System.out.println(temperatura);

    }
}