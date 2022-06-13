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
         transferencia= new Transferencia();
    }

    @Override
    public void actualizar(Object evento, Observable aThis) {
        if(evento.equals(Mozo.Eventos.transferirMesa)){
            opcionTransferencia();
       }else if(evento.equals(Mozo.Eventos.aceptarTransferencia)){
         //  transferencia=null;
           vistaMozo.mostrarMensaje("Transferencia confirmada!");
       }else if(evento.equals(Mozo.Eventos.rechazarTransferencia)){
        //   transferencia=null;
           vistaMozo.mostrarMensaje("Transferencia rechazada!");
       }
    }
    
    public void mostrarMesas(){
        sistema.asignarMesas(mozo);
        vistaMozo.cargarMesas(mozo);
    }
    public void mostrarProductos(){
        vistaMozo.mostrarProductos(sistema.getProductos());
    }
    
    public void abrirMesa(Mesa unaMesa){
        try {
            mozo.abrirMesa(unaMesa);
            sistema.agregarServicio(unaMesa);
            vistaMozo.mostrarMensaje("Mesa abierta con exito.");
        } catch (MesaException ex) {
            vistaMozo.mostrarMensaje(ex.getMessage());
        }
    }
    
    public void cerrarMesa(Mesa unaMesa,Cliente unCliente){
        try {
            mozo.cerrarMesa(unaMesa,unCliente);
            //int clienteId = jTextFieldDescripcion.getText();
            vistaMozo.mostrarMensaje("Mesa cerrada con exito.");
        } catch (MesaException ex) {
            vistaMozo.mostrarMensaje(ex.getMessage());
        }
    }

    public void hacerPedido(Producto unProducto, int cantidad, String descripcion, Mesa unaMesa){
        Servicio serv=new Servicio();
        try{
            serv.hacerPedido(unProducto, cantidad, descripcion);
            vistaMozo.mostrarMensaje("Pedido realizado con exito.");
        }catch(ServicioException ex){
            vistaMozo.mostrarMensaje(ex.getMessage());
        }
        
    }
    
    public void transferirMesa(Mesa mesaTransferir,Mozo mozoDestino){
        Transferencia transf = new Transferencia(mozo,mozoDestino,mesaTransferir);
        transferencia = transf;
        mozoDestino.transferirMesa(transf);
    }
    
    public ArrayList<Mozo> mozosConectados(){
        return sistema.getMozosConectados();
    }
    
    public Cliente buscarCliente(int idCliente){
        return sistema.buscarCliente(idCliente);
    }
    
    public Producto buscarProducto(String producto){
        return sistema.buscarProducto(producto);
    }
    
    public Mesa buscarMesa(int nroMesa,Mozo mozo){
        return mozo.buscarMesa(nroMesa);
    }

    private void opcionTransferencia() {
        
        vistaMozo.opcionTransferencia(transferencia);
    }
}
