/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentasbancarias;

/**
 *
 * @author EAG
 */
public class Cliente {

    //atributos

    private int id_cliente;
    private Cuenta cuenta_cliente;
    
    //constructores por defecto
    public Cliente(){
        this.id_cliente = 0;
        this.cuenta_cliente = null;
    }
    
    //constructores por parametros
    public Cliente(int id_cliente, Cuenta cuenta_cliente){
        this.id_cliente = id_cliente;
        this.cuenta_cliente = cuenta_cliente;
    }
    
    //constructor de copia
    public Cliente(Cliente clienteACopiar){
        this.id_cliente = clienteACopiar.id_cliente;
        
        //para copiar la cuenta, usamos el constructor de copia de CUENTAS
        //pero comprobamos que su valor no sea nulo ANTES de COPIAR
        if(clienteACopiar.cuenta_cliente != null){
            this.cuenta_cliente = new Cuenta(clienteACopiar.cuenta_cliente);
        }
        else{
            this.cuenta_cliente = null;
        }
    }
    
    
    //getters
    public int getIDCliente(){
        return this.id_cliente;
    }
    
    public Cuenta getCuentaCliente(){
        return this.cuenta_cliente;
    }
    
    //setters
    public void setIDCliente(int id_cliente){
        this.id_cliente = id_cliente;
    }
    
    public void setCuentaCliente(Cuenta cuenta_cliente){
        this.cuenta_cliente = cuenta_cliente;
    }
    
    //toString
    @Override
    public String toString(){
        String cadena = "ID del cliente: " + this.id_cliente +
                "\n Cuenta del cliente: " + this.cuenta_cliente;
        return cadena;
    }
    
    
    
}
