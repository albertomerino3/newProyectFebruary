/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author EAG
 */
public class Deporte {
    //atributos
    private String nombre;
    private TipoDeporte tipo;   //tiene dos opciones según el ENUM
    private int max_part;
    
    private Pruebas[] conjunto_pruebas;
    private int contadorPruebas; //variable para contar las pruebas que hay dentro
    
    //constructor x defecto
    public Deporte(){
        this.nombre = "";
        this.tipo = null;
        this.max_part = 0;
        
        this.conjunto_pruebas = new Pruebas[10];    //damos un tamaño "fijo" para crear el array
        this.contadorPruebas = 0;   //al empezar no hay ninguna prueba
    }
    
    //constructor x parámetros
    public Deporte(String nombre, TipoDeporte tipo, int max_part){
        this.nombre = nombre;
        this.tipo = tipo;
        this.max_part = max_part;
    }
    
    //constructor de copia
    public Deporte(Deporte d){
        this.nombre = d.nombre;
        this.tipo = d.tipo;
        this.max_part = d.max_part;
        this.conjunto_pruebas = d.conjunto_pruebas.clone();
    }
    
    //getters
    public String getNombre(){
        return this.nombre;
    }
    public TipoDeporte getTipo(){
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
    public void setTipo (TipoDeporte tipo){
        this.tipo = tipo;
    }
    public void setMax_part(int max_part){
        this.max_part = max_part;
    }
    public void setConjunto_pruebas(Pruebas[] conjunto_pruebas){
        this.conjunto_pruebas = conjunto_pruebas;
    }
    
    //métodos
    
    //metodo para añadir pruebas al array
    public void aniadirPruebas(Pruebas nuevaPrueba){
        // - 1 - comprobamos si hay hueco para la prueba
        if(contadorPruebas < conjunto_pruebas.length){
            
            // -2- usamos el contador como índice del array para saber donde va
            conjunto_pruebas[contadorPruebas] = nuevaPrueba;
            
            // -3- sumamos +1 al contador para que la proxima vaya en el siguiente hueco
            contadorPruebas++;
            
            System.out.println("PRUEBA AÑADIDA CORRECTAMENTE");
        } else {
            System.out.println("ERROR TAMAÑO. NO CABEN MÁS PRUEBAS EN " + this.nombre);
        }
    }
    
    @Override
    public String toString(){
        String cadena = "NOMBRE DEPORTE: " + this.nombre +
                "\n TIPO: " + this.tipo +
                "\n MAX_PARTICIPANTES: " + this.max_part + "\n";
        
        // aquí necesitamos un bucle para imprimir array
        for(int i = 0; i<contadorPruebas; i++){
        cadena += " - " + conjunto_pruebas[i].getNombre() + "\n";
    }        
        return cadena;
    }
    
    //usamos el contador en el toString para imprimir las pruebas que hay
    //si hay 3/10 aparecen las 3 y no da error
                
    
}
