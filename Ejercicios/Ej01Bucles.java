package Bucles.Ejercicios;

/*Ejercicio Bucles  WHILE 1: Hacer un programa que pida por teclado un número positivo y mayor que 0,
y que despues inicie una cuenta atrás hasta llegar a 0.
USANDO SOLO BUCLE WHILE*/

import java.util.Scanner;

public class Ej01Bucles {
    public static void main(String[] args) {

        //Primero declaramos las variables
        int cero = 0;   //declaramos e inicializamos el final de la cuenta atrás.
        int intro;     //declaramos pero no inicializamos el número inicial.

        //Creamos objeto de la clase Scanner.
        Scanner key = new Scanner(System.in);

        /*Ahora analizamos lo que tenemos que hacer:
        * 1. Tenemos que solicitar un número por teclado.
        * 2. Tenemos que evaluar que el número sea mayor que 0.
        * Para ello tenemos que hacer un bucle que no me deje continuar hasta que introduzca un número mayor que 0
        * 3. Tenemos que volver a usar un bucle para que el valor intro decrezca hasta llegar a 0
        * */

        //Pedimos número por teclado
        System.out.print("Por favor, introduce un número (recuerda mayor que 0): ");
        intro = key.nextInt();

        //Analizamos con un bucle si es mayor que 0
        while (intro <= 0) {  //Mientras que... intro sea menor o igual que 0
            //Haz...
            System.out.print("Error, has introducido un número menor que 0, por favor introduce el número de nuevo: ");
            intro = key.nextInt();
            //El bucle volverá al principio a analizar la condición de nuevo...
        }

        //Bucle while para hacer la cuenta atrás.
        while (intro >= 0) { //Mientras que...intro sea mayor o igual que 0
            //Haz...
            System.out.println(intro);  //valor de intro = lo que hayamos introducido.
            intro--;    //Nuevo valor de intro = introducido - 1

            //Vuelve el bucle al principio
        }

        System.out.println("FIN DEL PROGRAMA.");

        key.close();


    }
}
