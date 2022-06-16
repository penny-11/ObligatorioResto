/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obligatorio2restoControladores;

import java.util.ArrayList;
import obligatorio2Observador.Observable;
import obligatorio2Observador.Observador;
import obligatoriorestoLogica.Bar;
import obligatoriorestoLogica.Cocina;
import obligatoriorestoLogica.Fachada;
import obligatoriorestoLogica.Gestor;
import obligatoriorestoLogica.Pedido;
import obligatoriorestoLogica.UnidadProcesadora;

/**
 *
 * @author tomas
 */
public class ControladorMonitoreo implements Observador {
    

     private InterfaceMonitorPedidos vistaGestor;


    private Fachada sistema = Fachada.getInstancia();
    private Gestor gestor;
    private UnidadProcesadora unidad;
    private Pedido pedido;


    public ControladorMonitoreo(InterfaceMonitorPedidos vista, Gestor user) {
        this.vistaGestor=vista;
        this.gestor=user;
        vistaGestor.cargarUnidades(sistema.getUnidadProcesadoras());
        this.unidad=sistema.getUnidadProcesadoras().get(0);
        unidad.agregar(this);
        gestor.agregar(this);
    }

    @Override
    public void actualizar(Object evento, Observable aThis) {
       if(evento.equals(Cocina.Eventos.recibirPedido)){
           mostrarPendientes();
       }else if(evento.equals(Bar.Eventos.recibirPedido)){
           mostrarPendientes();
       }else if(evento.equals(Gestor.Eventos.pedidoTomado)){
           mostrarPendientes();
       }
    }
    
    public void tomarPedido(Pedido pedido){
        pedido.setEstado(true);
        unidad.getPedidos().remove(pedido);
        gestor.addPedidoTomado(pedido);
    }
    
    public void finalizarPedido(Pedido pedido){
        gestor.getPedidosTomados().remove(pedido);
        pedido.getServicio().getMozoAtencion().pedidoFinalizado(pedido);
    }
    
    public ArrayList<UnidadProcesadora> mostrarUP(){
        return sistema.getUnidadProcesadoras();
    }
    
    public void cargarUnidades(ArrayList<UnidadProcesadora> unidades){
        vistaGestor.cargarUnidades(unidades);
    }

    public void mostrarPendientes() {
        vistaGestor.mostrarPendientes(unidad.getPedidos());
    }

    public void mostrarTomados() {
        vistaGestor.mostrarTomados(gestor.getPedidosTomados());
    }
    
    public void cambiarUnidad(UnidadProcesadora nuevaUnidad){
            this.unidad=nuevaUnidad;
    }
    
    
    
    
    
}
