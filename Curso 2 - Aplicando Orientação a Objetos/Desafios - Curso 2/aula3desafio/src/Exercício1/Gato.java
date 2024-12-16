package Exercício1;

public class Gato extends Animal{

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println(" MiauMiau!!");
    }

    public void arranharMoveis(){
        System.out.print(" está arranhando móveis");
    }
}
