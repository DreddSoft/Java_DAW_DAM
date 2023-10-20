package Bucles.Ejercicios.DeClase;


import java.util.Scanner;

/*
 * Ejercicio 4:
 * Solicítale al usuario un número entre 0 y 10 ambos incluidos:
 *  - Si el usuario introduce un número que no esté dentro de ese rango, vuelve a
 * pedírselo tantas veces como sea necesario, es decir, hasta que introduzca un
 * número entre 0 y 10.
 * - Una vez obtenido el número dentro de ese rango, muestra la tabla de multiplicar
 * de dicho número.*
 */
public class EJ04_TablaMultiplicar {

    public static void main(String[] args) {
        /* ---- VARIABLES ---- */
        //numeros
        int base;
        //resultado
        int resultado = 0;

        //Scanner
        Scanner key = new Scanner(System.in);

        /*
         * ¿Qué hacemos?
         * 1. Iniciar programa.
         * 2. Solicitar al usuario un número.
         * 3. Comprobar que ese número esta entre 0 y 10.
         * 4. Multiplicar el número del 0 al 10 (su tabla completa).
         * 5. Mostrar resultado.
         * 6. Finalizar programa.
         * */

        /* ---- MAIN PROGRAM ---- */

        //1. Iniciar programa.
        System.out.println("INICIO DE PROGRAMA." +
                "\nBienvenidos al programa de la tabla de multiplicar.");

        //Lo vamos a hacer con un while
        //2. Solicitar al usuario un número.
        System.out.println("Recuerda un número entre 0 y 10.");
        System.out.print("Introduce un número: ");
        base = key.nextInt();

        //3. Comprobar que ese número esta entre 0 y 10.
        while (base < 0 || base > 10) {  //Mientras que...base menor que 0 o base mayor que 10
            //Haz...
            System.out.println("Error, has introducido " + base + ", recuerda un número entre 0 y 10.");
            System.out.print("Introduce de nuevo el número: ");
            base = key.nextInt();

        }   //Cuando salga del while es porque es un número entre 0 y 10 (incluidos).

        //4. Multiplicar el número del 0 al 10 (su tabla completa).
        for (int i = 0; i <= 10; i++) { //Para i = 0, donde incrementa en 1, hasta llegar a 10.
            //Haz...
            resultado = base * i;   //Multiplicará base x 0, base x 1, base x 2, ... hasta base x 10
            //5. Mostrar resultado.
            System.out.println(base + " x " + i + "= " + resultado);
        }

        //6. Finalizar programa.
        System.out.println("FIN DE PROGRAMA.");

        //Cierra Scanner
        key.close();

        //Formatea: Control + Alt + L

    }

}
