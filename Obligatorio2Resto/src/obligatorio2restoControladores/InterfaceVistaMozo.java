/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package obligatorio2restoControladores;

import java.util.ArrayList;
import obligatoriorestoLogica.Cliente;
import obligatoriorestoLogica.Mesa;
import obligatoriorestoLogica.Mozo;
import obligatoriorestoLogica.Pedido;
import obligatoriorestoLogica.Producto;
import obligatoriorestoLogica.Servicio;
import obligatoriorestoLogica.Transferencia;

/**
 *
 * @author tomas
 */
public interface InterfaceVistaMozo {
    
    public void cargarMesas(ArrayList<Mesa> mesasMozo);
    
    public void mostrarPedidosMesa(Servicio servicioMesa);
    
    public void abrirMesa(Mesa unaMesa);
    
    public void cerrarMesa(Mesa unaMesa);
    
    public void transferenciaMesa();
    
    public void transferirMesa(Mesa mesa,Mozo mozoOrigen,Mozo mozoTransferir);
    
    public void hacerPedido(Producto unProducto,int cantidad,String descripcion,Mesa unaMesa);
    
    public void salirSistema();
    
    public void mostrarMensaje(String mensaje);
    
    public void opcionTransferencia(Transferencia trans);
    
    public void opcionPedidoFinalizado(Pedido unPedido);

    public void mostrarProductos(ArrayList<Producto> productos);
    
    public void mostrarMozosConectados(ArrayList<Mozo> mozosConectados);
    
    public void mostrarDatos(Cliente seleccionado);
    
}
