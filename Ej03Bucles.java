package Bucles.Ejercicios;

import java.util.Scanner;

/* EJERCICIO DE BUCLES 3.
 * Hacer un programa que pida por teclado un número de alumnos con un mínimo de 0 y un máximo de 10.
 * Que pida por teclado la edad de cada alumno (comprendido entre 10 y 19).
 * Hacer un contador para los alumnos mayores de edad y los menores de edad.
 * Que devuelve la media de edad de los alumnos - USAR SOLO BUCLES WHILE.
 * */
public class Ej03Bucles {

    public static void main(String[] args) {
        //Declaramos las variables
        int alumnos;        //No inicializamos.
        int edad;           //No inicializamos.
        int sumaEdad = 0;   //Declaramos e inicializamos.
        double media = 0;   //Declaramos e inicializamos la media de edad a 0 - OJO es double.

        int mayorEdad = 0;  //Contador mayores de edad.
        int menorEdad = 0;  //Contador menores de edad.

        //Scanner
        Scanner key = new Scanner(System.in);


        /* Analizamos que tenemos que hacer:
         * 1. Solicitar por teclado el número de estudiantes (teniendo en cuenta el mínimo y el máximo).
         * 2. Solicitar por teclado la edad de los estudiantes y sumarla en sumaEdad.
         * 3. Evaluar que la edad introducida por teclado sea mayor que 10 y menor que 19.ç
         * 4. Hacer un contador para mayores de edad y otros para menores de edad.
         * 5. Calcular la edad media de la clase.
         *
         * */

        System.out.println("Bienvenidos al programa.");
        System.out.print("Introduce un número de alumnos (mínimo 1, máximo 10): ");
        alumnos = key.nextInt();

        while (alumnos < 1 || alumnos > 10) {   //Mientras que... alumnos sea menor que 1 o mayor que 10
            //Haz...
            System.out.println("Error, recuerda mínimo 1, máximo 10");
            System.out.print("Introduce el número de alumnos de nuevo: ");
            alumnos = key.nextInt();

        }

        //Declaramos una variable temporal
        int temp = 0;
        while (temp != alumnos) {   //Mientras que...temp (valor 1) sea diferente de alumnos (valor introducido por teclado)
            //Haz...
            System.out.print("Introduce una edad del alumno: ");
            edad = key.nextInt();
            while (edad < 10 || edad > 19) {    //Mientras que... edad sea menor que 10 y mayor que 19
                //haz...
                System.out.println("Error, recuerda la edad de los alumnos está comprendida entre 10 y 19");
                System.out.print("Introduce la edad de nuevo: ");
                edad = key.nextInt();
            }
            //Le sumamos a la sumatoria de las edades la edad introducida.
            sumaEdad = sumaEdad + edad;

            //Evaluamos si es mayor de edad:
            if (edad >= 18) {
                mayorEdad++;
            } else {
                menorEdad++;
            }

            temp++;
            //Fin del bucle
        }

        //Mostrar la cantidad de alumnos mayores de edad
        System.out.println("Hay " + mayorEdad + " alumnos mayores de edad.");
        //Mostrar la cantidad de alumnos menores de edad
        System.out.println("Hay " + menorEdad + " alumnos menores de edad.");

        //Mostrar la edad media de alumnos = sumaEdad / alumnos
        media = (double) sumaEdad / alumnos;
        System.out.println("La media de edad de los alumnos es de " + media + " años.");

        key.close();

        System.out.println("FIN DEL PROGRAMA.");

    }
}
