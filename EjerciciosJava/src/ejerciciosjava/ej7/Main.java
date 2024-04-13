package ejerciciosjava.ej7;

public class Main {
    public static void main(String[] args) {
        // Creamos una instancia de Numero con el valor inicial 5
        Numero num = new Numero(5);
        
        // Realizamos algunas operaciones y mostramos los resultados
        System.out.println("El número inicial es: " + num.getNumero());
        System.out.println("La suma de 3 al número es: " + num.suma(3));
        System.out.println("El doble del número es: " + num.getDobre());
        System.out.println("El triple del número es: " + num.getTriplo());
        System.out.println("El cuádruplo del número es: " + num.getCuadruplo());
        System.out.println("Factorial de " + num.getNumero() + " es: " + num.factorial());
        
        // Verificamos si el número es primo
        if (num.ePrimo()) {
            System.out.println(num.getNumero() + " es un número primo.");
        } else {
            System.out.println(num.getNumero() + " no es un número primo.");
        }
        
        // Mostramos los números primos menores que el número
        System.out.print("Números primos menores que " + num.getNumero() + ": ");
        num.primosMenores();
    }
}
