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
        this.num_hab = num_hab;
        this.tipo = tipo;
        this.precio_noche = precio_noche;
    }
    
    //de copia
    public Habitacion(Habitacion c){
        this.num_hab = c.num_hab;
        this.tipo = c.tipo;
        this.precio_noche = c.precio_noche;
    }
    
    //getters
    public int getNum_hab(){
        return this.num_hab;
    }
    public String getTipo(){
        return this.tipo;
    }
    public double getPrecio_noche(){
        return this.precio_noche;
    }
    
    //setters
    public void setNum_hab(int num_hab){
        this.num_hab = num_hab;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setPrecio_noche(double precio_noche){
        this.precio_noche = precio_noche;
    }
    
    //metodos personalizados
    
    //toString
    @Override
    public String toString(){
        String cadena = "Número de Habitación: " + this.num_hab +
                "\n Tipo de Habitación: " + this.tipo +
                "\n Precio por noche: " + this.precio_noche;

        return cadena;
    }
}
