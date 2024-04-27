public class Compra {

    private double valorCompra;

    public Compra(int valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(int valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double valorTotal(){
        return valorCompra;
    }
}
