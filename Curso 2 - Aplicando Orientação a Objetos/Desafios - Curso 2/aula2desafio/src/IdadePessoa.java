public class IdadePessoa {
    //2 - Crie uma classe idadePessoa com os atributos privados nome e idade. Utilize
    // métodos getters e setters para acessar e modificar esses atributos. Adicione um
    // metodo verificarIdade que imprime se a pessoa é maior de idade ou não.

    //atributos//
    private String nome;
    private int idade;

    //getters//
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }

    //setters//
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    //métodos//
    public void verificarIdade(){
        if(idade >= 18){
            System.out.println("é maior de idade.");;
        } else {
            System.out.println("não é maior de idade.");;
        }
    }

}
