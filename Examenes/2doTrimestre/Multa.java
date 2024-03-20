package Ex2Trim_Programacion;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Multa {

    // Atributos
    private String cod;
    private double importe;
    private LocalDateTime fechayhora;
    private TipoMulta tipo;
    private static int numero = 100;

    // Constructor
    public Multa(double importe, LocalDateTime fechayhora, TipoMulta tipo) throws ValorNegativo {
        if (importe < 0) throw new ValorNegativo("El importe nunca puede ser negativo");
        this.importe = importe;
        this.fechayhora = fechayhora;
        this.tipo = tipo;
        this.numero += 1;
        this.cod = "M-" + numero;
    }
    // Getters y Setters
    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public LocalDateTime getFechayhora() {
        return fechayhora;
    }

    public void setFechayhora(LocalDateTime fechayhora) {
        this.fechayhora = fechayhora;
    }

    public TipoMulta getTipo() {
        return tipo;
    }

    public void setTipo(TipoMulta tipo) {
        this.tipo = tipo;
    }

    public static int getNumero() {
        return numero;
    }

    public static void setNumero(int numero) {
        Multa.numero = numero;
    }

    // toString
    @Override
    public String toString() {

        DateTimeFormatter spa = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");

        return "Multa de tipo " + this.tipo.toString() +
                "\nCon código: " + this.cod +
                "\nImporte: " + this.importe + " euros." +
                "\nFecha y hora: " + this.fechayhora.format(spa);
    }
}
