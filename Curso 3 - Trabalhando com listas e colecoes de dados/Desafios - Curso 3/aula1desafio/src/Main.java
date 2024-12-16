import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //2 - No metodo main da classe Principal, crie um ArrayList de Pessoa chamado listaDePessoas.
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        //3 - Adicione pelo menos três pessoas à lista utilizando o metodo add.
        var pessoa1 = new Pessoa();
        pessoa1.setNome("Angelina");
        pessoa1.setIdade(18);

        var pessoa2 = new Pessoa();
        pessoa2.setNome("Pedro");
        pessoa2.setIdade(18);

        var pessoa3 = new Pessoa();
        pessoa3.setNome("Mafe");
        pessoa3.setIdade(19);

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        //4 - Imprima o tamanho da lista utilizando o metodo size.
        System.out.println("Tamanho da lista: " + listaDePessoas.size());

        //5 - Imprima a primeira pessoa da lista utilizando o metodo get.
        System.out.println("Pessoa 1: " + listaDePessoas.get(0).getNome());

        //6 - Imprima a lista completa.
        System.out.println(listaDePessoas);
    }
}