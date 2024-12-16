package Exercício2;

//2 - Crie uma classe Animal e uma classe Cachorro que herda de Animal. Em seguida, crie um objeto da
//classe Cachorro e faça o casting para a classe Animal.

public class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
}
