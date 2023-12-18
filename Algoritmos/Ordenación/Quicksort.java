package Algoritmos.Ordenacion;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Quicksort {


    public static void main(String[] args) {

        // Objeto Random.
        Random r = new Random();

        // Creamos un arrayNumeros.
        int[] arrNum = new int[5];

        // Rellenamos el arrayNumeros de números random.
        for (int i = 0; i < arrNum.length; i++) {
            arrNum[i] = r.nextInt(1, 10);
        }

        // Mostramos el arrayNumeros desordenado.
        System.out.println("Desordenado: " + Arrays.toString(arrNum));

        // Usamos el algoritmo quicksort.
        arrNum = quicksort(arrNum, 0, arrNum.length - 1);

        // Mostramos el arrayNumeros ordenado.
        System.out.println("Ordenado: " + Arrays.toString(arrNum));


    }

    // Algoritmo QuickSort.
    public static int[] quicksort(int[] arrBase, int izq, int der) {

        int pivot = arrBase[izq];   // Tomamos el primer elemento como pivote.

        int i = izq;        // i realiza la búsqueda de izq a derecha.
        int j = der;        // j realiza la búsqueda de der a izq.

        while (i < j) { // Mientras no se crucen las búsquedas.

            // Busca el elemento mayor que pivote de izq a derecha.
            while (arrBase[i] <= pivot && i < j) i++;
            // Busca el elemento menor que pivote de derecha a izq.
            while (arrBase[j] > pivot) j--;

            // Si no se han cruzado, los intercambiamos.
            if (i < j) {
                int aux = arrBase[i];
                arrBase[i] = arrBase[j];
                arrBase[j] = aux;
            }

            // Intercambiamos la posición de inicio con el lugar correcto de pivote.
            arrBase[izq] = arrBase[j];  // valor en posición correcta de pivote lo pasamos a la primera pos.
            arrBase[j] = pivot;         // guardamos pivote en su posición correcta en el orden.

            // Usamos recursividad.
            if (izq < j - 1)
                quicksort(arrBase, izq, j -1);  // Ordenamos la parte izquierda del conjunto.

            if (j+1 < der)
                quicksort(arrBase, j + 1, der); // Ordenamos la parte derecha del conjunto.
        }

        // devolvemos el ArrayOrdenado.
        return arrBase;
    }

    // Función para incrementar un Array
    public static int[] increaseArray(int[] arrBase) {

        // Creamos un Array copia con longitud ArrayBase + 1.
        int[] arrCopy = new int[arrBase.length + 1];

        // Recorremos todos los valores de ArrayBase guardandolos en ArrayCopia.
        for (int i = 0; i < arrBase.length; i++) {
            arrCopy[i] = arrBase[i];

        }

        // Devolvemos el ArrayCopia.
        return arrCopy;
    }


}
