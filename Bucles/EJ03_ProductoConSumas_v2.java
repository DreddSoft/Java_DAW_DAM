package Bucles.Ejercicios.DeClase;


import java.util.Scanner;

/**
 * Ejercicios de clase - Bucles: Producto con sumas de dos números enteros.
 *
 * @author DreddSoft
 * @version 2.0
 * @since 2023-10-20
 */

/*
 * Ejercicio 3:
 * Dados dos números enteros positivos, calcula su producto utilizando solo sumas.
 * */
public class EJ03_ProductoConSumas_v2 {

    //Declaramos método main
    public static void main(String[] args) {
        /* ---- VARIABLES ---- */
        //Números
        int base;
        int multiplicador;
        //Resultado
        int resultado = 0;  //Declaramos e inicializamos porque no le vamos a meter valor por teclado.

        //Scanner
        Scanner key = new Scanner(System.in);

        /*
         * ¿Qué tenemos que hacer?
         * 1. Crear función de multiplicación con sumas.
         * 2. Iniciar programa.
         * 3. Introducir por teclado el número base.
         * 4. Introducir por teclado el número multiplicador.
         * 5. Evaluar con un bucle que ambos números sean positivos (!= de 0).
         * 6. Usar la función de multiplicación.
         * 7. Mostrar el resultado.
         * 8. Comprobar el resultado.
         * 9. Finalizar programa.
         * */

        /* ---- MAIN PROGRAM ---- */
        //2. Iniciar programa.
        System.out.println("INICIO DE PROGRAMA" +
                "\nBienvenidos al programa de multiplicación con sumas.");


        do {
            //3. Introducir por teclado el número base.
            System.out.print("Introduce un número base: ");
            base = key.nextInt();   //Introduce por teclado el número

            //4. Introducir por teclado el número multiplicador.
            System.out.print("Introduce un multiplicador: ");
            multiplicador = key.nextInt();  //introduce por teclado el número

        } while (base < 0 || multiplicador < 0); //5. Evaluar con un bucle que ambos números sean positivos (!= de 0).

        //6. Usar la función de multiplicación.
        resultado = multiplicacion(base, multiplicador);

        //7. Mostrar el resultado.
        System.out.println("El resultado de multiplicar " + base + " por " + multiplicador + " es: " + resultado + ".");

        //8. Comprobar el resultado.
        int comprobar = base * multiplicador;
        System.out.println("Comprobación: " + comprobar + ".");

        //9. Finalizar programa.
        System.out.println("FIN DE PROGRAMA.");

        //Cerrar scanner
        key.close();

        //Formatear Windows + Alt + L



    }

    //Este ejercicio lo vamos a hacer con una función externa.
    //1. Crear función de multiplicación con sumas.
    public static int multiplicacion(int base, int multiplicador) { //La función debe recibir por parámetros la base y el multiplicador.
        int resultado = 0;  //Declaramos e inicializamos una variable resultado para esta función.

        for (int i = 0; i < multiplicador; i++) {   //Bucle for para recorrer (repetir) desde 0 hasta uno antes de multiplicador.
            resultado += base;  //resultado = resultado + base;
        }

        return resultado;
    }

}
