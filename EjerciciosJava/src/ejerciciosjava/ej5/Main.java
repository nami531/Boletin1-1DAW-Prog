/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava.ej5;

public class Main {
    public static void main(String[] args) {
        Persoa persona1 = new Persoa("Juan", 25, "12345678A", 'E');
        persona1.setPeso(70); // Establecemos el peso
        persona1.setAltura(170); // Establecemos la altura

        Persoa persona2 = new Persoa("Maria", 17, "87654321B", 'T');
        persona2.setPeso(55); // Establecemos el peso
        persona2.setAltura(160); // Establecemos la altura

        // Mostramos la información de las personas
        System.out.println("Información de la persona 1:");
        persona1.amosarInformacion();
        System.out.println("\nInformación de la persona 2:");
        persona2.amosarInformacion();

        // Probamos algunos métodos adicionales
        System.out.println("\nEl IMC de la persona 1 es: " + persona1.calcularIMC());
        System.out.println("¿La persona 1 es mayor de edad? " + persona1.eMaiorIdade());
        System.out.println("¿La situación actual de la persona 1 es correcta? " + persona1.eCorrectaSituacion(persona1.getSituacionActual()));
    }
}
