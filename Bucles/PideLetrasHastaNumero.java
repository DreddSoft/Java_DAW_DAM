package Bucles.Ejercicios.DeClase;

import java.util.Scanner;

/**
 * Ejercicios de clase - Bucles: Muestra los multiplos de 5 hasta 100.
 *
 * @version 1.0
 * @since 2023-10-18
 * @author DreddSoft
 * */

/*
 * Ejercicio 4: Realiza un programa que pida letras hasta que se introduzca un número, en la salida deberá mostrar el número de letras introducidas
 * y las letras concatendas en un string, separadas por un espacio en blanco.
 * */

public class PideLetrasHastaNumero {

    public static void main(String[] args) {
        /* ---- VARIABLES ---- */
        String intro;               //String que vamos a introducir.
        String resultado = "";      //String donde vamos a mostrar todas las letras válidas.
        String validos = "abcdefghijklmnñopqrstuvwxyz";

        int cnt = 0;       //contador de palabras

        boolean contieneValidos = true;     //contieneValidos = true significa que contiene los caracteres validos, false es que no

        //Scaner
        Scanner keyboard = new Scanner(System.in);




        /* ¿Qué tenemos que hacer?
        * 1. Iniciar el programa.
        * 2. Comprobar qu se ha introducido el valor valido con un bucle
        * 3. Si la longitud del texto es mayor que 1, no es una letra
        * 4. Si la longitud del texto es 1 es una letra
        * 5. Controlar el resultado: si se ha introducido un número desde el principio mostrar un mensaje
        * 6. Controlar el resultado: mostrar las palabras concatenadas como resultado.
        * 7. Fin del programa.
        * */
        /* ---- MAIN PROGRAM ---- */

        //1. Iniciar el programa.
        System.out.println("Bienvenido al programa.");
        System.out.println("Introduce letras, en cuanto introduzcas un número se sale del programa.");

        //2. Comprobar qu se ha introducido el valor valido con un bucle
        do {
            System.out.print("Introduce una letra: ");
            intro = keyboard.nextLine();

            if (validos.contains(intro)) {
                //3. Si la longitud del texto es mayor que 1, no es una letra
                if (intro.length() > 1) {
                    System.out.println("no has introducido una letra, es algo más largo.");

                } else {
                    //4. Si la longitud del texto es 1 es una letra
                    resultado = resultado + " " + intro;
                    cnt++;
                }

            } else {
                System.out.println("Valor invalido, se sale del programa.");
            }

        } while (validos.contains(intro));

        //5. Controlar el resultado: si se ha introducido un número desde el principio mostrar un mensaje
        if (resultado.isEmpty()) { //Comprobamos si resultado esta vacio (se entiende que no se ha concatenado nada).
            System.out.println("Has introducido un caracter no válido desde el principio.");

        } else {
            //6. Controlar el resultado: mostrar las palabras concatenadas como resultado.
            System.out.println("Perfecto, has introducido " + cnt + " palabras," +
                    "\n y las palabras que has introducido son: " + resultado);
        }

        //7. Fin del programa.
        System.out.println("FIN DEL PROGRAMA.");

    }

}
