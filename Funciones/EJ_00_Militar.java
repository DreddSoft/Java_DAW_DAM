package Funciones;

import java.util.Scanner;

/**
 * Ejercicios de clase - Funciones: Programa militar.
 *
 * @author DreddSoft
 * @version 1.0
 * @since 2023-10-25
 */
/*
 * Ejercicio MILITAR:
 * Un grupo de inteligencia militar desea codificar los mensajes secretos de tal forma que no puedan ser interpretados con una
 * lectura directa, para lo cual han establecido las siguientes reglas.
 * - Todo mensaje debe tener sus letras mayúsuculas.
 * - Reemplazar cada letra por la que sigue según abecedario, excepto Z que  se deberá reemplazar con la letra A.
 * - Reemplazar cada dígito encontrado por el siguiente numero excepto el 9 que  deberá ser reemplazado por el 0.
 * - Los espacios en blanco se reemplazan por la letra Ç.
 * - No se reemplazarán el resto de carácteres.
 * Debe tener al menos las funciones: string leerTexto();
 * - string textoMayuscula(String cadena)
 * - string reemplazarLetraSiguiente(String cadena )
 * - string reemplazarNumeroSiguiente(String cadena)
 * - string reemplazarEspaciosBlanco(String cadena)
 * - string reemplazarLetraAnterior(String cadena )
 * - string reemplazarNumeroAnterior(String cadena)
 * - string ponerEspacios en blaco(String cadena)
 *
 * Crear el algorítmo que decodifique el mensaje
 * Crear el algoritmo que codifique el mensaje
 * Crea un menú que pida codificar o decodificar el mensaje.
 */
public class EJ_00_Militar {

    public static void main(String[] args) {

        /* ---- MAIN PROGRAM ---- */

        String texto = leerTexto();

        String modif = textoMayuscula(texto);
        System.out.println("El texto en mayúscula es: " + modif);

        /*modif = reemplazarLetraSiguiente(modif);
        System.out.println("El texto tras la primera modificación es: " + modif);*/

        modif = reemplazarLetraSiguiente2(modif);
        System.out.println("El texto tras la segunda modificación es: " + modif);

        modif = reemplazarNumeroSiguiente(modif);
        System.out.println("El texto tras reemplazar los números es. " + modif);

        /*modif = reemplazarNumeroSiguiente2(modif);
        System.out.println("El texto tras reemplazar los números 2 veces es: " + modif);*/

        modif = reemplazarEspaciosBlanco(modif);
        System.out.println("El texto con los espacios cambiados es: " + modif);

        modif = reemplazarLetraAnterior(modif);
        System.out.println("El texto reemplazando la letra anterior es: " + modif);

        modif = reemplazarNumeroAnterior(modif);
        System.out.println("El texto reemplazando el número anterior es: " + modif);

        modif = ponerEspaciosBlanco(modif);
        System.out.println("El texto poniendo los espacios en blanco es: " + modif);

        System.out.println("Resumido queda en: ");
        System.out.println("Codificar el texto " + texto);
        modif = codificarMensaje(texto);
        System.out.println("Mensaje codificado: " + modif);

        modif = descodificarMensaje(modif);
        System.out.println("Mensaje descodificado: " + modif);


    }

    // 1. Crear función String leerTexto();
    public static String leerTexto() {
        //El texto - declarado e inicilizado vacío.
        String text = "";
        //Scanner
        Scanner key = new Scanner(System.in);

        //Solicitamos al usuario que introduzca por teclado el texto
        System.out.print("Introduce el texto: ");
        text = key.nextLine();

        //Mostramos el texto por consola
        System.out.println("Tu texto es: " + text);

        //Devolvemos el texto como String para que se guarde en una variable en el main
        return text;
    }

