package Exercício5;

//5 - Crie uma interface Forma com um metodo calcularArea(). Implemente a interface em duas classes,
//por exemplo, Circulo e Quadrado. Em seguida, crie uma lista de formas (objetos da interface Forma) e
//utilize um loop para calcular e imprimir a área de cada forma.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Forma forma1 = new Quadrado(5);
        Forma forma2 = new Circulo(3);
        Forma forma3 = new Quadrado(6);

        var lista = new ArrayList<>();
        lista.add(forma1);
        lista.add(forma2);
        lista.add(forma3);

        for(Object item : lista){
            if(item instanceof Quadrado){
                System.out.println(((Quadrado) item).calcularArea());
            } else if (item instanceof Circulo) {
                System.out.println(((Circulo) item).calcularArea());
            }
        }

    }
}
