package Algoritmos.Ordenacion;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {


    public static void main(String[] args) {

        // Array
        int[] arrNum = new int[6];

        // Random
        Random r = new Random();

        // Rellenamos el Array de números random
        for (int i = 0; i < arrNum.length; i++) {

            arrNum[i] = r.nextInt(0, 10);

        }

        // Mostramos el Array desordenado.
        System.out.println("Array desordenado: " + Arrays.toString(arrNum));

        // Ordenamos.
        insertionSort(arrNum);

        // Mostramos el Array ordenado.
        System.out.println("Array ordenado: " + Arrays.toString(arrNum));




    }

    // Algoritmo insertionsort - Ordenación por inserción.
    public static void insertionSort (int[] arr) {

        // Creamos un bucle for para recorrer todos los elementos del Array.
        // Empezamos en la primera posición que tenga elementos a la izq (osea 1).
        for (int i = 1; i < arr.length; i++) {

            // Creamos dos variables: key con el valor de la posición a evaluar i
            // y una variable j, que será el valor a la izquierda de key.
            int key = arr[i];
            int j = i - 1;

            // bucle while para comprobar el valor key con sus valores a la izquierda.
            // 1ra condición: que j => 0 (0 será la primera posición del Array).
            // 2da condición: que el valor del indice j sea mayor que key.
            while (j >= 0 && arr[j] > key) {
                // Intercambiamos la posición del valor en j con su siguiente.
                arr[j + 1] = arr[j];
                // decrementamos el indice j para ir comprobando todos los valores a la izq.
                j -= 1;
            }

            // El valor de key se guarda en la posición siguiente a j.
            arr[j + 1] = key;

        }

    }




}