    // 2. Crear función textoMayuscula (String cadena) | Convertir el texto a mayúscula
    public static String textoMayuscula(String temp) {
        //Declaramos e inicializamos vacia un String auxiliar para guardar y devolver el resultado (el texto en mayuscula).
        String aux = "";

        //En esta función vamos a usar un método de la clase String
        aux = temp.toUpperCase();   //toUpperCase() convierte el texto a mayúscula

        //Devolvemos el string ya en mayúscula
        return aux;

    }

    // 3. Crear función reemplazarLetraSiguiente (String cadena) | Cambiar las letras del texto por la siguiente letra
    public static String reemplazarLetraSiguiente(String temp) {
        //Declaramos e inicializamos vacia un String auxiliar donde guardaremos el texto con las letras cambiadas
        String aux = "";

        //Bucle for para recorrer el largo de la cadena temp
        for (int i = 0; i < temp.length(); i++) {
            //Declaramos un char
            char c = temp.charAt(i);

            // Primero comprobamos que se encuentre entre los caracteres del abcedario
            // Se entiende que trabajamos el texto en mayúsculas, porque lo hemos convertido a mayúscula
            if (c >= 'A' || c <= 'Z') { //Primer condicional
                // Condicional por si el caracter es Z, que vuelva a empezar por A
                if (c == 'Z') { //Segundo condicional
                    c = 'A';
                } else if (c == ' ') {
                    c = c;
                } else {
                    c = c;
                }
            } else {
                c = c;
            }
            aux += c;
        }

        //Método para eliminar los espacios.
        aux = aux.trim();
        return aux;
    }

    // 3.1 Crear función reemplazarLetraSiguiente2 - segunda forma de como hacerlo
    public static String reemplazarLetraSiguiente2(String temp) {
        //Declaramos char c para guardar todos los caracteres del texto
        char c;
        //Declaramos un string para guardar el texto resultado
        String aux = "";

        for (int i = 0; i < temp.length(); i++) {
            //Recorremos el texto temp y guardamos los caracteres con el metodo charAt
            c = temp.charAt(i);
            //Comprobamos si es una letra
            if (Character.isLetter(c)) {
                if (c == 'Z') { //Condicional anidado
                    c = 'A';
                } else {
                    c += 1;
                }

            }

            aux += c;
        }
        return aux;

    }

    // 4. Crear función reemplazarNumeroSiguiente (String cadena) | Función a la cual le introducimos una cadena con numeros
    // reconoce los números y los cambia por el siguiente.
    public static String reemplazarNumeroSiguiente(String temp) {
        // Declaramos un char
        char c;
        //Declaramos un String auxiliar para guardar el resultado
        String aux = "";

        //Primero recorremos el largo del texto temp, para ello usamos un for
        for (int i = 0; i < temp.length(); i++) {
            c = temp.charAt(i); //Guardamos en la variable local 'c' cada caracter del texto

            // Comprobamos si es un digito: Hay dos formas
            // Forma 1: Usando el método de la clase Character .isDigit()
            if (Character.isDigit(c)) { //Esto nos evalúa si el caracter c es un número

                //Dentro de este condicional tenemos que evaluar si c es 9, para darle valor 0
                if (c == '9') {
                    c = '0';    //Volvemos a reestablecer el valor a 0

                } else {    //Si no es 9 (está entre 0 y 8), sumamos 1

                    c += 1;
                }

            }

            aux += c;
        }
        return aux;
    }

    // 4.2 Crear función reemplazarNumeroSiguiente sin usar métodos API Java.
    public static String reemplazarNumeroSiguiente2(String temp) {
        //String para guardar info
        String aux = "";
        //Char para guardar los caracteres del texto
        char c;

        //For para recorrer todas las posiciones del texto temp
        for (int i = 0; i < temp.length(); i++) {
            //Guardamos cada caracter de temp en char c
            c = temp.charAt(i);

            //Condicional para evaluar si es un número (isDigit).
            if (c == ' ') {
                c = c;
            } else if (c >= 0 || c <= 8) { //Sí...c es mayor o igual que 0 o menor o igual que 8
                //Haz...
                c += 1;
            } else if (c == 9) {    //Sí...c es igual a 9
                //Haz...
                c = 0;  //Si es igual a 9, le damos valor 0.
            } else {
                c = c;
            }

            //Guardamos los valores en el String aux
            aux += c;

        }

        return aux;
    }

