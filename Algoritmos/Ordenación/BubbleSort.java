package Algoritmos.Ordenacion;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

    public static void main(String[] args) {

        // Array
        int[] arrNum = new int[6];

        // Random
        Random r = new Random();

        // Generamos todos los números del Array
        for (int i = 0; i < arrNum.length; i++) {

            arrNum[i] = r.nextInt(0, 10);

        }

        // Imprimimos desordenado.
        System.out.println("Desordenado: " + Arrays.toString(arrNum));

        // Ordenamos Array.
        bubbleSort(arrNum);

        // Imprimimos Array ordenado.
        System.out.println("Ordenado: " + Arrays.toString(arrNum));


    }

    // Algoritmo Bubble sort - Ortdenación burbuja.
    public static void bubbleSort(int[] arr) {

        // Ejecutamos 2 bucles for:
        // 1. Para recorrer el Array.
        // 2. Para las comparaciones.
        for (int i = 0; i < arr.length - 1; i++) {
            //.length - 1 porque después de la primera iteración, el elemento final estaría ordenado.

            // Creamos un registro de si está ordenado, con valor incial true.
            boolean sorted = true;

            // Segundo bucle para realizar las comparaciones.
            for (int j = 0; j < arr.length - i - 1; j++) {

                // Condicional para evaluar si el valor j es mayor que el siguiente.
                if (arr[j] > arr[j + 1]) {
                    // Intercambio de posición.
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    // Ordenado = false, si hay cambio significa que no está ordenado.
                    sorted = false;
                }
            }
            // Si ordenado = true, en la iteración no se ha realizado ningún intercambio, significa que está ordenado.
            if (sorted) break;   // break saca del bucle.
        }
    }
}
