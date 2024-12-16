package Exercício5;

public class ProdutoFisico implements Calculavel{

    @Override
    public double calcularPrecoFinal(double precoOriginal) {
        double custoDeImpressao = 15;
        return precoOriginal + custoDeImpressao;
    }
}
