public class Aluno {
    //4 - Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize
    // métodos getters e setters para acessar e modificar esses atributos. Adicione um
    // metodo calcularMedia que retorna a média das notas do aluno.

    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    public String getNome() {
        return nome;
    }
    public double getNota1() {
        return nota1;
    }
    public double getNota2() {
        return nota2;
    }
    public double getNota3() {
        return nota3;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public void calcularMedia(){
        System.out.println((nota1 + nota2 + nota3) / 3);
    }
}
