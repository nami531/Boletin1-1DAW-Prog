/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4;

/**
 *
 * @author nadia
 */
public class Alumnx {
    private String nombre; 
    private String dni; 
    private int idade ; 
    private String escola; 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0){
            this.idade = idade;
        }
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }
    
    public Alumnx(String nombre, String dni, int idade, String escola){
        setNombre(nombre);
        setDni(dni); 
        setIdade(idade); 
        setEscola(escola);
    }
    
    public boolean eMaiorIdade(){
        return idade > 18;
    }
    
    public boolean equal(Alumnx al){
        return (idade <= al.getIdade()); 
    }
    
    @Override 
    public boolean equals(Object al){
        return this == al;  
    }
}
