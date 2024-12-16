package Exercício1;

public class Teste {
    public static void main(String[] args) {

        Gato gato1 = new Gato();
        gato1.nome = "Cleo";

        System.out.print(gato1.nome);
        gato1.arranharMoveis();
        System.out.print(" e ");
        gato1.emitirSom();

        Cachorro cao1 = new Cachorro();
        cao1.nome = "Boris";

        System.out.print(cao1.nome);
        cao1.abanarRabo();
        System.out.print(" e ");
        cao1.emitirSom();

    }
}
