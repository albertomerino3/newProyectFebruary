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
    
    //metodos personalizados
    public void aniadirJugador(Jugador j){
        //creamos un array nuevo con 1 nuevo espacio para añadir Jugador
        Jugador[] nuevoArray = new Jugador[this.listaJugadores.length + 1];
        //copiamos jugadores a nuevoArray
        //usamos -1 como límite , para no copiar más elementos de los que existen
        for (int i=0; i<nuevoArray.length - 1; i++){
            nuevoArray[i] = this.listaJugadores[i];
        }
        //asignar el nuev jugador
        nuevoArray[nuevoArray.length - 1] = j;
        //actualizar referencia
        this.setListaJugadores(nuevoArray);
    }
    
    
    public void finalizarPartida(){
        //recorremos la lista de jugadores que participaron
        for(int i = 0; i < this.listaJugadores.length; i++){
            this.listaJugadores[i].aumentarNivel();
        }
    }
    
    //toString
    @Override
    public String toString(){
        String cadena = "Duración de la partida: " + this.duracion + "\n" +
                "Jugadores de la partida: " + "\n";
        //añadimos array listaJugadores
        //para evitar bucle infinito, imprimimos nombre jugadores
        //si no hay jugadores, lo indicamos
        if(this.listaJugadores.length == 0){
            cadena += "No hay jugadores en la partida todavía...";
        }
        else{
            for(int i = 0; i < this.listaJugadores.length; i++){
                cadena += listaJugadores[i].getNombre() + "\n";
            }
        }
        return cadena;
    }
    
    
}
