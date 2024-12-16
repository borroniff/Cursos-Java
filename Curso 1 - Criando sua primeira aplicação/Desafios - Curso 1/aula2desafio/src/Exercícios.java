public class Exercícios {
    public static void main (String[] args) {

    // 1 - Crie um programa que realize a média de duas notas decimais e exiba o resultado.
           double nota1 = 5.5;
           double nota2 = 8.7;
           double media = (nota1 + nota2) / 2;
           System.out.println (media);

    /* 2 - Declare uma variável do tipo double e uma variável do tipo int. Faça o casting
           variável double para int e imprima o resultado. */
           double variavel1 = 3.4;
           int variavel2 = (int) variavel1;
           System.out.println(variavel2);

    /* 3 - Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra).
           Atribua valores a essas variáveis e concatene-as em uma mensagem. */
           char letra = 'A';
           String palavra = " menina";
           System.out.println(letra + palavra);

    /* 4 - Declare uma variável do tipo double precoProduto e uma variável do tipo int
           (quantidade). Calcule o valor total multiplicando o preço do produto pela
           quantidade e apresente o resultado em uma mensagem. */
           double precoProduto = 6.99;
           int quantidade = 3;
           double valorTotal = precoProduto * quantidade;
           System.out.println(valorTotal);

    /* 5 - Declare uma variável do tipo double valorEmDolares. Atribua um valor em
           dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94
           reais. Realize a conversão do valor em dólares para reais e imprima o resultado
           formatado. */
           double valorEmDolares = 4.7;
           double valorEmReais = valorEmDolares * 4.94;
           System.out.printf("O valor em reais é: R$ %.2f\n", valorEmReais);

    /* 6 - Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a
           essa variável, representando o preço original de um produto.Em seguida, declare
           uma variável do tipo double percentualDesconto e atribua um valor percentual de
           desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em
           reais, aplique-o ao preço original e imprima o novo preço com desconto. */
           double precoOriginal = 34.15;
           double percentualDesconto = 15;
           double novoPreco = precoOriginal - (precoOriginal * percentualDesconto / 100);
           System.out.printf("O novo preço com desconto é: R$ %.2f\n", novoPreco);

    }
}
