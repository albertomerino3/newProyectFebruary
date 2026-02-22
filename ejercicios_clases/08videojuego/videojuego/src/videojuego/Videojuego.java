/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package videojuego;

/**
 *
 * @author alberto
 */
public class Videojuego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PRUEBA DEL VIDEOJUEGO
        
        //crear los jugadores
        Jugador j1 = new Jugador("Harry", 1);
        Jugador j2 = new Jugador("Drako", 1);
        
        //crear la partida
        Partida partida1 = new Partida();
        partida1.setDuracion(30);
        
        //añadir jugadores
        partida1.aniadirJugador(j2);
        partida1.aniadirJugador(j1);
        
        //terminar la partida
        partida1.finalizarPartida();
        
        System.out.println(partida1.toString());
    }
    
}
