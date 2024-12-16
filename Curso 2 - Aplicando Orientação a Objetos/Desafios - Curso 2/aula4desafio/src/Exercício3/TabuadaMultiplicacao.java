package Exercício3;

public class TabuadaMultiplicacao implements Tabuada{

    // 3 - Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada com o metodo
    // mostrarTabuada() para exibir a tabuada de um número. A classe deve receber o número como
    // parâmetro.

    @Override
    public void mostrarTabuada(int numero) {
        for (int i = 0; i < 11; i++) {
            System.out.printf( "%d x %d = %d", numero, i, numero*i);
            System.out.println(' ');
        }
    }
}
