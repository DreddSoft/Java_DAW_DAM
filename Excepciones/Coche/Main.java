package Clases.deClase.Coche;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Inicia programa.");

        // Declaramos el objeto coche null
        Coche peugeot = null;

        // Try catch
        try {

            peugeot = crearCoche(peugeot);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        }

        System.out.println(peugeot.toString());



        System.out.println("FIN PROGRAMA.");

    }

    // Métodos para leer
    public static int leerInt () {
        Scanner key = new Scanner(System.in);

        System.out.print("Introduce un número (int): ");
        return key.nextInt();
    }
    public static float leerFloat () {
        Scanner k = new Scanner(System.in);
        System.out.print("Introduce un número (float): ");
        return k.nextFloat();
    }
    public static String leerString () {
        Scanner k = new Scanner(System.in);
        System.out.print("Introduce un texto: ");
        return k.nextLine();
    }

    // Métodos para leerCosas del coche
    public static int leerRueda(Coche coche) {

        coche.setRuedas(leerInt());

        return coche.getRuedas();
    }
    public static String leerMatricula (Coche coche) {
        coche.setMatricula(leerString());

        return coche.getMatricula();
    }
    public static String leerColor (Coche coche) {
        coche.setColor(leerString());

        return coche.getColor();
    }
    public static float leerVelocidad (Coche coche) {
        coche.setVelocidad(leerFloat());

        return coche.getVelocidad();
    }

    // Método crear objeto Coche
    public static Coche crearCoche (Coche coche) throws Exception {

        coche = new Coche(leerRueda(coche), leerMatricula(coche), leerColor(coche), leerVelocidad(coche));

        return coche;
    }



}
