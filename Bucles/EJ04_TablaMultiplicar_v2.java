package Bucles.Ejercicios.DeClase;

import java.util.Scanner;

/**
 * Ejercicios de clase - Bucles: Tabla de multiplicar de un número entre 0 y 10
 *
 * @author DreddSoft
 * @version 2.0
 * @since 2023-10-20
 */
/*
 * Ejercicio 4:
 * Solicítale al usuario un número entre 0 y 10 ambos incluidos:
 *  - Si el usuario introduce un número que no esté dentro de ese rango, vuelve a
 * pedírselo tantas veces como sea necesario, es decir, hasta que introduzca un
 * número entre 0 y 10.
 * - Una vez obtenido el número dentro de ese rango, muestra la tabla de multiplicar
 * de dicho número.*
 */

public class EJ04_TablaMultiplicar_v2 {

    //Declaramos el main
    public static void main(String[] args) {

        /* ---- VARIABLES ---- */
        //número
        int base;

        //Scanner
        Scanner key = new Scanner(System.in);

        /*
         * ¿Qué hay que hacer?
         * 1. Crear una función para hacer y mostrar la tabla de multiplicar que reciba por parámetro el número base.
         * 2. Iniciar main program.
         * 3. Solicitar número base a usuario.
         * 4. Comprobar con un bucle que el valor de base este comprendido entre 0 y 10.
         * 5. Usar función tablaMultiplicar.
         * 6. Mostrar resultado.
         * 7. Fin de programa.
         * */

        /* ---- MAIN PROGRAM ---- */

        //2. Iniciar main program.
        System.out.println("INICIO PROGRAMA." +
                "\nBienvenidos al programa de la tabla de multiplicar." +
                "\nPor favor, recuerda un número entre 0 y 10.");

        //4. Comprobar con un bucle que el valor de base este comprendido entre 0 y 10.
        do {    //Haz...

            //3. Solicitar número base a usuario.
            System.out.print("Introduce un número: ");
            base = key.nextInt();

            //Siempre hay que mandar mensaje para informar de errores
            if (base < 0 || base > 10) {
                System.out.println("Error, recuerda un número entre 0 y 10.");

            }

        } while (base < 0 || base > 10); //Mientras que... base sea menor que 0 o mayor que 10 (se repetirá el bucle).

        //5. Usar función tablaMultiplicar.
        tablaMultiplicar(base);

        //7. Fin de programa.
        key.close();    //Cierra Scanner.
        System.out.println("FIN DE PROGRAMA.");

        //Formateamos: Control + Alt + L

    }

    //1. Crear una función para hacer y mostrar la tabla de multiplicar que reciba por parámetro el número base.
    public static void tablaMultiplicar(int base) {
        int resultado = 0;

        for (int i = 0; i <= 10; i++) {
            resultado = base * i; //base x 0, base x 1, base x2, base x3, ..., hasta base x10
            //6. Mostrar resultado.
            System.out.println(base + " x " + i + " = " + resultado + ".");

        }

    }
}
