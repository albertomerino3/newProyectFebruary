/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionhotelera;

/**
 *
 * @author EAG
 */
public class Reservas {
    
    //atributos
    private int id_cliente;
    private String fechaEntrada;
    private String fechaSalida;
    private int total_noches;
    
    private Habitacion habitacion;
    
    //constructores
    public Reservas(){
        this.id_cliente = 0;
        this.fechaEntrada = "";
        this.fechaSalida = "";
        this.total_noches = 0;
        this.habitacion = null;
    }
    
    public Reservas (int id_cliente, String fechaEntrada, String fechaSalida, int total_noches, Habitacion habitacion){
        this.id_cliente = id_cliente;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.total_noches = total_noches;
        this.habitacion = habitacion;
    }
    
    public Reservas (Reservas c){
        this.id_cliente = c.id_cliente;
        this.fechaEntrada = c.fechaEntrada;
        this.fechaSalida = c.fechaSalida;
        this.total_noches = c.total_noches;
        this.habitacion = c.habitacion;
    }
    
    //getters
    public int getId_cliente(){
        return this.id_cliente;
    }
    public String getFechaEntrada(){
        return this.fechaEntrada;
    }
    public String getFechaSalida(){
        return this.fechaSalida;
    }
    public int getTotalNoches(){
        return this.total_noches;
    }
    public Habitacion getHabitacion(){
        return this.habitacion;
    }
    
    //setters
    public void setId_cliente(int id_cliente){
        this.id_cliente = id_cliente;
    }
    public void setFechaEntrada(String fechaEntrada){
        this.fechaEntrada = fechaEntrada;
    }
    public void setFechaSalida(String fechaSalida){
        this.fechaSalida = fechaSalida;
    }
    public void setTotalNoches(int total_noches){
        this.total_noches = total_noches;
    }
    public void setHabitacion(Habitacion habitacion){
        this.habitacion = habitacion;
    }
    
    //metodos personalizados
    public double calcularImporte(){
        double importeTotal;
        importeTotal = habitacion.getPrecio_noche() * total_noches;
        return importeTotal;
    }
    
    //toString
    @Override
    public String toString(){
        String cadena = "ID del cliente: " + this.id_cliente + "\n" +
                "Fecha de Entrada: " + this.fechaEntrada + "\n" +
                "Fecha de Salida: " + this.fechaSalida + "\n" +
                "Total de noches: " + this.total_noches + "\n" +
                "Precio total: " + calcularImporte();
        return cadena;
    }
}
