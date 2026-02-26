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
public class JuegosOlimpicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //prueba de DEPORTE
        Participantes[] listaVaciaPart = new Participantes[0];
        Medallas[] listaVaciaMed = new Medallas[0];
        
        Deporte esqui = new Deporte ("Esqui alpino", TipoDeporte.INDIVIDUAL, 30);
        
        Pruebas carrera = new Pruebas ("NOMBRE", "20/07/2026", listaVaciaPart,
        "", listaVaciaMed, 0, TipoDeporte.INDIVIDUAL, false);
                
            //(String nombre, String fecha_celebracion, Participantes[] participantes,
            //String resultado, Medallas[] medallas, int resultadoMedallas,
            //TipoDeporte deporteAsociado, boolean resultadoRegistrado){
        
            System.out.println("AÑADIENDO PRUEBA AL DEPORTE...");
            esqui.aniadirPruebas(carrera);
            
            System.out.println(esqui.toString());
    }
    
}
