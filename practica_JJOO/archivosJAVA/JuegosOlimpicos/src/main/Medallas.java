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
public class Medallas {
    
    //atributos
    private String tipo; //oro plata o bronce
    private Participantes ganador; //la gana el deportista o equipo
    private static int totalMedallas; //contador static
    
    //constructor x defecto
    public Medallas(){
        this.tipo = "";
        this.ganador = null;
        totalMedallas++;
    }
    
    //constructor x parámetros
    public Medallas(String tipo, Participantes ganador){
        this.tipo = tipo;
        this.ganador = ganador;
        totalMedallas++;
    }
    
    //constructor de copia
    public Medallas(Medallas m){
        this.tipo = m.tipo;
        this.ganador = m.ganador;
        totalMedallas++;
    }
    
        //getters
    public String getTipo(){
        return this.tipo;
    }
    public Participantes getGanador(){
        return this.ganador;
    }
    
    //setters
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setGanador (Participantes ganador){
        this.ganador = ganador;
    }

    //métodos
    public static int getTotalMedallas(){
        return totalMedallas;
    }
    
    @Override
    public String toString(){
        String cadena = "TIPO DE MEDALLA " + this.tipo +
                "\n GANADA POR: " + this.ganador;
        
        return cadena;
    }
      
    
    
}
