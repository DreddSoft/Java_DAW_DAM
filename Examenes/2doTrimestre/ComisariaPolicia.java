package Ex2Trim_Programacion;

import java.util.Arrays;

public class ComisariaPolicia {

    private Policia[] cuerpo;

    public ComisariaPolicia() {
        this.cuerpo = new Policia[0];
    }
    public Policia[] getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(Policia[] cuerpo) {
        this.cuerpo = cuerpo;
    }

    // Funciones internas
    // Función para incrementar Array
    private Policia[] incrementarArray(Policia[] base) {

        // Usamos Arrays.copyOf
        return Arrays.copyOf(base, base.length + 1);
    }

    // Funciones propias
    // insertarPolicia(Policia p) -> introduce un policia en el Array
    public void insertarPolicia(Policia p) {

        // Incrementar Array
        this.cuerpo = incrementarArray(cuerpo);

        // Introducimos en la última posición
        cuerpo[cuerpo.length - 1] = p;

    }

    // insertarMultaPolicia(String codigo, Multa m)
    public void insertarMultaPolicia(String codigo, Multa m) throws NoCumpleRequisitos {

        // Buscamos al policía por código
        Policia p = encontrarPorCodigo(codigo);

        // Si el policia es null, no hay policia en el cuerpo
        if (p == null) throw new NoCumpleRequisitos("No existe ningún policía con ese código.");

        // Comprobamos si el policía es un PoliciaTransito
        // Introducimos la multa
        if (p instanceof PoliciaTransito) ((PoliciaTransito) p).introducirMulta(m);

            // Si no, no puede poner multa porque es Jefe
        else throw new NoCumpleRequisitos("El policia no es policía de tránsito. No puede poner multas.");

    }

    // Método encontrarPorCodigo(String codigo)
    public Policia encontrarPorCodigo(String codigo) {

        // Recorremos con un bucle for el array de policias
        for (int i = 0; i < cuerpo.length; i++) {

            // Si el código coincide retornamos el policia
            if (codigo.equalsIgnoreCase(cuerpo[i].getCod())) return cuerpo[i];
        }

        // Si no se encontrara el código, el policía no existe
        return null;
    }

    public String toStringPoliciasYMultasOrdenadoPorCodigo() {

        // Ordenamos el Array, esto lo hará en base al compareTo definido en la clase policía
        Arrays.sort(cuerpo);

        // String resultado
        String resultado = "";

        // Bucle for para recorrer el Array
        for (int i = 0; i < cuerpo.length; i++) {

            resultado += cuerpo[i].toString() + "\n";

        }

        // Retornamos el resultado
        return resultado;
    }


}
