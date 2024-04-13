package ejerciciosjava.ej9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Crear un objeto Data para manejar la fecha
        Data fecha = new Data();
        
        // Mostrar el menú
        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Introducir nueva fecha");
            System.out.println("2. Adelantar fecha");
            System.out.println("3. Mostrar fecha actual");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            
            // Procesar la opción seleccionada
            switch (opcion) {
                case 1:
                    System.out.print("Introduce el día: ");
                    int dia = scanner.nextInt();
                    System.out.print("Introduce el mes: ");
                    int mes = scanner.nextInt();
                    System.out.print("Introduce el año: ");
                    int anho = scanner.nextInt();
                    fecha.reiniciar(dia, mes, anho);
                    System.out.println("Fecha actualizada.");
                case 2:
                    fecha.adelantar();
                    System.out.println("Fecha adelantada un día.");
                case 3:
                    fecha.imprimir();
                case 4:
                    System.out.println("Saliendo del programa.");
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del menú.");
            }
        } while (opcion != 4);
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
}
