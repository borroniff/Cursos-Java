//4.1 - Crie uma classe ProdutoPerecivel que herde de Produto. Adicione um atributo dataValidade
//e um construtor que utilize o construtor da classe mãe (super) para inicializar os atributos
//herdados.

public class ProdutoPerecivel extends Produto{

    private String dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return super.toString() + " - Data de Validade: " + dataValidade;

    }
}
