package Exercício1;

public class Main {
    public static void main(String[] args) {

        ConversorMoeda conversor = new ConversorMoeda();

        double dolares = 100.0;
        double reais = conversor.converterDolarParaReal(dolares);

        System.out.println("Valor em dólares: " + dolares);
        System.out.println("Valor convertido para reais: " + reais);
    }
}