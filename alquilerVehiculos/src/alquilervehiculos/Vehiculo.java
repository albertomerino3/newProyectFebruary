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
    //metodo que se ejecuta al crear objeto
    public Vehiculo(String matricula, String marca, String modelo){
        this.matricula = matricula; //atributo del objeto = valor que le llega al constructor
        this.marca = marca;
        this.modelo = modelo;
        this.disponible = true; //por defecto está disponible, tiene sentido al dar de alta un coche, que no esté alquilado todavía
    }
    
    // getters y setters
    public String getMatricula(){   //permite leer un dato privado desde fuera
        return matricula;
    }
    
    public boolean isDisponible() { //al ser boolean se usa is en vez de get
        return disponible;
    }
    
    public void setDisponible(boolean disponible){ //para cambiar el estado del vehiculo
        this.disponible = disponible;
    }
    
    @Override
    public String toString(){       //para imprimir el objeto de forma legible
        return "Vehiculo{" +
                "matricula='" + matricula + '\''+
                ", marca='" + marca + '\''+
                ", mdoelo='" + modelo + '\'' +
                ", disponible=" + disponible +
                '}';
    }
    
    
}
