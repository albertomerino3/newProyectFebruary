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
public class Clientes {
    //atributos
    private String nombre, doc_iden;
    private Reservas[] reservas;
    
    //constructores
    //x defecto
    public Clientes(){
        this.nombre = "";
        this.doc_iden = "";
        this.reservas = new Reservas[0];
    }
    //x parámetros
    public Clientes(String nombre, String doc_iden, Reservas[] reservas){
        this.nombre = nombre;
        this.doc_iden = doc_iden;
        this.reservas = reservas.clone();   //usamos el metodo clone en vez de this
                                            //para copiar todos los valores del array
    }
    //de copia
    public Clientes(Clientes c){
        this.nombre = c.nombre;
        this.doc_iden = c.doc_iden;
        this.reservas = c.reservas.clone();
    }
    
    //getters
    public String getNombre(){
        return this.nombre;
    }
    public String getDoc_iden(){
        return this.doc_iden;
    }
    public Reservas[] getReservas(){
        return this.reservas;
    }
    
    //setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setDoc_iden(String doc_iden){
        this.doc_iden = doc_iden;
    }
    public void setReservas(Reservas[] reservas){
        this.reservas = reservas;
    }
    
    //metodos personalizados
    
    //toString
    @Override
    public String toString(){
        String cadena = "Nombre del cliente: " + this.nombre + "n/"+
                "Documento de Identidad: " + this.doc_iden + "n/" +
                "Reservas: " + this.reservas;
    }
    
}