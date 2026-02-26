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
public class Equipo extends Participantes {
    //atributos
    private String nombreEquipo;
    private Deportista[] deportistas;
    private int medallas;
    
    //constructores
    public Equipo(){
        this.nombreEquipo = "";
        this.deportistas = new Deportista[20];
        this.medallas = 0;
    }
    
    public Equipo(String nombre, String pais, int edad, int num_iden_olimp, String nombreEquipo, Deportista[] deportistas, int medallas){
        super(nombre, pais, edad, num_iden_olimp);
        this.nombreEquipo = nombreEquipo;
        this.deportistas = deportistas;
        this.medallas = medallas;
    }
    
    public Equipo(Equipo e){
        super(e); //usamos elc onstructor de copia del padre
        this.nombreEquipo = e.nombreEquipo;
        this.deportistas = e.deportistas;
        this.medallas = e.medallas;
    }
    
    //getters
    public String getNombreEquipo(){
        return this.nombreEquipo;
    }
    public Deportista[] getDeportistas(){
        return this.deportistas;
    }
    public int getMedallas(){
        return this.medallas;
    }
    
    //setters
    public void setNombreEquipo(String nombreEquipo){
        this.nombreEquipo = nombreEquipo;
    }
    public void setDeportistas(Deportista[] deportistas){
        this.deportistas = deportistas;
    }
    public void setMedallas(int medallas){
        this.medallas = medallas;
    }

    @Override
    public void mostrarInfo() {
        System.out.println(this.toString());
    }
    
    public String toString(){
        return super.toString() + "NOMBRE EQUIPO: " + this.nombreEquipo +
                 "\n MIEMBROS : " + this.deportistas.length;
    }
    
}
