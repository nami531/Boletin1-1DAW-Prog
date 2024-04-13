/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2;

/**
 *
 * @author nadia
 */
public class Libro {

    
    private String titulo; 
    private String autor; 
    private int ejemplares; 
    private int prestados; 
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        if (ejemplares > 0) {
            this.ejemplares = ejemplares;
        }
    }

    public int getPrestados() {
        return prestados;
    }

    public boolean setPrestados(int prestados) {
        if (prestados > 0 && prestados <= ejemplares){
            this.prestados = prestados;
            return true; 
        }
        return false; 
    }
    
    public Libro(){
        setAutor("");
        setTitulo(""); 
        setEjemplares(0); 
        setPrestados(0);     
    }
    
    public Libro(String autor, String titulo, int ejemplares, int prestados){
        setAutor(autor);
        setTitulo(titulo); 
        setEjemplares(ejemplares); 
        setPrestados(prestados);
    }
    
    public boolean prestar(){
        if (ejemplares <= 0){
            return false; 
        } else {
            return setPrestados(prestados + 1);
        }
    }
    
    public boolean devolver(){
        if (prestados == 0){
            return false; 
        } else {
            return setPrestados(prestados - 1); 
        }
    }
}
