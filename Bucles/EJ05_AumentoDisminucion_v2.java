package Bucles.Ejercicios.DeClase;

import java.util.Scanner;

/**
 * Ejercicios de clase - Bucles: Dado n1 < n2; doblar el valor de n1 y reducir a la mitad el de n2, hasta que n2>n1
 *
 * @author DreddSoft
 * @version 2.0
 * @since 2023-10-21
 */
/*
 * Ejercicio 5:
 * Utilizando un bucle for con dos contadores, realiza un programa que dados dos números enteros n1 y n2.
 * - Se introducen por teclado.
 * - n2 > n1, si no es así que lo repetan hasta que se cumpla.
 * - aumenta el valor de n1 al doble.
 * - disminuye el valor de n2 a la mitad.
 */
public class EJ05_AumentoDisminucion_v2 {

    public static void main(String[] args) {

        /* ---- VARIABLES ---- */
        //Números
        int n1;
        int n2;

        //Contador
        int contador = 0;

        //Scanner
        Scanner key = new Scanner(System.in);

        /*
         * ¿Qué hacemos?
         * 1. Iniciar el programa.
         * 2. Solicitar el valor de n1 y n2.
         * 3. Vamos a usar un do-while, comprobar que n2 > n1. Si no, pedir de nuevo los números.
         * 4. Usar un bucle para duplicar el valor de n1 y dividir a la mitad el de n2, hasta que se cumpla que n1 > n2.
         * 5. Mostrar incrementos.
         * 6. Mostrar números finales.
         * 7. Finalizar programa.
         * */

        /* ---- MAIN PROGRAM ---- */
        //1. Iniciar el programa.
        System.out.println("INICIO DE PROGRAMA." +
                "\nBienvenidos al programa de duplicar y disminuir valor." +
                "\nRecuerda, introduce un valor n1 que sea menor que el valor n2.");

        // 2. Solicitar el valor de n1 y n2.
        // 3. Vamos a usar un do-while, comprobar que n2 > n1. Si no, pedir de nuevo los números.

        do {    //Haz...
            System.out.println("Introduce el primer número: ");
            n1 = key.nextInt();

            System.out.println("Ahora, introduce el segundo número: ");
            n2 = key.nextInt();
        } while (n1 > n2); //Mientras que...n1 > n2 repite el bucle

        // 4. Usar un bucle para duplicar el valor de n1 y dividir a la mitad el de n2, hasta que se cumpla que n1 > n2.
        for (n1 = n1; n1 < n2; n1 *= 2) {
            // 5. Mostrar incrementos.
            System.out.println("Incremento de n1: " + n1);
            System.out.println("Decremento de n2: " + n2);
            //En este bucle hemos definido que n1 aumente x2 en el propio bucle.
            //Entonces, tenemos que dividir n2 a la mitad.
            n2 /= 2;

            contador++;

        }

        //6. Mostrar números finales.
        System.out.println("Valor final de n1: " + n1 +
                "\nValor final de n2: " + n2 +
                "\nEn " + contador + "intentos.");

        //7. Finalizar programa.
        System.out.println("FIN DE PROGRAMA.");

        //Cerramos Scanner
        key.close();

        //Formateo: Ctrl + Alt + L
    }

}
