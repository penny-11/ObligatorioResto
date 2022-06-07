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
public class Bar extends UnidadProcesadora{

    public Bar(String nombre) {
        super(nombre);
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public ArrayList<Pedido> getPedidos() {
        return this.pedidos;
    }

    @Override
    public void recibirPedido(Pedido unPedido) {
        this.pedidos.add(unPedido);
    }

    @Override
    public void despacharPedido(Pedido unPedido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Pedido> pedidosMostrar(boolean estado) {
        ArrayList<Pedido> pedidosMostrar=new ArrayList();
        for(Pedido p:pedidos){
            if(p.getEstado()==estado){
                pedidosMostrar.add(p);
            }
        }
        return pedidosMostrar;
    }
    
}
