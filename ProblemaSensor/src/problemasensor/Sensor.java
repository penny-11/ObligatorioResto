/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problemasensor;

import java.util.ArrayList;

/**
 *
 * @author tomas
 */
public class Sensor {
    
    private ArrayList<EscuchadorSensor> escuchadores=new ArrayList();
    private boolean activado;
    
    public void agregarEscuchador(EscuchadorSensor eS){
        if(!escuchadores.contains(eS)){
            escuchadores.add(eS);
        }
    }
    
    public void quitarEscuchador(EscuchadorSensor eS){
        escuchadores.remove(eS);
    }
    
    public void avisar(){
        for(EscuchadorSensor esc:escuchadores){
            if(activado) esc.detectaMovimiento();
            else esc.detectaReposo();
        }
    }
    
    public void activa(){
        if(!activado){
            System.out.print("Se activa alarma");
            activado=true;
            avisar();
        }
    }
    
    public void desactiva(){
        if(activado){
            System.out.print("Se desactiva alarma");
            activado=false;
            avisar();
        }
    }
    
    private void hayMovimiento(){
        activa();
    }
    
    private void hayReposo(){
        desactiva();
    }
    
}
