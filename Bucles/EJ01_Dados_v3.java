package Bucles.Ejercicios.DeClase;

import java.util.Random;

/**
 * Ejercicios de clase - Bucles: lanzamiento de dados.
 *
 * @author DreddSoft
 * @version 3.0
 * @since 2023-10-19
 */

/*
 * Ejercicio 1:
 * Haz un programa para simular 20 lanzamientos de un dado.
 * En este vamos a hacer PROGRAMACIÓN FUNCIONAL y hacer uso de funciones externas al main para simplificar el código.
 * */
public class EJ01_Dados_v3 {

    public static void main(String[] args) {
        /* ---- VARIABLES ---- */
        //Valor que le vamos a dar al dado
        int dado;

        //límite de lanzamientos
        int limite = 20;

        /*
         * ¿Qué hay que hacer?
         * 1. Crear función lanzarDado.
         * 2. Dentro de la función INSTANCIAR un random.
         * 3. Devolver un int con el valor de un random.nextInt(origin: 1, bound: 6).
         * 4. Inciar programa MAIN.
         * 5. Crear un bucle que nos permita repetir el lanzamiento 20 veces.
         * 6. Usar la función lanzarDado
         * 7. Mostrar el lanzamiento.
         * 8. Cuando se haya lanzado 20 veces, informar que se ha lanzado 20 veces.
         * 9. Finalizar programa.
         * */

        /* ---- MAIN PROGRAM ---- */
        System.out.println("INICIO PROGRAMA." +
                "\nBienvenidos al programa de lanzamiento de dados, este será lanzado " + limite + " veces.");


        //5. Crear un bucle que nos permita repetir el lanzamiento 20 veces.
        //Lo vamos a hacer con for

        for (int lanzamiento = 0; lanzamiento <= limite; lanzamiento++) {
            System.out.println("Lanzamiento del dado:");
            //6. Usar la función lanzarDado
            dado = lanzarDado();    //Usamos la función para dar valor a la variable int dado. La función devolverá un entero random entre 1 y 6

            //7. Mostrar el lanzamiento.
            System.out.println("Intento: " + lanzamiento + ", dado: " + dado);
        }

        //8. Cuando se haya lanzado 20 veces, informar que se ha lanzado 20 veces.
        System.out.println("Ya se ha llegado al límite de " + limite + " lanzamientos.");

        //9. Finalizar programa.
        System.out.println("FIN DE PROGRAMA.");


    }

    //1. Crear función lanzarDado.
    public static int lanzarDado(){
        //2. Dentro de la función INSTANCIAR un random.
        Random r = new Random();

        //3. Devolver un int con el valor de un random.nextInt(origin: 1, bound: 6).
        return r.nextInt(1, 6);

    }


}
