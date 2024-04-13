/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava.ej10;

/**
 *
 * @author nadia
 */
public class Main {
    public static void main(String[] args) {
        Empregado e1 = new Empregado("Manolo", "899899899", 999); 
        Empregado e2 = new Empregado("Maria", "123456789", 1200);
        Empregado e3 = new Empregado("Javier", "1112223334", 800); 
        System.out.println(e1.getSb());
        
        EquipoProxecto educativa = new EquipoProxecto(e1,e2,e3,20);
        educativa.obtenerNomeamentoEquipo();
        educativa.mostrarInfoContacto(); 
        System.out.println(educativa.getComision());
        
        Empregado e4 = new Empregado("German", "11122233", 1800); 
        Empregado e5 = new Empregado("Nadia", "111222334", 2000); 
        Empregado e6 = new Empregado("Veru", "111222336", 2500); 
        
        EquipoProxecto ventas = new EquipoProxecto(e4,e5,e6,18);
        ventas.obtenerNomeamentoEquipo();
        ventas.mostrarInfoContacto(); 
        
                
    }
    
    
}
