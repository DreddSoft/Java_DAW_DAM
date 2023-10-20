package Bucles.Ejercicios.DeClase;

import java.util.Random;

/**
 * Ejercicios de clase - Bucles: Lanzamiento de dados.
 *
 * @author DreddSoft
 * @version 1.0
 * @since 2023-10-19
 */

/*
 * Ejercicio 1:
 * Haz un programa para simular 20 lanzamientos de un dado.
 * */
public class EJ01_Dados {

    public static void main(String[] args) {
        /* ---- VARIABLES ---- */
        //Valor que le vamos a dar al dado
        int dado;

        //contador de lanzamientos
        int lanzamiento = 0;

        //límite de lanzamientos
        int limite = 20;

        //Random
        Random r = new Random();


        /*
         * ¿Qué hay que hacer?
         * 1. Inciar programa.
         * 2. Crear un bucle que nos permita repetir el lanzamiento 20 veces.
         * 3. Acotar el resultado del dado entre 1 y 6.
         * 4. Mostrar el lanzamiento.
         * 5. Cuando se haya lanzado 20 veces, informar que se ha lanzado 20 veces.
         * 6. Finalizar programa.
         * */

        /* ---- MAIN PROGRAM ---- */
        //1. Inciar programa.
        System.out.println("INICIO PROGRAMA.");
        System.out.println("Bienvenidos al programa de lanzamientos de dados.");

        //2. Crear un bucle que nos permita repetir el lanzamiento 20 veces.
        //Lo vamos a hacer con un while

        while (lanzamiento <= limite) {    //Mientras que lanzamiento sea menor o igual que límite
            //Haz...
            System.out.println("Lanzamiento del dado: ");
            //3. Acotar el resultado del dado entre 1 y 6.
            dado = r.nextInt(1, 6);
            //4. Mostrar el lanzamiento.
            System.out.println("Intento: " + lanzamiento + ", dado: " + dado);

            lanzamiento++;

        }
        //5. Cuando se haya lanzado 20 veces, informar que se ha lanzado 20 veces.
        System.out.println("El dado se ha lanzado 20 veces, el límite de lanzamientos.");

        //6. Finalizar programa.
        System.out.println("FIN DEL PROGRAMA.");
        

    }


}
