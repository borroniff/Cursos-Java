public class Livro {
    //5 - Desenvolva uma classe Livro com os atributos privados titulo e autor. Utilize
    // métodos getters e setters para acessar e modificar esses atributos. Adicione um
    // metodo exibirDetalhes que imprime o título e o autor do livro.

    private String titulo;
    private String autor;

    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirDetalhes(){
        System.out.println("O título é " + titulo + " e o autor é " + autor);
    }
}
