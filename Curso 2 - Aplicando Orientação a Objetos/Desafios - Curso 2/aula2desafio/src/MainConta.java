public class MainConta {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.setNumeroConta(123456);
        conta1.setSaldo(2500.00);
        conta1.titular = "Angelina";

        System.out.println("Número da conta: " + conta1.getNumeroConta());
        System.out.println("Titular: " + conta1.titular);
        System.out.println("Saldo: " + conta1.getSaldo());
    }
}