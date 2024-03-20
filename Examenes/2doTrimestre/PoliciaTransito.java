package Ex2Trim_Programacion;

import java.time.DayOfWeek;
import java.util.Arrays;

public class PoliciaTransito extends Policia implements MultasPermitido {

    // Tiene atributo un Array de clase Multa
    private Multa[] arrMultas = new Multa[0];

    // El constructor recibe por parámetro solo el nombre
    public PoliciaTransito(String nombre) {
        super(nombre);
        actualizarSueldo();
        super.setCod("T-" + super.getCod());
        this.arrMultas = new Multa[0];
    }

    // Getters y Setters
    public Multa[] getArrMultas() {
        return arrMultas;
    }

    public void setArrMultas(Multa[] arrMultas) {
        this.arrMultas = arrMultas;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() +
                "\nTipo de policia: Policía de Transito." +
                "\nMultas puestas: " + numeroMultasTotal();
    }

    // Métodos propios
    // Método para sacar el total de todas las multas
    public double sumaTodasMultas(Multa[] arrBase) {

        // Variable suma
        double suma = 0;

        // Recorremos el array y sumamos el precio de todas
        for (int i = 0; i < arrBase.length; i++) {

            // Cada caso de Multa
            suma += arrBase[i].getImporte();
        }

        // Retornamos el resultado
        return suma;
    }

    // Método actualizarSueldo
    public void actualizarSueldo() {

        // usamos la función para sacar el total de las multas
        double total = sumaTodasMultas(this.arrMultas);

        // Si el total es mayor o igual que 800
        if (total >= 800) {
            // Se establece el salario como el salario base + 10% de 800
            super.setSueldo(getSueldo() + ((800 / 100) * 10));
        } else {
            // Si es menor que 800
            // Se establece el salario como salario base + 10% del total
            super.setSueldo(getSueldo() + ((total / 100) * 10));
        }
    }

    // Método para incrementar el ArrayMultas
    private Multa[] incrementarArrayMultas(Multa[] arrBase) {

        // Usamos Arrays.copyOf: copia e incrementa en 1
        return Arrays.copyOf(arrBase, arrBase.length + 1);
    }


    // Métodos de la interfaz
    @Override
    public void introducirMulta(Multa m) {

        // Incrementamos Array
        this.arrMultas = incrementarArrayMultas(arrMultas);

        // Ultima posición vacía, introducimos la multa
        this.arrMultas[arrMultas.length - 1] = m;

    }

    @Override
    public int numeroMultasTotal() {

        // Con que devolvamos la longitud del Array es suficiente
        return this.arrMultas.length;

    }

    @Override
    public int numeroMultas(DayOfWeek dia) {

        // contador
        int cnt = 0;

        // Recorremos el Array
        for (int i = 0; i < arrMultas.length; i++) {

            // Condicional para comprobar que el día de la semana coincide
            if (arrMultas[i].getFechayhora().getDayOfWeek().equals(dia)) cnt++;

        }

        // Devolvemos el contador
        return cnt;
    }

    @Override
    public int numeroMultas(String tipomulta) {

        // Variable contador
        int cnt = 0;

        // Condiconal para comprobar que tipomulta coincide con alguno de los tipos
        if (tipomulta.equalsIgnoreCase(TipoMulta.VELOCIDAD.toString()) || tipomulta.equalsIgnoreCase(TipoMulta.APARCAMIENTO.toString()) || tipomulta.equalsIgnoreCase(TipoMulta.SEMAFORO.toString())) {

            // Recorremos el Array con for
            for (int i = 0; i < arrMultas.length; i++) {

                // Si el tipo coincide con el tipo de alguna de las multas, incrementamos contador
                if (arrMultas[i].getTipo().toString().equalsIgnoreCase(tipomulta)) cnt++;

            }

        } else {    // Si no coincide con ningún tipo, enviamos mensaje al usuario.
            System.out.println("El tipo de multa especificado no coincide." +
                    "\nPermitidos: Velocidad, Aparcamiento, Semaforo.");
        }

        // Retornamos el contador.
        return cnt;
    }


}
