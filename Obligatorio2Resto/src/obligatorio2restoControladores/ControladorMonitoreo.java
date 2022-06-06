/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obligatorio2restoControladores;

import java.util.ArrayList;
import obligatorio2Observador.Observable;
import obligatorio2Observador.Observador;
import obligatorio2restoUIEscritorio.VistaMonitorPedidos;
import obligatoriorestoLogica.Fachada;

/**
 *
 * @author tomas
 */
public class ControladorMonitoreo implements Observador {
    
     private VistaMonitorPedidos vista;
    private Fachada modelo = Fachada.getInstancia();

    public ControladorMonitoreo(VistaMonitorPedidos vista) {
        this.vista = vista;
        ArrayList resultado = new ArrayList();
        modelo.agregar(this);
        for (int i = 0; i < modelo.getServicios().size(); i++) {
            resultado.add(modelo.getServicios().get(i).getItems());
        }
        vista.mostrarPedidos(resultado);
        
    }

    @Override
    public void actualizar(Object evento, Observable aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
