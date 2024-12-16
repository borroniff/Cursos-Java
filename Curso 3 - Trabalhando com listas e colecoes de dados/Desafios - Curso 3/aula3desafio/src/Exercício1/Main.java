package Exercício1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //1 - Crie um ArrayList de strings e utilize um loop foreach para percorrer e imprimir cada elemento da lista.
        ArrayList<String> palavras = new ArrayList<>();
        palavras.add("uau");
        palavras.add("hahaha");
        palavras.add("iupi");
        for (String palavra : palavras) {
            System.out.println(palavra);
        }
    }
}