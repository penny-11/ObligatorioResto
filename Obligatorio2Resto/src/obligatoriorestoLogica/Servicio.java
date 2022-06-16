/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obligatoriorestoLogica;

import java.util.ArrayList;
import obligatorio2Observador.Observable;

/**
 *
 * @author tomas
 */
public class Servicio {

    private ArrayList<Pedido> items;
    private Mesa mesa;
    private Mozo mozoAtencion;

    public Servicio(Mesa mesa, Mozo mozoAtencion) {
        this.mesa = mesa;
        this.mozoAtencion = mozoAtencion;
        this.items = new ArrayList();
    }

    public Servicio() {
    }

    public ArrayList<Pedido> getItems() {
        return items;
    }

    public void addItem(Pedido item) {
        this.items.add(item);
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Mozo getMozoAtencion() {
        return mozoAtencion;
    }

    public void setMozoAtencion(Mozo mozoAtencion) {
        this.mozoAtencion = mozoAtencion;
    }

    public void hacerPedido(Producto unProducto, int cantidad, String descripcion) throws ServicioException {
        Pedido pedido = new Pedido(unProducto, cantidad, descripcion, this);
        if (pedido.validarCantidad()) {
            if (pedido.validarProducto()) {
                unProducto.modificarStock(cantidad);
                items.add(pedido);
                pedido.enviarPedido();
            } else {
                throw new ServicioException("Sin stock, solo quedan " + unProducto.getStock());
            }
        } else {
            throw new ServicioException("Cantidad Invalida");
        }
    }
    
    public boolean verificarPendientes(){
        boolean result=false;
        for(Pedido pe:items){
            if(pe.getEstado()){
                result=true;
                return result;
            }
        }
        return result;
    }

    public int total() {
        int total = 0;
        for (Pedido p : items) {
            total += p.subTotal();
        }
        return total;
    }

}
