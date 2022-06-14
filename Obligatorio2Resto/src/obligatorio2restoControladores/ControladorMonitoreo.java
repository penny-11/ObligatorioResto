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
import obligatoriorestoLogica.Mesa;
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


    public ControladorMonitoreo(InterfaceMonitorPedidos vista, Gestor user,UnidadProcesadora unidadEntrante) {
        this.vistaGestor=vista;
        this.gestor=user;
        this.unidad=unidadEntrante;
        unidad.agregar(this);
    }

    @Override
    public void actualizar(Object evento, Observable aThis) {
       if(evento.equals(Bar.Eventos.recibirPedido)){
           vistaGestor.mostrarPendientes(unidad.pedidosMostrar(false));
       }else if(evento.equals(Cocina.Eventos.recibirPedido)){
           vistaGestor.mostrarPendientes(unidad.pedidosMostrar(false));
           vistaGestor.mostrarTomados(gestor.getPedidosTomados());
       }
    }
    
    public void tomarPedido(Pedido pedido){
        pedido.setEstado(true);
        gestor.addPedidoTomado(pedido);
    }
    
    public void finalizarPedido(Pedido pedido){
        gestor.getPedidosTomados().remove(pedido);
    }
    
    public ArrayList<UnidadProcesadora> mostrarUP(){
        return sistema.getUnidadProcesadoras();
    }
    
    public void cargarUnidades(){
        ArrayList<UnidadProcesadora> unidades=sistema.getUnidadProcesadoras();
        vistaGestor.cargarUnidades(unidades);
    }

    public void mostrarPendientes() {
        vistaGestor.mostrarPendientes(unidad.pedidosMostrar(false));
    }

    public void mostrarTomados() {
        vistaGestor.mostrarTomados(gestor.getPedidosTomados());
    }
    
    public void cambiarUnidad(UnidadProcesadora nuevaUnidad){
        this.unidad=nuevaUnidad;
    }
    
    
    
    
    
}
