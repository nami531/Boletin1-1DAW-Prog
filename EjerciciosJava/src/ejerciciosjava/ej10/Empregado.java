/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava.ej10;

/**
 *
 * @author nadia
 */
public class Empregado {
    private String nome;
    private String telefono;
    private float sb;
    
    public Empregado(String nome, String telefono, float sb){
        setNome(nome); 
        setTelefono(telefono); 
        setSb(sb); 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono.length() != 9){
            this.telefono = " ";
        } else{
            this.telefono = telefono;
        }       
    }

    public float getSb() {
        return sb;
    }

    public void setSb(float sb) {
        if (sb<1000){
            this.sb = 1000;
        } else {
            this.sb = sb; 
        }
        
    }
    
    public String InfoContacto(){
        return "Nombre: " + nome + "\nTlf: " + telefono;
    }
    
    public void mostrarInfoContacto(){
        System.out.println(this.InfoContacto());
    }
}
