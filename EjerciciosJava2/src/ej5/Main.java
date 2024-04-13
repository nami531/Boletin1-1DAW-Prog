package ej5;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Circulo
        Circulo circulo = new Circulo(5.0f);
        
        // Mostrar información del círculo
        System.out.println("Información del círculo:");
        System.out.println("Radio: " + circulo.getRadio());
        System.out.println("Circunferencia: " + circulo.calcularCircunferencia());
        System.out.println("Superficie: " + circulo.calcularSuperficie());
        System.out.println("Diámetro: " + circulo.calcularDiametro());
    }
}
