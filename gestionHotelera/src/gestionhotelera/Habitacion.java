/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionhotelera;

/**
 *
 * @author EAG
 */
public class Habitacion {
    //atributos
    private int num_hab;
    private String tipo;
    private double precio_noche;
    
    //constructores
    //x defecto
    public Habitacion(){
        this.num_hab = 0;
        this.tipo = "";
        this.precio_noche = 0;
    }
    
    //x parámetros
    public Habitacion(int num_hab, String tipo, double precio_noche){
        
    }
}
