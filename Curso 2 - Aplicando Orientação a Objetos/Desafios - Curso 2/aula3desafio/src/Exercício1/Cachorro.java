package Exercício1;

import java.sql.SQLOutput;

public class Cachorro extends Animal{

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.print(" AuAu!!");
    }

    public void abanarRabo(){
        System.out.print(" está abanando o rabo");
    }
}
