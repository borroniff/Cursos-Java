public class MainIdade {
    public static void main(String[] args) {
        IdadePessoa pessoa1 = new IdadePessoa();
        pessoa1.setNome("Angelina");
        pessoa1.setIdade(18);

        System.out.print(pessoa1.getNome() + " ");
        pessoa1.verificarIdade();
    }
}
