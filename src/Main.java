import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean validacionSueldo = false;
        boolean validacionWhile = true;
        UI ui = new UI();
        Scanner sc = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();


        while (validacionWhile) {
            ui.mostrarMensaje();
            int opcion = sc.nextInt();

            if(opcion == 0){
                break;

            } else if(opcion == 1){
               String[] datos= ui.opcion1();
               clientes.add(new Cliente(datos[0], datos[1], 200));

            } else if(opcion == 2){
                ui.opcion2(clientes);
                continue;

            } else if(opcion == 3){
                boolean validacionNombre = ui.opcion3(clientes);

                if (validacionNombre == false){
                    System.out.println("Has introducido un nombre equivocado, por favor verifica lo que hayas puesto.");
                }
                continue;

            } else if(opcion == 4){
                boolean validacionNombre = ui.opcion4(clientes);

                if (validacionNombre == false){
                    System.out.println("Has introducido un nombre equivocado, por favor verifica lo que hayas puesto.");
                }
                continue;


            } else {
                System.out.println("Introduciste un valor incorrecto, por favor, verifica lo que has introducido.");
                continue;
            }
        }
    }
}