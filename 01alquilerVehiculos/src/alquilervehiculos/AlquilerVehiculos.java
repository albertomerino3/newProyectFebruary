/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alquilervehiculos;

/**
 *
 * @author alberto
 */
public class AlquilerVehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alquiler alquiler = new Alquiler("01/06/2026", "10/06/2026");
        
        Vehiculo v1 = new Vehiculo("1234ABC", "Toyota", "Corolla");
        Vehiculo v2 = new Vehiculo("5678DEF", "Seat", "Ibiza");
        
        alquiler.añadirVehiculo(v1);
        alquiler.añadirVehiculo(v2);
        
        boolean alquilado = alquiler.alquilerVehiculo("1234ABC");
        
        if (alquilado){
            System.out.println("Vehículo alquilado correctamente");
        } else{
            System.out.println("No se pudo alquilar el vehículo");
        }
        System.out.println(alquiler.consultarVehiculo("1234ABC"));
    }
    
}
