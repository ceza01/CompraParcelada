public class Principal {
    public static void main(String[] args) {

        CompraParcelada compra = new CompraParcelada(5000, 5, 5);

        System.out.println(compra.valorTotal());
    }
}
