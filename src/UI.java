import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class UI {

    Scanner sc = new Scanner(System.in);
    public void mostrarMensaje(){
        System.out.println("Bienvenido al Banco Nacional (BN), selecciona la opción que deseas ejecutar.");
        System.out.println("1. Crear usuario\n2. Ver usuarios (todos)\n3. Ver usuario (uno)\n4. Asignar saldo\n Presione 0 para salir. ");
    }

    public String[] opcion1(){
        System.out.println("Introduce el nombre y apellido que deseas asignarle a la persona: ");
        String nombre = sc.nextLine();

        System.out.println("Introduce el número de cuenta: ");
        String n_cuenta = sc.nextLine();

        System.out.println("Usuario con nombre " + nombre + " y cuenta " + n_cuenta + " creado correctamente.\n");

        String[] datos = new String[2];
        datos[0] = nombre;
        datos[1] = n_cuenta;

        return datos;
    }

    public void opcion2(ArrayList<Cliente> clientes){
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNombre() + " " + cliente.getN_cuenta() + " " + cliente.getSaldo() + "\n");
        }
        System.out.println("\n");
    }

    public boolean opcion3(ArrayList<Cliente> clientes) {
        boolean validacionNombre = false;
        System.out.println("Introduce el nombre de la persona que quieres obtener los datos: ");
        String nombreUnico = sc.nextLine();

        for (Cliente cliente : clientes) {
            if (cliente.getNombre().toUpperCase().equals(nombreUnico.toUpperCase())) {
                System.out.println(cliente.getNombre() + " " + cliente.getN_cuenta() + " " + cliente.getSaldo() + "\n");
                validacionNombre = true;
            }
        }

        return validacionNombre;
    }

    public boolean opcion4(ArrayList<Cliente> clientes) {
        boolean validacionNombre = false;
        System.out.println("Introduce el nombre de la persona que quieres obtener los datos: ");
        String nombreUnico = sc.nextLine();

        for (Cliente cliente : clientes) {
            if (cliente.getNombre().toUpperCase().equals(nombreUnico.toUpperCase())) {
                System.out.println("Introduce 1 si quieres sumarle saldo a " + cliente.getNombre() + ", introduce 2 si quieres restarle.");
                int opcion = sc.nextInt();

                if(opcion == 1){
                    System.out.println("Introduce la cantidad que quieres sumarle al saldo: ");
                    int cantidad = sc.nextInt();

                    cliente.sumarSaldo(cantidad);

                    System.out.println("Se le ha sumado " + cantidad + " a la cuenta de " + cliente.getNombre() + ",ahora tiene " + cliente.getSaldo());
                } else if(opcion == 2){
                    System.out.println("Introduce la cantidad que quieres restarle al saldo: ");
                    int cantidad = sc.nextInt();

                    cliente.restarSaldo(cantidad);

                    System.out.println("Se le ha restado " + cantidad + "a la cuenta de " + cliente.getNombre() + ", ahora tiene " + cliente.getSaldo());
                } else {
                    System.out.println("Introduce una opción correcta por favor.");
                    break;
                }
                validacionNombre = true;
            }
        }

        return validacionNombre;
    }
}
