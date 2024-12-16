package Exercício1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//1 - Crie uma lista de números inteiros e utilize o metodo Collections.sort para ordená-la em
//    ordem crescente. Em seguida, imprima a lista ordenada.

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(8);
        lista.add(2);
        lista.add(7);
        Collections.sort(lista);
        System.out.println(lista);
    }
}
