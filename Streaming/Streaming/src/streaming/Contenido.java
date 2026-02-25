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
public abstract class Contenido {
    //atributos
    private String titulo;
    private int anioEstreno;
    private static int totalContenidos =0;
    
    //constructores
    public Contenido(){
        this.titulo = "";
        this.anioEstreno = 0;
        totalContenidos++;
    }
    
    public Contenido(String titulo, int anio){
        this.titulo = titulo;
        this.anioEstreno = anio;
        totalContenidos++;
    }
    
    public Contenido(Contenido c){
        this.titulo = c.titulo;
        this.anioEstreno = c.anioEstreno;
        totalContenidos++;
    }
    
    //getters
    public String getTitulo(){
        return this.titulo;
    }
    public int getAnioEstreno(){
        return this.anioEstreno;
    }
    public static int getTotalContenidos(){
        return totalContenidos;
    }
    
    //setters
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAnioEstreno(int anioEstreno){
        this.anioEstreno = anioEstreno;
    }
    
    //metodos
    public abstract double calcularValoracion();
    //no se implementa al ser abstracto porque se crea en las hijas
    
    public abstract int getDuracion();
    
    @Override
    public String toString(){
        String cadena = "TITULO : " + this.titulo + "\n" +
                "AÑO DE ESTRENO : " + this.anioEstreno + "\n";
        
        return cadena;
    }
    
}
