public class Musica {
    //*3 - Crie uma classe Musica com atributos titulo, artista, anoLancamento,
    // avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar
    // a música e calcular a média de avaliações.

    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int numAvaliacoes;
    int somaDeAvaliacoes;

    void exibeFicha(){
        System.out.println(titulo);
        System.out.println(artista);
        System.out.println(anoDeLancamento);
        System.out.println(mediaDeAvaliacoes());
    }

    void avaliaMusica(double nota){
        somaDeAvaliacoes += nota;
        numAvaliacoes++;
    }

    double mediaDeAvaliacoes(){
        return somaDeAvaliacoes / numAvaliacoes;
    }
}
