/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obligatoriorestoLogica;

import java.util.ArrayList;

/**
 *
 * @author tomas
 */
public class ControlServicio {

    private ArrayList<Mesa> mesas = new ArrayList();

    public void asignarMesas(Mozo mozo) {
        for (Mesa me : mesas) {
            if (mozo.getMesas().isEmpty()) {
                mozo.addMesa(me);
            }
        }
    }
    
    public void abrirMesa(Mesa unaMesa) throws MesaException{
        if (!unaMesa.isEstadoMesa()) {
            unaMesa.setEstadoMesa(true);
        }else{
            throw new MesaException("La Mesa ya esta abierta.");
        }
    }

    public void cerrarMesa(Mesa unaMesa,Cliente unCliente) throws MesaException{
        if (unaMesa.isEstadoMesa()) {
            if(unCliente!=null){
                unaMesa.addCliente(unCliente);
                unaMesa.setEstadoMesa(false);
            }
        }else{
            throw new MesaException("La Mesa no esta abierta");
        }
    }
    
    
}
