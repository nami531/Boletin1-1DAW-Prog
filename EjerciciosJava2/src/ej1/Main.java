/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1;

import java.util.Scanner;

/**
 *
 * @author nadia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean jugar = true; 
        Ahorcado j1 = null; 
        Scanner sc = new Scanner(System.in);

        System.out.println("Jugador 1: Introduce el texto a adivinar");
        String texto = sc.nextLine();

        System.out.println("¿Quieres dar una pista?: s/n ");
        String opcion = sc.next();
        if (opcion.equals("s")) {
            System.out.println("Introduce la pista: ");
            String pista = sc.nextLine();
            j1 = new Ahorcado(texto, pista);
        } else {
            if (opcion.equals("n")) {
                j1 = new Ahorcado(texto);
            } else {
                System.out.println("Creo que no te he entendido");
                jugar = false; 
            }
        }
        
        do {
            System.out.println("Jugador 2: ¿Qué quieres hacer?, \n 1.Decir una letra \n 2.Adivinar el texto");
            int op = sc.nextInt();
            if (op == 1){
                char letra = j1.leerLetra(); 
                j1.pintar();
                if (!j1.probarLetra(letra)){
                   if (j1.perdio()){
                       System.out.println("Has perdido, el jugador 1 ha ganado");
                       jugar = false; 
                   }
                } else {
                    System.out.println("La letra aparece"); 
                }
            } else {
                if (op == 2){
                    String frase = sc.next(); 
                    if (j1.adivinada()){
                        System.out.println("Has ganado!");
                    } else {
                        System.out.println("No has adivinado la frase");
                        jugar = false; 
                    }
                } else {
                    System.out.println("Creo que no has introducido ninguna de las opciones establecidas");
                }
            }
            
            
        } while (jugar); 
    }

}
