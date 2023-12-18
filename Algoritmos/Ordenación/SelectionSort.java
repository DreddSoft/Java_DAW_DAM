package Algoritmos.Ordenacion;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

    public static void main(String[] args) {

        // Array
        int[] arrNum = new int[6];

        // Random
        Random r = new Random();

        // Rellenamos el Array de valores Random.
        for (int i = 0; i < arrNum.length; i++) {
            arrNum[i] = r.nextInt(0, 20);
        }


        // Imprimimos el ArrayDesordenado.
        System.out.println("Desordenado: " + Arrays.toString(arrNum));

        // Ordenamos el Array.
        selectionSort(arrNum);

        // Imprimimos el Array.
        System.out.println("Ordenado: " + Arrays.toString(arrNum));





    }

    // Algoritmo SelectionSort - Algoritmo de ordenación por selección.
    public static void selectionSort (int[] arrBase) {
        // Bucle for para recorrer todas las posiciones del Array.
        // En él vamos a ir desplazando los "límites" a la derecha.
        for (int i = 0; i < arrBase.length; i++) {

            /* Variable min_idx que será el índice del valor más bajo,
            * le damos valor i, para que sea el valor a la izquierda en cada iteracción. */
            int min_idx = i;

            // Bucle for para recorrer los valores a la derecha.
            // empezamos en la posición j = i + 1, la siguiente posición a i.
            for (int j = i + 1; j < arrBase.length; j++) {

                // Si el valor en la posición j es mayor que el valor en la posición indiceMinimo.
                if (arrBase[j] < arrBase[min_idx])
                    // Guardamos j como el nuevo indice mínimo.
                    min_idx = j;
            }
            // Intercambiamos las posiciones de i con índice mínimo.
            int temp = arrBase[min_idx];
            arrBase[min_idx] = arrBase[i];
            arrBase[i] = temp;
        }
    }

    // Algoritmo SelectionSort - forma sin retorno (void).



}
