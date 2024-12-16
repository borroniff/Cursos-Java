package Exercício2;

public class CalculadoraSalaRetangular implements CalculoGeometrico{

    // 2 - Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico
    // com os métodos calcularArea() e calcularPerimetro() para calcular a área e o perímetro de
    // uma sala retangular. A classe deve receber altura e largura como parâmetros.


    @Override
    public double calcularArea(double ladoMenor, double ladoMaior) {
        return ladoMenor * ladoMaior;
    }

    @Override
    public double calcularPerimetro(double ladoMenor, double ladoMaior) {
        return (2*ladoMaior) + (2*ladoMenor);
    }
}
