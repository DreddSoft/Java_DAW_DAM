package Bucles.Ejercicios.DeClase;

import java.util.Scanner;

/**
 * Ejercicios de clase - Bucles: Pide números hasta que introduzcas un negativo.
 *
 * @version 1.0
 * @since 2023-10-18
 * @author DreddSoft
 * */

/*
* Realiza un programa que vaya pidiendo números hasta que se inrtoduzca un número negativo.
* 1. Nos tiene que decir cuantos números se han introducido (contador).
* 2. La media de los números impares.
* 3. La media de los números pares.
* 4. El número negativo solo se utiliza para salir, pero no cuenta en el cómputo.
* */

public class PideNumeroHastaNegativo {

    public static void main(String[] args) {
        /* ---- VARIABLES ---- */
        int numIntro;   //número a introducir
        int contTotal = 0;  //contador total.
        int contPares = 0;  //contador pares.
        int contImpa = 0;   //contador impares.

        int sumaTotal = 0;  //sumatorio del total
        int sumaPares = 0;  //sumatorio de los pares.
        int sumaImpa = 0;   //sumatorio de los impares.


        //Scanner
        Scanner key = new Scanner(System.in);

        /* ¿Qué hacemos?
        * 1. Pedir un número por teclado.
        * 2. Evaluar si es negativo o positivo.
        * 3. Si es positivo, sumar el número a un sumatorio y aumentar el contador.
        * 4. Si es par, sumar el número al sumatorio par y aumentar el contador par.
        * 5. Si es impar, sumar el número al sumatorio impar y aumentar el contador impar.
        * 6. Mostrar el sumatorio total, el total de números introducidos y la media.
        * 7. Mostrar el sumatorio de pares, el total de números pares y la media.
        * 8. Mostrar el sumatorio de impares, el total de impares y la media.
        * 9. Fin de programa.
        * */
        /* ---- MAIN PROGRAM ---- */
        //Lo vamos a hacer con do-while
        System.out.println("Inicia el programa.");
        System.out.println("Introduce los números enteros positivos que quieras, en cuanto introduzcas un número negativo, se acaba el programa.");

        //2. Evaluar si es negativo o positivo.
        do {    //Haz...
            //Pedir un número por teclado.
            System.out.print("Introduce un número: ");
            numIntro = key.nextInt();
            //3. Si es positivo, sumar el número a un sumatorio y aumentar el contador.
            if (numIntro >= 0) {
                sumaTotal += numIntro;  //Esto es igual que sumaTotal = sumaTotal + numIntro.
                contTotal++;

                //4. Si es par, sumar el número al sumatorio par y aumentar el contador par.
                if (numIntro % 2 == 0) {    //Si el modulo de dividir el número entre 2 es igual 0 es un número par.
                    sumaPares += numIntro;
                    contPares++;

                } else { //Cualquier número que su modulo de dividir entre 2 sea diferente de 0 es impar
                    //5. Si es impar, sumar el número al sumatorio impar y aumentar el contador impar.
                    sumaImpa += numIntro;
                    contImpa++;

                }


            }

        } while (numIntro >= 0); //Mientras que el número que introducimos sea mayor de 0

        if (sumaTotal > 0) {    //Si la suma total es mayor que 0, significa que el usario no ha introducido un número negativo desde el principio

            //6. Mostrar el sumatorio total, el total de números introducidos y la media.
            //Media del total
            double mediaTotal = sumaTotal / contTotal;
            System.out.println("Se han introducido un total de " + contTotal + " numeros." +
                    "\nHaciendo una suma total de " + sumaTotal + "." +
                    "\ny con una media de " + mediaTotal + ".");

            //7. Mostrar el sumatorio de pares, el total de números pares y la media.
            //media de los pares.
            double mediaPares = sumaPares / contPares;
            System.out.println("Se ha introducido un total de " + contPares + " numero pares," +
                    "\n haciendo una suma total de " + sumaPares + "," +
                    "\n y con una media de " + mediaPares + ".");

            //8. Mostrar el sumatorio de impares, el total de impares y la media.
            //media de los impares.
            double mediaImpares = sumaImpa / contImpa;
            System.out.println("Se ha introducido un totla de " + contImpa + " numeros impares," +
                    "\n haciendo una suma total de " + sumaImpa + "," +
                    "\n y con una media de " + mediaImpares + ".");

        } else {
            System.out.println("Has introducido un número negativo desde el principio.");
        }



        //9. Fin de programa.
        key.close();
        System.out.println("FIN DE PROGRAMA.");

    }

}
