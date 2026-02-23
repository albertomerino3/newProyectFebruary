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
public class Pruebas {
    //atributos
    private String nombre;
    private String fecha_celebracion;
    private Participantes[] participantes;
    private String resultado;
    private Medallas[] medallas;
    
    //constructor x defecto
    public Pruebas(){
        this.nombre = "";
        this.fecha_celebracion = "";
        this.participantes = new Participantes[0];
        this.resultado = "";
        this.medallas = new Medallas[0];
    }
    
    //constructor x parámetros
    public Pruebas (String nombre, String fecha_celebracion, Participantes[] participantes,
            String resultado, Medallas[] medallas){
        this.nombre = nombre;
        this.fecha_celebracion = fecha_celebracion;
        this.participantes = participantes;
        this.resultado = resultado;
        this.medallas = medallas;
    }
    
    //constructor de copia
    public Pruebas(Pruebas p){
        this.nombre = p.nombre;
        this.fecha_celebracion = p.fecha_celebracion;
        this.participantes = p.participantes;
        this.resultado = p.resultado;
        this.medallas = p.medallas;
    }
    
}
