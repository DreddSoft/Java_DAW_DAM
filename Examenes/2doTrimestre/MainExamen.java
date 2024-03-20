package Ex2Trim_Programacion;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Scanner;

public class MainExamen {

    public static void main(String[] args) {

        // Scanner
        Scanner k = new Scanner(System.in);

        // 8.1 Crea una comisario de policía y añade dos policías de transito y dos jefes de policía
        ComisariaPolicia brooklyn99 = new ComisariaPolicia();

        // Insertamos dos Jefes de policia
        brooklyn99.insertarPolicia(new JefePolicia("Pedro"));
        brooklyn99.insertarPolicia(new JefePolicia("Manuel"));

        // Insertamos dos Policías de transito
        brooklyn99.insertarPolicia(new PoliciaTransito("Javier"));
        brooklyn99.insertarPolicia(new PoliciaTransito("David"));

        // MENU
        menu(k, brooklyn99);


        // FIN DE PROGRAMA
        k.close();
        System.out.println("FIN DE PROGRAMA.");






    }
    // Función menu
    public static void menu(Scanner k, ComisariaPolicia comisaria) {

        // Variable para controlar la salida del menu
        boolean salir = false;

        // Separador
        String separador = "==============================================";

        // Bucle para controlar
        do {

            try {

                char op = menuPrincipal(k);

                switch (op) {
                    case 'a' -> {
                        introducirUnaMulta(comisaria);
                    }
                    case 'b' -> {
                        mostrarInformacion(comisaria);
                    }
                    case 'c' -> {
                        actualizarSueldoPoliciaTransito(comisaria);
                    }
                    case 'd' -> {
                        System.out.println("SALIR DEL MENU.");
                        salir = true;
                    }
                    default -> {
                        System.out.println("Opción elegida incorrecta.");
                    }
                }

            } catch (ValorNegativo vn) {
                System.out.println("Error: " + vn.getMessage());
            } catch (NoCumpleRequisitos nc) {
                System.out.println("Error: " + nc.getMessage());
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                // Limpiar buffer del Scanner
                k.nextLine();
            }

        } while (!salir);

    }
    // Elección en menu
    public static char menuPrincipal (Scanner k) throws NoCumpleRequisitos {

        // Separador
        String separador = "==============================================";

        System.out.printf(separador +
                "\n==================== MENU ====================" +
                "\n" + separador + "\n");

        System.out.println("Opciones del menu:" +
                "\na) Introducir una multa." +
                "\nb) Mostrar información." +
                "\nc) Actualizar el sueldo de los policías de tránsito." +
                "\nd) Salir.");

        System.out.print("Introduce una opción: ");
        String temp = k.next();

        // Comprobamos que la opción introducida no sea más larga, si no lanzamos error.
        if (temp.length() > 1) throw new NoCumpleRequisitos("Opción introducida en el menú demasiado larga.");
        char op = temp.charAt(0);

        // Devolvemos en caracter
        return op;

    }

    // a) Opción a Introducir una multa
    public static void introducirUnaMulta(ComisariaPolicia comisaria) throws DateTimeException, ValorNegativo, NoCumpleRequisitos, NumberFormatException {

        // Scanner
        Scanner k = new Scanner(System.in);

        // Formato de fecha
        DateTimeFormatter spa = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");

        // Primero construimos la fecha


        // Construimos la fecha
        LocalDateTime fecha = introduceFechaYHora();

        if (fecha.isBefore(LocalDateTime.now())) throw new DateTimeException("Fecha anterior a la de hoy.");

        // Pedimos el importe
        System.out.print("Introduce el importe de la multa: ");
        double importe = k.nextDouble();

        // Solicitamos el tipo de la multa.
        System.out.print("Elige una de las opciones la multa (Recuerda, por defecto es velocidad)." +
                "\n1) VELOCIDAD." +
                "\n2) APARCAMIENTO." +
                "\n3) SEMAFORO" +
                "\nIntroduce una opción: ");
        TipoMulta tipo;
        int op = k.nextInt();
        switch (op) {
            case 1 -> {
                tipo = TipoMulta.VELOCIDAD;
            }
            case 2 -> {
                tipo = TipoMulta.APARCAMIENTO;
            }
            case 3 -> {
                tipo = TipoMulta.SEMAFORO;
            }
            default -> {
                tipo = TipoMulta.VELOCIDAD;
            }

        }

        // Creamos el objeto multa
        Multa m = new Multa(importe, fecha, tipo);

        // Mostramos la información de la policía para ver los códigos.
        mostrarInformacion(comisaria);


        // Pedimos un código de policía:
        System.out.print("Codigo de policia de tránsito formato: T-XXXXX." +
                "\nIntroduce un código: ");
        String codigo = k.next();

        // Usamos método insertarMultaPolicia
        comisaria.insertarMultaPolicia(codigo, m);

        k.close();

    }

    // b) Mostrar información.
    public static void mostrarInformacion(ComisariaPolicia comisaria) {

        // usamos la función toStringPoliciasYMultasOrdenadoPorCodigo
        String muestra = comisaria.toStringPoliciasYMultasOrdenadoPorCodigo();
        System.out.println(muestra);

    }

    // c) actualizar el sueldo de los policias de tránsito.
    public static void actualizarSueldoPoliciaTransito(ComisariaPolicia comisaria) {

        // Capturamos en una variable el array de policias de la comisaria
        Policia[] elCuerpo = comisaria.getCuerpo();

        // Recorremos el Array
        for (int i = 0; i < elCuerpo.length; i++) {

            // Condicional comprobamos que el policía sea de transito
            if (elCuerpo[i] instanceof PoliciaTransito) {

                // Actualizamos el salario
                ((PoliciaTransito) elCuerpo[i]).actualizarSueldo();
            }
        }

        System.out.println("Sueldos actualizados.");
    }


    // Función introducir fechayHora
    public static LocalDateTime introduceFechaYHora() {

        // Scanner
        Scanner k = new Scanner(System.in);

        // Usamos enteros
        System.out.println("Introduce un día: ");
        int d = k.nextInt();

        System.out.println("Introduce el mes: ");
        int M = k.nextInt();

        System.out.println("Introduce el año: ");
        int y = k.nextInt();

        System.out.println("Introduce la hora: ");
        int h = k.nextInt();

        System.out.println("Introduce los minutos: ");
        int m = k.nextInt();

        System.out.println("Introduce los segundos: ");
        int s = k.nextInt();

        // Construimos la fecha
        return LocalDateTime.of(y, M, d, h, m, s);

    }

}
