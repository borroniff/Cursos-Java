package Exercício1;

public class Animal {
    //1 - Crie uma classe Animal com um metodo emitirSom(). Em seguida, crie duas
    // subclasses: Cachorro e Gato, que herdam da classe Animal. Adicione o metodo
    // emitirSom() nas subclasses, utilizando a anotação @Override para indicar que
    // estão sobrescrevendo o metodo. Além disso, adicione métodos específicos para
    // cada subclasse, como abanarRabo() para o Cachorro e arranharMoveis() para o Gato.

    protected String nome;

    public void emitirSom(){
        System.out.print("está fazendo barulho:");
    }
}
