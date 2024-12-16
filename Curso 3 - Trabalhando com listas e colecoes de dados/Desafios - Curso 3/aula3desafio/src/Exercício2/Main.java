package Exercício2;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Dumbo", 1, "SRD");
        Animal animal = (Animal) cachorro;
        System.out.println(cachorro.getNome());
        System.out.println(cachorro.getIdade());
        System.out.println(cachorro.getRaca());
    }
}
