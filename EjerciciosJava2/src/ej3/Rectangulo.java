/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3;

/**
 *
 * @author nadia
 */
public class Rectangulo {
    private int base; 
    private int altura; 
    private float area; 

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        if (base > 0){
            this.base = base;
        }        
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        if (altura > 0){
            this.altura = altura;
        }        
    }
    
    public Rectangulo(){
        setBase(0); 
        setAltura(0); 
    }
    
    public Rectangulo(int base, int altura){
        setBase(base); 
        setAltura(altura); 
    }
    
    public float getArea(){
        area = (float) base * altura; 
        return area; 
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "altura=" + altura + ", area=" + area + '}';
    }
    
    public boolean eCadrado(){
        if (base == altura){
            return true; 
        } else {
            return false; 
        }
    }
}
