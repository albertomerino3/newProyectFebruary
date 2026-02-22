/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videojuego;

/**
 *
 * @author alberto
 */
public class Jugador {
    //atributos
    private String nombre;
    private int nivel;
    
    //constructor x defecto
    public Jugador(){
        this.nombre = "";
        this.nivel = 1;
    }
    
    //constructor x parámetros
    public Jugador(String nombre, int nivel){
        this.nombre = nombre;
        this.nivel = nivel;
    }
    
    //constructor de copia
    public Jugador(Jugador c){
        this.nombre = c.nombre;
        this.nivel = c.nivel;
    }
    
    //getters
    public String getNombre(){
        return this.nombre;
    }
    public int getNivel(){
        return this.nivel;
    }
    
    //setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setNivel(int nivel){
        this.nivel = nivel;
    }
    
    //métodos personalizados
    public void aumentarNivel(){
            this.nivel ++;  //el nivel sube cuando se llame a este método
    }
    
    //toString
    @Override
    public String toString(){
        String cadena = "Nombre del Jugador: " + this.nombre + "\n" +
                "Nivel del Jugador: " + this.nivel ;
        return cadena;
    }

}
