package Clases.deClase.Coche;

public class Coche {

    // Variables

    private int ruedas;
    private String matricula;
    private String color;
    private float velocidad;

    // Constructor
    public Coche(int ruedas, String matricula, String color, float velocidad) throws Exception{
        this.ruedas = ruedas;
        if (ruedas < 2 || ruedas > 6) throw new Exception("El valor de ruedas tiene que estar comprendido entre 2 y 6");
        this.matricula = matricula;
        if (matricula.length() > 8)  throw new Exception("La longitud de matrícula debe ser igual o inferior a 8");
        this.color = color;
        this.velocidad = velocidad;
        if (velocidad < 0) throw new Exception("La velocidad no puede ser negativa.");
    }

    // GETTERS Y SETTERS
    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    // TO STRING

    @Override
    public String toString() {
        return "Coche{" +
                "ruedas=" + ruedas +
                ", matricula='" + matricula + '\'' +
                ", color='" + color + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}
