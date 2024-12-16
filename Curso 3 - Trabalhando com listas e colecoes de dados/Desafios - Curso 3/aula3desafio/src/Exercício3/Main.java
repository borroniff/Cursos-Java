package Exercício3;

public class Main {
    public static void main(String[] args) {

        //3 - Modifique o Exercício 2 para incluir uma verificação usando instanceof para garantir
        //que o objeto seja do tipo correto antes de fazer o casting.

        Animal animal = new Cachorro("Dumbo", 1, "SRD");
        if(animal instanceof Cachorro){
            System.out.println(animal.getNome());
            System.out.println(((Cachorro) animal).getRaca());
        } else {
            System.out.println("Não é um Cachorro");
        }
    }
}
