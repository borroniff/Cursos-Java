public class Carro {
    // 4 - Crie uma classe Carro com atributos modelo, ano, cor e métodos
    // para exibir a ficha técnica e calcular a idade do carro.

    String modelo;
    int ano;
    String cor;

    void exibirFicha(){
        System.out.println(modelo);
        System.out.println(ano);
        System.out.println(cor);
        System.out.println(idade());
    }

    int idade(){
        return 2024 - ano;
    }
}

