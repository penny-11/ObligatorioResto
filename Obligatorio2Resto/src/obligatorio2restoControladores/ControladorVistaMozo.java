/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obligatorio2restoControladores;

import java.util.logging.Level;
import java.util.logging.Logger;
import obligatorio2Observador.Observable;
import obligatorio2Observador.Observador;
import obligatoriorestoLogica.Cliente;
import obligatoriorestoLogica.Fachada;
import obligatoriorestoLogica.Mesa;
import obligatoriorestoLogica.MesaException;
import obligatoriorestoLogica.Mozo;

/**
 *
 * @author tomas
 */
public class ControladorVistaMozo implements Observador{
    
    private InterfaceVistaMozo vistaMozo;
    private Fachada sistema=Fachada.getInstancia();
    private Mozo mozo;

    public ControladorVistaMozo(InterfaceVistaMozo vista,Mozo mo) {
        this.vistaMozo=vista;
        this.mozo = mo;
    }

    @Override
    public void actualizar(Object evento, Observable aThis) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void mostrarMesas(){
        vistaMozo.cargarMesas(mozo);
    }
    
    public void abrirMesa(Mesa unaMesa){
        try {
            mozo.abrirMesa(unaMesa);
        } catch (MesaException ex) {
            vistaMozo.mostrarMensaje("Mesa ya esta abierta.");
        }
    }
    
    public void cerrarMesa(Mesa unaMesa,Cliente unCliente){
        try {
            mozo.cerrarMesa(unaMesa,unCliente);
        } catch (MesaException ex) {
            vistaMozo.mostrarMensaje("Mesa no esta abierta.");
        }
    }
    
    
}
