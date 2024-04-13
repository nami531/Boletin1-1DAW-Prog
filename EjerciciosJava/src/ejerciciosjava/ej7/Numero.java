/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava.ej7;

/**
 *
 * @author nadia
 */
public class Numero {
    int numero; 
    
    public Numero(){
        setNumero(0); 
    }
    
    public Numero(int numero){
        setNumero(numero); 
    }
    
    public int suma(int numero2){
        setNumero(numero + numero2); 
        return this.numero;
    }
    
    public int resta(int numero2){
        setNumero(numero - numero2); 
        return this.numero;
    }
    
    public int getDobre(){
        return this.numero * 2;
    }
    
    public int getTriplo(){
        return this.numero * 3;
    }
    
    public int getCuadruplo(){
        return this.numero * 4;
    }
    
    public void duplica(){
        setNumero(numero * 2); 
    }
    
    public int factorial(){
        int factorial = numero;  
        for (int i = 2; i<=numero; i++){
            factorial *= i; 
        }
        return factorial; 
    }
    
    public static boolean esPrimo(int numero){
        for (int i = 1; numero>i; i++ ){
           if (numero / i == 0){
               return true; 
           }
        } return false;  
    }
    
    public boolean ePrimo(){
        return esPrimo(this.numero);
    }
    
    public void primosMenores(){
        for (int i=numero - 1; i > 0; i--){
            if (esPrimo(i)){
                System.out.print(i + ",");
            }
        }
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
           
}
