package Bucles.Ejercicios.DeClase;

/**
 * Ejercicios de clase - Bucles: Números aleatorios y mostrarlos hasta que salga un multiplo de 9.
 *
 * @author DreddSoft
 * @version 2.0
 * @since 2023-10-20
 */

/*
 * Ejercicio 2:
 * Genera números aleatorios y muéstralos hasta que salga uno que sea múltiplo de 9.
 * */
public class EJ02_NumAleatorios_v2 {    //Hacemos con While y Math.Random

    public static void main(String[] args) {

        /* ---- VARIABLES ---- */
        //número
        int numAleatorio;

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
        System.out.println("INICIO DE PROGRAMA." +
                "\nBienvenidos al programa de número aleatorios hasta que salga un número multiplo de 9.");

        //2. Generar un número random (vamos a acotarlo entre 1 y 1000).
        numAleatorio = (int) (Math.random() * 1000) + 1;

        //4. Evaluar si es múltiplo de 9.
        while (numAleatorio % 9 != 0) {
            numAleatorio = (int) (Math.random() * 1000) + 1;
            System.out.println("El número es " + numAleatorio + ".");
        }

        //Mostrar el resultado.
        System.out.println("Finaliza el programa porque el número " + numAleatorio + " es multiplo de 9.");

        //5. Finalizar programa.
        System.out.println("FIN DE PROGRAMA.");


    }

}
