package Bucles.Ejercicios.DeClase;

/**
 * Ejercicios de clase - Bucles: Pin secreto
 *
 * @version 1.0
 * @since 2023-10-18
 * @author DreddSoft
 * */

/*
* Ejercicio 1:
* Tenemos la pantalla del móvil bloqueada. Partiendo de un PIN_SECRETO, intentaremos desbloquear la pantalla.
* Tenemo 5 intentos.
* Si consigues acceder, lanza por consola el mensaje "login correcto".
* Si no lo consigues, lanza por consola el mensaje "llamando a la policía".
* */

import javax.swing.text.Utilities;
import java.util.Random;
import java.util.Scanner;

public class Pin_Secreto {

    public static void main(String[] args) {
        //Declaramos las variables.
        String pinSecreto;      //Declaramos el pin secreto
        int intentos = 5;       //Declaramos e inicializamos el contador de intentos.

        String pin = "";        //Declaramos e inicializamos en vaco el pin que vamos a introducir.

        //Aquí metemos un boolean para definir si lo hemos desbloqueado

        boolean desbloqueo = false; //false= bloqueado, true = desbloqueado

        /* OJO! estamos dando por hecho que el usuario solo puede introducir números.*/

        //Scanner
        Scanner key = new Scanner(System.in);

        /*
        * Qué tenemos que hacer:
        * 1. Generar el número pin en el MAIN usando la función generaPin.
        * 2. Pedir al usuario que introduzca un pin para comparar, recondandole que el pin es de 4 dígitos de 0 a 9.
        * 3. Controlar con un bucle while el número de intentos del usuario.
        * 4. Si es correcto, devolver "login correcto".
        * 5. Si es incorrecto, devolver "llamando a la policia".
        * */

        //Generamos el pin
        pinSecreto = generaPin();

        //Pedimos al usuario que introduzca un pin
        System.out.print("Encendido del movil. ");
        do {    //Haz...
            System.out.println("Tienes " + intentos + " intentos.");
            System.out.print("Introduce el pin: ");
            pin = key.nextLine();

            if (pin.length() > 4) {
                System.out.println("Pin demasiado largo, recuerda 4 dígitos.");

            } else if (pin.length() < 4) {
                System.out.println("Pin demasiado corto, recuerda 4 dígitos.");

            }

            if (pin.equals(pinSecreto)) { //Si pin es igual a pinSecreto
                desbloqueo = true;
                break;  //Para salir del bucle

            }

            //Decrementamos el valor de intentos, uno menos
            intentos--;

        } while (intentos != 0); //Mientras que... intentos sea diferente de 0

        //Devolver al usuario si se ha desbloqueado o no
        if (desbloqueo) {   //Esto es lo mismo que poner if (desbloqueo == true)
            System.out.println("Login correcto.");

        } else {
            System.out.println("Llamando a la policia");
        }

        /* ---- AQUI VAMOS A COMPROBAR EL PIN REAL ---- Esto es solo para comprobar*/
        System.out.println("El pin es: " + pinSecreto); //Recordad que esto no tiene sentido, es solo para comprobar


        //Cerramos el Scanner
        key.close();

        //Finalizamos el programa
        System.out.println("FIN DE PROGRAMA.");

    }
    //Función para generar el pin usando la clase RANDOM
    public static String generaPin() {
        //Creamos un Random
        Random al = new Random();

        //Creamos variables temporales
        int num;
        String pin = "";

        //Hacemos un bucle for para generar 4 números random.
        for (int i = 1; i <= 4; i++) {  //Para...i = 1 (que se incrementa en 1), donde i es menor o igual que 4
            //Esta condición significa que se va a repetir el bucle hasta que i (que aumenta de 1 en 1) llegue al mismo valor que 4, osea habrá 4 repeticiones.
            //Haz...

            //Generamos un número aletorio del 0 al 9
            num = al.nextInt(10);

            //Guardamos el número en la variable String pin
            pin = pin + num;

        }
        //Devolvemos el pin
        return pin;
    }

}
