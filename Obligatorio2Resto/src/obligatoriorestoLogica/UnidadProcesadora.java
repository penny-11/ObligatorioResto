/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obligatoriorestoLogica;

import java.util.ArrayList;

/**
 *
 * @author tomas
 */
public abstract class UnidadProcesadora {
    
    protected String nombre;
    protected ArrayList<Pedido> pedidos;

    public UnidadProcesadora(String nombre) {
        this.nombre = nombre;
        this.pedidos=new ArrayList();
    }
    
    public abstract String getNombre();
    public abstract ArrayList<Pedido> getPedidos();
    public abstract void recibirPedido(Pedido unPedido);
    public abstract void despacharPedido(Pedido unPedido);
    
}
