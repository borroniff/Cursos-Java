package Exercício5;

public class Main {
    public static void main(String[] args) {

        Livro livro = new Livro();
        ProdutoFisico produto = new ProdutoFisico();

        System.out.println(livro.calcularPrecoFinal(50));
        System.out.println(produto.calcularPrecoFinal(25));
    }
}
