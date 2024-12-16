//1 - Crie uma classe Pessoa com atributos como nome, idade, e um metodo toString
//que represente esses atributos.

public class Pessoa {

    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa: " + nome + " - Idade: " + idade;
    }
}