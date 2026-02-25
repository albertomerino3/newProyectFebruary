/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author EAG
 */
public class Pruebas {
    //atributos
    private String nombre;
    private String fecha_celebracion;
    private Participantes[] participantes;
    private String resultado;
    private Medallas[] medallas;
    private int resultadoMedallas;
    private TipoDeporte deporteAsociado;
    private boolean resultadoRegistrado;
    
    //constructor x defecto
    public Pruebas(){
        this.nombre = "";
        this.fecha_celebracion = "";
        this.participantes = new Participantes[0];
        this.resultado = "";
        this.medallas = new Medallas[0];
        this.resultadoMedallas = 0;
        this.deporteAsociado = null;
        this.resultadoRegistrado = false;
    }
    
    //constructor x parámetros
    public Pruebas (String nombre, String fecha_celebracion, Participantes[] participantes,
            String resultado, Medallas[] medallas, int resultadoMedallas, TipoDeporte deporteAsociado,
            boolean resultadoRegistrado){
        this.nombre = nombre;
        this.fecha_celebracion = fecha_celebracion;
        this.participantes = participantes;
        this.resultado = resultado;
        this.medallas = medallas;
        this.resultadoMedallas = resultadoMedallas;
        this.deporteAsociado = deporteAsociado;
        this.resultadoRegistrado = resultadoRegistrado;
    }
    
    //constructor de copia
    public Pruebas(Pruebas p){
        this.nombre = p.nombre;
        this.fecha_celebracion = p.fecha_celebracion;
        this.participantes = p.participantes;
        this.resultado = p.resultado;
        this.medallas = p.medallas;
        this.resultadoMedallas = p.resultadoMedallas;
        this.deporteAsociado = p.deporteAsociado;
        this.resultadoRegistrado = p.resultadoRegistrado;
    }
    
    //getters
    public String getNombre(){
        return this.nombre;
    }
    public String getFecha_celebracion(){
        return this.fecha_celebracion;
    }
    public Participantes[] getParticipantes(){
        return this.participantes;
    }
    public String getResultado(){
        return this.resultado;
    }
    public Medallas[] getMedallas(){
        return this.medallas;
    }
    public TipoDeporte getDeporteAsociado(){
        return this.deporteAsociado;
    }
    public boolean getResultadoRegistrado(){
        return this.resultadoRegistrado;
    }
    
    //setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setFecha_celebracion(String fecha_celebracion){
        this.fecha_celebracion = fecha_celebracion;
    }
    public void setParticipantes(Participantes[] participantes){
        this.participantes = participantes;
    }
    public void setResultado(String resultado){
        this.resultado = resultado;
    }
    public void setMedallas(Medallas[] medallas){
        this.medallas = medallas;
    }
    public void setDeporteAsociado(TipoDeporte deporteAsociado){
        this.deporteAsociado = deporteAsociado;
    }
    public void setResultadoRegistrado(boolean resultadoRegistrado){
        this.resultadoRegistrado = resultadoRegistrado;
    }
    
    //metodos
    
    public void registrarParticipantes(Participantes p){
        
        // para saber el límite 
        int limiteMaximo = this.deporteAsociado.getMax_part();
        
        //para saber cuantos participantes hay
        int participantesInscritos = this.participantes.size();
        
        //no superar el maximo de participantes x deporte
        if(participantesInscritos >= limiteMaximo){
            System.out.println("ERROR DEPORTE COMPLETO - Se ha alcanzado el Máximo de Participantes.");
            return;
            
            //no puede inscribirse 2 veces
        } else if (participantes.length){
            System.out.println("ERROR DUPLICADO - El participate ya está inscrito");
            return;
            
            //si pasa todas las validaciones, lo registramos
        } else {
            this.participantes.add(p);
            System.out.println("PARTICIPANTE : " + p.getNombre() + " REGISTRADO");
        }
    }
    

    
    
    public void registrarResultados(String detalleResultado){
        this.resultado = detalleResultado;
        System.out.println("Resultado Registrado : " + detalleResultado);
    }
    
    //no hay medalla si no hay resultadoRegistrado
    public void asignarMedallas(Participantes oro, Participantes plata, Participantes bronce){
        if(!resultadoRegistrado){
            System.out.println("ERROR REGISRO - Para asignar una medalla debes tener un resultado asignado");
            return;
        }
        
        //creamos objetos MEDALLA (CONSTRUCTOR DE MEDALLAS -> Medallas(tipo, participante))
        this.medallas = new Medallas[3];
        this.medallas[0] = new Medallas("Oro", oro);
        this.medallas[1] = new Medallas("Plata", plata);
        this.medallas[2] = new Medallas("Bronce", bronce);
        
        //contador de medallas x participante
        oro.setNum_medallas(oro.getNum_medallas() +1);
        plata.setNum_iden_olimp(resultadoMedallas);
        plata.setNum_medallas(plata.getNum_medallas() +1);
        bronce.setNum_medallas(resultadoMedallas);
    }
    
    public void mostrarClasificacion(){
        System.out.println("CLASIFICACIÓN DE : " + this.nombre);
        if (this.medallas[0] != null){
            System.out.println("MEDALLA DE ORO : " + medallas[0].getGanador().getNombre());
            System.out.println("MEDALLA DE PLATA : " + medallas[1].getGanador().getNombre());
            System.out.println("MEDALLA DE BRONCE : " + medallas[2].getGanador().getNombre());
        }
    }
    
    
    @Override

    public String toString(){
        String cadena = "NOMBRE DE LA PRUEBA " + this.nombre +
                "\n FECHA : " + this.fecha_celebracion +
                "\n PARTICIPANTES : " + this.participantes +
                "\n RESULTADO FINAL : " + this.resultado +
                "\n MEDALLAS ASIGNADAS : " + this.resultadoMedallas +
                "\n CLASIFICACIÓN FINAL : " + this.;
        
        return cadena;
    }

    private int getMax_part() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
