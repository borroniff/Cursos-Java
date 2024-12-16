package Exercício6;

public class Main {
    public static void main(String[] args) {

        Produto produto = new Produto();
        Servico servico = new Servico();

        System.out.println(produto.precoTotal(5.00, 5));
        System.out.println(servico.precoTotal(8, 5));
    }
}
