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
public class Pedido {
    
    private Item item;
    private Mesa mesa;
    private Mozo mozoAtencion;

    public Pedido(Mesa mesa, Mozo mozoAtencion) {
        this.mesa = mesa;
        this.mozoAtencion = mozoAtencion;
    }
    
    public Pedido(){
    }

    public Item getItems() {
        return item;
    }

    public void setItem(Item item) {
        this.item=item;
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
    
    
    
}
