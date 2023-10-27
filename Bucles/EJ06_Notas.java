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
 * Ejercicio 6:
 * Realiza un programa en el cual se introduzcan notas numéricas correspondientes a las
 * calificaciones de un grupo de alumnos y se presenten en pantalla el número total de
 * alumnos que han sacado MUY DEFICIENTE (0, 1, 2), INSUFICIENTE (3, 4) APROBADO (5), BIEN (6),
 * NOTABLE (7, 8), SOBRESALIENTE (9, 10).
 */

public class EJ06_Notas {

    public static void main(String[] args) {

        /* ---- VARIABLES ---- */
        //número de alumnos:
        int numAlumnos;

        //nota de los alumnos:
        int nota;

        //Nombre de los alumnos:
        String nombre;

        //Contador:
        int contador = 0;

        //Scanner
        Scanner key = new Scanner(System.in);

        /*
         * ¿Qué tenemos que hacer?
         * 1. Iniciar el programa.
         * 2. Solicitar por teclado el número total de alumnos.
         * 3. Controlar que ese número no sea mayot que 20, ni menor que 1.
         * 4. Iniciar el bucle que controle las introducciones (Lo haremos con WHILE).
         * 5. Introducir el nombre por teclado.
         * 6. Introducir la nota.
         * 7. Controlar que la nota sea un valor entre 1 y 10.
         * 8. Devolver el resultado por es usando las terminaciones que se marcan en el enunciado.
         * 9. Finalizar el programa.
         * */

        // 1. Iniciar el programa.
        System.out.println("INICIO DEL PROGRAMA." +
                "\nBienvenidos al programa de notas del alumnado.");

        // 2. Solicitar por teclado el número total de alumnos.
        System.out.print("Introduce el número total de alumnos (entre 1 y 20): ");
        numAlumnos = key.nextInt();

        // 3. Controlar que ese número no sea mayot que 20, ni menor que 1.
        while (numAlumnos < 1 || numAlumnos > 20) {     //Mientras que...numAlumnos sea menor que 1 o mayor que 20
            //Haz...
            System.out.print("Número de alumnos introducido es incorrecto, recuerda entre 1 y 20: ");
            numAlumnos = key.nextInt();

        }

        // 4. Iniciar el bucle que controle las introducciones (Lo haremos con WHILE).

        while (contador <= numAlumnos) {    //Mientras que... contador sea menor o igual que numAlumnos
            //Haz...
            // 5. Introducir el nombre por teclado.
            System.out.print("Introduce el nombre del alumno: ");
            nombre = key.next();

            //6. Introducir la nota.
            System.out.print("Introduce la nota del alumno: ");
            nota = key.nextInt();

            // 7. Controlar que la nota sea un valor entre 1 y 10.
            while (nota < 0 || nota > 10) { //Mientras que...la nota es menor que 0 o mayor que 10
                //Haz...
                System.out.print("La nota introducida es incorrecta, recuerda 1 mínimo, 10 máximo: ");
                nota = key.nextInt();

            }
            // 8. Devolver el resultado por es usando las terminaciones que se marcan en el enunciado.
            if (nota < 3) {
                System.out.println("El alumno " + nombre + " ha sacado un DEFICIENTE (" + nota + ").");

            } else if (nota >= 3 && nota < 5) {
                System.out.println("El alumno " + nombre + " ha sacado un INSUFICIENTE (" + nota + ").");

            } else if (nota == 5) {
                System.out.println("El alumno " + nombre + " ha sacado un APROBADO (" + nota + ").");

            } else if (nota == 6) {
                System.out.println("El alumno " + nombre + " ha sacado un BIEN (" + nota + ").");

            } else if (nota > 6 && nota < 9) {
                System.out.println("El alumno " + nombre + " ha sacado un NOTABLE (" + nota + ").");

            } else {
                System.out.println("El alumno " + nombre + " ha sacado un SOBRESALIENTE (" + nota + ").");
            }

            contador++;

        }

        // 9. Finalizar el programa.

        key.close();

        System.out.println("FIN DEL PROGRAMA.");


    }

}
