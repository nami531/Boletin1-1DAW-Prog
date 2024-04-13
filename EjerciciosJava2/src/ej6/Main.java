package ej6;

public class Main {
    public static void main(String[] args) {
        // Crear un teléfono móvil prepago con saldo inicial de 20 euros
        MobilPrepago telefono = new MobilPrepago(123456789, 20.0f);
        
        // Mostrar saldo inicial
        System.out.println("Saldo inicial: " + telefono.consultarSaldo() + " euros");
        
        // Recargar 10 euros
        telefono.recargar(10);
        System.out.println("Recarga de 10 euros realizada. Saldo actual: " + telefono.consultarSaldo() + " euros");
        
        // Realizar una llamada de 30 segundos
        telefono.efectuarChamada(30);
        System.out.println("Llamada de 30 segundos realizada. Saldo actual: " + telefono.consultarSaldo() + " euros");
        
        // Navegar 10 MB
        telefono.navegar(10);
        System.out.println("Navegación de 10 MB realizada. Saldo actual: " + telefono.consultarSaldo() + " euros");
        
        // Intentar recargar un importe no válido (no divisible por 5)
        if (telefono.recargar(7)) {
            System.out.println("Recarga de 7 euros realizada correctamente.");
        } else {
            System.out.println("No se puede recargar un importe que no sea múltiplo de 5.");
        }
    }
}
