/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obligatorio2restoControladores;

import java.util.ArrayList;
import obligatorio2Observador.Observable;
import obligatorio2Observador.Observador;
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


    private Fachada modelo = Fachada.getInstancia();
    private Gestor gestor;
    private UnidadProcesadora unidad;
    private Pedido pedido;


    public ControladorMonitoreo(InterfaceMonitorPedidos vista, Gestor user,UnidadProcesadora lugar) {
        this.vistaGestor=vista;
        this.gestor=user;
        this.unidad=lugar;
        pedido.avisar(this);
    }

    @Override
    public void actualizar(Object evento, Observable aThis) {
       if(evento.equals(Pedido.eventos.nuevoPedido)){
           vistaGestor.mostrarPendientes();
       }else if(evento.equals(Pedido.eventos.cambiarPedido)){
           vistaGestor.mostrarPendientes();
           vistaGestor.mostrarTomados();
       }
    }
    
    public void tomarPedido(Pedido pedido){
        pedido.setEstado(true);
        gestor.addPedidoTomado(pedido);
    }
    
    public void finalizarPedido(Pedido pedido){
        gestor.getPedidosTomados().remove(pedido);
    }
    
    
}
