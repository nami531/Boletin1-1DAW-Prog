/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej6;

/**
 *
 * @author nadia
 */
public class MobilPrepago {
    private int numeroMobil; 
    private final float  custoEstablecLlamada; 
    private final float  custoMinutoLlamada; 
    private final float custoConsumoMB; 
    private float saldo; 

    public int getNumeroMobil() {
        return numeroMobil;
    }

    public void setNumeroMobil(int numeroMobil) {
        this.numeroMobil = numeroMobil;
    }

    public float getCustoConsumoMB() {
        return custoConsumoMB;
    }

    public float getSaldo() {
        return saldo;
    }

   

    public MobilPrepago(int numeroMobil, float saldo) {
        this.numeroMobil = numeroMobil;
        this.custoEstablecLlamada = 2.0f;
        this.custoMinutoLlamada = 0.56f;
        this.custoConsumoMB = 0.27f;
        this.saldo = saldo;
    }
    
    public void efectuarChamada(int segundos){
        float eliminar = custoMinutoLlamada * segundos + custoEstablecLlamada;
        
        if (saldo - (eliminar)< 0){
            System.out.println("Se ha cortado la llamada por saldo insuficiente");
        } else {
            saldo -= (eliminar);
        }
        
    }

    public void navegar(int MB){
        if (saldo - custoConsumoMB * MB < 0){
            System.out.println("Se ha cortado la línea por saldo insuficiente");
        } else {
            saldo -= saldo - custoConsumoMB * MB;
        }
    }
      
    public boolean recargar(int importe){
        if (importe / 5 == 0){
            saldo += importe; 
            return true; 
        } else {
            return false; 
        }
    }
    
    public float consultarSaldo(){
        return saldo; 
    }
}
