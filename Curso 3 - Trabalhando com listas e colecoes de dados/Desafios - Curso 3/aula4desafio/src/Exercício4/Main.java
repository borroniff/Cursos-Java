package Exercício4;

//4 - Crie uma lista utilizando a interface List e instancie-a tanto como ArrayList quanto
//    como LinkedList. Adicione elementos e imprima a lista, mostrando que é possível trocar
//    facilmente a implementação.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lista1 = new ArrayList<>();
        lista1.add("Carlos");
        lista1.add("Maria");
        lista1.add("José");
        System.out.println(lista1);

        List<String> lista2 = new LinkedList<>();
        lista2.add("Carlos");
        lista2.add("Maria");
        lista2.add("José");
        System.out.println(lista2);
    }
}
