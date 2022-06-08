/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obligatorio2restoControladores;

import java.util.ArrayList;
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
import obligatoriorestoLogica.Transferencia;

/**
 *
 * @author tomas
 */
public class ControladorVistaMozo implements Observador{
    
    private InterfaceVistaMozo vistaMozo;
    private Fachada sistema=Fachada.getInstancia();
    private Mozo mozo;
    private Transferencia transferencia;

    public ControladorVistaMozo(InterfaceVistaMozo vista,Mozo mo) {
        this.vistaMozo=vista;
        this.mozo = mo;
        mozo.agregar(this);
    }

    @Override
    public void actualizar(Object evento, Observable aThis) {
        if(evento.equals(Mesa.eventos.transferenciaMesa)){
           vistaMozo.opcionTransferencia(transferencia);
       }else if(evento.equals(Mozo.eventos.aceptarTransferencia)){
           vistaMozo.mostrarMensaje("Transferencia confirmada!");
       }else if(evento.equals(Mozo.eventos.rechazarTransferencia)){
           transferencia=null;
           vistaMozo.mostrarMensaje("Transferencia rechazada");
       }
    }
    
    public void mostrarMesas(){
        sistema.asignarMesas(mozo);
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
            //int clienteId = jTextFieldDescripcion.getText();
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
    
    public void transferirMesa(Mesa mesaTransferir,Mozo mozoDestino){
        transferencia=new Transferencia(mozo,mozoDestino,mesaTransferir);
        mesaTransferir.transferirMesa(mozoDestino);
    }
    
    public ArrayList<Mozo> mozosConectados(){
        return sistema.getMozosConectados();
    }
    
    public Cliente buscarCliente(int idCliente){
        return sistema.buscarCliente(idCliente);
    }
}
