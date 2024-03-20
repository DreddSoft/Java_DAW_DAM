package Ex2Trim_Programacion;

public class JefePolicia extends Policia {

    // No tiene atributos propios

    // Constructor
    public JefePolicia(String nombre) {
        super(nombre);
        super.setSueldo(super.getSueldo() + 1000);
        super.setCod("J-" + super.getCod());
    }

    // toString


    @Override
    public String toString() {
        return super.toString() +
                "\nTipo de policía: Jefe de Policía.";
    }
}
