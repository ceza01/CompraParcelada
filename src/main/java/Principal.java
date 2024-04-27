public class Principal {
    public static void main(String[] args) {

        CompraParcelada compra = new CompraParcelada(2000, 5, 5.00);

        System.out.println(compra.valorTotal());
    }
}
