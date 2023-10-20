package Bucles.Ejercicios.DeClase;


import java.util.Random;

/**
 * Ejercicios de clase - Bucles: lanzamiento de dados.
 *
 * @author DreddSoft
 * @version 2.0
 * @since 2023-10-19
 */

/*
 * Ejercicio 1:
 * Haz un programa para simular 20 lanzamientos de un dado.
 * */
public class EJ01_Dados_v2 {

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
        System.out.println("INICIO PROGRAMA." +
                "\nBienvenidos al programa de lanzamiento de dado, este será landazo " + limite
                + "veces.");

        //2. Crear un bucle que nos permita repetir el lanzamiento 20 veces.
        //lo vamos a hacer con un bucle do-while
        do {    //Haz...
            System.out.println("Lanzamiento del dado.");
            //3. Acotar el resultado del dado entre 1 y 6.
            dado = r.nextInt(1, 6);
            //4. Mostrar el lanzamiento.
            System.out.println("Intento: " + lanzamiento + ", dado: " + dado);

            lanzamiento++;

        } while (lanzamiento <= limite); //Mientras...


        //5. Cuando se haya lanzado 20 veces, informar que se ha lanzado 20 veces.
        System.out.println("Ya se ha llegado al límite de " + limite + " lanzamientos.");

        //6. Finalizar programa.
        System.out.println("FIN DE PROGRAMA.");


    }
}
