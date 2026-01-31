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
public class Cuenta {
    
    //atributos
    
    private int num_iden;
    private double saldo;
    private Cliente cliente;
    
    //constructores por defecto
    
    public Cuenta(){
        this.num_iden = 0;
        this.saldo = 0; // lo pide el enunciado
        this.cliente = null; //cuando se crea cliente no tiene cuenta
        
    }
    
    //constructor por parámetros
    public Cuenta(int num_iden, double saldo, Cliente cliente){
        this.num_iden = num_iden;
        this.saldo = saldo;
        this.cliente = cliente;
    }
    
    //constructor de copia
    public Cuenta(Cuenta cuentaACopiar){
        this.num_iden = cuentaACopiar.num_iden;
        this.saldo = cuentaACopiar.saldo;
        
        //para copiar cliente, comprobamos que su valor no sea nulo
        //antes de copiarlo
        if (cuentaACopiar.cliente != null){
            this.cliente = new Cliente(cuentaACopiar.cliente);
        }
        else{
            this.cliente = null;
        }
    }
    
    // getters
    
    public int getNum_iden(){
        return this.num_iden;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public Cliente getCliente(){
        return this.cliente;
    }
    
    //setters
    
    public void setNum_iden(int num_iden){
        this.num_iden = num_iden;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    
    //metodos personalizados 
    
    public void ingresarDinero(double dineroIngresado, double saldo){
        saldo += dineroIngresado;
    }
    
    public void retirarDinero (double dineroRetirado, double saldo){
        if(saldo > dineroRetirado){
            saldo -= dineroRetirado;
        } else{
            System.out.println("No tienes suficiente saldo para retirar el dinero :(");
        }
    }
    
    // metodo de consultarSaldo se haría con el toString
    
    @Override
    public String toString(){
        String cadena = "Numero identificativo :" + this.num_iden +
                "\n Saldo Actual :" + this.saldo;
        // quitamos Cliente this.cliente para que no haya un bucle infinito
        //de llamadas recursivas
        return cadena;
    }
}
