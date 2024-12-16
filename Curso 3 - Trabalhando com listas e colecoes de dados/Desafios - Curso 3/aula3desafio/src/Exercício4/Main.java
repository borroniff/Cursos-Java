package Exercício4;

import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Produto prod1 = new Produto("Camiseta", 25.99);
        var prod2 = new Produto("Casaco", 105.49);
        var prod3 = new Produto("Calça", 89.90);

        var lista = new ArrayList<>();
        lista.add(prod1);
        lista.add(prod2);
        lista.add(prod3);

        double precoTotal = 0;
        for(Object item : lista) {
            precoTotal += ((Produto) item).getPreco();
        }
        precoTotal = precoTotal/lista.size();
        System.out.println(precoTotal);
    }
}
