package TRIM_1.deClase;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author DreddSoft
 * @version 1.0
 * @since 2023-11-21
 */


public class prueba {

    /*
     * 1. Programa que lea dies valores numéricos con dos decimales correspondientes a las calificaciones de un tribunal.
     * El programa debe obtener e imprimir la nota media. Para el cálculo de la media deben desestimarse la nota mayor y la menor
     * si ambas se diferencian en tres o más puntos. Este proceso de desestimar notas debe repetirse hasta que la nota mayor y
     * la nota menor difieran en menos de tres puntos o bien sólo queden cuatro calificaciones. (usar un array dinámico para dicho ejercicio)
     * 2. Añadir el código necesario para que si al introducir un valor no válido, lo indique pida un valor nuevo.
     * */

    public static void main(String[] args) {

        // Notas
        double notas = 0;

        // Condición para verificar que se ha introducido un número
        boolean check = false;

        // Array
        double[] arrNotas = new double[0];

        // Scanner
        Scanner key = new Scanner(System.in);

        // INICIA MAIN PROGRAM.

        do {    // Haz...

            System.out.println("Bienvenidos al programa de media de notas.");
            System.out.print("Introduce la nota (recuerda un valor con decimales: ");
            notas = key.nextDouble();

            while (notas < 0 || notas > 10) {   //Mientras que... notas sea menor que 0 o mayor que 10
                // Mensaje
                System.out.print("Recuerda, un valor entre 0 y 10: ");
                notas = key.nextDouble();
            }

            // Mostramos por pantalla la nota
            System.out.println("La nota introducida es " + notas);

            arrNotas = introducirValor(arrNotas, notas);

        } while (arrNotas.length < 10);    // Mientras que... la longitud del Array sea menor que 10.

        // Mostramos el Array
        System.out.println(Arrays.toString(arrNotas));

        // Desestimamos notas
        arrNotas = desestimarNotas(arrNotas);

        // Mensaje
        System.out.println("Una vez desestimadas las notas, queda este resultado" +
                "\n" + Arrays.toString(arrNotas));

        // Calculamos la media
        double media = 0;
        media = mediaArray(arrNotas);
        String med = String.format("%.2f", media);


        // Mensaje
        System.out.println("La media de las notas del Array es " + med);

        // FIn de programa.
        System.out.println("FIN DE PROGRAMA.");

    }

    // Función para sacar la media de un Arrray
    public static double mediaArray(double[] arrBase) {

        // Creamos un entero con el valor de las posiciones
        int posiciones = arrBase.length;

        // Declaramos un double sumatorio de valores del Array
        double sumatoria = 0;

        // Declaramos e iniciamos un double media de Array
        double media = 0;

        // Bucle for para guardar todos los valores sumados en el sumatorio
        for (int i = 0; i < arrBase.length; i++) {

            sumatoria += arrBase[i];

        }

        // Media = sumatoria / posiciones
        media = sumatoria / posiciones;

        // Devolvemos la media.
        return media;
    }

    // Función para incrementar el array
    public static double[] incrementarArray(double[] arrBase) {

        // Crear copia
        double[] arrCopia = new double[arrBase.length + 1];

        // Copiar el Array
        arrCopia = Arrays.copyOf(arrBase, arrCopia.length);

        // Devolvemos el ArrayCopia
        return arrCopia;
    }

    // Función para introducir un valor en el Array
    public static double[] introducirValor(double[] arrBase, double valor) {

        // Incrementamos el Array.
        arrBase = incrementarArray(arrBase);

        // Introducimos el valor en la última posición.
        arrBase[arrBase.length - 1] = valor;

        // Ordenamos el Array.
        Arrays.sort(arrBase);

        // Devolvemos el array con el valor.
        return arrBase;

    }

    public static double[] desestimarNotas(double[] arrBase) {

        // Bucle while

        while (arrBase.length >= 4) {
            // Haz...
            // Diferencia
            double diferencia = arrBase[arrBase.length - 1] - arrBase[0];


            if (diferencia <= 3) break;

            // Eliminamos primera posición.
            arrBase = eliminarPrimeraPos(arrBase);

            // Eliminamos última posición.
            arrBase = eliminarUltimaPos(arrBase);
        }

        return arrBase;
    }

    // Función para eliminar la primera posición del Array
    public static double[] eliminarPrimeraPos(double[] arrBase) {

        // Array Copia con longitud - 1
        double[] arrCopia = new double[arrBase.length - 1];

        // Usamos la función de la API Arrays.copyofrange(), obviando la primera posición
        arrCopia = Arrays.copyOfRange(arrBase, 1, arrBase.length - 1);

        // Devolvemos el ArrayCopia
        return arrCopia;
    }

    // Función para eliminar la ultima posición del Array
    public static double[] eliminarUltimaPos(double[] arrBase) {

        // ArrayCopia con longitud arrBase.length - 1
        double[] arrCopia = new double[arrBase.length - 1];

        // Usamos la función de la API Arrays.copyOfRange(), obviando la última posición.
        arrCopia = Arrays.copyOfRange(arrBase, 0, arrBase.length - 1);

        // Devolvemos el ArrayCopia
        return arrCopia;
    }


}
