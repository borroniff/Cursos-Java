package Exercício2;

public class Main {
    public static void main(String[] args) {

        CalculadoraSalaRetangular calcula = new CalculadoraSalaRetangular();

        System.out.println("O perímetro é: " + calcula.calcularPerimetro(1.5, 5.6));
        System.out.println("A área é: " + calcula.calcularArea(1.5, 5.6));
    }
}
