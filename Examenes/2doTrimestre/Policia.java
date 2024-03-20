package Ex2Trim_Programacion;

import java.util.Comparator;
import java.util.Random;

public abstract class Policia implements Comparable<Policia> {

    private String nombre;
    private double sueldo;
    private String cod;

    // Constructor
    public Policia(String nombre) {
        this.nombre = nombre;
        this.sueldo = 1750.0;
        this.cod = generarCodigo();
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    // toString
    @Override
    public String toString() {
        return "Policia de nombre " + this.nombre +
                "\nSueldo: " + this.sueldo +
                "\nCódigo: " + this.cod;
    }
    // Métodos propios
    private String generarCodigo() {

        // Random
        Random r = new Random();

        // Generamos código
        return String.format("%05d", r.nextInt(0, 99999));
    }
    // Método compareTo implementado de la interfaz comparator

    @Override
    public int compareTo(Policia o) {

        // Usando el método compareTo de la clase String, comparamos el código.
        int comparador = this.cod.compareTo(o.cod);

        // En el caso que el comparador sea 0, 2 códigos iguales, comparamos por nombre.
        if (comparador == 0) this.nombre.compareTo(o.nombre);

        // Retornamos el comparador.
        return comparador;
    }
}
