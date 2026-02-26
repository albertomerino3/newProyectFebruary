/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author EAG
 */
public class Deportista extends Participantes {
    //atributos
    private String especialidad;
    
    //constructor x defecto
    public Deportista (){
        especialidad = "";
    }
    
    //constructor x parámetros
    public Deportista(String nombre, String pais, int edad, int num_iden_olimp, String especialidad){
        super(nombre, pais, edad, num_iden_olimp); //envia los datos a participantes
        this.especialidad = especialidad; //guarda el dato específico aquí
    }
    
    //constructor d copia
    public Deportista(Deportista d){
        this.especialidad = d.especialidad;
    }
    
    //getter
    public String getEspecialidad(){
        return this.especialidad;
    }
    public void setEsepecialidad(String especialidad){
        this.especialidad = especialidad;
    }
            
    @Override
    public void mostrarInfo() {
        System.out.println(this.toString());

    }
    
    public String toString(){
        return super.toString() + "ESPECIALIDAD : " +this.especialidad;
    }
}
