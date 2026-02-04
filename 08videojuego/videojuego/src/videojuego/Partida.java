/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videojuego;

/**
 *
 * @author alberto
 */
public class Partida {
    //atributos
    private int duracion;
    private Jugador[] listaJugadores;
    
    //constructor x defecto
    public Partida(){
        this.duracion = 0;
        this.listaJugadores = new Jugador[0];
    }
    
    //constructor x parametro
    public Partida(int duracion, Jugador[] listaJugadores){
        this.duracion = duracion;
        this.listaJugadores = listaJugadores.clone();
    }
    
    //constructor de copia
    public Partida(Partida c){
        this.duracion = c.duracion;
        this.listaJugadores = c.listaJugadores.clone();
    }
    
    //getters
    public int getDuracion(){
        return this.duracion;
    }
    public Jugador[] getListaJugadores(){
        return this.listaJugadores;
    }
    
    //setters
    public void setDuracion(int duracion){
        this.duracion = duracion;
    }
    public void setListaJugadores(Jugador[] listaJugadores){
        this.listaJugadores = listaJugadores;
    }
}
