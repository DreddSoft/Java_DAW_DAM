package Clases.deClase.Coche;

import java.util.Scanner;

public class CocheMain {

    // Variables

    private int ruedas;
    private String matricula;
    private String color;
    private float velocidad;

    // Constructor


    public CocheMain() throws Exception{
        this.ruedas = leerRuedas();
        if (ruedas <= 0 || ruedas > 6) throw new Exception("Ruedas mal, valor entre 1 y 6.");
        this.matricula = leerMatricula();
        if (matricula.length() >= 8) throw new Exception("Matrícula tiene una longitud de 8 o superior.");
        this.color = leerColor();
        this.velocidad = leerVelocidad();
        if (velocidad < 0) throw new Exception("La velocidad no puede ser negativa.");
    }


    // Métodos para leer por teclado
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

    // Métodos principales de la clase
    public static int leerRuedas () {

        int ruedas;
        ruedas = leerInt();

        return ruedas;
    }

    public static String leerMatricula () {
        return leerString();
    }
    public static String leerColor () {
        return leerString();
    }
    public static float leerVelocidad () {
        return leerFloat();
    }

    @Override
    public String toString() {
        return "CocheMain{" +
                "ruedas=" + ruedas +
                ", matricula='" + matricula + '\'' +
                ", color='" + color + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }

    /* ---- MAIN ---- */
    public static void main(String[] args) {

        System.out.println("Inicia programa.");

        CocheMain coche = null;

        try {
            coche = new CocheMain();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println(coche.toString());
        }


    }


}
