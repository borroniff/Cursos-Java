public class Compra implements Comparable<Compra>{

    private String item;
    private double valor;

    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Item: " + getItem() + " - " + "Valor: " + getValor();
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.compare(this.getValor(), outraCompra.getValor());
    }
}
