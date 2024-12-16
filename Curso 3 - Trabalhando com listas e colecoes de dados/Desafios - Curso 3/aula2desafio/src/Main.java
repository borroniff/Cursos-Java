import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //1.2 - Em seguida, crie uma lista de objetos Produto utilizando a classe ArrayList. Adicione alguns
        //produtos, imprima o tamanho da lista e recupere um produto pelo índice.

        //3.2 - Em seguida, crie objetos Produto utilizando esse novo construtor.
        var produto1 = new Produto("Camiseta", 45.99, 3);
        /*produto1.setNome("Camiseta");
        produto1.setPreco(45.99);
        produto1.setQuantidade(3);*/

        var produto2 = new Produto("Calça", 69.99, 2);
        /*produto2.setNome("Calça");
        produto2.setPreco(69.99);
        produto2.setQuantidade(2);*/

        var produto3 = new Produto("Sandália", 25.99, 1);
        /*produto3.setNome("Sandália");
        produto3.setPreco(25.99);
        produto3.setQuantidade(1);*/

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        System.out.println(listaProdutos.size());
        System.out.println(listaProdutos.get(0).getNome());

        //2.2 - Em seguida, imprima a lista de produtos utilizando o metodo System.out.println().
        System.out.println(listaProdutos);

        //4.2 - Crie um objeto ProdutoPerecivel e imprima seus valores.
        var produto4 = new ProdutoPerecivel("Bifes de carne", 8.49, 8, "12/11/2024");
        System.out.println(produto4);
    }
}