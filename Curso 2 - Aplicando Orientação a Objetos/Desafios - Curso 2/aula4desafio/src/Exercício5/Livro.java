package Exercício5;

public class Livro implements Calculavel{

    @Override
    public double calcularPrecoFinal(double precoOriginal) {
        double imposto = (15*50)/100;
        return precoOriginal + imposto;
    }

}
