package Bucles.Ejercicios.DeClase;

/**
 * Ejercicios de clase - Bucles: Muestra los multiplos de 5 hasta 100.
 *
 * @version 1.0
 * @since 2023-10-18
 * @author DreddSoft
 * */

/*
 * Ejercicio 2: Muestra los números múltiplos de 5, desde 0 hasta 100 - USANDO DO-WHILE
 * */
public class NumMultiplos5 {
    public static void main(String[] args) {
        /* ---- VARIABLES ---- */

        int indice = 1;     //Indice para saber que múltiplo es.
        int multiplo = 0;       //Donde vamos a guardar el multiplo.
        int base = 5;       //5 es nuestra base

        /*
        * ¿Qué hacemos?
        * 1. Iniciar el programa e informar al usuaro.
        * 2. Evaluar con el bucle que el multiplo no pase de 100
        * 3. Recorrer con for y mostrar cada múltiplo.
        * 4. Finalizar el programa.
        * */

        /* ---- MAIN PROGRAM ---- */
        //1. Iniciar el programa e informar al usuaro.
        System.out.println("Bienvenido al programa de múltiplos de 5.");
        System.out.println("Ahora te vamos a mostrar todos los números: ");

        //2. Evaluar con el bucle que el multiplo no pase de 100
        do {    //Haz...

            //3. Recorrer con for y mostrar cada múltiplo.
            multiplo = base * indice;
            System.out.println("Multiplo de 5 en base " + indice + " es: " + multiplo);
            indice++;

        } while (multiplo < 100); //Mientras...que muliplo sea menor que 100
        //En cuanto sea mayor que 100, se sale del bucle

        //4. Finalizar el programa.
        System.out.println("Listo, FIN DEL PROGRAMA.");

    }

}
