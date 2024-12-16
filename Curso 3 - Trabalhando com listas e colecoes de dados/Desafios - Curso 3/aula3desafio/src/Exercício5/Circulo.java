package Exercício5;

public class Circulo implements Forma{

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double calcularArea() {
        return (raio*raio)*3.14;
    }
}
