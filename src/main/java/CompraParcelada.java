import static java.lang.Math.pow;

public class CompraParcelada extends Compra {

    private int parcelas;
    private double juros;

    public CompraParcelada(int valorCompra, int parcelas, double juros) {
        super(valorCompra);
        this.parcelas = parcelas;
        this.juros = juros;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    @Override
    public double valorTotal() {
        double total = 0;
        if (getValorCompra() > 0 && getParcelas() == 1){
            return getValorCompra();
        } else if (getValorCompra() > 0 && getParcelas() > 1) {
            double jurosConvertido = getJuros() / 100;
            total = getValorCompra() * pow((1 + jurosConvertido), getParcelas());
        }
        return (double) Math.round(total * 100) / 100;
    }
}
