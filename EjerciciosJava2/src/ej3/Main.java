package ej3;

public class Main {
    public static void main(String[] args) {
        // Crear un rectángulo
        Rectangulo rectangulo1 = new Rectangulo(5, 10);
        
        // Mostrar información del rectángulo
        System.out.println("Información del rectángulo:");
        System.out.println("Base: " + rectangulo1.getBase());
        System.out.println("Altura: " + rectangulo1.getAltura());
        System.out.println("Área: " + rectangulo1.getArea());
        System.out.println("¿Es cuadrado? " + (rectangulo1.eCadrado() ? "Sí" : "No"));
        
        // Crear otro rectángulo
        Rectangulo rectangulo2 = new Rectangulo(7, 7);
        
        // Mostrar información del segundo rectángulo
        System.out.println("\nInformación del segundo rectángulo:");
        System.out.println("Base: " + rectangulo2.getBase());
        System.out.println("Altura: " + rectangulo2.getAltura());
        System.out.println("Área: " + rectangulo2.getArea());
        System.out.println("¿Es cuadrado? " + (rectangulo2.eCadrado() ? "Sí" : "No"));
    }
}
