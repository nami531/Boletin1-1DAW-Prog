package ejerciciosjava.ej8;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la clase IFEEVI
        IFEVI ifevi = new IFEVI();
        
        // Obtener la capacidad de la sala principal
        System.out.println("Capacidad de la sala principal: " + ifevi.getSalaPpal());
        
        // Obtener la capacidad de la sala de compra-venta
        System.out.println("Capacidad de la sala de compra-venta: " + ifevi.getCompraVenta());
        
        // Obtener la capacidad de todas las salas
        int[] capacidadesSalas = ifevi.getSalas();
        System.out.println("Capacidad de todas las salas:");
        for (int i = 0; i < capacidadesSalas.length; i++) {
            System.out.println("Sala " + i + ": " + capacidadesSalas[i]);
        }
        
        // Realizar una venta de entrada en la sala principal
        ifevi.venderEntrada(0);
        System.out.println("\nSe ha vendido una entrada en la sala principal.");
        
        // Mostrar la nueva capacidad de la sala principal
        System.out.println("Nueva capacidad de la sala principal: " + ifevi.getSalaPpal());
    }
}