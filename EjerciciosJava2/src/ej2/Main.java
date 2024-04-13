package ej2;

public class Main {
    public static void main(String[] args) {
        // Crear un libro
        Libro libro1 = new Libro("Autor 1", "Libro 1", 10, 3);
        
        // Mostrar información del libro
        System.out.println("Información del libro:");
        System.out.println("Título: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Ejemplares totales: " + libro1.getEjemplares());
        System.out.println("Ejemplares prestados: " + libro1.getPrestados());
        
        // Prestar un ejemplar del libro
        System.out.println("\nPrestar un ejemplar del libro...");
        if (libro1.prestar()) {
            System.out.println("Préstamo exitoso.");
        } else {
            System.out.println("No se pudo prestar el libro.");
        }
        
        // Mostrar información actualizada del libro
        System.out.println("\nInformación actualizada del libro:");
        System.out.println("Título: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Ejemplares totales: " + libro1.getEjemplares());
        System.out.println("Ejemplares prestados: " + libro1.getPrestados());
        
        // Devolver un ejemplar del libro
        System.out.println("\nDevolver un ejemplar del libro...");
        if (libro1.devolver()) {
            System.out.println("Devolución exitosa.");
        } else {
            System.out.println("No se pudo devolver el libro.");
        }
        
        // Mostrar información actualizada del libro después de devolución
        System.out.println("\nInformación actualizada del libro:");
        System.out.println("Título: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Ejemplares totales: " + libro1.getEjemplares());
        System.out.println("Ejemplares prestados: " + libro1.getPrestados());
    }
}
