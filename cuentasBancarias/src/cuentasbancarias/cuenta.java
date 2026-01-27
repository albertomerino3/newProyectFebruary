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
public class cuenta {
    
    //atributos
    
    private int num_iden;
    private double saldo;
    private cliente cliente;
    
    //constructores por defecto
    
    public cuenta(){
        this.num_iden = ;
        this.saldo = 0;
        this.cliente = null; //cuando se crea cliente no tiene cuenta
        
    }
    
    //constructor por parámetros
    public cuenta(int num_inden, double saldo, cliente cliente){
        this.num_iden = num_iden;
        this.saldo = saldo;
        this.cliente = cliente;
    }
    
    //constructor de copia
    public cuenta(cuenta cuentaACopiar){
        this.num_iden = cuentaACopiar.num_iden;
        this.saldo = cuentaACopiar.saldo;
        
        //para copiar cliente, comprobamos que su valor no sea nulo
        //antes de copiarlo
        if (cuentaACopiar.cliente != null){
            this.cliente = new cliente(cuentaACopiar.cliente);
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
    
    public cliente getCliente(){
        return this.cliente;
    }
    
    //setters
    
    public void setNum_iden(int num_iden){
        this.num_iden = num_iden;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public void setCliente(cliente cliente){
        this.cliente = cliente;
    }
    //metodos
}
