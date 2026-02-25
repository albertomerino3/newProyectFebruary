/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming;

/**
 *
 * @author EAG
 */
public class Pelicula extends Contenido {
    //atributos
    private String genero;
    private double puntuacionMedia;
    private int duracion;
    
    //constructores
    public Pelicula(){
        super();        //llamamos al constructor del padre
        this.genero = "";
        this.puntuacionMedia = 0;
        this.duracion = 0;
    }
    
    public Pelicula(String titulo, int anio, String genero, double puntuacionMedia, int duracion){
        super(titulo, anio);    //llamamos al constructor del padre
        
        this.genero = genero;
                
        //controlar que la puntuacion esté dentro del rango 0-10
        if(puntuacionMedia < 0 || puntuacionMedia > 10){
            System.out.println("PUNTUACION NO PUEDE SER INFERIOR A 0");
            this.puntuacionMedia = 0;
        }
        else if(puntuacionMedia >10 ){
            System.out.println("LA PUNTUACION NO PUEDE SER SUPERIOR A 10");
            this.puntuacionMedia = 10;
        }
        else{
            this.puntuacionMedia = puntuacionMedia;
        }
            
        //controlamos que la duracion no sea negativa
        if (duracion <0){
            System.out.println("DURACION NO VÁLIDA");
            this.duracion = 0;
        }
        else{
            this.duracion = duracion;
        }
        
    }
    
    public Pelicula (Pelicula peliculaACopiar){
        super(peliculaACopiar);
        
        this.genero = peliculaACopiar.genero;
        this.puntuacionMedia = peliculaACopiar.puntuacionMedia;
        this.duracion = peliculaACopiar.duracion;
    }
    
    
    //getters
    public String getGenero(){
        return this.genero;
    }
    
    public double getPuntuacionMedia(){
        return this.puntuacionMedia;
    }
    
    public int getDuracion(){
        return this.duracion;
    }
    
    //setters
    public void setGenero(String genero){
        this.genero = genero;
    }
    
    
    public void setPuntuacionMedia(double puntuacion){
        if(puntuacionMedia < 0 || puntuacionMedia > 10){
            System.out.println("PUNTUACION NO PUEDE SER INFERIOR A 0");
            this.puntuacionMedia = 0;
        }
        else if(puntuacionMedia >10 ){
            System.out.println("LA PUNTUACION NO PUEDE SER SUPERIOR A 10");
            this.puntuacionMedia = 10;
        }
        else{
            this.puntuacionMedia = puntuacionMedia;
        }
    }
    
    public void setDuracion(int duracion){
        if (duracion <0){
            System.out.println("DURACION NO VÁLIDA");
            this.duracion = 0;
        }
        else{
            this.duracion = duracion;
        }
    }
    
    //metodos
    public double calcularValoracion(){
        double valoracion = this.puntuacionMedia;
        if(this.getAnioEstreno() >= 2020){
            valoracion ++;
            if(valoracion >10){
                valoracion = 10;
            }
        }
        return valoracion;
    }
}
