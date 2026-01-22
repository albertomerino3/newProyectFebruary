/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alquilervehiculos;

/**
 *
 * @author alberto
 */
public class Vehiculo {
    //variables(atributos) del objeto
    //son los datos que tendrá cada Vehiculo
    //private por seguridad y orden, se accede a ellas con metodos (get y set)
    
    private String matricula;
    private String marca;
    private String modelo;
    private boolean disponible;
    
    //constructor
    public Vehiculo(String matricula, String marca, String modelo){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.disponible = true; //por defecto está disponible
    }
    
    // getters y setters
    public String getMatricula(){
        return matricula;
    }
    
    public boolean isDisponible() { //al ser boolean se usa is
        return disponible;
    }
    
    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }
    
    @Override
    public String toString(){
        return "Vehiculo{" +
                "matricula='" + matricula + '\''+
                ", marca='" + marca + '\''+
                ", mdoelo='" + modelo + '\'' +
                ", disponible=" + disponible +
                '}';
    }
    
    
}
