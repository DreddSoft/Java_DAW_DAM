package Ex2Trim_Programacion;

public class ValorNegativo extends Exception {

    private String msj;

    public ValorNegativo(String msj) {
        this.msj = msj;
    }

    @Override
    public String getMessage() {
        return this.msj;
    }
}
