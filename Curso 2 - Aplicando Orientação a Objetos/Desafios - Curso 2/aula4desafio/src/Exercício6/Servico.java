package Exercício6;

public class Servico implements Vendavel {

    @Override
    public double precoTotal(double horasPorDia, int dias) {
        return horasPorDia * dias * 15;
    }
}
