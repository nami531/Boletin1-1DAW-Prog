/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej5;

/**
 *
 * @author nadia
 */
public class Circulo {
    private float radio; 

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        if (radio > 0){
            this.radio = radio;
        }
    }

    public Circulo(float radio) {
        setRadio(radio); 
    }
    
    public double calcularCircunferencia(){
        return 2 * Math.PI * radio; 
    }
    
    public double calcularSuperficie(){
        return Math.PI * Math.pow(radio, 2); 
    }
    
    public double calcularDiametro(){
        return 2 * radio; 
    }
}
