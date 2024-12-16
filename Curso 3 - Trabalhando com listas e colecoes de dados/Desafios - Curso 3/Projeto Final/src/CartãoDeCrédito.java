import java.util.ArrayList;
import java.util.List;

public class CartãoDeCrédito {

    private double limite = 500;
    private List<Compra> compras = new ArrayList<>();

    public double getLimite() {
        return limite;
    }
    public List<Compra> getCompras() {
        return compras;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
