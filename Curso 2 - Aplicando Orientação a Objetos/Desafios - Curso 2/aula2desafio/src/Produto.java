public class Produto {
    //3 - Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize
    // métodos getters e setters para acessar e modificar esses atributos. Adicione um
    // metodo aplicarDesconto que recebe um valor percentual e reduz o preço do produto.

    //atributos//
    private String nome;
    private double preco;

    //getters//
    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }

    //setters//
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

    //metodos//
    public void aplicarDesconto(int percentual){
        System.out.println("O novo preço é " + (preco - (percentual * preco / 100)));
    }

}
