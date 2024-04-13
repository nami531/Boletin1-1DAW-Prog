package ej4;

public class Main {
    public static void main(String[] args) {
        // Crear dos objetos Alumnx
        Alumnx alumnx1 = new Alumnx("Juan", "12345678A", 20, "Colegio A");
        Alumnx alumnx2 = new Alumnx("María", "87654321B", 16, "Colegio B");
        
        // Mostrar información del primer alumno
        System.out.println("Información del primer alumno:");
        System.out.println("Nombre: " + alumnx1.getNombre());
        System.out.println("DNI: " + alumnx1.getDni());
        System.out.println("Edad: " + alumnx1.getIdade());
        System.out.println("Escuela: " + alumnx1.getEscola());
        System.out.println("¿Es mayor de edad? " + (alumnx1.eMaiorIdade() ? "Sí" : "No"));
        
        // Mostrar información del segundo alumno
        System.out.println("\nInformación del segundo alumno:");
        System.out.println("Nombre: " + alumnx2.getNombre());
        System.out.println("DNI: " + alumnx2.getDni());
        System.out.println("Edad: " + alumnx2.getIdade());
        System.out.println("Escuela: " + alumnx2.getEscola());
        System.out.println("¿Es mayor de edad? " + (alumnx2.eMaiorIdade() ? "Sí" : "No"));
        
        // Comprobar si los alumnos son iguales
        System.out.println("\n¿Los alumnos son iguales?");
        if (alumnx1.equals(alumnx2)) {
            System.out.println("Sí");
        } else {
            System.out.println("No");
        }
    }
}
