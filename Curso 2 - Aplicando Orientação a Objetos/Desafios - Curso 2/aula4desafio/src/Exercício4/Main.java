package Exercício4;

public class Main {
    public static void main(String[] args) {

        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();

        System.out.println(conversor.celsiusParaFahrenheit(0));

        System.out.println(conversor.fahrenheitParaCelsius(32));
    }
}
