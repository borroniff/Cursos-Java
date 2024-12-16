package Exercício1;

public class ConversorMoeda implements ConversaoFinanceira{

    //1 - Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira
    // com o metodo converterDolarParaReal() para converter um valor em dólar para reais. A
    // classe deve receber o valor em dólar como parâmetro.

    @Override
    public double converterDolarParaReal(double dolares) {
        return dolares * 4.00;
    }
}

