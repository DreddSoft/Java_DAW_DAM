package Bucles.Ejercicios.DeClase;

import java.util.Scanner;

/**
 * Ejercicios de clase - Bucles: Notas de clase.
 *
 * @author DreddSoft
 * @version 2.0
 * @since 2023-10-23
 */
/*
 * Ejercicio 7:
 * Realiza un programa que calcule la suma de los pares e impares comprendidos entre dos valores
 * enteros n1 y n2:
 * - se introducen por teclado.
 * - que cumplan que n1 < n2.
 */
public class EJ07_SumaParesImpares_v2 {

    public static void main(String[] args) {
        /* ---- VARIABLES  ---- */
        //Números a introducir.
        int n1, n2;

        //Sumatorios
        int sumaPar = 0;
        int sumaImpar = 0;

        //Scanner
        Scanner key = new Scanner(System.in);

        /*
         * ¿Qué tenemos que hacer?
         * 1.
         *
         * */


        /* ---- MAIN PROGRAM ---- */
        // 1. Iniciar programa.
        System.out.println("INICIO DE PROGRAMA." +
                "\nBienvenidos al programa de suma de pares e impares comprendidos entre dos números.");

        // 2. Controlar que el valor de n1 sea mayor que 1
        do {
            //Haz...
            //3. Pide n1:
            System.out.print("Introduce el valor de n1: ");
            n1 = key.nextInt();

            //Manda mensaje si menor que 1 - lo hacemos con el operador ternario
            String error = (n1 < 1) ? "Valor de n1 es menor que 1." : "Valor de n1 es válido.";
            System.out.println(error);

        } while (n1 < 1);   //Mientras que...n1 sea menor que 1.

        // 4. Controlar que el valor de n2 sea mayor que n1, y por ende mayor que 1.
        do {
            //Haz...
            // 5. Pedir n2.
            System.out.println("Introduce el valor de n2: ");
            n2 = key.nextInt();

            //Mandar un mensaje si n2 es menor que n1, lo hacemos con operador ternario.
            String error = (n2 < n1) ? "Valor de n2 es menor que n1." : "Valor de n2 es correcto.";
            System.out.println(error);

        } while (n2 < n1);

        // 6. Recorrer todos los valores entre n1 y n2, para ello hacemos un bucle for e incrementamos en 1
        for (int i = n1; i <= n2; i++) {
            // 7. Comprobar si el numero entre n1 y n2 es par
            if (i % 2 == 0) { //Si... la division del numero i entre 2, da resto final (modulo) 0, es par
                // 8. Sumatorio de pares.
                sumaPar += i;
            } else {    //Cualquier otra cosa es un numero impar
                // 9. Comprobar si el numero entre n1 y n2 es impar.
                // 10. Sumatorio de impares.
                sumaImpar += i;
            }

        }

        // 11. mostrar resultados.
        System.out.println("Del conjunto de numeros comprendidos entre " + n1 + " y " + n2 + "." +
                "\nEl sumatorio de los numeros pares es: " + sumaPar +
                "\nEl sumatorio de los numeros impares es: " + sumaImpar);

        // 12. Finalizar programa
        key.close();
        System.out.println("FIN DE PROGRAMA.");


    }
}
