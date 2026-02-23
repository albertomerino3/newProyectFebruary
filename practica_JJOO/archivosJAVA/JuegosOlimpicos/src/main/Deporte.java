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
public class Deporte {
    //atributos
    private String nombre;
    private String tipo;
    private int max_part;
    private Pruebas[] conjunto_pruebas;
    
    //constructor x defecto
    public Deporte(){
        this.nombre = "";
        this.tipo = "";
        this.max_part = 0;
        this.conjunto_pruebas = new Pruebas[0];
    }
    
    //constructor x parámetros
    public Deporte(String nombre, String tipo, int max_part, Pruebas[] conjunto_pruebas){
        this.nombre = nombre;
        this.tipo = tipo;
        this.max_part = max_part;
        this.conjunto_pruebas = conjunto_pruebas;
    }
    
    //constructor de copia
    public Deporte(Deporte d){
        this.nombre = d.nombre;
        this.tipo = d.tipo;
        this.max_part = d.max_part;
        this.conjunto_pruebas = d.conjunto_pruebas;
    }
    
    //getters
    public String getNombre(){
        return this.nombre;
    }
    public String getTipo(){
        return this.tipo;
    }
    public int getMax_part(){
        return this.max_part;
    }
    public Pruebas[] getConjunto_pruebas(){
        return this.conjunto_pruebas;
    }
    
    //setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTipo (String tipo){
        this.tipo = tipo;
    }
    public void setMax_part(int max_part){
        this.max_part = max_part;
    }
    public void setConjunto_pruebas(Pruebas[] conjunto_pruebas){
        this.conjunto_pruebas = conjunto_pruebas;
    }
    
    
}
