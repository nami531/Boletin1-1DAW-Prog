/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava.ej9;

/**
 *
 * @author nadia
 */
public class Data {
    
    private int dia; 
    private int mes; 
    private int anho; 
    
    public Data(){
        defecto(); 
    }
    
    public Data(int dia, int mes, int anho){
        setFecha(dia, mes, anho); 
    }

    protected void setFecha(int dia, int mes, int anho) {
        setDia(dia);
        setMes(mes);
        setAnho(anho);
    }
    
    protected void defecto() {
        setDia(1);
        setMes(1);
        setAnho(1900);
    }
    
    public void reiniciar(){
        defecto();
    }
    
    public void reiniciar(int dia, int mes, int anho){
        setFecha(dia, mes, anho);
    }
    
    public void adelantar(){
        setDia(dia + 1 % dias(mes,anho)); 
    }
    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia > 0 && dia <= dias(mes,anho)){
            this.dia = dia;
        } else {
            this.dia = 1; 
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes > 0 && mes <= 12){
            this.mes = mes;
        } else {
            this.mes = 1; 
        }
    }

    public int getAnho() {
        return anho;
    }

    public void setAnho(int anho) {
        if (anho >= 1900){
            this.anho = anho;
        } else {
            this.anho = 1900;
        }
    }
    
    public void imprimir(){
        System.out.println("Fecha:"+ dia + "-" + mes + "-" + anho);
    }
    
    public static boolean esBisiesto(int anho) {
        if ((anho % 4 == 0 && anho % 100 != 0) || (anho % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
    
    protected static int dias(int mes, int anho){
        int[] meses = new int[]{31,29,31,30,31,30,31,31,30,31,30,31}; 
        if (esBisiesto(anho)){
            meses[1] = 28;
        }
        return meses[mes];
    }
}
