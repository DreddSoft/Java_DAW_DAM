package Bucles.Ejercicios.DeClase;

import java.util.Scanner;

/**
 * Ejercicios de clase - Bucles: Notas de clase.
 *
 * @author DreddSoft
 * @version 1.0
 * @since 2023-10-23
 */
/*
 * Ejercicio 7:
 * Realiza un programa que calcule la suma de los pares e impares comprendidos entre dos valores
 * enteros n1 y n2:
 * - se introducen por teclado.
 * - que cumplan que n1 < n2.
 */

public class EJ07_SumaParesImpares {

    public static void main(String[] args) {
        /* ---- VARIABLES ----*/

        //Números
        int n1, n2;

        //Sumatorios
        int sumaPares = 0;
        int sumaImpares = 0;

        //Scanner
        Scanner key = new Scanner(System.in);

        /*
         * ¿Qué tenemos que hacer? -- LO HACEMOS CON WHILE
         * 1. Iniciar programa.
         * 2. Pedir n1:
         * 3. Comprobamos que n1 sea positivo.
         * 4. Pedir n2:
         * 5. Controlar que n2 sea mayor que n1 (y por ende positivo).
         * 6. Recorrer los valores entre n1 y n2 con un for
         * 7. Guardar los valores sumatorios en sumaPar.
         * 8. Guardar los valores sumatorios en sumaImpar.
         * 9. Mostrar resultado:
         * 10. Cerrar Scanner
         * 11. Finalizar programa.
         * */
        /* ---- MAIN PROGRAM ---- */
        // 1. Iniciar programa.
        System.out.println("INICIO DE PROGRAMA." +
                "\nBienvenidos al programa de suma de pares e impares comprendidos entre dos números.");

        // 2. Pedir n1:
        System.out.print("Por favor, introduce el primer número n1: ");
        n1 = key.nextInt();

        // 3. Comprobamos que n1 sea positivo.
        while (n1 < 0) {    //Mientras que... n1 sea menor que 0, osea negativo.
            //Haz...
            System.out.print("Has introducido un número negativo: ");
            n1 = key.nextInt();
        }

        // 4. Pedir n2:
        System.out.println("Introduce el valor de n2, recuerda que debe ser mayor que n1: ");
        n2 = key.nextInt();

        // 5. Controlar que n2 sea mayor que n1 (y por ende positivo).
        while (n2 < n1) {   //Mientras que... n2 sea menor que n1
            //Haz...
            System.out.println("Has introducido un valor menor que n1 para n2, recuerda debe ser mayor que " + n1 + ".");
            System.out.print("Introduce de nuevo n2: ");
            n2 = key.nextInt();

        }

        // 6. Recorrer los valores entre n1 y n2 con un for
        for (int i = n1; i <= n2; i++) {
            // 7. Guardar los valores sumatorios en sumaPar.
            if (n1 % 2 == 0) {  //Si la división de n1 entre 2, da como resto final 0 es PAR.
                sumaPares += i;    //sumaPares = sumaPares(valor anterior) + n1;
            } else {    //Cualquier otra cosa es impar
                // 8. Guardar los valores sumatorios en sumaImpar.
                sumaImpares += i;
            }
        }

        // 9. Mostrar resultado:
        System.out.println("El sumatorio de números pares e impares comprendidos entre " + n1 + " y " + n2 + " es :" +
                "\nSumatorio de pares: " + sumaPares + "." +
                "\nSumatorio de impares: " + sumaImpares + ".");

        // 10. Cerrar Scanner
        key.close();

        // 11. Finalizar programa.
        System.out.println("FIN PROGRAMA.");

        //formateo


    }


}
