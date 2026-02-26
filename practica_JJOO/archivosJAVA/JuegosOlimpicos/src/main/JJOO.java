/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;

/**
 *
 * @author EAG
 */
public class JJOO {
    
    Scanner sc = new Scanner(System.in);
    
    //atributos
    private String nombre;
    private int anio;
    private String ciudad_sede;
    private Deporte[] deportes;
    private Participantes[] participantes;
    private int contadorDeportes;
    private int contadorParticipantes;
    
    //constructor x defecto
    public JJOO(){
        this.nombre = "";
        this.anio = 0;
        this.ciudad_sede = "";
        
        this.deportes = new Deporte[20];    //le damos hueco para añadir deportes
        this.contadorDeportes = 0;
        
        this.participantes = new Participantes[100];    //hueco para participantes
        this.contadorParticipantes = 0;
    }
    
    //constructor x parámetros
    public JJOO(String nombre, int anio, String ciudad_sede, Deporte[] deportes, Participantes[] participantes) {
        this.nombre = nombre;
        this.anio = anio;
        this.ciudad_sede = ciudad_sede;
        this.deportes = deportes;
        this.participantes = participantes;
    }

    //constructor de copia
    public JJOO(JJOO j){
        this.nombre = j.nombre;
        this.anio = j.anio;
        this.ciudad_sede = j.ciudad_sede;
        this.deportes = j.deportes;
        this.participantes = j.participantes;
    }
    
    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getCiudad_sede() {
        return ciudad_sede;
    }

    public void setCiudad_sede(String ciudad_sede) {
        this.ciudad_sede = ciudad_sede;
    }

    public Deporte[] getDeportes() {
        return deportes;
    }

    public void setDeportes(Deporte[] deportes) {
        this.deportes = deportes;
    }

    public Participantes[] getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Participantes[] participantes) {
        this.participantes = participantes;
    }
    
    //métodos
    
    public void registrarDeporte(Deporte d){
        //si hay 1 hueco guardado, contadorDeportes vale 1
        //así que el siguiente hueco libre del array será Deportes[1]
        
        if(contadorDeportes < deportes.length){
            deportes[contadorDeportes] = d;
            
            contadorDeportes++;           
            System.out.println("Deporte " + this.nombre + " REGISTRADO!");
        } else {
            System.out.println("ERROR TAMAÑO: El registro Deportes está completo.");
        }
        
        }
    
    public void registrarDeportista(Deportista de){
        
        //si el contador es MENOR que los huecos --> ENTRA
        if(contadorParticipantes < participantes.length){
        participantes[contadorParticipantes] = de;
        contadorParticipantes++;   
        
        //se usa el nombre del deportista llamando de.(parámetro) y getNombre de PARTICIPANTES
            System.out.println("El participante: " + de.getNombre() + "ESTÁ REGISTRADO!");
        } else {
            System.out.println("ERROR TAMAÑO: El registro de Participantes está lleno.");
        }

    }
    
    //para ver los deportes que hemos registrado arriba
    
    public void mostrarDeportesArray(){
        System.out.println("LISTA DE DEPORTES REGISTRADOS EN " + this.nombre);
        
        for (int i = 0; i< deportes.length; i++){
            System.out.println((i+1) + deportes[i].getNombre());
        }
        
    }
    
    public void mostrarMedalleroPais(){
        System.out.println("LISTA DE PARTICIPANTES REGISTRADOS EN :" + this.nombre);
        
        System.out.println("Introduce el país que quieres buscar: ");
        String paisABuscar = sc.nextLine();
        int totalMedallas = 0;
        
        for (int i = 0; i < contadorParticipantes; i++){
            if (paisABuscar.equals(participantes[i].getPais())){
            System.out.println((i+1) + participantes[i].getNombre());            
            totalMedallas += participantes[i].getNum_medallas();
            
                System.out.println("Participantes con medallas : " +participantes[i].getNombre());
            }
            
            System.out.println("TOTAL MEDALLAS DE " + paisABuscar + " : " +totalMedallas + " MEDALLAS.");
        

        }
    }
    
    public void participanteGanador(Participantes p){
        for (int i = 0; i < contadorParticipantes; i++){
            
            //se compara el participantes que recibimos (parametro) con el array
            if (participantes[i].getNombre().equals(p.getNombre())){
                participantes[i].ganarMedalla();
            }
        }
    }
    
    public void participanteGanador(){
        //asumiendo que el primero es ganador
        Participantes ganador = participantes[0];
        
        for (int i = 0; i < contadorParticipantes; i++){
            //si el participante actual tiene más medallas que el "ganador"
            if(participantes[i].getNum_medallas() > ganador.getNum_medallas()){
                ganador = participantes[i];
            }
        }
        
        System.out.println("EL PARTICIPANTE CON MÁS MEDALLAS ES : " +ganador.getNombre());
    }

    
    
    
    
    
}
