package com.pim.jrgs2526.pf03;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @ParameterizedTest
    @ValueSource(ints =  {5, 6, 7, 8, 9, 10})
    public void testCalcularAprobado(int nota) {
        App main = new App();
        int resultado = main.calcularNota(nota);
        Assertions.assertEquals(App.NOTA_APROBADA, resultado);
    }

    @ParameterizedTest
    @ValueSource(ints =  {0, 1, 2,3,4})
    public void testCalcularSuspenso(int nota) {
        App main = new App();
        int resultado = main.calcularNota(nota);
        Assertions.assertEquals(App.NOTA_SUSPENSA, resultado);
    }

    @Test
    public void testCalcularError() {
        App main = new App();
        try {
            int resultado = main.calcularNota(63);
        }
        catch (IllegalArgumentException e) {
            Assertions.assertEquals(App.ERROR_AL_CALCULAR_LA_NOTA, e.getMessage());
            return;
        }
        Assertions.fail();
    }
}