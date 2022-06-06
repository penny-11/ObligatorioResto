/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obligatorio2restoControladores;

import obligatorio2Observador.Observable;
import obligatorio2Observador.Observador;
import obligatorio2restoUIEscritorio.MonitorPedidos;
import obligatoriorestoLogica.Fachada;

/**
 *
 * @author tomas
 */
public class ControladorMonitoreo implements Observador {
    
     private MonitorPedidos vista;
    private Fachada modelo = Fachada.getInstancia();

    public ControladorMonitoreo() {
    }

    @Override
    public void actualizar(Object evento, Observable aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
