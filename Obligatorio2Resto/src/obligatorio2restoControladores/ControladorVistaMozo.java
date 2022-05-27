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
import obligatoriorestoLogica.Producto;
import obligatoriorestoLogica.Servicio;
import obligatoriorestoLogica.ServicioException;

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
            sistema.agregarServicio(unaMesa);
        } catch (MesaException ex) {
            vistaMozo.mostrarMensaje(ex.getMessage());
        }
    }
    
    public void cerrarMesa(Mesa unaMesa,Cliente unCliente){
        try {
            mozo.cerrarMesa(unaMesa,unCliente);
        } catch (MesaException ex) {
            vistaMozo.mostrarMensaje(ex.getMessage());
        }
    }

    public void hacerPedido(Producto unProducto, int cantidad, String descripcion, Mesa unaMesa){
        Servicio serv=sistema.buscarServicio(unaMesa);
        try{
            if(serv!=null){
            serv.hacerPedido(unProducto, cantidad, descripcion);
        }else{
            vistaMozo.mostrarMensaje("Servicio no existe");
        }
        }catch(ServicioException ex){
            vistaMozo.mostrarMensaje(ex.getMessage());
        }
        
    }
    
    public void verificarMesa(Mesa unaMesa){
        if(!unaMesa.isEstadoMesa()){
            vistaMozo.mostrarMensaje("La mesa esta cerrada");
        }
    }
    
    
}
