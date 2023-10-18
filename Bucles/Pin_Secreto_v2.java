package Bucles.Ejercicios.DeClase;

import java.util.Scanner;

/**
 * Ejercicios de clase - Bucles: Pin secreto
 *
 * @version 2.0
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
public class Pin_Secreto_v2 {
    public static void main(String[] args) {

        /* ---- VARIABLES DEL MAIN ---- */
        String pinSecreto;  //Declaramos pero NO inicializamos. Este será el pin a averiguar.
        String pin = "";    //Declaramos e inicializamos vacío. Este será el pin que introduzca el usuario.

        int intentos = 5;   //Número de intentos que tiene el usuario para averiguar el pin

        boolean desbloqueo = false; //false = bloqueado, true = desbloqueado.

        //Scanner
        Scanner key = new Scanner(System.in);

        /* OJO! estamos dando por hecho que el usuario solo puede introducir números.*/
        /*
         * Qué tenemos que hacer:
         * 1. Generar el número pin en el MAIN usando la función generaPin.
         * 2. Pedir al usuario que introduzca un pin para comparar, recondandole que el pin es de 4 dígitos de 0 a 9.
         * 3. Controlar con un bucle while el número de intentos del usuario.
         * 4. Si es correcto, devolver "login correcto".
         * 5. Si es incorrecto, devolver "llamando a la policia".
         * */

        //Generar el pinSecreto
        pinSecreto = generaPin();

        //2. Pedir al usuario que introduzca un pin para comparar, recordandole que el pin es de 4 dígitos.
        //Lo vamos a hacer con while
        System.out.println("Encendido del movil.");
        System.out.print("Introduce el pin: ");
        pin = key.nextLine();
        intentos--;

        //3. Controlar con un bucle while el número de intentos del usuario.
        while (intentos > 0) {  //Mientras...que intentos sea mayor que 0
            //Haz...
            if (pin.length() > 4) { //Si... el pin tiene más de 4 dígitos
                System.out.println("Ojo, demasiado largo. Es un número de 4 dígitos.");

            } else if (pin.length() < 4) {  //Sí... el pin tiene menos de 4 dígitos.
                System.out.println("Ojo, demasiado corto. Es un número de 4 dígitos.");

            }

            if (pin.equals(pinSecreto)) {   //Sí...pin es igual a pinSecreto
                desbloqueo = true;  //Recuerda desbloque = true significa que lo hemos desbloqueado
                break;              //Break, corta el flujo del bucle y nos saca.

            }

            //volvemos a pedir el pin
            System.out.print("Error, introduce el pin: ");
            pin = key.nextLine();

            //Decrementamos el contador
            intentos--;

        }

        //4. Si es correcto, devolver "login correcto".
        if (desbloqueo == true) {   //Esto no es optimo, lo dejo para que se vea un ejemplo diferente.
            System.out.println("login correcto.");

        } else {    //5. Si es incorrecto, devolver "llamando a la policia".
            System.out.println("llamando a la policia.");
        }

        /* ---- AQUI VAMOS A COMPROBAR EL PIN REAL ---- Esto es solo para comprobar*/
        System.out.println("El pin es: " + pinSecreto); //Recordad que esto no tiene sentido, es solo para comprobar

        //Cerramos el Scanner
        key.close();

        //Finalizamos el programa
        System.out.println("FIN DE PROGRAMA.");


    }

    //Función para crear el pin usando la clase Math.Random
    public static String generaPin() {
        //Variables temporales
        int num;
        String pin = "";

        //Bucle for para generar los 4 números aleatorios
        for (int i = 1; i <= 4; i++) {  //Para...i = 1 (que se incrementa en 1), donde i es menor o igual que 4
            //Esta condición significa que se va a repetir el bucle hasta que i (que aumenta de 1 en 1) llegue al mismo valor que 4, osea habrá 4 repeticiones.
            //Haz...

            //Generamos el número aleatoro del 0 al 9
            num = (int) ((Math.random() * 10) - 1);
            /* ¿Por qué (int)?, ¿Por qué * 10?, ¿Por qué -1?
            * 1. Porque el método random() de la clase Math devuelve un double y hay que Castearlo a int
            * 2. Porque ese método devuelve un número decimal con valor comprendido entre 0.0 y 1.0
            * 3. Al multiplicar por 10 generamos un número con decimales comprendido entre 0 y 10, pero puede ser 10 y
            * como no queremos eso, pues restamos 1 para que el valor máximo sea 9
            * EN RESUMEN: Hemos generado un número con decimales cuyo valor esta comprendido entre 0 y 9, y
            * al hacerle casting a (int) lo convertimos en un entero y pierde los decimales.
            * */

            //Almacenamos en la variable String pin el número
            pin = pin + num;
        }
        //Devolvemos el pin de 4 números
        return pin;
    }
}