    // 5. Crear función reemplazarEspaciosBlanco() - Que cambiará los espacios en blacon por _
    public static String reemplazarEspaciosBlanco(String temp) {
        //Declaramos un String para guardar el resultado
        String aux = "";
        //Declaramos un char para guardar los carácteres del texto que introducimos
        char c;

        //Bucle for para recorrer todos los caracteres del texto que introducimos
        for (int i = 0; i < temp.length(); i++) {
            c = temp.charAt(i);
            if (c == ' ') { //sí...c es igual a espacio en blanco.
                //Haz...
                c = '_';
            } else {    //Si no...c se guarda con el mismo valor.
                c = c;
            }
            //Guardamos el caracter c dentro del String aux
            aux = aux + c;
        }
        //Devolvemos el String aux como resultado
        return aux;
    }

    // 6. Crear función reemplazarLetraAnterior() - pero sólo vamos a hacer 1 usando métodos de la API
    //Para hacerlo manual teneis la función reemplazarLetraSiguiente, es igual pero - 1;
    public static String reemplazarLetraAnterior(String temp) {
        //String para guardar el resultado
        String aux = "";
        //Char para guardar cada caracter del texto que introducimos
        char c;

        //Bucle for para recorrer todos los caracteres del texto temp
        for (int i = 0; i < temp.length(); i++) {
            //Damos a c el valor de cada caracter de temp
            c = temp.charAt(i);
            //Condicional para evaluar si es una letra
            if (Character.isLetter(c)) {
                if (c == 'a') {
                    c = 'z';
                } else {
                    c -= 1;
                }
            }
            //Guardamos el caracter dentro del string aux
            aux += c;
        }
        //Devolvemos el String aux como resultado
        return aux;
    }

    // 7. Crear función reemplazarNumeroAnterior() - sólo hacemos usando método de API de JAva.
    public static String reemplazarNumeroAnterior(String temp) {
        //String para guardar el resultado
        String aux = "";
        //Char para usar los caracteres
        char c;

        //Bucle for para recorrer todas las posiciones del texto temp y guardar los caracteres en char c
        for (int i = 0; i < temp.length(); i++) {
            c = temp.charAt(i);
            //Condicional para saber si es un número
            if (Character.isDigit(c)) { //Sí... c. es un dígito (número).
                if (c == '0') { //Si...c es igual a 9
                    c = '9';  //Le damos valor 0.
                } else {    //Si no... (c está entre 0 y 8)
                    c -= 1; //le damos valor c - 1;
                }
            }
            aux += c;   //Guardamos cada c dentro del String aux
        }
        //Devolvemos String aux como resultado
        return aux;
    }

    // 8. Crear función ponerEspaciosBlanco()
    public static String ponerEspaciosBlanco (String temp) {
        String aux = "";
        char c;

        for (int i = 0; i < temp.length(); i++) {
            c = temp.charAt(i);
            if (c == '_') {
                c = ' ';
            } else {
                c = c;
            }
            aux += c;
        }
        return aux;
    }

    // 9. Crear función codificarMensaje (String temp)
    public static String codificarMensaje (String temp) {
        String textoModificado = "";
        textoModificado = textoMayuscula(temp);
        textoModificado = reemplazarLetraSiguiente2(textoModificado);
        textoModificado = reemplazarNumeroSiguiente(textoModificado);
        textoModificado = reemplazarEspaciosBlanco(textoModificado);

        return textoModificado;
    }
    //10. Crear función descodificarMensaje (String temp)
    public static String descodificarMensaje (String temp) {
        String textoModificado = "";
        textoModificado = ponerEspaciosBlanco(temp);
        textoModificado = reemplazarNumeroAnterior(textoModificado);
        textoModificado = reemplazarLetraAnterior(textoModificado);

        return textoModificado;
    }

}
