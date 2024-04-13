/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava.ej5;

/**
 *
 * @author nadia
 */
public class Persoa {
    private String nome; 
    private int idade; 
    private String dni; 
    private char situacionActual; 
    private float peso; 
    private int altura; 
    
    public Persoa(String nome, int idade, String dni, char situacionActual){
        setNome(nome); 
        setIdade(idade); 
        setDni(dni); 
        setSituacionActual(situacionActual);  
        setPeso(peso); 
        setAltura(altura); 
    }
    
    public float calcularIMC(){
        float imc = (float) (peso / Math.pow(altura, 2)) * 100; 
        return imc; 
    }
    
    public boolean eMaiorIdade(){
        if (idade >= 18) {
            return true; 
        }else {
            return false; 
        }
    }
    
    protected boolean eCorrectaSituacion(char situacionActual){
        String situaciones = "ETD"; 
        if (situaciones.contains(String.valueOf(situacionActual))){
            return true; 
        } else {
            return false; 
        }
    }
    
    protected boolean eCorrectaIdade(int idade){
        if (idade >= 0 && idade <= 150){
            return true; 
        } else {
            return false; 
        }
    }
    
    public void amosarInformacion(){
        System.out.println("Persoa{" + "nome=" + nome + ", idade=" + idade + ", dni=" + dni + ", situacionActual=" + situacionActual + ", peso=" + peso + ", altura=" + altura + '}');
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != ""){
            this.nome = nome;
        }else {
            System.out.println("El nombre no puede estar vacío");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (eCorrectaIdade(idade)){
            this.idade = idade;
        }else {
            this.idade = 0; 
        }
           
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public char getSituacionActual() {
        return situacionActual;
    }

    public void setSituacionActual(char situacionActual) {
        if (eCorrectaSituacion(situacionActual)) {
            this.situacionActual = situacionActual;
        }else {
            System.out.println("No está contemplado en las situaciones actuales");
        }
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        if (peso > 0){
            this.peso = peso;
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

}
