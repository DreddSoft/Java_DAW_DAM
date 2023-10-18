package Bucles.Ejercicios;

        /*2. Caso contrario, hay que hacer un programa donde el valor que pedimos por teclado sea mayor que 0 y menor que 10.
        Después hacer un incremento del número en 1 hasta llegar a 30 - OJO USANSO SOLO bucle While.*/

import java.util.Scanner;

public class Ej02Bucles {

    public static void main(String[] args) {

        //Declaramos variables
        int intro;      //Declaramos pero no inicializamos.
        int end = 30;   //Declaramos e inicializamos el valor final.

        //Scanner
        Scanner key = new Scanner(System.in);

        /*Que tenemos que hacer?
        * 1. Solicitar un número por teclado.
        * 2. Evaluar que ese número sea mayor que 0 y menor que 10.
        * 3. Si cumple la condición anterior continuar, si no pedir el número de nuevo informando del error.
        * 4. Crear un bucle que evalúe la condición de que el número introducido sea menor que o igual que end
        * 5. Incrementar el intro.
        * 6. Finalizar el programa.
        * */

        //Solicitamos número por teclado.
        System.out.print("Bienvenido, introduce un número (recuerda mayor que 0 y menor que 10: ");
        intro = key.nextInt();

        //Evaluamos que el número sea mayor que 0 y menor que 10
        while (intro <= 0 || intro > 10) {  //Mientras que... intro sea menor o igual a 0 o mayor que 10
            //Ojo, hemos usado el operador OR
            //Haz...
            System.out.println("Error, recuerda el número tiene que ser mayor que 0 y menor que 10.");
            System.out.print("Por favor, introduce el número de nuevo: ");
            intro = key.nextInt();

        }

        //bucle para incrementar el número
        while (intro <= end) {  //Mientras que... intro sea menor o igual que end
            //Haz...
            System.out.println(intro);  //Mostramos intro
            intro++;                    //incrementamos intro

        }

        key.close();

        System.out.println("FIN DEL PROGRAMA.");

    }

}
