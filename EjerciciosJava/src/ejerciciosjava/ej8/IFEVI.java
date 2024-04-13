/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava.ej8;

/**
 *
 * @author nadia
 */
public class IFEVI {
    private int salaPpal;
    private int compraVenta; 
    private int vip; 
    private int[] salas; 
    
    public IFEVI(){
        salaPpal = 2000; 
        compraVenta = 300; 
        vip = 20; 
        salas = new int[]{salaPpal, compraVenta, vip}; 
    }
    
    protected boolean comprobacionEntradas(){
        for (int i = 0; i <= salas.length; i++){
            if (salas[i] <= 0){
                return false; 
            }
        } return true; 
    }
    
    public void venderEntrada(int zona){
        salas[zona] -=  1; 
    }

    public int getSalaPpal() {
        return salaPpal;
    }

    public int getCompraVenta() {
        return compraVenta;
    }

    public int[] getSalas() {
        return salas;
    }
    
    
}
