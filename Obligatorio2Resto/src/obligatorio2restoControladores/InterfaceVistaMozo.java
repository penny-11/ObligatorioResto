/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package obligatorio2restoControladores;

import obligatoriorestoLogica.Cliente;
import obligatoriorestoLogica.Mesa;
import obligatoriorestoLogica.Mozo;
import obligatoriorestoLogica.Producto;

/**
 *
 * @author tomas
 */
public interface InterfaceVistaMozo {
    
    public void cargarMesas(Mozo unMozo);
    
    public void mostrarPedidosMesa(Mesa unaMesa);
    
    public void abrirMesa(Mesa unaMesa);
    
    public void cerrarMesa(Mesa unaMesa,Cliente unCliente);
    
    public void transferirMesa();
    
    public void hacerPedido(Producto unProducto,int cantidad,String descripcion,Mesa unaMesa);
    
    public void salirSistema();
    
    
}
