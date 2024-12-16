//1.1 - Crie uma classe Produto com atributos como nome, preco, e quantidade.

//2 - Implemente o metodo toString() na classe Produto para retornar uma representação em texto do objeto.
//Em seguida, imprima a lista de produtos utilizando o metodo System.out.println().

//3 - Modifique a classe Produto para incluir um construtor que aceite parâmetros para inicializar os
//atributos. Em seguida, crie objetos Produto utilizando esse novo construtor.

//4 - Crie uma classe ProdutoPerecivel que herde de Produto. Adicione um atributo dataValidade e um construtor
//que utilize o construtor da classe mãe (super) para inicializar os atributos herdados. Crie um objeto
//ProdutoPerecivel e imprima seus valores.

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    //3.1 - Modifique a classe Produto para incluir um construtor que aceite parâmetros para inicializar
    //os atributos.
    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    //2.1 - Implemente o metodo toString() na classe Produto para retornar uma representação em texto do objeto.

    @Override
    public String toString() {
        return "Nome: " + nome + " - Preco: " + preco + " - Quantidade: " + quantidade;
    }
}
