/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alquilervehiculos;

/**
 *
 * @author alberto
 */
public class Alquiler {
    //atributos
    private String fechaInicio;
    private String fechaFin;
    private Vehiculo[] vehiculos;
    
    //constructor
    public Alquiler(){
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.vehiculos = new Vehiculo[0];
    }
    
    public Alquiler (String fechaInicio, String fechaFin, Vehiculo[] vehiculos){
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.vehiculos = vehiculos.clone();
    }
    
    public Alquiler(Alquiler a){
        this.fechaInicio = a.fechaInicio;
        this.fechaFin = a.fechaFin;
        this.vehiculos = a.vehiculos;
    }
    
    //getters
    public Vehiculo[] getAlquiler(){
        return this.vehiculos;
    }
    
    public void añadirVehiculo(Vehiculo v){
        vehiculos.add(v);
    }
    
    public Vehiculo consultarVehiculo(String matricula){
        for (Vehiculo v : vehiculos){
            if (v:getMatricula().equals(matricula)){
                return v;
            }
        }
        return null;
    }
    
    public boolean alquilerVehiculo(Strin matricula){
        Vehiculo v = consultarVehiculo(matricula);
        
        if (v != null && v.isDisponible()){
            v.setDisponible(false);
            return true;
        }
        return false; 
    }
}
