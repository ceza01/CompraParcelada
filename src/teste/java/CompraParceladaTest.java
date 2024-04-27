import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CompraParceladaTest {
    private static CompraParcelada compraUma;
    private static CompraParcelada compraDuas;
    private static CompraParcelada compraCinco;
    private static CompraParcelada compraDez;

    @BeforeAll
    public static void setUp(){
        compraUma = new CompraParcelada(5000, 1, 5);
        compraDuas = new CompraParcelada(5000, 2, 5);
        compraCinco = new CompraParcelada(5000, 5, 5);
        compraDez = new CompraParcelada(5000, 10, 5);
    }

    @Test
    void valorTotalUmaParcela() {
        Assertions.assertEquals(5000, compraUma.valorTotal());
    }

    @Test
    void valorTotalDuasParcelas() {
        Assertions.assertEquals(5512.50, compraDuas.valorTotal(), 0.01);
    }

    @Test
    void valorTotalCincoParcelas() {
        Assertions.assertEquals(6381.41, compraCinco.valorTotal(), 0.01);
    }

    @Test
    void valorTotalDezParcelas() {
        Assertions.assertEquals(8144.47, compraDez.valorTotal(), 0.01);
    }
}