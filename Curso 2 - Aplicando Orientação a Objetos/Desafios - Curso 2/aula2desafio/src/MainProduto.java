public class MainProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.setNome("Computador");
        produto1.setPreco(5000.00);

        System.out.println("Produto: " + produto1.getNome());
        System.out.println("Valor original: " + produto1.getPreco());
        produto1.aplicarDesconto(50);
    }
}
