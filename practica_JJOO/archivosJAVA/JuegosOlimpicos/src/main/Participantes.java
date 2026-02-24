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
public abstract class Participantes {
    //atributos
    private String nombre;
    private String pais;
    private int edad;
    private int num_iden_olimp;
    private int num_medallas;
    
    //constructor x defecto
    public Participantes(){
        this.nombre = "";
        this.pais = "";
        this.edad = 0;
        this.num_iden_olimp = 0;
        this.num_medallas = 0;
    }
    
    //constructor x parámetros
    public Participantes(String nombre, String pais,
            int edad, int num_iden_olimp){
        this.nombre = nombre;
        this.pais = pais;
        this.edad = edad;
        this.num_iden_olimp = num_iden_olimp;
        this.num_medallas = 0; //se inicia en 0
    }
    
    //constructor de copia
    public Participantes(Participantes p){
        this.nombre = p.nombre;
        this.pais = p.pais;
        this.edad= p.edad;
        this.num_iden_olimp = p.num_iden_olimp;
        this.num_medallas = p.num_medallas;
    }
    
        //getters
    public String getNombre(){
        return this.nombre;
    }
    public String getPais(){
        return this.pais;
    }
    public int getNum_iden_olimp(){
        return this.num_iden_olimp;
    }
    public int getEdad(){
        return this.edad;
    }
    public int getNum_medallas(){
        return this.num_medallas;
    }
    
    //setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setPais(String pais){
        this.pais = pais;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setNum_iden_olimp(int num_iden_olimp){
        this.num_iden_olimp = num_iden_olimp;
    }
    public void setNum_medallas(int num_medallas){
        this.num_medallas = num_medallas;
    }
    
    //metodos
    
}
