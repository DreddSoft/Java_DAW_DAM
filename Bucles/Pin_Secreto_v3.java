package Bucles.Ejercicios.DeClase;

import java.util.Random;
import java.util.Scanner;

/**
 * Ejercicios de clase - Bucles: Pin secreto
 *
 * @version 3.0
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
public class Pin_Secreto_v3 {
    public static void main(String[] args) {

        /* ---- VARIABLES DEL MAIN ---- */
        String pinSecreto;  //Declaramos pero NO inicializamos. Este será el pin a averiguar.
        String pin = "";    //Declaramos e inicializamos vacío. Este será el pin que introduzca el usuario.

        String valoresPermitidos = "0123456789";    //Valores permitidos

        int intentos = 5;   //Número de intentos que tiene el usuario para averiguar el pin

        boolean desbloqueo = false;     //false = bloqueado, true = desbloqueado.
        boolean contieneNumero = true;  //para comprobar si tiene números o tiene otro caracter que no sea un número

        //Scanner
        Scanner key = new Scanner(System.in);

        /* OJO! Aquí vamos a comprobar si el usuario introduce algo que no sea un número.*/
        /*
         * Qué tenemos que hacer:
         * 1. Generar el número pin en el MAIN usando la función generaPin.
         * 2. Pedir al usuario que introduzca un pin para comparar, recondandole que el pin es de 4 dígitos de 0 a 9.
         * 3. Controlar con un bucle while el número de intentos del usuario.
         * 4. Si es correcto, devolver "login correcto".
         * 5. Si es incorrecto, devolver "llamando a la policia".
         * */

        //1. Generar el número pin en el MAIN usando la función generaPin.
        pinSecreto = generaPin();

        //2. Pedir al usuario que introduzca un pin para comparar, recondandole que el pin es de 4 dígitos de 0 a 9.
        //Lo hacemos con do-while

        System.out.println("Encendido del teléfono.");

        //3. Controlar con un bucle while el número de intentos del usuario.
        do {    //Haz...
            //Pedimos que introduzca el pin
            System.out.println("Tienes " + intentos + " intentos.");
            System.out.print("Introduce el pin: ");
            pin = key.nextLine();

            contieneNumero = comprobarNumeros(pin); //Para dar valor a contieneNumero usamos la función comprobarNumeros
            //Evaluamos si ha introducido valores permitidos
            if (contieneNumero) {   //Sí...contieneNumero es igual true (osea contiene todo números).
                //Ahora evaluamos si es largo o corto
                if (pin.length() > 4) { //Sí... el largo de pin es mayor de 4
                    System.out.println("Demasiado largo, recuerda un pin de 4 dígitos.");
                } else if (pin.length() < 4) {  //Sí...el largo de pin es menor de 4
                    System.out.println("Demasiado corto, recuerda un pin de 4 dígitos.");
                }

                if (pin.equals(pinSecreto)) {   //Sí... pin es igual a pinSecreto
                    desbloqueo = true;  //Desbloqueo = true significa que lo ha desbloqueado
                    break;  //Para salir del bucle.
                }

            } else {
                System.out.println("Haz introducido valores incorrectos");

            }
            intentos--;

        } while (intentos != 0);    //Mientras... que intentos sea diferente de 0

        //4. Si es correcto, devolver "login correcto".
        //5. Si es incorrecto, devolver "llamando a la policia".
        //Pero...vamos a usar el operador ternario

        String resultado = (desbloqueo) ? "login correcto." : "llamando a la policía.";
        /* Esto del operador ternario es lo mismo que hacer
         * if (desbloqueo) {
         * resultado = "login correcto."
         * } else {
         * resultado = "llamando a la policía."
         * }
         * Pero más simplificado y además optimiza el código.
         * */
        System.out.println(resultado);
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

    //Función para comprobar si se introduce un caracter que no sea un númeor
    public static boolean comprobarNumeros(String texto) {    //Introducimos un string y nos devuelve un booleao
        boolean contieneNumeros = true;

        for (int i = 0; i < texto.length(); i++) {  //bucle for...
            char c = texto.charAt(i);   //Sacamos cada caracter del texto
            if (!(Character.isDigit(c))) {
                contieneNumeros = false;    //false porque no contiene números, es otro caracter
                break;  //Nos saca del bucle en cuanto encuentre un caracter que no sea un número
            }
        }
        //Devolvemos el boolean
        return contieneNumeros;
    }


}
