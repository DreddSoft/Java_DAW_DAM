package Bucles.Ejercicios.DeClase;

import java.util.Scanner;

/**
 * Ejercicios de clase - Bucles: Producto con sumas de dos números enteros.
 *
 * @author DreddSoft
 * @version 1.0
 * @since 2023-10-20
 */

/*
 * Ejercicio 3:
 * Dados dos números enteros positivos, calcula su producto utilizando solo sumas.
 * */
public class EJ03_ProductoConSumas {

    public static void main(String[] args) {

        /* ---- VARIABLES ---- */
        //2 Números enteros
        int base;
        int multiplicador;
        int resultado = 0;

        //Scanner.
        Scanner key = new Scanner(System.in);

        /*
         * ¿Qué hay que hacer?
         * 1. Iniciar programa.
         * 2. Introducir por teclado un número base (ojo: positivo).
         * 3. Introducir por teclado un número multiplicador (ojo: positivo).
         * 4. Usar un bucle for para realizar la suma.
         * 5. Mostrar resultado.
         * 6. Finalizar el programa.
         * */

        /* ---- MAIN PROGRAM ---- */

        //1. Iniciar programa.
        System.out.println("INICIO PROGRAMA." +
                "\nBienvenidos al programa de multiplicaciones en sumas.");

        //2. Introducir por teclado un número base (ojo: positivo).
        do {    //Haz...
            //2. Introducir por teclado un número base (ojo: positivo).
            System.out.print("Introduce un número base: ");
            base = key.nextInt();

            //3. Introducir por teclado un número multiplicador (ojo: positivo).
            System.out.print("Introduce un multiplicador: ");
            multiplicador = key.nextInt();

        } while (base < 0 || multiplicador < 0); //Mientras que...el número base o multiplicador sean menor que 0 (osea negativos).

        //4. Usar un bucle for para realizar la suma.
        for (int i = 0; i < multiplicador; i++) {
            resultado += base;

        }

        //5. Mostrar resultado.
        System.out.println("El resultado de multiplicar (sumando) " + base + " por " + multiplicador + " es: " + resultado + ".");
        //Comprobación
        int comprobacion = base * multiplicador;
        System.out.println("Comprobación: " + comprobacion + ".");

        //6. Finalizar el programa.
        System.out.println("FIN DE PROGRAMA.");

    }


}
