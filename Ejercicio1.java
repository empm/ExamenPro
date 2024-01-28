package ExamenB;

import java.util.Random;

public class Ejercicio1 {
    /* ------ Ej. 3 ------ */
    /**
     * Un mètode estàtic que reba com a paràmetres
     * un array de reals i un valor sencer
     * i retorne quants números hi ha a l’array majors que aquest valor
     * 
     * public static int vegadesValor (double [ ] dades, int valor)
     */

    public static int vegadesValor(double[] dades, int valor) {
        int count = 0;

        for (int i = 0; i < dades.length; i++) {
            if (dades[i] > valor)
                count++;
        }
        /* ------ Ej.4.2 ------ */
        System.out.println("Hay " + count + " números mayores que " + valor);
        /* ------ Ej.4.2 ------ */
        
        return count;
    }
    /* ------ Ej. 3 ------ */

    /* ------ Ej.4.1 ------ */
    /**
     * Definisca un array de 100 elements reals
     * i ho emplene amb números
     * reals aleatoris entre l’ 1 i el 20
     */
    public static void main(String[] args) {
        double[] reals = new double[100]; // Definir real de 100 n
        Random nRandom = new Random();

        for (int i = 0; i < reals.length; i++) {

            // random empieza en 0, sumamos 1
            reals[i] = nRandom.nextDouble(19) + 1;

            /* ------ TEST ------ 
            System.out.println(i + ". " + reals[i]);
            /* ------ TEST ------ */
        }
        /* ------ Ej.4.1 ------ */

        /* ------ Ej.4.2 ------ */
        int valor = 10;
        vegadesValor(reals, valor);
        /* ------ Ej.4.2 ------ */
    }

}
