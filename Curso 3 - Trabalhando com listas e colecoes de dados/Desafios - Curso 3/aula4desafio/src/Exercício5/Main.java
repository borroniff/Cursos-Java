package Exercício5;

//5 - Modifique o Exercício 4 para declarar a variável de lista como a interface List,
//    demonstrando o uso de polimorfismo.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lista;

        lista = new ArrayList<>();
        lista.add("Carlos");
        lista.add("Maria");
        lista.add("José");
        System.out.println(lista);

        lista = new LinkedList<>();
        lista.add("Carlos");
        lista.add("Maria");
        lista.add("José");
        System.out.println(lista);
    }
}