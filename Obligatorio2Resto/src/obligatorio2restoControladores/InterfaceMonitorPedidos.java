/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package obligatorio2restoControladores;

import java.util.ArrayList;
import obligatoriorestoLogica.Pedido;
import obligatoriorestoLogica.UnidadProcesadora;

/**
 *
 * @author tomas
 */
public interface InterfaceMonitorPedidos {

    public void mostrarPendientes(ArrayList<Pedido> pedidosPendientes);
    
    public void mostrarTomados(ArrayList<Pedido> pedidosTomados);

    public void cargarUnidades(ArrayList<UnidadProcesadora> unidades);
    
    public void tomarPedido(Pedido pedidoPendiente);
    
    public void finalizarPedido(Pedido pedidoTomado);

    
}
