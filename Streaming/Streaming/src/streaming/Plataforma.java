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
public class Plataforma {
    //atributos
    private String nombre;
    private Contenido[] catalogo;
    
    //constructores
    public Plataforma(){
    this.nombre = "";
    this.catalogo = new Contenido[0];        
    }
    
    public Plataforma(String nombre, Contenido[] catalogo){
        this.nombre = nombre;
        this.catalogo = catalogo;
    }
    
    public Plataforma(Plataforma p){
        this.nombre = p.nombre;
        this.catalogo = p.catalogo.clone();
    }
    
    //getters
    public String getNombre(){
        return this.nombre;
    }
    public Contenido[] getCatalogo(){
        return this.catalogo;
    }
    
    //setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    //metodos
    public void aniadirContenidoArray(){
        
    }
    
    public void aniadirContenido(Contenido c){
        //creamos un nuevo array con un elemento más
        Contenido[] nuevoArray = new Contenido[this.catalogo.length + 1];
        //copiamos el array que ya tenemos
        for(int i=0; i<this.catalogo.length; i++){
            nuevoArray[i] = this.catalogo[i];
        }
        //añadimos el nuevo elemento al final
        nuevoArray[this.catalogo.length] = c;
        //guardar el nuevo array en el atributo
        this.catalogo = nuevoArray;
    }
    
    public int calcularDuracionTotal(){
        int duracionTotal = 0;
        
        //recorrer todo el catalogo y calcular la duracion de cada elemento
        for(int i = 0; i < this.catalogo.length; i++){
            duracionTotal += this.catalogo[i].getDuracion();
        }
        
        return duracionTotal;
    }
    
    @Override
    public String toString(){
        String cadena = "NOMBRE PLATAFORMA : " + this.nombre + "\n CATALOGO: \n";
        for(int i = 0; i < this.catalogo.length; i++){
            cadena += this.catalogo[i];        
    }
        return cadena;

    }

    
    
}
