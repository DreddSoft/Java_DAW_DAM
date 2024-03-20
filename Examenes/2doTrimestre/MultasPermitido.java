package Ex2Trim_Programacion;

import java.time.DayOfWeek;

public interface MultasPermitido {

    void introducirMulta(Multa m);
    int numeroMultasTotal();
    int numeroMultas(DayOfWeek dia);
    int numeroMultas(String tipomulta);

}
