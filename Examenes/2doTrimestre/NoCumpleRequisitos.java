package Ex2Trim_Programacion;

public class NoCumpleRequisitos extends Exception {

    private String msj;

    public NoCumpleRequisitos(String msj) {
        this.msj = msj;
    }

    @Override
    public String getMessage() {
        return this.msj;
    }
}
