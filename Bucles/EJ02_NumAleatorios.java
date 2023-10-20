package Bucles.Ejercicios.DeClase;

import java.util.Random;

/**
 * Ejercicios de clase - Bucles: Números aleatorios y mostrarlos hasta que salga un multiplo de 9.
 *
 * @author DreddSoft
 * @version 1.0
 * @since 2023-10-20
 */

/*
 * Ejercicio 2:
 * Genera números aleatorios y muéstralos hasta que salga uno que sea múltiplo de 9.
 * */
public class EJ02_NumAleatorios {

    public static void main(String[] args) {
        /* ---- VARIABLES ---- */
        //número
        int numRandom;

        //Random
        Random r = new Random();

        /*
        * ¿Qué tenemos que hacer?
        * 1. Iniciar programa.
        * 2. Generar un número random (vamos a acotarlo entre 1 y 1000).
        * 3. Mostrar el número por consola.
        * 4. Evaluar si es múltiplo de 9.
        * 4.1 Si es múltiplo de 9, finalizar programa.
        * 4.2 Si NO es múltiplo de 9, continuar programa.
        * 5. Finalizar programa.
        * */

        /* ---- MAIN PROGRAM ---- */

        //1. Iniciar programa.
        System.out.println("INICIO DEL PROGRAMA." +
                "\nBienvenidos al programa de generar números aleatorios." +
                " Este programa finalizará cuando aparezca un múltiplo de 9.");

        do {
            //2. Generar un número random (vamos a acotarlo entre 1 y 1000).
            numRandom = r.nextInt(1, 1000);

            //3. Mostrar el número por consola.
            System.out.println("El número es: " + numRandom + ".");


            //4. Evaluar si es múltiplo de 9
            //4.1 Si es múltiplo de 9, finalizar programa.
        } while ((numRandom % 9 != 0)); //Mientras que... la división de numRandom entre 9 sea diferente a 0

        System.out.println("Finaliza el programa porque el número " + numRandom + " es multiplo de 9.");

        //5. Finalizar programa.
        System.out.println("FIN DE PROGRAMA.");


    }

}
