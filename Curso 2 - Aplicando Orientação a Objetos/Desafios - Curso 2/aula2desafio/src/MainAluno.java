public class MainAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Angelina");
        aluno1.setNota1(8.0);
        aluno1.setNota2(9.0);
        aluno1.setNota3(10.0);

        System.out.print("A média do(a) aluno(a) " + aluno1.getNome() + " é ");
        aluno1.calcularMedia();
    }
}
