package Exercício6;

public class Produto implements Vendavel{

    @Override
    public double precoTotal(double precoUnidade, int quantidade) {
        return precoUnidade * quantidade;
    }

}
