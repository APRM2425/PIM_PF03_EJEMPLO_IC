package com.pim.jrgs2526.pf03;

/**
 * Hello world!
 *
 */
public class App 
{

    public static final String ERROR_AL_CALCULAR_LA_NOTA = "Error al calcular la nota";
    public static final int NOTA_APROBADA = 1;
    public static final int NOTA_SUSPENSA = -1;

    public static void main(String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public int calcularNota(int nota) {
        if (nota >= 0 && nota <= 4)
            return NOTA_SUSPENSA;
        if (nota >= 5 && nota <= 10)
            return NOTA_APROBADA;
        throw new IllegalArgumentException(ERROR_AL_CALCULAR_LA_NOTA);
    }
}