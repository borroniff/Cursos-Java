package Exercício3;

//3 - No Exercício 2, crie alguns objetos da classe Titulo e adicione-os a uma lista. Utilize o
//    metodo Collections.sort para ordenar a lista e, em seguida, imprima os títulos ordenados.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Titulo objeto1 = new Titulo();
        objeto1.setNome("Shrek 3");
        Titulo objeto2 = new Titulo();
        objeto2.setNome("Shrek 2");
        Titulo objeto3 = new Titulo();
        objeto3.setNome("Shrek 1");

        List<String> lista = new ArrayList<>();
        lista.add(objeto1.getNome());
        lista.add(objeto2.getNome());
        lista.add(objeto3.getNome());

        Collections.sort(lista);

        System.out.println(lista);
    }
}
