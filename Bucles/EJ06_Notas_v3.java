package Bucles.Ejercicios.DeClase;

import java.util.Scanner;

/**
 * Ejercicios de clase - Bucles: Notas de clase.
 *
 * @author DreddSoft
 * @version 3.0
 * @since 2023-10-23
 */
/*
 * Ejercicio 6:
 * Realiza un programa en el cual se introduzcan notas numéricas correspondientes a las
 * calificaciones de un grupo de alumnos y se presenten en pantalla el número total de
 * alumnos que han sacado MUY DEFICIENTE (0, 1, 2), INSUFICIENTE (3, 4) APROBADO (5), BIEN (6),
 * NOTABLE (7, 8), SOBRESALIENTE (9, 10).
 * LO HACEMOS CON FUNCIONES - METODOS
 */

public class EJ06_Notas_v3 {

    public static void main(String[] args) {
        /* ---- VARIABLES ---- */
        //Numero total de alumnos
        int numAlumnos;

        //Nota del alumno
        int nota;
        //Nota en valor String
        String notaFinal = "";

        //Nombre alumno
        String nombre = "";

        //Contador
        int contador = 0;
        //Scanner
        Scanner key = new Scanner(System.in);

        /*
         * ¿Qué tenemos que hacer?
         * 1. Crear una función para introducir el número de alumnos y comprobar que este entre 1 y 20.
         * 2. Crear una función para comprobar que la nota introducida es correcta.
         * 3. Crear una función para devolver la nota en String.
         * 4. Iniciar programa.
         * 5. Introducir el número de alumnos.
         * 6. Crear un bucle para controlar que se introduzca la nota tantas veces como alumnos hay
         * 7. Introduce el nombre del alumno:
         * 8. Introduce la nota del alumno:
         * 9. Mostrar los resultados
         * 10. Cerrar Scanner.
         * 11. Finalizar programa.
         * 12. Formatear en IntelliJ: Control + alt + L
         * */

        /* ---- MAIN PROGRAM ---- */

        // 4. Iniciar programa.
        System.out.println("INICIO DE PROGRAMA." +
                "\nBienvenidos al programa de notas del alumnado.");

        // 5. Introducir el número de alumnos.
        numAlumnos = numeroAlumnos();

        // 6. Crear un bucle para controlar que se introduzca la nota tantas veces como alumnos hay
        do {    //Haz...
            // 7. Introduce el nombre del alumno:
            System.out.print("Introduce el nombre del alumno: ");
            nombre = key.next();

            // 8. Introduce la nota del alumno:
            nota = comprobarNota();

            //9. Mostrar los resultados
            devolverDatos(nombre, nota);

            contador++;


        } while (contador < numAlumnos);   //Mientras que...contador sea menor que numAlumnos. Va a recorrer desde 0 hasta numAlumnos - 1.

        //10. Cerrar Scanner.
        key.close();

        //11. Finalizar programa.
        System.out.println("FIN DE PROGRAMA.");

        //12. Formatear en IntelliJ: Control + alt + L

    }

    // 1. Crear una función para introducir el número de alumnos y comprobar que este entre 1 y 20.
    public static int numeroAlumnos() {
        //Variable temporal para número de alumnos.
        int numAlum_Temp = 0;

        //Scanner
        Scanner intro = new Scanner(System.in);

        //Pedir número de alumnos:
        System.out.print("Introduce el número de alumnos: ");
        numAlum_Temp = intro.nextInt();

        while (numAlum_Temp < 1 || numAlum_Temp > 20) {

            if (numAlum_Temp < 1) {
                System.out.println("El número introducido es menor que 1.");
                System.out.print("Introduce el número de nuevo (recuerda mayor que 1): ");
                numAlum_Temp = intro.nextInt();

            } else if (numAlum_Temp > 20) {
                System.out.println("El número introducido es mayor que 20.");
                System.out.print("Introduce el número de nuevo (recuerda menor o igual que 20): ");
                numAlum_Temp = intro.nextInt();

            }

        }
        return numAlum_Temp;
    }

    //2. Crear una función para comprobar que la nota introducida es correcta.
    public static int comprobarNota() {
        int nota;
        Scanner temp = new Scanner(System.in);

        System.out.print("Introduce una nota para el alumno: ");
        nota = temp.nextInt();

        while (nota < 0 || nota > 20) {
            if (nota < 0) {
                System.out.print("Nota demasiado baja, recuerda mayor o igual que 0.");
                System.out.print("Introduce la nota de nuevo: ");
                nota = temp.nextInt();
            } else if (nota > 10) {
                System.out.println("Nota demasiado alta, recuerda menor o igual que 10.");
                System.out.print("Introduce la nota de nuevo: ");
                nota = temp.nextInt();
            }

        }
        return nota;
    }

    // 3. Crear una función para devolver la nota en String.
    public static void devolverDatos(String nombre, int nota) {
        switch (nota) {
            case 0, 1, 2 -> {
                System.out.println("El alumno " + nombre + "ha sacado un DEFICIENTE con una nota de " + nota + ".");
            }
            case 3, 4 -> {
                System.out.println("El alumno " + nombre + "ha sacado un INSUFICIENTE con una nota de " + nota + ".");
            }
            case 5 -> {
                System.out.println("El alumno " + nombre + "ha sacado un APROBADO con una nota de " + nota + ".");
            }
            case 6 -> {
                System.out.println("El alumno " + nombre + "ha sacado un BIEN con una nota de " + nota + ".");
            }
            case 7, 8 -> {
                System.out.println("El alumno " + nombre + "ha sacado un NOTABLE con una nota de " + nota + ".");
            }
            case 9, 10 -> {
                System.out.println("El alumno " + nombre + "ha sacado un SOBRESALIENTE con una nota de " + nota + ".");
            }
            default -> {
                System.out.println("ALGO RARO.");
            }
        }
    }

}
