public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: Top Gun");
        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double nota = 8.1; /*O mesmo que o float só que mais usado*/
        /* And=&& - Or=|| - Not=! */
        /* int x = 5;
           int y = x++; - Primeiro, y recebe o valor 5, depois x é incrementado para 6.*/
        /* int x = 5;
           int y = ++x; - Primeiro, x é incrementado para 6, depois y recebe o valor 6.*/
        double media = ( 9.8 + 6.3 + nota) /3;
        System.out.println(media);
        String sinopse = "File de aventura com galã dos anos 80.";
        System.out.println(sinopse);

        int classificacao = (int) (media /2);
        System.out.println(classificacao);
    }
}