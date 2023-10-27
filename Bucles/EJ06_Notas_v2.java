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
 * Ejercicio 6:
 * Realiza un programa en el cual se introduzcan notas numéricas correspondientes a las
 * calificaciones de un grupo de alumnos y se presenten en pantalla el número total de
 * alumnos que han sacado MUY DEFICIENTE (0, 1, 2), INSUFICIENTE (3, 4) APROBADO (5), BIEN (6),
 * NOTABLE (7, 8), SOBRESALIENTE (9, 10).
 */

public class EJ06_Notas_v2 {

    public static void main(String[] args) {
        /* ---- VARIABLES ---- */
        //número de alumnos:
        int numAlumnos;

        //nota de los alumnos:
        int nota;

        //nota en String
        String notaFinal = "";

        //Nombre de los alumnos:
        String nombre;

        //Contador:
        int contador = 0;

        //Scanner
        Scanner key = new Scanner(System.in);

        /*
         * ¿Qué tenemos que hacer?
         * 1. Iniciar programa.
         * 2. Solicitar el número de alumnos.
         * 3. Controlar que el número de alumnos esté comprendido entre 1 y 20.
         * 4. Introducir la nota del alumno: controlar que los valores sean correctas.
         * 5. Introducir el nombre del alumno.
         * 6. Controlar que el número de iteraciones corresponda con el número de alumnos.
         * 7. Mostrar el resultado.
         * 8. Finalizar el programa.
         * */

        /* ---- MAIN PROGRAM ---- */
        // 1. Iniciar programa.
        System.out.println("INICIO DE PROGRAMA." +
                "Bienvenidos al programa de notas de clase.");

        // 2. Solicitar el número de alumnos.
        // 3. Controlar que el número de alumnos esté comprendido entre 1 y 20.
        do {
            //Haz...
            System.out.print("Introduce un número de alumnos: ");
            numAlumnos = key.nextInt();

            // Usamos el operador ternario para informar al usuario si el número introducido es válido o no.
            String error = (numAlumnos < 1 || numAlumnos > 20) ? "Error, el número introducido no es válido." : "El número introducido es válido.";
            System.out.println(error);

        } while (numAlumnos < 1 || numAlumnos > 20); //Mientras que el número de alumnos sea menor que 1 y mayor que 20.

        // 6. Controlar que el número de iteraciones corresponda con el número de alumnos.
        do {
            //Haz...
            // 5. Introducir el nombre del alumno.
            System.out.print("Introduce el nombre del alumno: ");
            nombre = key.next();

            // 4. Introducir la nota del alumno: controlar que los valores sean correctas.
            System.out.print("Introduce la nota del alumno: ");
            nota = key.nextInt();

            // USAMOS UN SWITCH
            switch (nota) {
                case 0, 1, 2:
                    notaFinal = "DEFICIENTE";
                    contador++;
                    break;
                case 3, 4:
                    notaFinal = "INSUFICIENTE";
                    contador++;
                    break;
                case 5:
                    notaFinal = "APROBADO";
                    contador++;
                    break;
                case 6:
                    notaFinal = "BIEN";
                    contador++;
                    break;
                case 7, 8:
                    notaFinal = "NOTABLE";
                    contador++;
                    break;
                case 9, 10:
                    notaFinal = "SOBRESALIENTE";
                    contador++;
                    break;
                default:
                    System.out.println("Nota incorrecta.");
                    break;
            }

            // 7. Mostrar el resultado.
            System.out.println("El alumno " + nombre + " ha sacado un " + notaFinal + "(" + nota + ").");
        } while (contador <= numAlumnos); //Mientras que...contador sea menor que numAlumnos

        // 8. Finalizar el programa.
        key.close();
        System.out.println("FIN DEL PROGRAMA.");
        //Formateamos: Ctrl + alt + L


    }
}
