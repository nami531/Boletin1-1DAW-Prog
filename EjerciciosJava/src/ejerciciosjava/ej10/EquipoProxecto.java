/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava.ej10;

/**
 *
 * @author nadia
 */
public class EquipoProxecto {
    private Empregado responsable; 
    private Empregado analista;
    private Empregado desenhador;
    private  int comision; 
    
    public EquipoProxecto(Empregado responsable, Empregado analista, Empregado desenhador, int comision){
        this.responsable = responsable; 
        this.analista = analista; 
        this.desenhador = desenhador; 
        setComision(comision);
    }
    
    public void obtenerNomeamentoEquipo(){
        System.out.println("Responsable " + responsable.getNome() );
        System.out.println("Analista " + analista.getNome());
        System.out.println("Deseñador "+ desenhador.getNome());
    }
    
    public void mostrarInfoContacto(){
        System.out.println("Responsable " + responsable.InfoContacto() );
        System.out.println("Analista " + analista.InfoContacto());
        System.out.println("Deseñador "+ desenhador.InfoContacto());
   
    }
    
    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        if (comision < 0){
            this.comision = 0; 
        } else {
            if (comision > 100){
                this.comision = 100; 
            } else {
                this.comision = comision;
            }
        }
    }
    
    
    
}
